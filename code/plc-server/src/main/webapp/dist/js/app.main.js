var trackTimer = undefined;

var PLC = {
	amap: {
		inst: {},
		data: {
			mtop: $(".plc-amap"),
			mpanel: $(".plc-amap-panel"),
			mcontainer: $("#amap-container"),
			mpheight: $(".plc-amap-panel").css("height"),
			mcheight: $("#amap-container").css("height"),
			locs: [],
			//Vechiles track marker map
			tracks: {},
			//Vechiles location path map
			drives: {},
			vinfos: {}
		},
		reload: function() {
			if(this.inst) {
				this.inst.destroy();
			}
			this.inst = window.init();
		},
		expand: function() {
			var $main = $("#page-wrapper");
			$main.toggleClass("page-wrapper-expand");
			if($main.hasClass("page-wrapper-expand")) {
				$("nav.navbar").hide();
			} else {
				$("nav.navbar").show();
			}
			return;
		},
		cfullscreen: function() {},
		trackVehicle: function() {
			var $trackFlag = $(".plc-track-tag");
			$trackFlag.toggleClass("hidden");
			if($trackFlag.hasClass("hidden")) {
				if(trackTimer) {
					clearInterval(trackTimer);
				}
				return;
			}
			if(trackTimer != undefined) {
				clearInterval(trackTimer);
			}
			var _this = this;
			trackTimer = setInterval(function() {
				$.getJSON(
					getServerUrl("api/vehicles/fetch"),
					function(data) {
						if(data.result != 0)
							return;
						//DO update all vehicle track
						var arrayVechileTracks = data.data;
						if(arrayVechileTracks && arrayVechileTracks.length > 0)
							_this.updateVechileTrack(arrayVechileTracks);
					}
				);
			}, 3000);
		},
		updateVechileTrack: function(arrytrks) {
			var _this = this;
			var trackMap = _this.data.tracks;
			for(var trk in arrytrks) {
				var vt = arrytrks[trk];
				var trkId = vt.vehicleId;
				if(trackMap[trkId]) { // already exist
					log("update");
					if(vt.shipStatus != 1) {
						_this.inst.remove(trackMap[trkId]);
						trackMap[trkId] = undefined;
						delete trackMap[trkId];
						var adrive = _this.data.drives[trkId];
						if(adrive) {
							adrive.clear();
							_this.data.drives[trkId] = undefined;
							delete _this.data.drives[trkId];
						}
						continue;
					} //not shipping
					trackMap[trkId].setPosition([vt.longitude, vt.latitude]);
				} else { // new vehicle
					if(vt.shipStatus != 1) //not shipping
						continue;
					log("insert");
					trackMap[trkId] = new AMap.Marker({
						position: new AMap.LngLat(vt.longitude, vt.latitude),
						title: trk.vehicleId,
						offset: new AMap.Pixel(-14, -16),
						content: '<div class="marker-route marker-car"></div>'
					});
					AMap.event.addListener(trackMap[trkId], 'click', function() {
						_this.buildVehicleInfo(vt, trackMap[trkId]);
					});
					_this.inst.add(trackMap[trkId]);
					_this.inst.setFitView();
					_this.buildPath(vt);
				}
			}
		},
		buildPath: function(vt) {
			var _this = this;
			var trkId = vt.vehicleId;
			var truckOptions = {
				map: _this.inst,
				policy: 0,
				size: 1
			};
			var driving = new AMap.TruckDriving(truckOptions);
			var path = [];
			var fromloc = _this.findLocation(vt.fromId);
			var toloc = _this.findLocation(vt.toId);
			var startLngLat = [fromloc.longitude, fromloc.latitude];
			var endLngLat = [toloc.longitude, toloc.latitude];
			path.push({
				lnglat: startLngLat
			});
			path.push({
				lnglat: endLngLat
			});
			driving.search(path, function(status, result) {});
			_this.data.drives[trkId] = driving;
		},
		findLocation: function(locId) {
			var _this = this;
			var arryLocs = _this.data.locs || [];
			for(var loc_inx in arryLocs) {
				var loc = arryLocs[loc_inx];
				if(loc.id == locId) {
					return loc;
				}
			}
		},
		onLoad: function() {
			var _this = this;
			$.getJSON(getServerUrl("api/locations/all"), function(data) {
				if(data.result != 0) {
					log(data.errmsg);
					return;
				}
				log(data.data);
				_this.data.locs = data.data;
				$.each(data.data, function(i, item) {
					var marker = new AMap.Marker({
						position: [item.longitude, item.latitude], //位置
						title: item.name,
						extData: item,
						offset: new AMap.Pixel(-14, -16),
						content: '<div class="marker-route marker-' + item.locationType + '"></div>'
					})
					_this.inst.add(marker);
					marker.on("click", function() {
						_this.buildRelatedInfo(item, marker);
					})
				});
				_this.inst.setFitView();
			});
		},
		buildRelatedInfo: function(data, marker) {
			var _this = this;
			var title = data.name,
				content = [];
			content.push("地址：" + data.province + " " + data.city + " " + data.address);
			content.push("经纬度：" + data.longitude + "," + data.latitude);
			content.push("类型: " + getLocationTypeName(data.locationType));
			content.push("<a href='javascript:openwin("+data.id+")'>详细信息</a>");
			var domContent = createInfoWindow(title, content.join("<br>"));
			infoWindow.setContent(domContent);
			infoWindow.open(_this.inst, marker.getPosition());
		},
		buildVehicleInfo: function(data, marker) { //show vehicle info
			var _this = this;
			var title = data.carNo,
				content = [];
			content.push("经纬度：" + data.longitude + "," + data.latitude);
			content.push("温度：" + data.temp + " c");
			content.push("湿度：" + data.shidu + " %h");
			content.push("压力: " + data.yali + " mpa");
			content.push("门状态: " + (data.doorState == 0 ? "关" : "开"));

			var domContent = createInfoWindow(title, content.join("<br>"));
			var sVid = data.vehicleId;
			var vinfoWindow = _this.data.vinfos[sVid];
			if(!vinfoWindow) {
				vinfoWindow = new AMap.InfoWindow({
					isCustom: true,
					content: "",
					offset: new AMap.Pixel(16, -45)
				});
			}
			vinfoWindow.setContent(domContent);
			vinfoWindow.open(_this.inst, marker.getPosition());

		}
	}
};

window.init = function() {
	var amapInst = new AMap.Map('amap-container', {
		resizeEnable: true,
		zoom: 11,
		center: [120.794214, 31.335478]
	});
	PLC.amap.inst = amapInst;
	if(location.href.indexOf('&guide=1') !== -1) {
		amapInst.setStatus({
			scrollWheel: false
		})
	}
	amapInst.plugin(["AMap.ToolBar"], function() {
		amapInst.addControl(new AMap.ToolBar({
			liteStyle: true
		}))
	});
	amapInst.on("complete", function() {
		PLC.amap.onLoad();
	});
	return amapInst;
}

$(function() {
	$(".plc-amap a[data-action]").bind("click", function() {
		var $link = $(this);
		var actionName = $link.data("action");
		PLC.amap[actionName].call(PLC.amap);
	});

});

infoWindow = new AMap.InfoWindow({
	isCustom: true,
	content: "",
	offset: new AMap.Pixel(16, -45)
});

//构建自定义信息窗体
function createInfoWindow(title, content) {
	var info = document.createElement("div");
	info.className = "info";

	//可以通过下面的方式修改自定义窗体的宽高
	//info.style.width = "400px";
	// 定义顶部标题
	var top = document.createElement("div");
	var titleD = document.createElement("div");
	var closeX = document.createElement("img");
	top.className = "info-top";
	titleD.innerHTML = title;
	closeX.src = "https://webapi.amap.com/images/close2.gif";
	closeX.onclick = closeInfoWindow;

	top.appendChild(titleD);
	top.appendChild(closeX);
	info.appendChild(top);

	// 定义中部内容
	var middle = document.createElement("div");
	middle.className = "info-middle";
	middle.style.backgroundColor = 'white';
	middle.innerHTML = content;
	info.appendChild(middle);

	// 定义底部内容
	var bottom = document.createElement("div");
	bottom.className = "info-bottom";
	bottom.style.position = 'relative';
	bottom.style.top = '0px';
	bottom.style.margin = '0 auto';
	var sharp = document.createElement("img");
	sharp.src = "https://webapi.amap.com/images/sharp.png";
	bottom.appendChild(sharp);
	info.appendChild(bottom);
	return info;
}

//关闭信息窗体
function closeInfoWindow() {
	PLC.amap.inst.clearInfoWindow();
}

function getLocationTypeName(type) {
	var types = [];
	types[0] = "博世工厂";
	types[1] = "博世仓库";
	types[5] = "客户";
	types[8] = "供应商";

	return types[type] || "N/A";
}

function openwin(sid) {
	window.open("packs.html?id="+sid, "_blank", "resizable=yes, scrollbars=yes, titlebar=yes, width=800, height=900, top=10, left=10")
	
	//window.open("packs.html?id="+sid, "newwindow", "height=100, width=400, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
}