<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册-小贷800</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"></link>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"></link>
<link rel="stylesheet" type="text/css" href="css/signin.css"></link>
<link rel="stylesheet" type="text/css" href="css/style.css"></link>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<style>
	body{
		margin:0;
		padding:0;
		font-weight:bold;
		text-align:center;
	}
	.center{
		text-align:center;
	}
	#link{
		text-decoration:underline;
		hover:cursor;
	}
	#form{
		margin-left:35%;
		margin-top:5%;
	}
	
</style>
</head>
<body>
	  <div class="container">

          <form >
            <div class="col-xs-4" id="form" >
        <div class="center"><h2 class="form-signin-heading">注册</h2></div>
     	<input type="text" class="form-control" placeholder="用户名">
        <input type="password" class="form-control" placeholder="密码">
        <input type="password" class="form-control" placeholder="确认密码">
        <input type="text" class="form-control" placeholder="邮箱">
 		<br/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
        <br>
        <div class="center" id="link"><a href="index.xhtml">回到首页</a></div>
        </div>
      </form>
      	

    </div>
</body>
</html>