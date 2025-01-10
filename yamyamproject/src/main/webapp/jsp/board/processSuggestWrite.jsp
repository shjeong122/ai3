<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>건의사항 쓰기 백엔드</title>
</head>
<body>
	<%
	String login =(String) session.getAttribute("uid");
	
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
  	
  	// session.setAttrunute("id",id) 이런식으로 세션에 아이디 저장해두고// 
  	// 가져올 수 있나? => ㅇㅇ 가능함 ㅋㅋ 예상한대로 해냈음 //
  			
  	String suggestTitle = request.getParameter("suggestTitle");
  	String suggestContent = request.getParameter("suggestContent");
  	
  	
  	String sql = "insert into suggest values(null,?,?,?,default,default)";
  	PreparedStatement pstm = con.prepareStatement(sql);
  	pstm.setString(1, login);
  	pstm.setString(2, suggestTitle);
  	pstm.setString(3, suggestContent);
  	
  	int rs = pstm.executeUpdate();
  	response.sendRedirect("suggestion.jsp");
	%>
	
	
	
	
	
</body>
</html>