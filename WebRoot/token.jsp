<%@page import="com.lxl.vo.Userlogin"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ page erroePage="jsp/error.jsp" %> 错误页处理 --%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html  lang="zh-CN">
  <head>
  <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="css/bootstrap-theme.css" rel="stylesheet" media="screen">


    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../../docs-assets/js/html5shiv.js"></script>
      <script src="../../docs-assets/js/respond.min.js"></script>
    <![endif]-->
 
    
    <title>token</title>
    
	<!--
	<script type="text/javascript" src="js/jsKJ/jquery-1.7.2.js"></script>
	-->
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

<body>
	token--表单重复提交
</body>
 
</html>
