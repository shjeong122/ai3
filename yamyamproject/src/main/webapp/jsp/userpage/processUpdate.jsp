<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인정보 변경 백엔드</title>
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
  	
  	String upw = request.getParameter("upw");
  	String sql = "update userinfo set upw = ? where uid = ?";
  	PreparedStatement pstm = con.prepareStatement(sql);
  	pstm.setString(1, upw);
  	pstm.setString(2, login);
  	
  	int rs = pstm.executeUpdate();
  	
  	out.println("<script>");
    out.println("alert('정보가 성공적으로 변경되었습니다.');");
    out.println("window.location.href = '" + request.getHeader("Referer") + "';");
    out.println("</script>");
  	%>
</body>
</html>