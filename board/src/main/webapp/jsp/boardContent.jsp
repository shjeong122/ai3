<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardContent.jsp</title>
</head>
<body>
   <h1> 게시글 내용 화면 </h1>
   <%
       request.setCharacterEncoding("utf-8");
       String content = (String) session.getAttribute("con");
   
   %>
   <%= content %>
</body>
</html>