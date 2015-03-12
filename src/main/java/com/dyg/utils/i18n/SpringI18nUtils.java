package com.dyg.utils.i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;

import com.dyg.utils.spring.ApplicationContextHelper;

/**
 * @author duyangang
 * @date 2015年3月12日
 * @time 下午3:30:41
 * 
 * Spring 对国际化的操作
 * 
 */
public class SpringI18nUtils {
	
	/**
	 * @return
	 * 
	 * 根据传入的key获得国际化的值
	 */
	public static String getMessage(String key,HttpServletRequest request){
		Locale locale = request.getLocale();
		String countryCode = locale.getCountry();//城市code
		System.out.println("===城市Code==="+countryCode);
		ApplicationContext context = ApplicationContextHelper.getAppContext();
		String value = context.getMessage(key, null, locale);
		return value;
	}
}
