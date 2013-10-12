<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆-小贷800</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"></link>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"></link>
<link rel="stylesheet" type="text/css" href="css/signin.css"></link>

<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	function validate(){
		var id = document.form.id.value;
		var pwd = document.form.pwd.value;
		var pattern = new RegExp("[^a-z0-9A-Z]");
		if(id.length==0||pwd.length==0){
			alert("用户名或密码不能为空");
			return false;
		}
		if(pattern.test(id)){
			alert("用户名只能有字母和数字组成");
			return false;
		}
		if(pattern.test(pwd)){
			alert("密码只能有字母和数字组成");
			return false;
		}
		return true;
		
	}

</script>
<style>
	body{
		font-weight:bold;
	}
	.center{
		text-align:center;
	}
	.link{
		text-decoration:underline;
		hover:cursor;
	}
</style>
</head>
<body>
	  <div class="container">

      <form class="form-signin" action="login" method="post" name="form" onsubmit="return validate()">
        <div class="center"><h2 class="form-signin-heading">登陆</h2></div>
        <input type="text" class="form-control" placeholder="用户名" name="id">
        <input type="password" class="form-control" placeholder="密码" name="pwd">
        <label class="checkbox">
          <input type="checkbox" value="remember-me" > 保存用户名密码
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit" >登陆</button>
        <br>
        <div class="center link"><a href="register.jsp">新用户注册</a></div>
        <div class="center link"><a href="index.xhtml">回到首页</a></div>
      </form>
      	

    </div>
</body>
</html>