package com.openthinks.plc.saas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.plc.core.common.JSON;
import com.openthinks.plc.core.common.JSONArray;
import com.openthinks.plc.core.common.JSONConverters;
import com.openthinks.plc.core.common.JSONObject;
import com.openthinks.plc.core.model.LocationsVw;
import com.openthinks.plc.core.model.PacksVw;
import com.openthinks.plc.core.service.LocationService;
import com.openthinks.plc.saas.APIConstant;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Controller
@RequestMapping(APIConstant.LOCATION)
public class LocationAPI {

  @Autowired
  LocationService locationService;

  @GetMapping("/all")
  @ResponseBody
  public Object getAllLocations() {
    JSONObject root = JSON.object().success();
    JSONArray items = root.createEmbedArray("data");
    List<LocationsVw> list = locationService.findAllLocationsVw();
    list.forEach((lvw) -> {
      items.add(JSONConverters.perparedAndGet(lvw));
    });
    return root;
  }

  @GetMapping("/{locationId}/packs")
  @ResponseBody
  public Object getOutPacks(@PathVariable(name = "locationId") long locationId) {
    JSONObject root = JSON.object().success();
    JSONObject data = root.createEmbedJSONObj("data");
    JSONArray inItems = data.createEmbedArray("in");
    List<PacksVw> list = locationService.listInPacks(locationId);
    list.forEach((lvw) -> {
      inItems.add(JSONConverters.perparedAndGet(lvw));
    });
    JSONArray outItems = data.createEmbedArray("out");
    list = locationService.listOutPacks(locationId);
    list.forEach((lvw) -> {
      outItems.add(JSONConverters.perparedAndGet(lvw));
    });
    return root;
  }
}
