<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
	.title {text-align:center;}
</style>

<!-- body -->
	<h2 class="title">게시물 리스트</h2>
	
	<c:forEach var="rs" items="${boardlist}">
		<table>
			<thead>
			</thead>
			<tbody>
				
			</tbody>
		</table>
	</c:forEach>
	
</body>
</html>