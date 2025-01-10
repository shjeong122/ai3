<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	function check(){
		if (f.writer.value == ""){
			alert("이름을 입력해 주세요!!")
			f.writer.focus()
			return false
		}
		if (f.subject.value == ""){
			alert("제목을 입력해 주세요!!")
			f.subject.focus()
			return false
		}
		if (f.content.value == ""){
			alert("내용을 입력해 주세요!!")
			f.content.focus()
			return false
		}
		if (f.passwd.value == ""){
			alert("비밀번호을 입력해 주세요!!")
			f.passwd.focus()
			return false
		}
		return true
	}
</script>

<%
	if (isLogin == false) {%>
		<script type="text/javascript">
			alert("로그인 해 주세요")
			location.href="list.jsp"
		</script>
<%		
	}
%>
	
<html>
<head>
	<title>글 쓰기</title>
</head>
<body>
<form name="f" action="writePro.jsp" method="post" onsubmit="return check()">
	<input type="hidden" name="num" value="<%=num%>"/>
	<input type="hidden" name="num" value="<%=re_level%>"/>
	<input type="hidden" name="num" value="<%=re_step%>"/>
	<div align="center">
		<table border="1" width="90%">
			<tr bgcolor="lightgray">
				<td colspan="2" align="center">글쓰기</a></td>
			</tr>			
			<tr>	
				<td width="15%" align="center">이름</td>
				<td><input type="text" name="writer" value="<%=id%>" tabindex="1" readOnly></td>
			</tr>
			<tr>	
				<td width="15%" align="center">제목</td>
				<td><input type="text" name="subject" tabindex="2" style="width: 100%;"></td>
			</tr>
			<tr>	
				<td width="15%" align="center">이메일</td>
				<td><input type="text" name="email" tabindex="3" style="width: 100%;"></td>
			</tr>
			<tr>	
				<td width="15%" align="center">내용</td>
				<td><textarea name="content" tabindex="4" style="width: 100%;" rows="15"></textarea></td>
			</tr>
			<tr>	
				<td width="15%" align="center">비밀번호</td>
				<td><input type="password" tabindex="5" name="passwd"></td>
			</tr>
			<tr>	
				<td colspan="2" align="center">
					<input type="hidden" name="ip" value="<%=request.getRemoteAddr()%>">
				 	<input type="submit" value="제출">
					<input type="button" value="다시 작성" onclick="location.href='<%=request.getContextPath()%>/board/writeForm.jsp';">
					<input type="button" value="목록 보기" onclick="location.href='<%=request.getContextPath()%>/board/list.jsp';">
				</td>
			</tr>
		</table>
	</div>
</form>
</body>
</html>
