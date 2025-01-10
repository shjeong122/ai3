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
  <%
    // DB 연결하기 
    //join.jsp에서 입력합 값을 가져오기 
     request.setCharacterEncoding("utf-8");
    
    //DB연결
     Class.forName("com.mysql.jdbc.Driver"); // 메모리에 드라이브 올리기
     String url = "jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
     String dbName="root";
     String dbPass="1234";
     Connection conn = DriverManager.getConnection(url, dbName, dbPass);
     
    // 삭제할 게시판 번호를 가져온다.
     String num1 = request.getParameter("num");
     System.out.print( num1 );
     // "7"--> 7 문자열 7을 숫자 기본형 7로 바꾸기
     int num = Integer.valueOf(num1).intValue();
      
     // Sql 실행하기 delete from board where num = 7 ;
     String deleteSql = "delete from board where num = ?";
     PreparedStatement pstmt = conn.prepareStatement(deleteSql);
     pstmt.setInt(1, num);
     
     pstmt.executeUpdate();
    // boardList.jsp 다시 화면 보이기
     response.sendRedirect("boardList.jsp") ;
 %>
</body>
</html>