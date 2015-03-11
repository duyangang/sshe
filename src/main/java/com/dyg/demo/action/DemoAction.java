package com.dyg.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace("/demo")
@Action
@Results({@Result(name="save",location="/index.jsp")})
public class DemoAction extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
		
		return "success";
	}
	
	@Action("save")
	public String save(){
		
		return "save";
	}
}
