package com.dyg.demo.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.dyg.utils.i18n.I18nUtils;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace("/demo")
@Action
@Results({@Result(name="index",location="/WEB-INF/view/jsp/demo/demoIndex.jsp")})
public class DemoAction extends ActionSupport implements ServletRequestAware,SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7085828785957232491L;
	
	private HttpServletRequest request ;
	private Map<String,Object> session;
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	@Action("index")
	public String showIndex(){
		I18nUtils.doI18n(request);
		return "index";
	}
}
