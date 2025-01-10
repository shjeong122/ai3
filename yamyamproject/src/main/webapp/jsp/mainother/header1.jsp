<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인헤더</title>
</head>
<body>
<% 
  	String username = (String) session.getAttribute("uname");
  	
  	%>
	    <header>
      <div id="title">
        <a href="main1.jsp">
          <img src="../wpImages/mainbanners/headBanner.png" />
          <h1></h1>
        </a>
      </div>
      <nav>
        <ul class="personal">
          <li>|</li>
          <li><%=username%> 님</li>
          <li>|</li>
          <li><a href="../userpage/processLogout.jsp">로그아웃</a></li>
          <li>|</li>
        </ul>
      </nav>
      <nav>
        <ul class="fixmenu">
          <li class="header">
            <a><img src="../wpImages/logo.png" id="menulogo1" /></a>
          </li>
          <li class="header">
            <a href="gnbSubmenu.jsp">학원 소개</a>
            <ul class="hovermenu">
              <li><a href="gnbSubmenu.jsp">학원 소개</a></li>
              <li><a href="gnbSubmenu2.jsp">찾아오시는 길</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="korean.jsp">한식 과정</a>
            <ul class="hovermenu">
              <li><a href="korean.jsp">강사 소개</a></li>
              <li><a href="koreaCurri.jsp">수업 커리큘럼</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="chinese.jsp">중식 과정</a>
            <ul class="hovermenu">
              <li><a href="chinese.jsp">강사 소개</a></li>
              <li><a href="chinaCurri.jsp">수업 커리큘럼</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="japanese.jsp">일식 과정</a>
            <ul class="hovermenu">
              <li><a href="japanese.jsp">강사 소개</a></li>
              <li><a href="japanCurri.jsp">수업 커리큘럼</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="../board/notice.jsp">게 시 판</a>
            <ul class="hovermenu">
              <li><a href="../board/notice.jsp">공지사항</a></li>
              <li><a href="../board/suggestion.jsp">건의사항</a></li>
              <li><a href="../board/review.jsp">소중한 수강평</a></li>
            </ul>
          </li>
          <li class="header">
            <a href="../userpage/update.jsp">마이페이지</a>
            <ul class="hovermenu">
              <li><a href="main1.jsp">아이디 찾기</a></li>
              <li><a href="main1.jsp">비밀번호 찾기</a></li>
              <li><a href="../userpage/update.jsp">개인정보 수정</a></li>
              <li><a href="../userpage/delete.jsp">회원탈퇴</a></li>
            </ul>
          </li>
          <li class="header">
            <a><img src="../wpImages/logo.png" id="menulogo2" /></a>
          </li>
        </ul>
      </nav>
    </header>
</body>
</html>