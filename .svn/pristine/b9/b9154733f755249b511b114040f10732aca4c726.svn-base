/**
 * 
 */
package com.openthinks.plc.core.common;

/**
 * @author dailey.yet@outlook.com
 *
 */
@FunctionalInterface
public interface JSONObjectConverter {

	public JSONObject convert(Object bizModel);

	@SuppressWarnings("unchecked")
	public static <T> T cast(Object bizObj) {
		return (T) bizObj;
	}
	

	JSONObjectConverter NULL = (obj)->JSON.object();
	
}
