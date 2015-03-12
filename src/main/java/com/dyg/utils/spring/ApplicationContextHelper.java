package com.dyg.utils.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author duyangang
 * @date 2015年3月12日
 * @time 下午3:27:53
 * 
 * 获得Spring的ApplicationContext对象
 * 
 */
public class ApplicationContextHelper implements ApplicationContextAware{
	
	private static  ApplicationContext context;
	public void setApplicationContext(ApplicationContext aContext)
			throws BeansException {
		context = aContext;
	}
	
	public static ApplicationContext getAppContext(){
		return context;
	}
	
}
