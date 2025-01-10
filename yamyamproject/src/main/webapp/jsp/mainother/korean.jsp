<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>korean</title>
    <link rel="stylesheet" href="../../yamyam/jorisa.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
  </head>
  <body>
<% 
String login = (String) session.getAttribute("uid"); 

if (login != null) {
%>

   <%@ include file="header1.jsp"%>
   
    <main>
      <nav>
        <img class="middle" src="../wpImages/teachers/korean.png" />
        <h1 class="title">
          <strong> |&nbsp;&nbsp;&nbsp; 강사 소개&nbsp;&nbsp;&nbsp;|</strong>
        </h1>
        <span class="chefintro">
          <dl class="career">
            <h3><strong>< 강사 경력 ></strong></h3>
            <dd>2024 YAMYAM ACADEMY 겸임 강사</dd>
            <dd>2024 국제베스트브랜드대상 어워즈 한식개발부문 대상</dd>
            <dd>2022 약선요리기능장(사단법인 대한 약선 요리 전문 최고원)</dd>
            <dd>2022 대한민국 한식포럼 한식명장 선정</dd>
            <dd>2020 월드코리안뉴스 한식문화 편집의원</dd>
            <dd>2018 한국음식문화재단 대한민국 한식 대가 선정</dd>
            <dd>2015 숙명여자대학교 학국음식 연구원 수료</dd>
          </dl>
          <img
            id="koreachef"
            src="../wpImages/teachers/KoreaChef_photo_Parkmiran.jpg"
          />
        </span>
        <div id="comment">
          <p class="sub1">"어서오세요 한식의 세계로"<br></p>
            <p class="sub2">기술력과 이론으로 꽉채워 드립니다.<br>박미란 쉐프가 소개하는 한식의 세계!</p>
          
        </div>
    </main>
    <%@ include file="footer2.jsp"%>
  </body>
</html>
<%
} else {
%>
<%@ include file="header2.jsp"%>
    <main>
      <nav>
        <img class="middle" src="../wpImages/teachers/korean.png" />
        <h1 class="title">
          <strong> |&nbsp;&nbsp;&nbsp; 강사 소개&nbsp;&nbsp;&nbsp;|</strong>
        </h1>
        <span class="chefintro">
          <dl class="career">
            <h3><strong>< 강사 경력 ></strong></h3>
            <dd>2024 YAMYAM ACADEMY 겸임 강사</dd>
            <dd>2024 국제베스트브랜드대상 어워즈 한식개발부문 대상</dd>
            <dd>2022 약선요리기능장(사단법인 대한 약선 요리 전문 최고원)</dd>
            <dd>2022 대한민국 한식포럼 한식명장 선정</dd>
            <dd>2020 월드코리안뉴스 한식문화 편집의원</dd>
            <dd>2018 한국음식문화재단 대한민국 한식 대가 선정</dd>
            <dd>2015 숙명여자대학교 학국음식 연구원 수료</dd>
          </dl>
          <img
            id="koreachef"
            src="../wpImages/teachers/KoreaChef_photo_Parkmiran.jpg"
          />
        </span>
        <div id="comment">
          <p class="sub1">"어서오세요 한식의 세계로"<br></p>
            <p class="sub2">기술력과 이론으로 꽉채워 드립니다.<br>박미란 쉐프가 소개하는 한식의 세계!</p>         
        </div>
    </main>
    <%@ include file="footer2.jsp"%>
 </body>
</html>
 
<% } 
%>
  