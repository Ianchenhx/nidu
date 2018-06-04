package com.ian.nidu.base;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ian.nidu.common.JsonResult;
import com.ian.nidu.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @description Controller基类
 * @createTime 20180504 22:53
 * @author ian
 */
public abstract class BaseController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	protected User getCurrentUser() {
		return (User)this.getSessionAttribute("user");
	}
	
	protected JsonResult successJsonResult() {
		return JsonResult.getSuccessJsonResult();
	}
	
	protected JsonResult errorJsonResult(String errorMsg) {
		return JsonResult.getErrorJsonResult(errorMsg);
	}
	
	protected HttpServletRequest getRequest() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	protected HttpServletResponse getResponse() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
	}
	
	protected HttpSession getSession() {
		return this.getRequest().getSession(true);
	}
	
	protected void setSessionAttribute(String name, Object value) {
		this.getSession().setAttribute(name, value);
	}
	
	protected Object getSessionAttribute(String name) {
		return this.getSession().getAttribute(name);
	}
	
	protected void setRequestAttribute(String name, Object value) {
		this.getRequest().setAttribute(name, name);
	}
	
	protected Object getRequestAttribute(String name) {
		return this.getRequest().getAttribute(name);
	}
	
	protected String getRequestParameter(String param) {
		return this.getRequest().getParameter(param);
	}
}
