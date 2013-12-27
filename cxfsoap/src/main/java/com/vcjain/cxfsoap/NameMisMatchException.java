package com.vcjain.cxfsoap;
/**
 * 
 */

/**
 * @author vcjain
 *
 */
public class NameMisMatchException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String message;
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @param code
	 * @param message
	 */
	public NameMisMatchException(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	
}
