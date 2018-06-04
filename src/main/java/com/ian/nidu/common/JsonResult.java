package com.ian.nidu.common;

import java.util.HashMap;

/**
 * @description 返回值
 * @createTime 20180504 22:53
 * @author ian
 */
public class JsonResult extends HashMap<String, Object> {
	
	public final static String SUCCESS_KEY = "success";
	public final static String ERROR_MSG_KEY = "errorMsg";
	public final static String DEFAULT_ERROR_MSG = "请求失败";
	
	private static final long serialVersionUID = 3737164430538090036L;

	public static JsonResult getSuccessJsonResult() {
		return new JsonResult().put(SUCCESS_KEY, true);
	}
	
	public static JsonResult getErrorJsonResult(String errorMsg) {
		return new JsonResult().put(SUCCESS_KEY, false).put(ERROR_MSG_KEY, errorMsg == null ? DEFAULT_ERROR_MSG : errorMsg);
	}

	/**
	 * put进结果
	 * @param key
	 * @param value
     * @return
     */
	public JsonResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
