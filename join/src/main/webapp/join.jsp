<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action = "processJoin,jsp" name="join" method="get">
		<label for="id">아이디</label>
		<input type="text" name="id"> <br>
		<label for="pw">비밀번호</label>
		<input type="password" name="pw"> <br>
		<label for="name">이름</label>
		<input type="text" name="name"> <br>
		<label for="email">이메일</label>
		<input type="text" name="email"> <br>
		
		<input type="submit" value="회원가입하기">
		<input type="reset" value="취소하기"> <br>

		<a href="memberList.jsp">전체 회원 리스트 보기</a>
	</form>
</body>
</html>