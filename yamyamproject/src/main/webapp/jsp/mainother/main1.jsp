<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>메인화면</title>
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"
    />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
  </head>
  <body>
  	<% 
  	String login = (String) session.getAttribute("uid");
  	
  	request.setCharacterEncoding("utf-8");
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/board?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
  	String id = "root";
  	String pw = "1234";
  	
  	try {
  		Class.forName("com.mysql.jdbc.Driver");
  		con = DriverManager.getConnection(url, id ,pw);
  	}catch(Exception e) {  		
  	}
	
  	String sql = "select * from notice order by no desc limit 5";
  	PreparedStatement pstm = con.prepareStatement(sql);
  	ResultSet rs = pstm.executeQuery();
  
  	String sql2 = "select * from suggest order by no desc limit 5";
  	PreparedStatement pstm2 = con.prepareStatement(sql2);
  	ResultSet rs2 = pstm2.executeQuery();  	  
  	%>
  	
  	<%
  	if (login != null) {
	%>
	
    <%@ include file="header1.jsp"%>
    
    <a class="middlebannerTop">
      <img src="../wpImages/mainbanners/middleBanner.png" id="mbTopPhoto" />
    </a>
     
    <div class="slideshow-container">

	<div class="mySlides fade">
	  <div class="numbertext">1 / 3</div>
	  <img src="../wpImages/reviews/review1.png" " style="width:100%">
	  
	</div>
	
	<div class="mySlides fade">
	  <div class="numbertext">2 / 3</div>
	  <img src="../wpImages/reviews/review2.png" style="width:100%">
	
	</div>
	
	<div class="mySlides fade">
	  <div class="numbertext">3 / 3</div>
	  <img src="../wpImages/reviews/review3.png" style="width:100%">
	  
	</div>
	
	</div>
	<br>
	
	<div style="text-align:center">
	  <span class="dot"></span> 
	  <span class="dot"></span> 
	  <span class="dot"></span> 
	</div>

    <main class="bigbg">
      <h1>
        <br />
        |&nbsp;&nbsp;&nbsp;커리큘럼&nbsp;&nbsp;&nbsp;|
      </h1>
      <div class="bigbanner">
        <a class="corses K" href="korean.jsp">
          <img src="../wpImages/mainbanners/koreanCorse.jpg" /><span
            class="hovertext"
            >한식과정 자세히보기</span
          >
        </a>
        <a class="corses C" href="chinese.jsp">
          <img src="../wpImages/mainbanners/chineseCorse.jpg" /><span
            class="hovertext"
            >중식과정 자세히보기</span
          >
        </a>
        <a class="corses J" href="japanese.jsp">
          <img src="../wpImages/mainbanners/japanesecorse.jpeg" /><span
            class="hovertext"
            >일식과정 자세히보기</span
          >
        </a>
      </div>

      <div class="write">
        <ul class="announcementsbox">
          <span class="material-symbols-outlined"> campaign </span>
          <span>공지사항</span>
          <a class="more" href="../board/notice.jsp">>&nbsp;더보기</a>
          <%while(rs.next()) {
        	  %><li><a href="#"><%=rs.getString("noticeTitle") %></a></li>
          <%}%>
       </ul>

        <ul class="suggestionsbox">
          <span class="material-symbols-outlined"> campaign </span>
          <span>건의사항</span>
          <a class="more" href="../board/suggestion.jsp">>&nbsp;더보기</a>
           <%while(rs2.next()) {
        	  %><li><a href="#"><%=rs2.getString("suggestTitle") %></a></li>
          <%}%>
        </ul>

        <a class="cscBox">
          <img
            src="../wpImages/cscBanner.png"
            style="width: 420px; height: 275px"
          />
        </a>
      </div>
    </main>
    <footer>
      <nav class="bannerLink">
        <a href="https://www.naver.com/" target="_blank"
          ><img
            src="https://play-lh.googleusercontent.com/YW_Rd7EUbZZ6gyEblSbXHGSPOy54FzBgtFmWgCSYioTskmhP5n1-L-Ay7fCdE0RUvzI=w240-h480-rw"
            style="width: 120px; height: 100px"
        /></a>
        <a href="https://www.google.com/" target="_blank"
          ><img
            src="https://previews.123rf.com/images/kornienko/kornienko1611/kornienko161100200/66047248-%ED%82%A4%EC%8B%9C-%EB%82%98%EC%9A%B0-%EB%AA%B0%EB%8F%84%EB%B0%94-2016-%EB%85%84-11-%EC%9B%94-16-%EC%9D%BC-pc-%ED%99%94%EB%A9%B4%EC%97%90-google-%EB%A1%9C%EA%B3%A0-google%EC%9D%80-google-inc-%EA%B0%80-%EC%86%8C%EC%9C%A0-%ED%95%9C-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%9D%B8%ED%84%B0%EB%84%B7-%EA%B2%80%EC%83%89.jpg"
            style="width: 120px; height: 100px"
        /></a>
        <a href="https://www.kakaocorp.com/page/" target="_blank"
          ><img src="https://t1.kakaocdn.net/kakaocorp/corp_thumbnail/Kakao.png"
          style="width: 120px; height: 100px;"></a
        >
        <a href="https://www.baemin.com/" target="_blank"
          ><img
            src="https://www.shinailbo.co.kr/news/photo/202304/1682383_845303_89.png"
            style="width: 120px; height: 100px"
        /></a>
      </nav>
      <nav class="footerText">
        <ul>
          <!--<li><a href="#">Yam Yam 블로그</a></li>-->
            <li>|</li>
            <li><a href="gnbSubmenu.jsp">학원소개</a></li>
            <li>|</li>
            <a href="policy.jsp" style="color: blue">이용약관 및 개인정보처리방침</a></li>
            <li>|</li>
            <li><a href="../board/notice.jsp">공지사항</a></li>
            <li>|</li>
            <li><a href="../userinfo/delete.jsp">회원탈퇴</a></li>
            <li>|</li>
          </ul>
      </nav>
      <div class="footerText2">
        <div class="yam">
          <p id="yamyam">Yam Yam<br />Academy</p>
          <p id="yamyam2">(주)얌얌</p>
        </div>
        <p>
          | 상호명 : Yam Yam Academy<br />
          | 사업자등록번호 : 123-45-6789
        </p>
        <p>
          | 대표자 : 이지성<br />
          | 교육업 신고번호 : 2580-서울강동-1346<br />
          | 개인정보관리책임자 : 심현정<br />
          | 호스팅 제공 사업자 : 채수영
        </p>
        <p>
          | 주소 : 서울특별시 강동구 천호대로157길 14 쇼핑몰나비관리단 6층
          8층<br />
          | TEL : 070-123-4567 | FAX : (02)891-2345 | Email :
          yamyam@naver.com<br />
        </p>
        <p>Copyright 2024 얌얌학원 Corp. All Right Reserved.</p>
      </div>
    </footer>
  </body>
  <script>
  var slideIndex = 0;
  showSlides();

  function showSlides() {
      var i;
      var slides = document.getElementsByClassName("mySlides");
      var dots = document.getElementsByClassName("dot");
      for (i = 0; i < slides.length; i++) {
         slides[i].style.display = "none";  
      }
      slideIndex++;
      if (slideIndex > slides.length) {slideIndex = 1}    
      for (i = 0; i < dots.length; i++) {
          dots[i].className = dots[i].className.replace(" active", "");
      }
      slides[slideIndex-1].style.display = "block";  
      dots[slideIndex-1].className += " active";
      setTimeout(showSlides, 4000); // Change image every 2 seconds
  }
  </script>
</html>
		
	<%
	} else {
	%>
	
         <%@ include file="header2.jsp"%>
         
    <a class="middlebannerTop">
      <img src="../wpImages/mainbanners/middleBanner.png" id="mbTopPhoto" />
    </a>
	 
    <div class="slideshow-container">

	<div class="mySlides fade">
	  <div class="numbertext">1 / 3</div>
	  <img src="../wpImages/reviews/review1.png" " style="width:100%">
	  
	</div>
	
	<div class="mySlides fade">
	  <div class="numbertext">2 / 3</div>
	  <img src="../wpImages/reviews/review2.png" style="width:100%">
	
	</div>
	
	<div class="mySlides fade">
	  <div class="numbertext">3 / 3</div>
	  <img src="../wpImages/reviews/review3.png" style="width:100%">
	  
	</div>
	
	</div>
	<br>
	
	<div style="text-align:center">
	  <span class="dot"></span> 
	  <span class="dot"></span> 
	  <span class="dot"></span> 
	</div>
	
    <main class="bigbg">
      <h1>
        <br />
        |&nbsp;&nbsp;&nbsp;커리큘럼&nbsp;&nbsp;&nbsp;|
      </h1>
      <div class="bigbanner">
        <a class="corses K" href="korean.jsp">
          <img src="../wpImages/mainbanners/koreanCorse.jpg" /><span
            class="hovertext"
            >한식과정 자세히보기</span
          >
        </a>
        <a class="corses C" href="chinese.jsp">
          <img src="../wpImages/mainbanners/chineseCorse.jpg" /><span
            class="hovertext"
            >중식과정 자세히보기</span
          >
        </a>
        <a class="corses J" href="japanese.jsp">
          <img src="../wpImages/mainbanners/japanesecorse.jpeg" /><span
            class="hovertext"
            >일식과정 자세히보기</span
          >
        </a>
      </div>

      <div class="write">
        <ul class="announcementsbox">
          <span class="material-symbols-outlined"> campaign </span>
          <span>공지사항</span>
          <a class="more" href="../board/notice.jsp">>&nbsp;더보기</a>        
          <%while(rs.next()) {
        	 %><li><a href="#"><%=rs.getString("noticeTitle")%></a></li> 
  		  <%}%>
   		</ul>
        <ul class="suggestionsbox">
          <span class="material-symbols-outlined"> campaign </span>
          <span>건의사항</span>
          <a class="more" href="../board/suggestion.jsp">>&nbsp;더보기</a>
          <%while(rs2.next()) {
        	  %><li><a href="#"><%=rs2.getString("suggestTitle") %></a></li>
          <%}%>
        </ul>

        <a class="cscBox">
          <img
            src="../wpImages/cscBanner.png"
            style="width: 420px; height: 275px"
          />
        </a>
      </div>
    </main>
    <footer>
      <nav class="bannerLink">
        <a href="https://www.naver.com/" target="_blank"
          ><img
            src="https://play-lh.googleusercontent.com/YW_Rd7EUbZZ6gyEblSbXHGSPOy54FzBgtFmWgCSYioTskmhP5n1-L-Ay7fCdE0RUvzI=w240-h480-rw"
            style="width: 120px; height: 100px"
        /></a>
        <a href="https://www.google.com/" target="_blank"
          ><img
            src="https://previews.123rf.com/images/kornienko/kornienko1611/kornienko161100200/66047248-%ED%82%A4%EC%8B%9C-%EB%82%98%EC%9A%B0-%EB%AA%B0%EB%8F%84%EB%B0%94-2016-%EB%85%84-11-%EC%9B%94-16-%EC%9D%BC-pc-%ED%99%94%EB%A9%B4%EC%97%90-google-%EB%A1%9C%EA%B3%A0-google%EC%9D%80-google-inc-%EA%B0%80-%EC%86%8C%EC%9C%A0-%ED%95%9C-%EA%B0%80%EC%9E%A5-%ED%81%B0-%EC%9D%B8%ED%84%B0%EB%84%B7-%EA%B2%80%EC%83%89.jpg"
            style="width: 120px; height: 100px"
        /></a>
        <a href="https://www.kakaocorp.com/page/" target="_blank"
          ><img src="https://t1.kakaocdn.net/kakaocorp/corp_thumbnail/Kakao.png"
          style="width: 120px; height: 100px;"></a
        >
        <a href="https://www.baemin.com/" target="_blank"
          ><img
            src="https://www.shinailbo.co.kr/news/photo/202304/1682383_845303_89.png"
            style="width: 120px; height: 100px"
        /></a>
      </nav>
      <nav class="footerText">
        <ul>
          <!--<li><a href="#">Yam Yam 블로그</a></li>-->
            <li>|</li>
            <li><a href="gnbSubmenu.jsp">학원소개</a></li>
            <li>|</li>
            <a href="policy.jsp" style="color: blue">이용약관 및 개인정보처리방침</a></li>
            <li>|</li>
            <li><a href="../board/notice.jsp">공지사항</a></li>
            <li>|</li>
            <li><a href="../userpage/login.jsp">회원탈퇴</a></li>
            <li>|</li>
          </ul>
      </nav>
      <div class="footerText2">
        <div class="yam">
          <p id="yamyam">Yam Yam<br />Academy</p>
          <p id="yamyam2">(주)얌얌</p>
        </div>
        <p>
          | 상호명 : Yam Yam Academy<br />
          | 사업자등록번호 : 123-45-6789
        </p>
        <p>
          | 대표자 : 이지성<br />
          | 교육업 신고번호 : 2580-서울강동-1346<br />
          | 개인정보관리책임자 : 심현정<br />
          | 호스팅 제공 사업자 : 채수영
        </p>
        <p>
          | 주소 : 서울특별시 강동구 천호대로157길 14 쇼핑몰나비관리단 6층
          8층<br />
          | TEL : 070-123-4567 | FAX : (02)891-2345 | Email :
          yamyam@naver.com<br />
        </p>
        <p>Copyright 2024 얌얌학원 Corp. All Right Reserved.</p>
      </div>
    </footer>
  </body>
  <script>
  var slideIndex = 0;
  showSlides();

  function showSlides() {
      var i;
      var slides = document.getElementsByClassName("mySlides");
      var dots = document.getElementsByClassName("dot");
      for (i = 0; i < slides.length; i++) {
         slides[i].style.display = "none";  
      }
      slideIndex++;
      if (slideIndex > slides.length) {slideIndex = 1}    
      for (i = 0; i < dots.length; i++) {
          dots[i].className = dots[i].className.replace(" active", "");
      }
      slides[slideIndex-1].style.display = "block";  
      dots[slideIndex-1].className += " active";
      setTimeout(showSlides, 4000); // Change image every 2 seconds
  }
  </script>
</html>
		
	<% } %>
    