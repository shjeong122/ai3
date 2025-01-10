<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
</head>
<body>
<form action = "processJoin.jsp" name="join" method="post">
     <label for="id" > 아이디 </label>
     <input type="text" name="id" ><br>
      <label for="pwd" > 비밀번호 </label>
     <input type="password" name="pwd" ><br>
      <label for="name" > 이름 </label>
     <input type="text" name="name" ><br>
      <label for="email" > 이메일 </label>
     <input type="text" name="email" ><br>
     <input type="submit" value="회원가입하기">
     <input type="reset" value="취소하기" ><br>
     <a href="memberList.jsp">회원들 리스트보기</a>
  </form>
</body>
</html>