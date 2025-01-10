<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>로그인</title>
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <link rel="stylesheet" href="../../yamyam/mypage.css" />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
  </head>
  <body>
  <%@ include file="header2.jsp"%>
  
  <main>
      <div id="middletitle"><h1>Yam Yam Academy 로그인</h1></div>
      <form action="processLogin.jsp" id="login">
        <fieldset>
          <!--<legend>로그인</legend>-->
          <label for="userID">
            <div class="userID-container">
            <h1>&nbsp;아&nbsp;&nbsp;이&nbsp;&nbsp;디</h1>
            <style>
              label[for="userID"] h1 {
                font-size: 14px;
              }
            </style>
            <input type="text" 
            id="userID" 
            name="uid" 
            placeholder="아이디" 
            class = "userID-input"
            />
            </div>
          </label>
          <label for="password">
            <div class="password-container">
            <h1>&nbsp;비밀&nbsp;번호</h1>
            <style>
              label[for="password"] h1 {
                font-size: 14px;
              }
            </style>
            <input
              type="password"
              id="password"
              name="upw"
              placeholder="비밀번호"
              class = "userpassword-input"
            />
          </div>
          </label>

          <button type="submit">로그인</button>
        </fieldset>
        <a href="findId.jsp"> 아이디 찾기</a>
        <a href="findPw.jsp"> 비밀번호 찾기</a>
      </form>
    </main>
  
  
  <%@ include file="footer2.jsp"%>
  
  </body>
</html>



  