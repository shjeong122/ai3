<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*"  %>  
<%@ page import="jspBook.Member" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>updateprocesse</title>
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
      
     //파라미터로 자료는 모든 문자열
      String id =  request.getParameter("id");
      String pwd  = request.getParameter("pwd");
      String name = request.getParameter("name");
      String email = request.getParameter("email");
      String numS = request.getParameter("num");
      Integer numI = Integer.valueOf(numS);
      int num = numI.intValue(); //nums는 "6" int6 변경해야됨 => db는 인트이므로
      // int num =Integer.valueOf(numS).intValue();
      
     
      
      
      String updateQuery = "update memberTbl set id=?, pwd=?, name=?, email=? where num=?" ;
      //SQL 쿼리문을 새로운 내용을 토대로 재 실행
      PreparedStatement pstmt = con.prepareStatement(updateQuery);
      
      //values ? 값에 하나씩 삽입하여 전송함
      pstmt.setString(1, id);
      pstmt.setString(2, pwd);
      pstmt.setString(3, name);
      pstmt.setString(4, email);
      pstmt.setInt(5, num);
      
      pstmt.executeUpdate();
      response.sendRedirect("memberList.jsp");
      %>

</body>
</html>