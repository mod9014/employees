<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원목록</h1>
	<%-- <form method = "get" action = "${pageContext.request.contextPath}/employees/getEmployeesList"">
		<select name = limit>
			<option value = "10">10</option>
			<option value = "20">20</option>
			<option value = "30">30</option>
			<option value = "40">40</option>
			<option value = "50">50</option>
		</select>
		<button type = "submit">변경</button>
	</form> --%>
	<table border = "1">
		<thead>
			<tr>
				<th>사원 번호</th>
				<th>사원 생일</th>
				<th>사원 성</th>
				<th>사원 이름</th>
				<th>사원 성별</th>
				<th>입사 날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="employees" items="${list}">
				<tr>
					<td>${employees.empNo}</td>
					<td>${employees.birthDate}</td>
					<td>${employees.firstName}</td>
					<td>${employees.lastName}</td>
					<td>${employees.gender}</td>
					<td>${employees.hireDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button onclick = "location.href='${pageContext.request.contextPath}/'">Home</button>
</body>
</html>