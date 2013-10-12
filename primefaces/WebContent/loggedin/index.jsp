<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;UTF-8">
<title>Insert title here</title>
</head>
<body>
	你好,<%	
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			String id = (String)request.getSession().getAttribute("id");
			out.write(id);
		%>!<br/>
	网站正在建设,小贷800更多功能敬请关注!
</body>
</html>