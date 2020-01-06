<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="upd" enctype="multipart/form-data" method="post">
	<input type="text" name="bid" value="${map.bid }"><br>
	图书名：<input type="text" name="bname" value="${map.bname }"><br>
	类别：<input type="text" name="btype" value="${map.btype }"><br>
	手机号：<input type="text" name="phone" value="${map.phone }"><span style="color: red">${errophone }</span><br>
	作者：<input type="text" name="author" value="${map.author }"><br>
	受欢迎程度：<input type="text" name="hot" value="${map.hots }"><span style="color: red">${errohot }</span><br>
	日期：<input type="date" name="bdate" value="${map.bdate }"><br>
	头像：<input type="file" name="myFile" value="${map.picurl }"><br>
	<input type="submit" value="更新">
</form>
</body>
</html>