package com.openthinks.plc;
import java.text.SimpleDateFormat; 

/** 
 * @description 解决Date类型返回json格式为自定义格式 
 * @author aokunsang 
 * @date 2013-5-28 
 */  
public class CustomObjectMapper extends com.fasterxml.jackson.databind.ObjectMapper {  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public CustomObjectMapper(){  
    	this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm"));
    }
} 