<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</head>
<body>
<form>
		<div>
			<label>department_id : <input type="text" name="departmentId" value="${depInfo.departmentId}"></label>
		</div>
		<div>
			<label>department_name : <input type="text" name="firstName" value="${depInfo.departmentName}"></label>
		</div>
		<div>
			<label>manager_id : <input type="text" name="lastName" value="${depInfo.managerId}"></label>
		</div>
		<div>
			<label>location_id : <input type="text" name="email" value="${depInfo.locationId}"></label>
		</div>
		<div>
			<button type="button" id="updateBtn">수정</button>
			<button type="button" onclick="location.href=empDelete?departmentId=${depInfo.departmentId}">삭제</button>
			<button type="button" onclick="location.href='depList'">목록으로</button>
		</div>
	</form>
</body>
</html>