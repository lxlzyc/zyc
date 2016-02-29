<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ page erroePage="jsp/error.jsp" %> 错误页处理 --%>
<!-- 引入struts标签库     prefix别名-->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title><s:text name="login.title"/></title>


</head>

<body>
	<div class="container">
		<div class="loginMaindiv">
				<!-- 使用标签时不用写path---国际化 -->
				<!-- 令牌机制 token -->
				<s:form action="tokenAction.do"  method="post">
					<!-- 尽量别分开 标签-->
					<s:textfield name="username" key="login.username"></s:textfield>
					<!-- 此表单验证token -->
					<s:token></s:token>
					<s:submit value="%{getText('login.submit')}"></s:submit>
				</s:form>
				<a href="changeI18NAction.do?request_locale=zh_CN">切换中文</a>
				<a href="changeI18NAction.do?request_locale=en_US">change to en</a>
				
		</div>
	</div>
</body>


</html>
