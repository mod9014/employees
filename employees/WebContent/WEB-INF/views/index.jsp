<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table border = "1">
			<thead>
				<tr>
					<th>테이블 이름</th>
					<th>전체 행의 수</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>departments</td>
					<td>${departmentsRowCount}</td>
				</tr>
				<tr>
					<td>employees</td>
					<td>${employeesRowCount}</td>
				</tr>
				<tr>
					<td>dept_manager</td>
					<td>${deptManagerRowCount}</td>
				</tr>
				<tr>
					<td>dept_emp</td>
					<td>${deptEmpRowCount }</td>
				</tr>
				<tr>
					<td>salaries</td>
					<td>${salariesRowCount }</td>
				</tr>
				<tr>
					<td>titles</td>
					<td>${titlesRowCount }</td>
				</tr>
			</tbody>
					
		</table>
	</div>
	<div>
		<ul>
			<li><a href = "${pageContext.request.contextPath}/departments/getDepartmentsList">부서목록</a></li>
			<li><a href = "${pageContext.request.contextPath}/employees/getEmployeesList">사원목록</a></li>
			<li>사원 목록 정렬
				<a href = "${pageContext.request.contextPath}/employees/getEmployeesListOrderby?order=asc">오름차순</a>
				<a href = "${pageContext.request.contextPath}/employees/getEmployeesListOrderby?order=desc">내림차순</a>
			</li>
			<li><a href = "${pageContext.request.contextPath}/deptManager/getDeptManagersList">매니져목록</a></li>
			<li><a href = "${pageContext.request.contextPath}/deptEmp/getdeptEmpList">목록</a></li>
			<li><a href = "${pageContext.request.contextPath}/salaries/getSalariesList">부서목록</a></li>
			<li><a href = "${pageContext.request.contextPath}/titles/getTitlesList">사원목록</a></li>
		</ul>
	</div>
</body>
</html>