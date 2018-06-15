/**
 * 
 */
package com.openthinks.plc.core.common;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.openthinks.plc.BizConstant;

/**
 * @author dailey.yet@outlook.com
 *
 */
public final class JSONObject extends LinkedHashMap<String, Object> implements Serializable {
	private static final long serialVersionUID = -5354418059526451221L;

	JSONObject() {
	}

	JSONObject(Map<? extends String, ? extends Object> map) {
		super(map);
	}

	@SuppressWarnings("unchecked")
	public <T> T getProperty(String propertyName, Class<T> propertyType) {
		Object source = getProperty(propertyName);
		Class<?> runtimClassType = source.getClass();
		if (propertyType == JSONArray.class && Collection.class.isAssignableFrom(runtimClassType)) {
			return (T) new JSONArray((Collection<JSONObject>) source);
		} else if (propertyType == JSONObject.class && Map.class.isAssignableFrom(runtimClassType)) {
			return (T) new JSONObject((Map<? extends String, ? extends Object>) source);
		} else {
			String value = source.toString();
			Class<T> targetType = propertyType;
			if (targetType == int.class || targetType == Integer.class) {
				return (T) Integer.valueOf(value);
			} else if (targetType == long.class || targetType == Long.class) {
				return (T) Long.valueOf(value);
			} else if (targetType == float.class || targetType == Float.class) {
				return (T) Float.valueOf(value);
			} else if (targetType == double.class || targetType == Double.class) {
				return (T) Double.valueOf(value);
			} else if (targetType == boolean.class || targetType == Boolean.class) {
				return (T) Boolean.valueOf(value);
			} else if (targetType == byte.class || targetType == Byte.class) {
				return (T) Byte.valueOf(value);
			} else if (targetType == short.class || targetType == Short.class) {
				return (T) Short.valueOf(value);
			} else if (targetType == char.class || targetType == Character.class) {
				return (T) Character.valueOf(value.charAt(0));
			} else if (targetType == String.class) {
				return (T) value;
			}
		}
		return (T) source;
	}

	public Object getProperty(String propertyName) {
		return get(propertyName);
	}

	public JSONObject addProperty(String propertyName, final Object value) {
		Object tmpVal = value;
		/**
		 * JS long,double长整形精度不够会丢失精度；故转成字符串
		 */
		if (value != null && (value.getClass() == long.class || value.getClass() == Long.class
				|| value.getClass() == double.class || value.getClass() == Double.class)) {
			tmpVal = String.valueOf(value);
		} else if (value instanceof Valueable) {
			tmpVal = ((Valueable<?>) value).value();
		}
		if(tmpVal==null) {
			tmpVal = "";
		}
		put(propertyName, tmpVal);
		return this;
	}

	public JSONObject addProperties(Map<String, Object> map) {
		map.entrySet().forEach((entry) -> {
			addProperty(entry.getKey(), entry.getValue());
		});
		return this;
	}

	JSONObject addEmbedArray(String propertyName, final JSONArray value) {
		addProperty(propertyName, value);
		return this;
	}

	JSONObject addEmbedJSONObj(String propertyName, final JSONObject value) {
		addProperty(propertyName, value);
		return this;
	}

	/**
	 * create a new embed {@link JSONObject} and put it in its entries
	 * 
	 * @param propertyName
	 *            String property name
	 * @return {@link JSONObject} created embed {@link JSONObject}
	 */
	public JSONObject createEmbedJSONObj(String propertyName) {
		JSONObject embedJSONObj = new JSONObject();
		addProperty(propertyName, embedJSONObj);
		return embedJSONObj;
	}

	/**
	 * create a new embed {@link JSONArray} and put it in its entries
	 * 
	 * @param propertyName
	 *            String property name
	 * @return {@link JSONArray} created embed {@link JSONArray}
	 */
	public JSONArray createEmbedArray(String propertyName) {
		JSONArray value = new JSONArray();
		addProperty(propertyName, value);
		return value;
	}

	public JSONObject removeProperty(String propertyName) {
		remove(propertyName);
		return this;
	}

	public JSONObject success() {
		addProperty("result", BizConstant.OperationResult.SUCCESS);
		removeProperty("errmsg");
		removeProperty("errcode");
		return this;
	}

	public JSONObject error() {
		addProperty("result", BizConstant.OperationResult.FAILED);
		return this;
	}

	public JSONObject error(String errorMessage) {
		addProperty("result", BizConstant.OperationResult.FAILED);
		addProperty("errmsg", errorMessage);
		return this;
	}

	public JSONObject error(String errorCode, String errorMessage) {
		addProperty("result", BizConstant.OperationResult.FAILED);
		addProperty("errcode", errorCode);
		addProperty("errmsg", errorMessage);
		return this;
	}

}
