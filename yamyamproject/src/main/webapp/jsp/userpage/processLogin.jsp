<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 백엔드</title>
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
  	
  	String uid = request.getParameter("uid");
  	String upw = request.getParameter("upw");
  	
  	String sql = "select * from userinfo where uid =?";
  	PreparedStatement pstm = con.prepareStatement(sql);
  	pstm.setString(1, uid);
  	
  	ResultSet rs = pstm.executeQuery();
  	if(rs.next()){
  		if(rs.getString("uid").equals(uid) && rs.getString("upw").equals(upw)) { 
  			session.setAttribute("uid",uid); // 로그인 후에 세션에 로그인 정보(uid)를 저장함
  			session.setAttribute("uname", rs.getString("uname")); // 로그인한 사람의 이름정보 저장
  	        out.println("<script>");
  	        out.println("alert('환영합니다');");
  	        out.println("window.location.href = '../mainother/main1.jsp';");
  	        out.println("</script>");
  		}else{
  			out.println("<script>");
  	        out.println("alert('아이디 혹은 비밀번호를 확인해주세요');");
  	        out.println("window.location.href = 'login.jsp';");
  	        out.println("</script>");
  		}  		
  	}else{
  		out.println("<script>");
  	    out.println("alert('아이디 혹은 비밀번호를 확인해주세요');");
  	    out.println("window.location.href = 'login.jsp';");
  	    out.println("</script>");
  	}
  	
  	
  	
  	%>
</body>
</html>