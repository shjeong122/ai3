<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  //DB연결 insert문 저장 
     //join.jsp에서 입력합 값을 가져오기 
     request.setCharacterEncoding("utf-8");
    
    //DB연결
     Class.forName("com.mysql.jdbc.Driver"); // 메모리에 드라이브 올리기
     String url = "jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
     String dbName="root";
     String dbPass="1234";
     Connection conn = DriverManager.getConnection(url, dbName, dbPass);
     //입력한 값을 가져오기 input 태그안에 name을 써준다 
     String post_id = request.getParameter("post_id");
     String title = request.getParameter("title");
     String content = request.getParameter("content");
     String author = request.getParameter("author");
     //삽입sql문을 만들기 
     String insertSql = "insert into board(num, title, content, writer) values ( null, ?, ?, ?)";
     PreparedStatement  pstmt = conn.prepareStatement(insertSql);
     pstmt.setString(1, title);
     pstmt.setString(2, content);
     pstmt.setString(3, author);
    
     
     int r = pstmt.executeUpdate();
     response.sendRedirect("boardList.jsp");
 %>
</body>
</html>