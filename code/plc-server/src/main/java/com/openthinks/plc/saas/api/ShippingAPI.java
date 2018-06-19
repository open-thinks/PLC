/**
 * 
 */
package com.openthinks.plc.saas.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.plc.BizConstant.ShipStatus;
import com.openthinks.plc.core.common.CheckUtil;
import com.openthinks.plc.core.common.JSON;
import com.openthinks.plc.core.common.JSONArray;
import com.openthinks.plc.core.common.JSONConverters;
import com.openthinks.plc.core.common.JSONObject;
import com.openthinks.plc.core.model.ShippingsVw;
import com.openthinks.plc.core.service.ShipService;
import com.openthinks.plc.saas.APIConstant;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Controller
@RequestMapping(APIConstant.SHIPPING)
public class ShippingAPI {

	@Autowired
	ShipService shipService;
	
	@RequestMapping("/list")
	@ResponseBody
	public Object listShips(
			@RequestParam(required=false,defaultValue="0",name="status") String status,
			HttpServletRequest request,
			HttpServletResponse resonpse) {
		JSONObject root = JSON.object().success();
		ShipStatus shipStatus = ShipStatus.NOT_START;
		if(CheckUtil.isInteger(status)) {
			ShipStatus tmpStatus = ShipStatus.toShipStatus(Integer.valueOf(status));
			if(tmpStatus!=null) {
				shipStatus = tmpStatus;
			}
		}
		List<ShippingsVw> shipList=shipService.findShipsByStatus(shipStatus);
		JSONArray array = root.createEmbedArray("data");
		shipList.forEach(ship->array.add(JSONConverters.perparedAndGet(ship)));
		return root;
	}
	
}
