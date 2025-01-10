<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
   <%
      //JDBC 드라이버 연결하기
      Class.forName("com.mysql.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"; //jdbc:mysql://localhost:3306/DB명?useUnicode=true&characterEncoding=utf8
    
      String dbName ="root";
      String dbPwd = "1234";
      
      //DB 연결하기
      Connection con = DriverManager.getConnection(url, dbName, dbPwd);
      
      request.setCharacterEncoding("utf-8");
      
      String num =  request.getParameter("num");
      
      String deleteQuery = "delete from memberTbl where num=" + num ;
      //SQL 쿼리문을 새로운 내용을 토대로 재 실행
      PreparedStatement pstmt = con.prepareStatement(deleteQuery);
            
      pstmt.executeUpdate();
      response.sendRedirect("memberList.jsp");
  %>
</body>
</html>