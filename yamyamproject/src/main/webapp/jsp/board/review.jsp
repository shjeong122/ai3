<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
 <head>
   <meta charset="UTF-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <title>수강평</title>
   <link rel="stylesheet" href="../../yamyam/review.css" />
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
      <h1>|&nbsp;&nbsp;&nbsp;소중한 수강평&nbsp;&nbsp;&nbsp;|</h1>
      <div id="cheers">당신의 꿈을 <br />응원합니다.</div>
      <div class="review">
        <img width="1280px" src="../wpImages/reviews/review1.png" />
        <img width="1280px" src="../wpImages/reviews/review2.png" />
        <img width="1280px" src="../wpImages/reviews/review3.png" />
      </div>
      <img src="../wpImages/logo.png" id="logo" />
    </main>
<%@ include file="footer1.jsp"%>
<%
} else {
%>
<%@ include file="header2.jsp"%>
<main>
      <h1>|&nbsp;&nbsp;&nbsp;소중한 수강평&nbsp;&nbsp;&nbsp;|</h1>
      <div id="cheers">당신의 꿈을 <br />응원합니다.</div>
      <div class="review">
        <img width="1280px" src="../wpImages/reviews/review1.png" />
        <img width="1280px" src="../wpImages/reviews/review2.png" />
        <img width="1280px" src="../wpImages/reviews/review3.png" />
      </div>
      <img src="../wpImages/logo.png" id="logo" />
    </main>
<%@ include file="footer2.jsp"%>
<% } 
%>



</body>
</html>