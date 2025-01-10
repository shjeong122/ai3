<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 변경</title>
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <link rel="stylesheet" href="../../yamyam/mypage2.css" />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
  </head>
  <body>
    <% 
    String login = (String) session.getAttribute("uid");
    
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
  	
  	String sql = "select * from userinfo where uid=?";
  	PreparedStatement pstm = con.prepareStatement(sql);
  	pstm.setString(1, login);
	ResultSet rs = pstm.executeQuery();
	rs.next();
  	
	if (login != null) {
	%>
	
	<%@ include file="header1.jsp"%>
	
    <main>
      <div id="middletitle"><h1>Yam Yam Academy 개인정보 변경</h1></div>

      <form action="processUpdate.jsp" id="user">
        <fieldset>
          <legend>개인정보 수정</legend>
          <label for="userID">
            <h1>아&nbsp;&nbsp;이&nbsp;&nbsp;디</h1>
            <style>
              label[for="userID"] h1 {
                font-size: 14px;
              }
            </style>
            <input type="text" id="uid" name="uid" value="<%=rs.getString("uid")%>" readonly />
          </label>
          <label for="username">
            <h1>이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름</h1>
            <style>
              label[for="username"] h1 {
                font-size: 14px;
              }
            </style>
            <input
              type="text"
              id="uname"
              name="uname"
              value="<%=rs.getString("uname")%>"
              readonly
            />
          </label>
          <label for="password">
            <h1>비밀번호&nbsp;</h1>
            <style>
              label[for="username"] h1 {
                font-size: 14px;
              }
            </style>
            <input
              type="password"
              id="upw"
              name="upw"
              placeholder="비밀번호"
            />
          </label>
          <label for="useremail">
            <h1>이&nbsp;&nbsp;메&nbsp;&nbsp;일</h1>
            <style>
              label[for="useremail"] h1 {
                font-size: 14px;
              }
            </style>
            <input
              type="text"
              id="useremail"
              name="useremail"
              value="<%=rs.getString("umail")%>@<%=rs.getString("mailDomain") %>"
              readonly
            />
          </label>
        </fieldset>
        <button type="submit">변경</button>
      </form>
    </main>
   <%@ include file="footer2.jsp"%>
  </body>
</html>
		
	<%
	} else {
		response.sendRedirect("login.jsp");
} %>
   