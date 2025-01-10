<%@page import="com.mysql.cj.ServerPreparedQueryTestcaseGenerator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>processJoin.jsp</title>
</head>
<body>
<% //DB연결 insert문 저장
	//join.jsp에서 입력할 값 가져오기
	
	//DB연결
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"; //jdbc:mysql://localhost:3306/DB명?useUnicode=true&characterEncoding=utf8";
	String dbName="root";
	String dbPwd="1234";
	Connection conn = DriverManager.getConnection(url, dbName, dbPwd);
	
	//입력할 값 가져오기
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String email = request.getParameter("email");

	//삽입 sql문 만들기
	String insertSql = "insert into memberTbl values(null, ?, ?, ?, ?)";
	PreparedStatement pstmt = conn.prepareStatement(insertSql);
	pstmt.setString(1, id);
	pstmt.setString(2, pwd);
	pstmt.setString(3, name);
	pstmt.setString(4, email);
	
	int r = pstmt.executeUpdate();
	response.sendRedirect("memberList.jsp");
	
%>
</body>
</html>