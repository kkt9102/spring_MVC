<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample1</title>
</head>
<body>
	<div>샘플파일 1번입니다.</div>
	<div>리턴타입은 Void 입니다.</div>
	<div style="border:1px solid #000000;">
	<h4>코드보기</h4>
	<div>@RequestMapping("/sample/sample1")</div>
		<div>&ensp;&ensp;public void sample() {</div>
		<div>&ensp;&ensp;logger.info("sample1 called....................");</div>
		<div>&ensp;&ensp;return;</div>
	<div>}</div>
	</div>
</body>
</html>