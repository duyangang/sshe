<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="com.dyg.utils.i18n.SpringI18nUtils" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	demo index page!<br />
<%-- 	<fmt:message key="com.dyg.test"/> --%><!-- 纯jsp环境中使用 -->
<%-- <%= SpringI18nUtils.getMessage("com.dyg.test", request)%><!-- 使用Spring提供的国际化方案 --> --%>
<%-- 	<s:text name="com.dyg.test"></s:text><!-- struts2提供的 --> --%>

</body>
</html>