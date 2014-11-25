/**
 *  Copyright(C) 2013 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package my.study.dynaweb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Descriptions
 *
 * @version 2014年11月21日
 * @author SUNTEC
 * @since JDK1.6
 *
 */
@JsonInclude(Include.NON_NULL)
public class APIResult {
	public static final String CODE_OK = "ok";
	
	private String code;
	private String message;
	private Object data;
	
	/**
	 * 
	 */
	public APIResult() {
	}
	
	
	
	public static APIResult errorResult(String code, String message) {
		APIResult ret = new APIResult();
		ret.code = code;
		ret.message = message;
		return ret;
	}
	
	public static APIResult okResult(Object data) {
		APIResult ret = new APIResult();
		ret.code = CODE_OK;
		ret.data = data;
		return ret;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
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
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

}
