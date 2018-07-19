/**
 * 
 */
package com.openthinks.plc.core.common;

/**
 * @author dailey.yet@outlook.com
 *
 */
public final class CheckUtil {

	public static final boolean isLong(String input) {
		if (input == null)
			return false;
		try {
			Long.valueOf(input.trim());
			return true;
		} catch (NumberFormatException e) {
		} catch (Exception e) {
		}
		return false;
	}

	public static final boolean isInteger(String input) {
		if (input == null)
			return false;
		try {
			Integer.valueOf(input.trim());
			return true;
		} catch (NumberFormatException e) {
		} catch (Exception e) {
		}
		return false;
	}

}
