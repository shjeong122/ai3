<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 목록 보기 </title>
<style>
   <style>
   body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f9;
      margin: 0;
      padding: 0;
   }
   h1 {
      text-align: center;
      color: #333;
      margin: 20px 0;
   }
   table {
      width: 80%;
      margin: 0 auto;
      border-collapse: collapse;
      box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
   }
   th, td {
      padding: 15px;
      text-align: center;
   }
   th {
      background-color: #4CAF50;
      color: white;
      font-weight: bold;
   }
   td {
      background-color: #f9f9f9;
   }
   td:nth-child(odd) {
      background-color: #e9e9f0;
   }
   tr:hover {
      background-color: #f1f1f1;
   }
   a {
      color: #4CAF50;
      text-decoration: none;
      font-weight: bold;
   }
   a:hover {
      text-decoration: underline;
   }
   #content {
      width: 80%;
      margin: 20px auto;
      padding: 20px;
      background-color: #ffffff;
      border: 1px solid #ddd;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
   }
   #content p {
      font-size: 16px;
      color: #333;
   }
</style>
</head>
<body>
  <% 
  request.setCharacterEncoding("utf-8");
  Class.forName("com.mysql.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false"; //jdbc:mysql://localhost:3306/DB명?useUnicode=true&characterEncoding=utf8

  String dbName ="root";
  String dbPwd = "1234";
//DB 연결하기
  Connection con = DriverManager.getConnection(url, dbName, dbPwd);
  
  request.setCharacterEncoding("utf-8");
  String selectQuery = "select * from board order by num desc";
  PreparedStatement pstmt = con.prepareStatement(selectQuery);
  ResultSet rs = pstmt.executeQuery();
  

  %>
  <div>
     <h1> 게시판 </h1>
     <table>
       <tr><th>번호 </th><th>제목</th><th>작성자</th><th>작성일</th> </tr>
       <%  
           while( rs.next() ) {
        	    session.setAttribute("con", rs.getString("content") ) ;
       %>
       
       <tr><td> <%= rs.getInt("num") %> </td>
       
           <td> <a href="boardContent.jsp">  <%= rs.getString("title") %> </a>  </td>
           <td> <%= rs.getString("writer") %></td>
           <td> <%= rs.getDate("writeDate") %> </td> </tr>
       <%    } %>    
     </table>
    
  </div>
  <div>
    <p>
     <button> <a href="boardInsert.jsp" > 입력하기 </a>  </button>
     <button> <a href="boardUpdate.jsp" > 고치기 </a> </button>
     <button> <a href="boardDelete.jsp" > 삭제하기 </a> </button> 
  </div>
</body>
</html>