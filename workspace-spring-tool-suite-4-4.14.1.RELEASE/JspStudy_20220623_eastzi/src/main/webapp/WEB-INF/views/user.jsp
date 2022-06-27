<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	//String name = (String)request.getAttribute("name"); //=> obj로 업케스팅 된 것을 string을 붙여 다운케스팅
%>

 <!-- request 선언없이 사용 - 내장된 객체 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 정보</h1>
	<label>이름: </label>
	<input type="text" value="${name}"> 
</body>
</html>