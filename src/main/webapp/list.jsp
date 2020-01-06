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
<table>
	<tr>
		<td colspan="100">
			<form action="list">
				图书名：<input type="text" name="mohu" value="${mohu }"><input type="submit" value="搜索">
			</form>
		</td>
	</tr>
  <tr>
    <th>编号</th>
    <th>图书名</th>
    <th>类别</th>
    <th>手机号</th>
    <th>作者</th>
    <th>受欢迎程度</th>
    <th>日期</th>
    <th>图片</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${pageInfo.list }" var="tt">
      <tr>
	    <td>${tt.bid }</td>
	    <td>${tt.bname }</td>
	    <td>${tt.btype }</td>
	    <td>${tt.phone }</td>
	    <td>${tt.author }</td>
	    <td>${tt.hots }</td>
	    <td><img alt="图片损坏" src="lookimg?path=${tt.picurl }" height="50px" width="50px"></td>
	    <td>${tt.bdate }</td>
	    <td><a href="selecthx?bid=${tt.bid }"><input type="submit" value="更新"></a></td>
	  </tr>
  </c:forEach>
  <tr>
  	<td colspan="100">
  		<a href="list?pageNum=${pageInfo.prePage }&mohu=${mohu}"><<<</a>
  		<c:forEach begin="1" step="1" end="${pageInfo.pages }" var="aa">
  			<a href="list?pageNum=${aa}&mohu=${mohu}">${aa }</a>
  		</c:forEach>
  		<a href="list?pageNum=${pageInfo.nextPage }&mohu=${mohu}">>>></a>
  	</td>
  </tr>
</table>
</body>
</html>