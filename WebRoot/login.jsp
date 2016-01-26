<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ page erroePage="jsp/error.jsp" %> 错误页处理 --%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<script type="text/javascript" src="js/jsKJ/jquery-1.7.2.js"></script>
	-->
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="loginMaindiv">
    	<form name="submitForm" method="post" action="loginServlet" onsubmit="return loginFormPost(this);">
    		<div class="loginInputdiv">
    		<div class="loginInputLidiv"><span>登录名:</span><input type="text" size="18" id="username" name="username" placeholder="请输入登录名"></input></div>		
    		<div class="loginInputLidiv"><span>密码:</span><input type="password" size="18" id="password" name="password" placeholder="请输入密码"></input></div>
    		</div>
    		<div class="loginBtndiv">
    		<input type="button" id="submitbtn" name="submitbtn" value="登录"  onclick="loginFormPost(this.form)"></input>   		
    		<input type="reset" id="resetbtn" name="resetbtn" value="重置"></input>
    		</div>
    		<div class="loginSpandiv">
    		<a href="jsp/getPassword.jsp">忘记密码？</a>
    		</div>
    	</form>
    </div>
  </body>
  <script type="text/javascript">
  	function loginFormPost(form){
  	
  		var username = form.username.value;
  		var password = form.password.value;
  		if(username == ""){
  			alert("请输入用户名");
  			return false;
  		}
  		if(username.length < 4){
  			alert("请输入正确的用户名");
  			return false;
  		}
  		if(password == ""){
  			alert("请输入密码");
  			return false;
  		}
  		if(password.length < 6){
  			alert("请输入正确的密码");
  			return false;
  		}
  		document.submitForm.submit();
  	}
  </script>
</html>
