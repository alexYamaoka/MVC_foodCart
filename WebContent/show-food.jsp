<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
	<h1 align="center">Menu</h1>
	<p align="center"><a href="index.jsp">index</a></p>
	<table border="1" cellpadding="30%" align="center">
		<tr>
			<th>id</th>
			<th>item</th>
			<th>price</th>
			
		</tr>
		<c:forEach var="items" items="${foodItems}">
			<tr>
				<td>${items.id}</td>
				<td>${items.item}</td>
				<td>${items.price}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>