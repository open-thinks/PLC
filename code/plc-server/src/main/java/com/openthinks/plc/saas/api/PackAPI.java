/**
 * 
 */
package com.openthinks.plc.saas.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.plc.BizConstant.PackStatus;
import com.openthinks.plc.core.common.CheckUtil;
import com.openthinks.plc.core.common.JSON;
import com.openthinks.plc.core.common.JSONArray;
import com.openthinks.plc.core.common.JSONConverters;
import com.openthinks.plc.core.common.JSONObject;
import com.openthinks.plc.core.model.Packs;
import com.openthinks.plc.core.model.PacksVw;
import com.openthinks.plc.core.service.PackingService;
import com.openthinks.plc.saas.APIConstant;

/**
 * @author dailey.yet@outlook.com
 *
 */
@Controller
@RequestMapping(APIConstant.PACKING)
public class PackAPI {

	@Autowired
	PackingService packingService;

	// 出库，绑定到运单
	@PostMapping("/outbound/{shipId}")
	@ResponseBody
	public Object submitPacking(@PathVariable(name = "shipId") long shipId, @RequestBody Packs[] packSubmits,
			HttpServletRequest request, HttpServletResponse resonpse) {
		JSONObject root = JSON.object().success();
		boolean isSuccess = packingService.shipPacks(shipId, packSubmits);
		if (isSuccess == false) {
			root.error();
		}
		return root;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Object listPacks(
			@RequestParam(required=false,defaultValue="0",name="status") String status,
			HttpServletRequest request, HttpServletResponse resonpse) {
		JSONObject root = JSON.object().success();
		PackStatus packStatus = PackStatus.AVAIABLE;
		if(CheckUtil.isInteger(status)) {
			PackStatus tmpStatus = PackStatus.toPackStatus(Integer.valueOf(status));
			if(tmpStatus!=null) {
				packStatus = tmpStatus;
			}
		}
		List<PacksVw> packList=packingService.findPacksByStatus(packStatus);
		JSONArray array = root.createEmbedArray("data");
		packList.forEach(pack->array.add(JSONConverters.perparedAndGet(pack)));
		return root;
	}
}
