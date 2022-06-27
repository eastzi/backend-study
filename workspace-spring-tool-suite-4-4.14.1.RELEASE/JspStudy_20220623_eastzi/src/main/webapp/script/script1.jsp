<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	String[] name = new String[5];
	String[] email = new String[5];
	List<String> names = new ArrayList<String>();
	
	String madeName(String name) {
		return name + "님";
	}
	
	String madeEamil(String email) {
		return email + "@google.com";
	}
%>
<%
	names.add("김준일");
	names.add("김준일");
	names.add("김준일");
	names.add("김준일");
	names.add("김준일");
	name[0] = "김준일";
	email[0] = "asdf1234";
	name[1] = "김준이";
	email[1] = "asdf1235";
	name[2] = "김준삼";
	email[2] = "asdf1236";
	name[3] = "김준사";
	email[3] = "asdf1237";
	name[4] = "김준오";
	email[4] = "asdf1238";
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="name1" items="${names}">
				<tr>
					<td>${name1}</td>
					<td>${name1}</td>
					<td>${name1}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>