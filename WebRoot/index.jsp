<!DOCTYPE html>
<html lang="en">
    
<head>
        <title>Matrix Admin</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="css/matrix-login.css" />
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />

    </head>
    <body>
        <div id="loginbox">            
            <form id="loginform" method="post" class="form-vertical" action="loginServlet" onsubmit="loginFormPost(this);">
				 <div class="control-group normal_text"> <h3><img src="img/logo.png" alt="Logo" /></h3></div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lg"><i class="icon-user"></i></span><input id="Username" name="Username" type="text" placeholder="Username" />
                            
                        </div>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_ly"><i class="icon-lock"></i></span><input id="Password" name="Password" type="password" placeholder="Password" />
                           
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link btn btn-info" id="to-recover">Lost password?</a></span>
                    <span class="pull-right"><input type="submit" name="submit" class="btn btn-success" value="Login"/></span>
                </div>
            </form>
            <form id="recoverform" action="#" class="form-vertical">
				<p class="normal_text">Enter your e-mail address below and we will send you instructions how to recover a password.</p>
				
                    <div class="controls">
                        <div class="main_input_box">
                            <span class="add-on bg_lo"><i class="icon-envelope"></i></span><input type="text" placeholder="E-mail address" />
                        </div>
                    </div>
               
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link btn btn-success" id="to-login">&laquo; Back to login</a></span>
                    <span class="pull-right"><a class="btn btn-info">Recover</a></span>
                </div>
            </form>
        </div>
        
        <script src="js/jquery.min.js"></script> 
        <script src="js/jquery-1.7.2.js"></script>  
        <script src="js/matrix.login.js"></script> 
        <script>
        function checkLogin(){
        	var Username = $("#Username").val();
        	var Password = $("#Password").val();
        	if(Username == "" || Username == null){
        		$("#Username").attr("placeholder","请输入用户名");
        		return;
        	}
        	if(Password == "" || Password == null){
        		$("#Password").attr("placeholder","请输入密码");
        		return;
        	}
        	
//        	$.ajax({
//        		type:"post",
//        		url:"/seed/servlet/TestServlet",
//        		data: {Username:Username,Password:Password},
//        		async:true,
//        		success:function(data){
//        			var objs = eval("("+data+")");
//        			if(objs.msg == "true"){
//        				window.location.href ="index.html";
//        			}else{
//        				$("#Password").val("");
//        				$("#Password").attr("placeholder","请输入正确的用户名密码");
//        			}
//        		}
//        	});
        }
        	
        	
        </script>
    </body>

</html>
