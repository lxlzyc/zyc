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

    		<div class="loginBtndiv">
    		<span>用户名<%=session.getAttribute("username") %></span>	
    		
    		</div>
 			<div>
 			<span onclcik="ajaxFun();">ajax</span>
 			</div>
    </div>
  </body>
  <script type="text/javascript">
  	var xmlHttp;
  	function createXMLHttp(){
  		if(window.XMLHttpRequest){
  			xmlHttp = new XMLHttpRequest();
  		}else{
  			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
  		}
  	}
  	function ajaxFun(){
 		createXMLHttp();
 		xmlHttp.open("POST","content.htm");
 		xmlHttp.onreadystatechange = ajaxFunBack;
 		xmlHttp.send(null);
  	}
  </script>
</html>
