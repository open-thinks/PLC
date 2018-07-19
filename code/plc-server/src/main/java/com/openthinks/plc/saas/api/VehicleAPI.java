/**
 * 
 */
package com.openthinks.plc.saas.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.plc.core.common.JSON;
import com.openthinks.plc.core.common.JSONArray;
import com.openthinks.plc.core.common.JSONConverters;
import com.openthinks.plc.core.common.JSONObject;
import com.openthinks.plc.core.model.VehicleTrack;
import com.openthinks.plc.core.model.VehicleTrackVw;
import com.openthinks.plc.core.service.VehicleService;
import com.openthinks.plc.saas.APIConstant;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Controller
@RequestMapping(APIConstant.VEHICLE)
public class VehicleAPI {

  @Autowired
  VehicleService vehicleService;

  /**
   * 更新车辆位置信息;<BR>
   * vehicleId,latitude,longitude,coordType
   * 
   * @param track
   * @param request
   * @param resonpse
   * @return
   */
  @PostMapping("/track")
  @ResponseBody
  public Object updateVehicleTrack(@RequestBody VehicleTrack track, HttpServletRequest request,
      HttpServletResponse resonpse) {
    JSONObject root = JSON.object().success();
    boolean isSuccess = vehicleService.makeNewTrack(track);
    if (isSuccess == false) {
      root.error();
    }
    return root;
  }

  @GetMapping("/fetch")
  @ResponseBody
  public Object fetchVehicleTrack() {
    JSONObject root = JSON.object().success();
    List<VehicleTrackVw> trackList = vehicleService.fetchLatestTrack();
    JSONArray array = root.createEmbedArray("data");
    trackList.forEach(track -> array.add(JSONConverters.perparedAndGet(track)));
    return root;
  }
}
