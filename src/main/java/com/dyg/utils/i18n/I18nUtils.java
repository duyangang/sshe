package com.dyg.utils.i18n;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.util.LocalizedTextUtil;

public class I18nUtils {
	
	
	/**
	 * @param request
	 * 
	 * 在Java程序代码中玩国际化
	 * 
	 */
	public static String doI18n(HttpServletRequest request){
		String currentLocale = request.getLocale().toString();//获取本地语言
		System.out.println("本地国际化信息：" + currentLocale);
		request.getSession().setAttribute("WW_TRANS_I18N_LOCALE", LocalizedTextUtil.localeFromString(currentLocale, null));//将语言这种到环境中
		//然后用ResourceBundle获取相关的资源文件
		ResourceBundle resourceBundle = ResourceBundle.getBundle("ApplicationResources",request.getLocale());
		String value = resourceBundle.getString("com.dyg.test");
		System.out.println("国际化=====" + value);
		return value;
	}
}
