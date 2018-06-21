/**
 * base info js
 */
window.app = window.app || {
	envConf: {
		dev: {
			base_url: {
				server: '//localhost:8088/plc/',
				staticUrl:'//localhost:8088/plc/static/'
			},
			mqtt:{
				host:"localhost",
				port:"1833",
				topic_template:"TBOX/NAD/${imei}/LOG",
				client_template:"rdb-ws-${sid}"
			},
			timeout: 30 * 60
		},
		prod: {
			base_url:{
				server: '//139.219.0.117:8080/plc/',
				staticUrl:'//139.219.0.117:8080/plc/static/'
			},
			mqtt:{
				host:"139.219.0.117",
				port:"1833",
				topic_template:"TBOX/NAD/${imei}/LOG",
				client_template:"rdb-ws-${sid}"
			},
			timeout: 30 * 60
		},
		current: function() {
			if(window.location.href.indexOf('localhost')>-1||window.location.href.indexOf('127.0.0.1')>-1){
				return window.app.envConf.dev;
			} 
			return window.app.envConf.prod;
		}
	}
};
function log(msg){
	//if(window.app.envConf.current() == window.app.envConf.dev)
		console.log(msg);
}


function getServerUrl(path) {
	var sPath = '';
	if (path) {
		sPath = '' + path;
	}
	return window.app.envConf.current().base_url.server + sPath;
}

function getResourceUrl(path){
	var sPath = '';
	if (path) {
		sPath = '' + path;
	}
	return window.app.envConf.current().base_url.staticUrl + sPath;
}

function getServerWSUrl(path){
	var sPath = '';
	if (path) {
		sPath = '' + path;
	}
	var url_path = window.app.envConf.current().base_url.server;
	var index = url_path.indexOf("//");
	url_path = url_path.substring(index);
	return  "ws:"+url_path + sPath;
}

function getMqttServer(){
	return window.app.envConf.current().mqtt;
}

function getSessionTimeOut() {
	var stout = window.app.envConf.current().timeout || 1800;
	return stout;
}
/////////////////////

