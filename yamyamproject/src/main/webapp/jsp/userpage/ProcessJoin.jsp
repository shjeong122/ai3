<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 백엔드</title>
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
  	String uname = request.getParameter("uname");
  	String upw = request.getParameter("upw");
  	String pwHint = request.getParameter("pwHint");
  	String umail = request.getParameter("umail");
  	String mailDomain = request.getParameter("mailDomain");
  	
  	String sql = "insert into userinfo values(null,?,?,?,?,?,?)";
  	PreparedStatement pstm = con.prepareStatement(sql);
	pstm.setString(1, uid);  	
	pstm.setString(2, uname);
	pstm.setString(3, upw);
	pstm.setString(4, pwHint);
	pstm.setString(5, umail);
	pstm.setString(6, mailDomain);
	
	int rs = pstm.executeUpdate();
	
	out.println("<script>");
    out.println("alert('회원가입 완료 로그인 진행해주세요');");
    out.println("window.location.href = 'login.jsp';");
    out.println("</script>");
	
	
	/*// 위의 프로세스를 끝내고 바로 이전 페이지로 이동
	String previousPage = request.getHeader("Referer");
		if (previousPage != null) {
		response.sendRedirect(previousPage);
		}
		*/
  	%>
  	
  	
</body>
</html>