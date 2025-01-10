<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 보기</title>
</head>
<body>
<h1>memberList </h1>
  <%
//JDBC 드라이버 연결하기
  Class.forName("com.mysql.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"; //jdbc:mysql://localhost:3306/DB명?useUnicode=true&characterEncoding=utf8

  String dbName ="root";
  String dbPwd = "1234";
  
  //DB 연결하기
  Connection con = DriverManager.getConnection(url, dbName, dbPwd);
  
  request.setCharacterEncoding("utf-8");
  String selectQuery = "select * from memberTbl";
  PreparedStatement pstmt = con.prepareStatement(selectQuery);
  ResultSet rs = pstmt.executeQuery();
  
  %>
<table border = 1>
    <tr> 
       <th> 번호 </th> <th> 아이디</th> <th>비밀번호</th> <th>이름</th> <th>이메일</th> <th>비고</th>
    </tr>
    <%
      while( rs.next() ) {
    %>
       <tr>
          <td><%= rs.getInt("num") %> </td>
          <td><%= rs.getString("id") %> </td>
          <td><%= rs.getString("pwd") %> </td>
          <td><%= rs.getString("name") %> </td>
          <td><%= rs.getString("email") %> </td>
          <td> <a href="update.jsp?num=<%= rs.getInt("num") %>"> 수정 </a>
               <a href="delete.jsp?num=<%= rs.getInt("num") %> "> 삭제 </a> </td>
       </tr>
    
    <% } %>
  </table>
</body>
</html>