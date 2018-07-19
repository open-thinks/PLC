var PLC = {
	amap: {
		inst: {},
		data: {
			mtop: $(".plc-amap"),
			mpanel: $(".plc-amap-panel"),
			mcontainer: $("#amap-container"),
			mpheight: $(".plc-amap-panel").css("height"),
			mcheight: $("#amap-container").css("height"),
			locs:[]
		},
		reload: function() {
			if(this.inst) {
				this.inst.destroy();
			}
			this.inst = window.init();
		},
		expand: function() {
			var $main = $("#page-wrapper");
			var isExpand = this.data.mpanel.hasClass("plc-amap-panel-expand") == false;
			var topOffset = 50;
			var winWidth = (window.innerWidth > 0) ? window.innerWidth : screen.width;
			if(winWidth < 768) {
				topOffset = 100; // 2-row-menu
			}
			var winHeight = ((window.innerHeight > 0) ? window.innerHeight : screen.height) - 1;
			winHeight = winHeight - topOffset;
			if(winHeight < 1) winHeight = 1;
			if(isExpand) {
				this.data.mpheight = this.data.mpanel.css("height");
				this.data.mcheight = this.data.mcontainer.css("height");
				this.data.mpanel.appendTo($main);
				if(winHeight > topOffset) {
					this.data.mpanel.css("height", (winHeight - 40) + "px");
					this.data.mcontainer.css("height", (winHeight - 40 - 45) + "px");
				}
			} else {
				this.data.mpanel.appendTo(this.data.mtop);
				this.data.mpanel.css("height", this.data.mpheight);
				this.data.mcontainer.css("height", this.data.mcheight);
			}
			$("#page-wrapper > .row").toggleClass("hidden")
			this.data.mpanel.toggleClass("plc-amap-panel-expand");
		},
		fullscreen: function() {

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
						content: '<div class="marker-route marker-'+item.locationType+'"></div>'
					})
					_this.inst.add(marker);
					marker.on("click",function(){
						_this.buildRelatedInfo(item);
					})
				});
				_this.inst.setFitView();
			});

		},
		buildRelatedInfo:function(data){
			var $parent = $(".form-loc").parent();
			$(".form-valid",$parent).remove();
			var $form = $(".form-loc").clone();
			$form.removeClass("form-base").removeClass("hidden").addClass("form-valid");
			$("p[data-name]",$form).each(function(){
				$p = $(this);
				var property = $p.data("name");
				$p.text(data[property]);
			});
			$form.appendTo($parent);
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


