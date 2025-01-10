<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
 <head>
   <meta charset="UTF-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <title>건의사항</title>
   <link rel="stylesheet" href="../../yamyam/suggestion.css" />
   <link rel="stylesheet" href="../../yamyam/header.css" />
   <link rel="stylesheet" href="../../yamyam/main1.css" />
   <style>
     @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
   </style>
 </head>
 <body>
  <%
  	request.setCharacterEncoding("utf-8");
  	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/board?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
  	String id = "root";
  	String pw = "1234";
  	
  	try {
  		Class.forName("com.mysql.jdbc.Driver");
  		con = DriverManager.getConnection(url, id ,pw);
  	}catch(Exception e) {  		
  	}
  	
  	String sql = "select * from suggest order by no desc";
  	PreparedStatement pstm = con.prepareStatement(sql);
  	ResultSet rs = pstm.executeQuery();
  
	%>
	
	<% 
	String login = (String) session.getAttribute("uid"); 
	
	if (login != null) {
	%>
	<%@ include file="header1.jsp"%>
	<main>
      <h1>|&nbsp;&nbsp;&nbsp;건의 사항&nbsp;&nbsp;&nbsp;|</h1>
      <div>
        <table class="suggestion">
          <tr id="header">
            <td class="num">번호</td>
            <td class="title">제목</td>
            <td class="wirter">작성자</td>
            <td class="writeDate">작성일</td>
          </tr>
          <%
		 while(rs.next()) {
			%>
			<tr><td><%= rs.getInt("no") %></td>
			<td><a href=# style="text-decoration: none"><%= rs.getString("suggestTitle") %></a></td>
			<td><%= rs.getString("uid") %></td>
			<td><%= rs.getString("ndate") %></td></tr>
		    <% } %>
          <!--
          <script>
            var i,
              day = 20;
            for (i = 10; i > 0; i--) {
              document.write("<tr class='body'>");
              document.write("<td>" + i + "</td>");
              document.write("<td class='title'>제목입니다.</td>");
              document.write("<td>작성자</td>");
              document.write("<td>24-01-" + day-- + "</td>");
              document.write("</tr>");
            }
          </script>-->
        </table>
        <br />
        <button onclick="location.href='suggestWrite.jsp'">글쓰기</button>
      </div>
	<%@ include file="footer1.jsp"%>
	<%
	} else {
	%>
	<%@ include file="header2.jsp"%>
	<main>
      <h1>|&nbsp;&nbsp;&nbsp;건의 사항&nbsp;&nbsp;&nbsp;|</h1>
      <div>
        <table class="suggestion">
          <tr id="header">
            <td class="num">번호</td>
            <td class="title">제목</td>
            <td class="wirter">작성자</td>
            <td class="writeDate">작성일</td>
          </tr>
           <%
		 while(rs.next()) {
			%>
			<tr><td><%= rs.getInt("no") %></td>
			<td><a href=# style="text-decoration: none"><%= rs.getString("suggestTitle") %></a></td>
			<td><%= rs.getString("uid") %></td>
			<td><%= rs.getString("ndate") %></td></tr>
		    <% } %>
          <!--
          <script>
            var i,
              day = 20;
            for (i = 10; i > 0; i--) {
              document.write("<tr class='body'>");
              document.write("<td>" + i + "</td>");
              document.write("<td class='title'>제목입니다.</td>");
              document.write("<td>작성자</td>");
              document.write("<td>24-01-" + day-- + "</td>");
              document.write("</tr>");
            }
          </script>-->
        </table>
        <br />
        <button onclick="location.href='../userpage/login.jsp'">글쓰기</button>
      </div>
	<%@ include file="footer2.jsp"%>
	<% } 
	%>

	
</body>
</html>