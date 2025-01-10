<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="jspBook.Member" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>updateForm</title>
</head>
<body>

  <%
   Member m =(Member) session.getAttribute("sessionMember");
 %>
  <form action = "updateProcess.jsp" name="join" method="post">
     <input type="hidden" value="<%= m.getNum() %>" name="num">
     <label for="id" > 아이디 </label>
     <input type="text" name="id" value="<%= m.getId() %>" ><br>
      <label for="pwd" > 비밀번호 </label>
     <input type="password" name="pwd" value="<%= m.getPwd()%>"><br>
      <label for="name" > 이름 </label>
     <input type="text" name="name" value="<%= m.getName()%>"><br>
      <label for="email" > 이메일 </label>
     <input type="text" name="email" value="<%= m.getEmail() %>"><br>
     <input type="submit" value="수정하기">
     <input type="reset" value="취소하기" >
      
  </form>
</body>
</html>