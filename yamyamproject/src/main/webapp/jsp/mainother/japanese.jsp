<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>일식 과정</title>
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
        <img class="middle" src="../wpImages/teachers/japanese.png" />
        <h1 class="title">
          <strong> |&nbsp;&nbsp;&nbsp; 강사 소개&nbsp;&nbsp;&nbsp;|</strong>
        </h1>
        <span class="chefintro">
          <dl class="career">
            <h3><strong>< 강사 경력 ></strong></h3>
            <dd>2024 YAMYAM ACADEMY 겸임 강사</dd>
            <dd>2022 KBS 연예대상 베스트 아이콘 상 수상</dd>
            <dd>2022 한국호텔관광학교 호텔스시조리학과 특임교수 취임</dd>
            <dd>2021 KBS 연예대상 핫이슈 예능인상 수상</dd>
            <dd>
              2019 유뷰트 개설 '정호영의 오늘도 요리 Kitchen Caden'<br />(현
              구독자 44.6만명)
            </dd>
            <dd>2014~2018 블루리본 서베이 선정</dd>
            <dd>2014 이자카야 카덴 창업(오너쉐프)</dd>
            <dd>2003 츠지 조리사 전문학교 졸업</dd>
          </dl>
          <img
            id="chinesechef"
            src="../wpImages/teachers/JapanChef_photo_Junghoyoung.jpg"
          />
        </span>
        <div id="comment"></div>
          <p class="sub1">"어서오세요 일식의 세계로"<br></p>
           <p class="sub2"> 일식 세계의 연예인 <br>정호영 쉐프가 소개하는 일식의 세계!
          </p>
        </div>
    </main>
<%@ include file="footer1.jsp"%>
<%
} else {
%>
<%@ include file="header2.jsp"%>
    <main>
      <nav>
        <img class="middle" src="../wpImages/teachers/japanese.png" />
        <h1 class="title">
          <strong> |&nbsp;&nbsp;&nbsp; 강사 소개&nbsp;&nbsp;&nbsp;|</strong>
        </h1>
        <span class="chefintro">
          <dl class="career">
            <h3><strong>< 강사 경력 ></strong></h3>
            <dd>2024 YAMYAM ACADEMY 겸임 강사</dd>
            <dd>2022 KBS 연예대상 베스트 아이콘 상 수상</dd>
            <dd>2022 한국호텔관광학교 호텔스시조리학과 특임교수 취임</dd>
            <dd>2021 KBS 연예대상 핫이슈 예능인상 수상</dd>
            <dd>
              2019 유뷰트 개설 '정호영의 오늘도 요리 Kitchen Caden'<br />(현
              구독자 44.6만명)
            </dd>
            <dd>2014~2018 블루리본 서베이 선정</dd>
            <dd>2014 이자카야 카덴 창업(오너쉐프)</dd>
            <dd>2003 츠지 조리사 전문학교 졸업</dd>
          </dl>
          <img
            id="chinesechef"
            src="../wpImages/teachers/JapanChef_photo_Junghoyoung.jpg"
          />
        </span>
        <div id="comment"></div>
          <p class="sub1">"어서오세요 일식의 세계로"<br></p>
           <p class="sub2"> 일식 세계의 연예인 <br>정호영 쉐프가 소개하는 일식의 세계!
          </p>
        </div>
    </main>
<%@ include file="footer2.jsp"%>
<% } 
%>
  
  </body>
</html>
