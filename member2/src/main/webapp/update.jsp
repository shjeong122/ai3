<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*"  %>  
<%@ page import="jspBook.Member" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
   <%
   request.setCharacterEncoding("utf-8");
   
   String num11 =  request.getParameter("num"); //"6"
   
   Integer num22 = Integer.valueOf(num11); //"6" -> 6
   int num33 = num22.intValue();
 //JDBC 드라이버 연결하기
   Class.forName("com.mysql.jdbc.Driver");
   String url="jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"; 
   //jdbc:mysql://localhost:3306/DB명?useUnicode=true&characterEncoding=utf8

   String dbName ="root";
   String dbPwd = "1234";
   
   //DB 연결하기
   Connection con = DriverManager.getConnection(url, dbName, dbPwd);
   
   String selectQuery = "select * from memberTbl where num=?";
   
   PreparedStatement pstmt = con.prepareStatement(selectQuery);
   
   pstmt.setInt(1, num33);
   
   ResultSet rs = pstmt.executeQuery();
   
   int num1 = 0;
   String id1 = null;
   String pwd1 = null;
   String name1 = null;
   String email1  = null;
   
   rs.next();  //rs.next() 포인터를 resultset위치로 옮겨주는 명령이므로 1개라도 꼭 써주어야 합니다. 
   
	   num1 = rs.getInt("num");
	   id1 = rs.getString("id");
	   pwd1 = rs.getString("pwd");
	   name1= rs.getString("name");
	   email1 = rs.getString("email");
  
	   Member member =new  Member();
	   member.setNum(num1);
	   member.setId(id1);
	   member.setPwd(pwd1);
	   member.setName(name1);
	   member.setEmail(email1);
   
   session.setAttribute("sessionMember", member);
    
   response.sendRedirect("updateForm.jsp");
  %>
</body>
</html>