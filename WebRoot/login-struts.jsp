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


<title>登录</title>

<!--
	<script type="text/javascript" src="js/jsKJ/jquery-1.7.2.js"></script>
	-->
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div class="container">
		<div class="loginMaindiv">
			<div class="formdiv">
				<form class="form-horizontal" id="loginform" method="post"
					action="<%=path%>/new/mlogin.do">
					<div class="form-group">
						<label for="username" class="col-sm-3 control-label">用户名</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="username"
								name="username" placeholder="请输入登录名" />
						</div>
					</div>
					<div class="form-group">
						<label for="userpassword" class="col-sm-3 control-label">密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="userpassword"
								name="userpassword" placeholder="请输入密码" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-3 col-sm-10">
							<div class="checkbox">
								<label> <input type="checkbox" />记住我 </label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="mainbutton">
								<button type="submit" class="btn btn-primary btn-sm">提交</button>
								<button type="reset" class="btn btn-warning btn-sm">重置</button>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="hrefRight">
							<button type="button" class="btn btn-link btn-sm">忘记密码？</button>
							<button type="button" class="btn btn-link btn-sm"
								onclick="registerFun();">注册</button>
						</div>
					</div>
				</form>
				<!-- 使用标签时不用写path---国际化 -->
				<s:form   namespace="/new" action="taglogin" method="post">
					<!-- 尽量别分开 标签-->
					<s:textfield name = "us.username"/>用户名
					<s:password name = "us.userpassword"/>密码
					<s:submit value="提交"/>
				</s:form>
				<form class="form-horizontal csshide" id="registerform">
					<div class="form-group">
						<h3 class="h3">欢迎注册</h3>
					</div>
					<div class="form-group">
						<label for="newusername" class="col-sm-3 control-label">用户名</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="newusername"
								name="newusername" placeholder="请输入登录名" />
						</div>
					</div>
					<div class="form-group">
						<label for="newemail" class="col-sm-3 control-label">邮箱</label>
						<div class="col-sm-8">
							<input type="email" class="form-control" id="newemail"
								name="newemail" placeholder="请输入邮箱" />
						</div>
					</div>
					<div class="form-group">
						<label for="newsex" class="col-sm-3 control-label">性别</label>
						<div class="col-sm-8">
							<div class="radio">
								<label> <input type="radio" name="optionsRadios"
									id="optionsRadios1" value="option1"> 男 </label> <label>
									<input type="radio" name="optionsRadios" id="optionsRadios1"
									value="option1"> 女 </label>
							</div>
							<div class="radio">
								<label> <input type="radio" name="optionsRadios"
									id="optionsRadios2" value="option2" checked> 中性 </label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="newlove" class="col-sm-3 control-label">爱好</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="newlove"
								placeholder="请输入邮箱" />
						</div>
					</div>
					<div class="form-group">
						<label for="newpassword" class="col-sm-3 control-label">密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="newpassword"
								name="newpassword" placeholder="请输入密码" />
						</div>
					</div>
					<div class="form-group">
						<label for="repassword" class="col-sm-3 control-label">确认密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="repassword"
								name="repassword" placeholder="请输入确认密码" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="mainbutton">
								<button type="submit" class="btn btn-primary btn-sm">注册</button>
								<button type="reset" class="btn btn-warning btn-sm">重置</button>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="hrefRight">
							<button type="button" class="btn btn-link btn-sm"
								onclick="returnFun();">返回</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	$("input").focusout(
			function() {

				var value = $(this).val().trim();
				if (!value) {
					$(this).parent().addClass("has-error");
					return false;
				}
				var type = $(this).attr("type");
				if (type == "email") {
					var reg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
					if (!reg.test(value)) {
						$(this).parent().removeClass("has-error").addClass(
								"has-warning");
					} else {
						$(this).parent().removeClass("has-error").removeClass(
								"has-warning");
					}
				}
			});
	function registerFun() {
		$("#loginform").slideUp();
		$("#registerform").fadeIn();
		$("input").val("");
	}
	function returnFun() {
		$("#registerform").slideUp();
		$("#loginform").fadeIn();
	}
</script>

</html>
