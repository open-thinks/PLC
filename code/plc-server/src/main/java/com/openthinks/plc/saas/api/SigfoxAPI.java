/**
 * 
 */
package com.openthinks.plc.saas.api;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.plc.core.common.JSON;
import com.openthinks.plc.core.common.JSONObject;
import com.openthinks.plc.core.model.VehicleTrack;
import com.openthinks.plc.core.service.VehicleService;
import com.openthinks.plc.saas.APIConstant;

/**
 * @author dailey
 *
 */
@Controller
@RequestMapping(APIConstant.SIGFOX)
public class SigfoxAPI {

  @Autowired
  VehicleService vehicleService;

  @RequestMapping("/test")
  @ResponseBody
  public Object test(HttpServletRequest req) {
    System.out.println("received");

    JSONObject root = JSON.object().success();
    Enumeration<String> params = req.getParameterNames();
    while (params.hasMoreElements()) {
      String key = params.nextElement();
      System.out.println("Paramteter:" + key + "=" + req.getParameter(key));
    }
    return root;

  }


  @RequestMapping("/track")
  @ResponseBody
  public Object vetrack(HttpServletRequest req) {
    JSONObject root = JSON.object().success();
    String vc = req.getParameter("data");
    String vehicleId = req.getParameter("vid");
    if (vc == null || vc.length() == 0) {
      return root.error();
    }
    if (vehicleId == null || vehicleId.length() == 0) {
      return root.error();
    }
    vehicleId = vehicleId.trim();
    VehicleTrack track = null;
    if (vc.length() == 10) {
      String longitude = vc.substring(0, 5);
      String latitude = vc.substring(5);
      longitude = longitude.substring(0, 3) + "." + longitude.substring(3);
      latitude = latitude.substring(0, 2) + "." + latitude.substring(2);
      track = new VehicleTrack.Builder().latitude(latitude).longitude(longitude)
          .vehicleId(Long.valueOf(vehicleId)).build();
    } else if (vc.length() == 6) {
      String yali = vc.substring(0, 1);
      String temp = vc.substring(1, 4);
      String shidu = vc.substring(4, 6);
      temp = temp.substring(0, 2) + "." + temp.substring(2);
      track = new VehicleTrack.Builder().yali(yali).temp(temp).shidu(shidu)
          .vehicleId(Long.valueOf(vehicleId)).build();
    } else if (vc.length() == 4) {
      boolean isOpen = "1111".equalsIgnoreCase(vc);
      track = new VehicleTrack.Builder().doorState(isOpen ? 1 : 0)
          .vehicleId(Long.valueOf(vehicleId)).build();
    }
    if (track == null)
      return root.error();
    boolean isSuccess = vehicleService.makeNewTrack(track);
    if (isSuccess == false) {
      root.error();
    }
    return root;

  }

}
