<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴 백엔드</title>
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
  	// 로그인되어있는 회원의 정보를 받아오는 로직
  	String sql1 = "select * from userinfo where uid=?";
  	PreparedStatement pstm1 = con.prepareStatement(sql1);
  	pstm1.setString(1, login);
  	ResultSet rs1 = pstm1.executeQuery();
  	
  	// 삭제하는 로직
  	String sql = "delete from userinfo where uid=?";
  	PreparedStatement pstm = con.prepareStatement(sql);
  	pstm.setString(1, login);
  			
  	rs1.next();
  	if (rs1.getString("upw").equals(upw)) {
  		int rs = pstm.executeUpdate();
  		session.invalidate();
  		out.println("<script>");
        out.println("alert('탈퇴완료. 이용해주셔서 감사합니다.');");
        out.println("window.location.href = '../mainother/main1.jsp';");
        out.println("</script>");
  		
  	}else {
  		out.println("<script>");
        out.println("alert('비밀번호를 확인해주세요');");
        out.println("window.location.href = 'delete.jsp';");
        out.println("</script>");
  	}
  	
	%>
</body>
</html>