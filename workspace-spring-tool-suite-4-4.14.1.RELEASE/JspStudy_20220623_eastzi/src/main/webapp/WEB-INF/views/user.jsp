<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	//String name = (String)request.getAttribute("name"); //=> obj�� ���ɽ��� �� ���� string�� �ٿ� �ٿ��ɽ���
%>

 <!-- request ������� ��� - ����� ��ü -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����� ����</h1>
	<label>�̸�: </label>
	<input type="text" value="${name}"> 
</body>
</html>