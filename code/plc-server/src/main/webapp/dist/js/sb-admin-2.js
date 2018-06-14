/*!
 * Start Bootstrap - SB Admin 2 v3.3.7+1 (http://startbootstrap.com/template-overviews/sb-admin-2)
 * Copyright 2013-2016 Start Bootstrap
 * Licensed under MIT (https://github.com/BlackrockDigital/startbootstrap/blob/gh-pages/LICENSE)
 */
$(function() {
	$('#side-menu').metisMenu();
});

//Loads the correct sidebar on window load,
//collapses the sidebar on window resize.
// Sets the min-height of #page-wrapper to window size
$(function() {
	$(window).bind("load resize", function() {
		var topOffset = 50;
		var width = (this.window.innerWidth > 0) ? this.window.innerWidth : this.screen.width;
		if(width < 768) {
			$('div.navbar-collapse').addClass('collapse');
			topOffset = 100; // 2-row-menu
		} else {
			$('div.navbar-collapse').removeClass('collapse');
		}

		var height = ((this.window.innerHeight > 0) ? this.window.innerHeight : this.screen.height) - 1;
		height = height - topOffset;
		if(height < 1) height = 1;
		if(height > topOffset) {
			$("#page-wrapper").css("min-height", (height - 10) + "px");
		}
	});

	var url = window.location;
	// var element = $('ul.nav a').filter(function() {
	//     return this.href == url;
	// }).addClass('active').parent().parent().addClass('in').parent();
	var element = $('ul.nav a').filter(function() {
		return this.href == url;
	}).addClass('active').parent();

	while(true) {
		if(element.is('li')) {
			element = element.parent().addClass('in').parent();
		} else {
			break;
		}
	}

});

var PLC = {
	amap: {
		inst: null,
		data: {
			mtop: $(".plc-amap"),
			mpanel: $(".plc-amap-panel"),
			mcontainer: $("#amap-container"),
			mpheight: $(".plc-amap-panel").css("height"),
			mcheight: $("#amap-container").css("height")
		},
		reload: function() {
			if(this.inst) {
				this.inst.destory();
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
			winHeight = winHeight - topOffset ;
			if(winHeight < 1) winHeight = 1;
			if(isExpand) {
				this.data.mpheight = this.data.mpanel.css("height");
				this.data.mcheight = this.data.mcontainer.css("height");
				this.data.mpanel.appendTo($main);
				if(winHeight > topOffset) {
					this.data.mpanel.css("height", ( winHeight - 40 ) + "px");
					this.data.mcontainer.css("height", ( winHeight - 40 - 45 )+ "px");
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

		}
	}

};

window.init = function() {
	amap = new AMap.Map('amap-container', {
		resizeEnable: true,
		zoom: 11,
		center: [116.397428, 39.90923]
	});
	if(location.href.indexOf('&guide=1') !== -1) {
		amap.setStatus({
			scrollWheel: false
		})
	}
	amap.plugin(["AMap.ToolBar"], function() {
		amap.addControl(new AMap.ToolBar({
			liteStyle: true
		}))
	});
}

$(function() {
	$(".plc-amap a[data-action]").bind("click", function() {
		var $link = $(this);
		var actionName = $link.data("action");
		PLC.amap[actionName].call(PLC.amap);
	});

});