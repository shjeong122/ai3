<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="board.Board" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
      // 드라이브 연결하기
      // sql 실행 select * from boardTbl where num = 1
      // 나온 결과를 화면 띄워주기 
      // 수정한 것 입력받아서 
      // update 실행해주기 
      // 화면 boardList.jsp 보여주기 
      
      //join.jsp에서 입력합 값을 가져오기 
     request.setCharacterEncoding("utf-8");
    
    //DB연결
     Class.forName("com.mysql.jdbc.Driver"); // 메모리에 드라이브 올리기
     String url = "jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
     String dbName="root";
     String dbPass="1234";
     Connection conn = DriverManager.getConnection(url, dbName, dbPass);
     
    // 수정할 게시판 번호를 가져온다.
     String num1 = request.getParameter("num");
     System.out.print( num1 );
     // "7"--> 7 문자열 7을 숫자 기본형 7로 바꾸기
     int num = Integer.valueOf(num1).intValue();
     
     String selectQuery = "select * from board where num = ?";
     PreparedStatement pstmt = conn.prepareStatement(selectQuery);
     pstmt.setInt( 1, num ); 
     
     ResultSet rs = pstmt.executeQuery();
     
     rs.next();
    
     Board b = new Board();
     b.setNum(  rs.getInt( "num")  ); 
     b.setTitle( rs.getString( "title"));
     b.setContent( rs.getString("content"));
     b.setWriter( rs.getString("writer"));
    // b.setWriteDate( rs.getString("writeDate") );
         
     session.setAttribute("board", b ); 
     
     response.sendRedirect("updateForm.jsp");
      
   
   %>
</body>
</html>