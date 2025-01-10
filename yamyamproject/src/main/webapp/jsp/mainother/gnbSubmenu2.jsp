<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>찾아오시는 길</title>
    <link rel="stylesheet" href="../../yamyam/gnbSubmenu2.css">
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <style>
        @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
</head>
<body>
<% 
String login = (String) session.getAttribute("uid"); 

if (login != null) {
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
          <li><a href="main1.jsp">회원가입</a></li>
          <li>|</li>
          <li><a href="../userpage/processLogout.jsp">로그인/로그아웃</a></li>
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
 
  <h1> <br> |&nbsp;&nbsp;&nbsp;찾아오시는 길&nbsp;&nbsp;&nbsp; </h1>
    <div id="gridbox">
      <br> <br> <br> <br> <br> <br> <br> 
      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d101238.85382325432!2d126.99540576250004!3d37.53823429999999!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357cafafbd1d213d%3A0x7b3b87726903a069!2zTUJD7Lu07ZOo7YSw7JWE7Lm0642w66-4IOy7tO2TqO2EsO2VmeybkCjsspztmLjsoJAp!5e0!3m2!1sko!2skr!4v1726723909733!5m2!1sko!2skr" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe> 
      <br> <br> <br>
      <div id="subject"> 얌얌아카데미는 </div>
      <div id="road"> 5호선과 8호선으로 연결된 천호역과 <br> 도보 5분 내에 위치하고 있으며, <br> 천호 로데오 거리의 <br> 나비쇼핑몰 6층에 있습니다. </div>
      <img src="../wpImages/gnbimages/building.avif" id="building">
      <a href="https://www.google.com/maps?ll=37.538779,127.143378&z=13&t=m&hl=ko&gl=KR&mapclient=embed&cid=8879840015748931689" class="linkbutton"> click! </a>
      <div id="address"> |&nbsp;&nbsp;주소&nbsp;&nbsp;| &emsp;&emsp; </div>
      <div id="addrContent"> 서울시 강동구 천호대로 157길 14 나비쇼핑몰 6층 </div>
      <div id="car"> |&nbsp;&nbsp;자동차&nbsp;&nbsp;| &emsp;&emsp; </div>
      <div id="carContent"> 내비게이션 '얌얌 아카데미' 혹은 '천호 나비쇼핑몰' <br> 검색 후, 나비쇼핑몰 건물 주차장 이용 </div>
      <div id="subway"> |&nbsp;&nbsp;지하철&nbsp;&nbsp;| &emsp;&emsp; </div>
      <div id="subwayContent"> 5호선 천호역 5번 출구에서 도보 5분 </div>
      <div id="bus">|&nbsp;&nbsp;버스&nbsp;&nbsp;| &emsp;&emsp;  </div>
      <div id="busContent"> 천호역 중앙 승강장에서 도보 3분 </div>
      <br> <br> <br> <br> <br> <br>
    </div>
    <div>
        <img src="../wpImages/logo.png" id="logo">
    </div>
    
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
<%
} else {
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
          <li><a href="../userpage/join.jsp">회원가입</a></li>
          <li>|</li>
          <li><a href="../userpage/login.jsp">로그인/로그아웃</a></li>
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
            <a href="../userpage/login.jsp">마이페이지</a>
            <ul class="hovermenu">
              <li><a href="../userpage/findId.jsp">아이디 찾기</a></li>
              <li><a href="../userpage/findPw.jsp">비밀번호 찾기</a></li>
              <li><a href="../userpage/login.jsp">개인정보 수정</a></li>
              <li><a href="../userpage/login.jsp">회원탈퇴</a></li>
            </ul>
          </li>
          <li class="header">
            <a><img src="../wpImages/logo.png" id="menulogo2" /></a>
          </li>
        </ul>
      </nav>
    </header>
 
  <h1> <br> |&nbsp;&nbsp;&nbsp;찾아오시는 길&nbsp;&nbsp;&nbsp; </h1>
    <div id="gridbox">
      <br> <br> <br> <br> <br> <br> <br> 
      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d101238.85382325432!2d126.99540576250004!3d37.53823429999999!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357cafafbd1d213d%3A0x7b3b87726903a069!2zTUJD7Lu07ZOo7YSw7JWE7Lm0642w66-4IOy7tO2TqO2EsO2VmeybkCjsspztmLjsoJAp!5e0!3m2!1sko!2skr!4v1726723909733!5m2!1sko!2skr" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe> 
      <br> <br> <br>
      <div id="subject"> 얌얌아카데미는 </div>
      <div id="road"> 5호선과 8호선으로 연결된 천호역과 <br> 도보 5분 내에 위치하고 있으며, <br> 천호 로데오 거리의 <br> 나비쇼핑몰 6층에 있습니다. </div>
      <img src="../wpImages/gnbimages/building.avif" id="building">
      <a href="https://www.google.com/maps?ll=37.538779,127.143378&z=13&t=m&hl=ko&gl=KR&mapclient=embed&cid=8879840015748931689" class="linkbutton"> click! </a>
      <div id="address"> |&nbsp;&nbsp;주소&nbsp;&nbsp;| &emsp;&emsp; </div>
      <div id="addrContent"> 서울시 강동구 천호대로 157길 14 나비쇼핑몰 6층 </div>
      <div id="car"> |&nbsp;&nbsp;자동차&nbsp;&nbsp;| &emsp;&emsp; </div>
      <div id="carContent"> 내비게이션 '얌얌 아카데미' 혹은 '천호 나비쇼핑몰' <br> 검색 후, 나비쇼핑몰 건물 주차장 이용 </div>
      <div id="subway"> |&nbsp;&nbsp;지하철&nbsp;&nbsp;| &emsp;&emsp; </div>
      <div id="subwayContent"> 5호선 천호역 5번 출구에서 도보 5분 </div>
      <div id="bus">|&nbsp;&nbsp;버스&nbsp;&nbsp;| &emsp;&emsp;  </div>
      <div id="busContent"> 천호역 중앙 승강장에서 도보 3분 </div>
      <br> <br> <br> <br> <br> <br>
    </div>
    <div>
        <img src="../wpImages/logo.png" id="logo">
    </div>
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
<% } 
%>
</body>
</html>
