<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>중식과정</title>
    <link rel="stylesheet" href="../../yamyam/jorisa.css" />
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
<%@ include file="header1.jsp"%>
    <main>
      <nav>
        <img class="middle" src="../wpImages/teachers/chinese.png" />
        <h1 class="title">
          <strong>|&nbsp;&nbsp;&nbsp;강사 소개&nbsp;&nbsp;&nbsp;|</strong>
        </h1>
        <span class="chefintro">
          <dl class="career">
            <h3><strong>< 강사 경력 ></strong></h3>
            <dd>2024 YAMYAM ACADEMY 겸임 강사</dd>
            <dd>2021 KBS 연예대상 핫이슈 예능인상 수상</dd>
            <dd>2019 환경부 음식문화개선 홍보대사</dd>
            <dd>2016 한국호텔관광실용전문학교 석좌 교수 취임</dd>
            <dd>1999 목란 창업(오너 쉐프)</dd>
            <dd>1980 대한민국 주재 중화민국 대사관 총주방장 역임</dd>
          </dl>
          <img
            id="chinesechef"
            src="../wpImages/teachers/ChinaChef_photo.PNG"
          />
        </span>
        <div id="comment">
          <p class="sub1">"어서오세요 중식의 세계로"<br></p>
            <p class="sub2">50년 경력 중식 대가 <br>이연복 쉐프가 소개하는 중식의 세계!</p>

        </div>
    </main>

<%@ include file="footer1.jsp"%>
<%
} else {
%>
<%@ include file="header2.jsp"%>
    <main>
      <nav>
        <img class="middle" src="../wpImages/teachers/chinese.png" />
        <h1 class="title">
          <strong>|&nbsp;&nbsp;&nbsp;강사 소개&nbsp;&nbsp;&nbsp;|</strong>
        </h1>
        <span class="chefintro">
          <dl class="career">
            <h3><strong>< 강사 경력 ></strong></h3>
            <dd>2024 YAMYAM ACADEMY 겸임 강사</dd>
            <dd>2021 KBS 연예대상 핫이슈 예능인상 수상</dd>
            <dd>2019 환경부 음식문화개선 홍보대사</dd>
            <dd>2016 한국호텔관광실용전문학교 석좌 교수 취임</dd>
            <dd>1999 목란 창업(오너 쉐프)</dd>
            <dd>1980 대한민국 주재 중화민국 대사관 총주방장 역임</dd>
          </dl>
          <img
            id="chinesechef"
            src="../wpImages/teachers/ChinaChef_photo.PNG"
          />
        </span>
        <div id="comment">
          <p class="sub1">"어서오세요 중식의 세계로"<br></p>
            <p class="sub2">50년 경력 중식 대가 <br>이연복 쉐프가 소개하는 중식의 세계!</p>

        </div>
    </main>

<%@ include file="footer2.jsp"%>
<% } 
%>
  
  
  </body>
</html>
