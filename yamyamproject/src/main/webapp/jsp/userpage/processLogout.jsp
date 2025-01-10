<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 백엔드</title>
</head>
<body>
	<%
	session.invalidate(); // 세션 무효화 (로그아웃)
	response.sendRedirect("login.jsp"); // 로그아웃 후 로그인 페이지로 리다이렉트
	%>
</body>
</html>