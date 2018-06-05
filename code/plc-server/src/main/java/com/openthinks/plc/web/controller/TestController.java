package com.openthinks.plc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.plc.core.common.JSON;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("index.jhtml")
	@ResponseBody
	public Object test() {
		return JSON.object().success();
	}
}
