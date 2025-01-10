<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기 백엔드</title>
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
    
    String uname = request.getParameter("uname");
    String umail = request.getParameter("umail");
    String mailDomain = request.getParameter("mailDomain");
    
    String sql = "select * from userinfo where uname=? and umail=? and mailDomain=?";
    PreparedStatement pstm = con.prepareStatement(sql);    
    pstm.setString(1,uname);
    pstm.setString(2,umail);
    pstm.setString(3,mailDomain);
    
    ResultSet rs = pstm.executeQuery();
    rs.next();
    String findId = rs.getString("uid");
    if (rs.getString("uname").equals(uname) && rs.getString("umail").equals(umail) && rs.getString("mailDomain").equals(mailDomain)) {
       out.println("<script>");
       out.println("alert('ID :"+ findId +"');");
       out.println("window.location.href = 'login.jsp';");
       out.println("</script>");
    }
    %>
</body>
</html>