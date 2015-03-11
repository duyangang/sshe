package com.dyg.demo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/person") //访问路径的包名
@Results( { @Result(name = "success", location = "/index.jsp"), 
        @Result(name = "error", location = "/hello.jsp") })
@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") }) 
public class PersonAction extends ActionSupport {
 
 
    public PersonAction() {
        // TODO Auto-generated constructor stub
    } 
    @Action()  //访问路径的action名， 想要访问selUser 这个方法 地址为 http://localhost:8080/工程名/person/login
     public String selUser(){
            System.out.println("login-index");
         return SUCCESS;
         }
}
