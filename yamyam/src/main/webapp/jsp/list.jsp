<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>메인화면</title>
    <link rel="stylesheet" href="../yam/header.css" />
    <link rel="stylesheet" href="../yam/main1.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"
    />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
      </head>
<body>
<header>
      <div id="title">
        <a href="main1.html">
          <img src="../wpImages/mainbanners/headBanner.png" />
          <h1></h1>
        </a>
      </div>
      <nav>
        <ul class="personal">
          <li>|</li>
          <li><a href="mypage5-1.html">회원가입</a></li>
          <li>|</li>
          <li><a href="mypage.html">로그인/로그아웃</a></li>
          <li>|</li>
        </ul>
      </nav>
      <nav>
        <ul class="fixmenu">
          <li class="header">
            <a><img src="../wpImages/logo.png" id="menulogo1" /></a>
          </li>
          <li class="header">
            <a href="gnbSubmenu.html">학원 소개</a>
            <ul class="hovermenu">
              <li><a href="gnbSubmenu.html">학원 소개</a></li>
              <li><a href="gnbSubmenu2.html">찾아오시는 길</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="korean.html">한식 과정</a>
            <ul class="hovermenu">
              <li><a href="korean.html">강사 소개</a></li>
              <li><a href="koreaCurri.html">수업 커리큘럼</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="chinese.html">중식 과정</a>
            <ul class="hovermenu">
              <li><a href="chinese.html">강사 소개</a></li>
              <li><a href="chinaCurri.html">수업 커리큘럼</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="japanese.html">일식 과정</a>
            <ul class="hovermenu">
              <li><a href="japanese.html">강사 소개</a></li>
              <li><a href="japanCurri.html">수업 커리큘럼</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="notice.html">게 시 판</a>
            <ul class="hovermenu">
              <li><a href="notice.html">공지사항</a></li>
              <li><a href="suggestion.html">건의사항</a></li>
              <li><a href="review.html">소중한 수강평</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="mypage.html">마이페이지</a>
            <ul class="hovermenu">
              <li><a href="mypage3.html">아이디 찾기</a></li>
              <li><a href="mypage4.html">비밀번호 찾기</a></li>
              <li><a href="mypage2.html">개인정보 수정</a></li>
              <li><a href="mypage6.html">회원탈퇴</a></li>
            </ul>
          </li>
          <li class="header">
            <a><img src="../wpImages/logo.png" id="menulogo2" /></a>
          </li>
        </ul>
      </nav>
    </header>
	<div align="center">
		<hr color="green" width="300">
		<h2>글 목 록</h2>
		<hr color="green" width="300">
		<table borde="0" width="100%" class="outline">
			<tr>
				<td class="m1" colspan="5"></td>
				<td class="m1" align="center"><a href="writeForm.jsp">글쓰기</a></td>
			</tr>
			<tr bgcolor="limegreen">
				<th class="m1" width="10%">번호</th>
				<th class="m1" width="30%">제목</th>
				<th class="m1" width="15%">작성자</th>
				<th class="m1" width="20%">작성일</th>
			</tr>
<%
	List<board> list = boarddao.ListBoard(startRow, endRow);
	if (list == null || list.size() == 0){
%>
			<tr>
				<td colspan="6">글이 등록되어 있지 않습니다.</td>
			</tr>
<%
	}else { 
	for(BoardDTO dto : list){
		
%>
			<tr>
				<td align="center"><%=co--%></td>
			<td>
				<img src="../img/level.gif" width="<%=dto.getRe_level()*10%>"/>
				<a href="content.jsp?num=<%=dto.getNum()%>&co=<%=co %>">
					<%=dto.getSubject()%>
				</a>
			<%	if (dto.getReadcount() > 10){ %>
				<img src="../img/hot.gif">
			<%	} %>	
			</td>
				<td align="center"><%=dto.getWriter()%></td>
				<td align="center"><%=dto.getReg_date()%></td>
				<td align="center"><%=dto.getReadcount()%></td>
				<td align="center"><%=dto.getIp()%></td>
			</tr>
<%			} 
		}%>					
		</table><br>

<%
}
%>	
		
	</div>
</body>
</html>
<%@ include file="../bottom.jsp"%>