<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>중식 커리큘럼</title>
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
      <!-- 화면에 표시될 원본 보기 영역 - 기본적으로 숨겨진 상태이다. -->
      <div class="gray_layer" id="background"></div>
      <div class="over_layer" id="front"></div>
     <!--커리큘럼 end 모달팝업table-->
    <h1 class="title">
      <strong
        >|&nbsp;&nbsp;&nbsp;중식 조리 자격증
        커리큘럼&nbsp;&nbsp;&nbsp;|</strong
      >
    </h1>
    
    <div id="curriculum" name="curriculum">
      <table>
        <tr>
          <th scope="col" height="50" bgcolor="#d9e5ff">월</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">화</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">수</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">목</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">금</th>
        </tr>
        <tr>
          <th class="item pull-left">
            <a href="../wpImages/recipe/tangsuyuk.png" class="modal">
              <img
                src="../wpImages/food/chinese/tangsuyuk.png" alt="tangsuyuk"
                width="200"
                height="200" /></a
            ><br />탕수육
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/kanpyunggi.png"
              width="200"
              height="200"
            /><br />깐풍기
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/tangsuFish.png"
              width="200"
              height="200"
            /><br />탕수생선살
          </th>
          <th>
            <a href="../yamyam/food/chinese/chi_nanjawans.html">
              <img
                src="../wpImages/food/chinese/nanjawans.png"
                width="200"
                height="200" /></a
            ><br />난자완스
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/hongshotobu.png"
              width="200"
              height="200"
            /><br />홍쇼두부
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/chinese/shrimpFriedrice.png"
              width="200"
              height="200"
            /><br />새우볶음밥
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/unijajang.png"
              width="200"
              height="200"
            /><br />유니짜장면
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/ulmyun.png"
              width="200"
              height="200"
            /><br />울면
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/squidNangchae.png"
              width="200"
              height="200"
            /><br />오징어냉채, 해파리냉채
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/yangjangphi.png"
              width="200"
              height="200"
            /><br />양장피잡채
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/chinese/buchuJabchae.png"
              width="200"
              height="200"
            /><br />부추자채, 고추잡채
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/maphatobu.png"
              width="200"
              height="200"
            /><br />마파두부
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/vegiFri.png"
              width="200"
              height="200"
            /><br />채소볶음, 새우케첩볶음
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/lasogi.png"
              width="200"
              height="200"
            /><br />라조기, 경장육사
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/pascorn.png"
              width="200"
              height="200"
            /><br />빠스옥수수, 빠스고구마
          </th>
        </tr>
      </table>
    </div>
  </nav>
</main>

<%@ include file="footer1.jsp"%>
<%
} else {
%>
<%@ include file="header2.jsp"%>
    <main>
      <!-- 화면에 표시될 원본 보기 영역 - 기본적으로 숨겨진 상태이다. -->
      <div class="gray_layer" id="background"></div>
      <div class="over_layer" id="front"></div>
     <!--커리큘럼 end 모달팝업table-->
    <h1 class="title">
      <strong
        >|&nbsp;&nbsp;&nbsp;중식 조리 자격증
        커리큘럼&nbsp;&nbsp;&nbsp;|</strong
      >
    </h1>
    
    <div id="curriculum" name="curriculum">
      <table>
        <tr>
          <th scope="col" height="50" bgcolor="#d9e5ff">월</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">화</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">수</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">목</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">금</th>
        </tr>
        <tr>
          <th class="item pull-left">
            <a href="../wpImages/recipe/tangsuyuk.png" class="modal">
              <img
                src="../wpImages/food/chinese/tangsuyuk.png" alt="tangsuyuk"
                width="200"
                height="200" /></a
            ><br />탕수육
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/kanpyunggi.png"
              width="200"
              height="200"
            /><br />깐풍기
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/tangsuFish.png"
              width="200"
              height="200"
            /><br />탕수생선살
          </th>
          <th>
            <a href="../yamyam/food/chinese/chi_nanjawans.html">
              <img
                src="../wpImages/food/chinese/nanjawans.png"
                width="200"
                height="200" /></a
            ><br />난자완스
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/hongshotobu.png"
              width="200"
              height="200"
            /><br />홍쇼두부
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/chinese/shrimpFriedrice.png"
              width="200"
              height="200"
            /><br />새우볶음밥
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/unijajang.png"
              width="200"
              height="200"
            /><br />유니짜장면,
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/ulmyun.png"
              width="200"
              height="200"
            /><br />울면
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/squidNangchae.png"
              width="200"
              height="200"
            /><br />오징어냉채, 해파리냉채
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/yangjangphi.png"
              width="200"
              height="200"
            /><br />양장피잡채
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/chinese/buchuJabchae.png"
              width="200"
              height="200"
            /><br />부추자채, 고추잡채
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/maphatobu.png"
              width="200"
              height="200"
            /><br />마파두부
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/vegiFri.png"
              width="200"
              height="200"
            /><br />채소볶음, 새우케첩볶음
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/lasogi.png"
              width="200"
              height="200"
            /><br />라조기, 경장육사
          </th>
          <th>
            <img
              src="../wpImages/food/chinese/pascorn.png"
              width="200"
              height="200"
            /><br />빠스옥수수, 빠스고구마
          </th>
        </tr>
      </table>
    </div>
  </nav>
</main>

<%@ include file="footer2.jsp"%>
<% } 
%>

</body>
</html>
<script src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $('.modal').on('click',function(e){
            //a태그가 가진 이벤트 막기
            e.preventDefault();

            $("#background").fadeIn(200);  //배경 레이어
            $("#front").fadeIn(200);  //이미지 레이어

            let src = $(this).attr('href'); // 클릭한 링크의 href 속성값
            let img = "<img src='" + src +"'/>"; //이미지 태그 구성 
            $('#front').html(img);

        });

        //화면에 표시된 배경 레이어를 클릭한 경우
       $('#background').click(function(){
        $(this).fadeOut(200);
        $("#front").fadeOut(200);
       }); 
</script>
