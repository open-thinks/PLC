/**
 * 
 */
package com.openthinks.plc.core.common;

/**
 * @author dailey.yet@outlook.com
 *
 */
public class Result<T> {
	private T value;
	
	private Result(T value) {this.value=value;};
	
	
	public T get() {
		return value;
	}
	
	public Result<T> setValue(T value) {
		this.value = value;
		return this;
	}
	
	public static final <T> Result<T> valueOf(T value){
		return new Result<>(value);
	}
}
