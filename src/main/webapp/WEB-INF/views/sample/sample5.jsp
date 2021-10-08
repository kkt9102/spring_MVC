<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample5</title>
</head>
<body>
	<div>샘플파일 5번입니다.</div>
	<div>리턴타입은 Void 입니다.</div>
	<div>####################################</div>
	<p>${SampleVO.name}</p>
	<p>${SampleVO.price}</p>
	<div>####################################</div>
		<div style="border:1px solid #000000;">
	<h4>코드보기</h4>
	<div>@RequestMapping("/sample/sample5")</div>
		<div>&ensp;&ensp;public String sample4(Model model) {</div>
		<div>&ensp;&ensp;// 샘플데이터 만들기</div>
		<div>&ensp;&ensp;SampleVO sample = new SampleVO("샘플 아이템",10.99);</div>
		<div>&ensp;&ensp;</div>
		<div>&ensp;&ensp;logger.info("smaple4");</div>
		<div>&ensp;&ensp;</div>
		<div>&ensp;&ensp;model.addAttribute(sample);</div>
		<div>&ensp;&ensp;return "/sample/sample4";</div>
	<div>}</div>
	</div>	
</body>
</html>