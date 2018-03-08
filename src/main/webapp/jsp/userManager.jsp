<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>地址</td>
		</tr>
		<c:forEach items="${user }" var="u">
			<tr>
				<td>${u.name}</td>
				<td>${u.age}</td>
				<td>${u.gender}</td>
				<td>${u.address}</td>
			</tr>
		</c:forEach>
	</table>
	<h1>Hello  小朋友！</h1>
</body>
</html>