package com.openthinks.plc.saas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.plc.core.common.JSON;
import com.openthinks.plc.core.common.JSONArray;
import com.openthinks.plc.core.common.JSONConverters;
import com.openthinks.plc.core.common.JSONObject;
import com.openthinks.plc.core.model.LocationsVw;
import com.openthinks.plc.core.service.LocationService;
import com.openthinks.plc.saas.Constant;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Controller
@RequestMapping(Constant.LOCATION)
public class LocationAPI {

	@Autowired
	LocationService locationService;
	
	@GetMapping("/all")
	@ResponseBody
	public Object getAllLocations() {
		JSONObject root = JSON.object().success();
		JSONArray items = root.createEmbedArray("data");
		List<LocationsVw> list= locationService.findAllLocationsVw();
		list.forEach((lvw)->{
			items.add(JSONConverters.perparedAndGet(lvw));
		});
		return root;
	}
}
