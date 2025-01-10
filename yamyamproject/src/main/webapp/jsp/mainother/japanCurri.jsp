<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>japaneseCurriculum</title>
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
        <!-- 화면에 표시될 원본 보기 영역 - 기본적으로 숨겨진 상태이다. -->
   <div class="gray_layer" id="background"></div>
   <div class="over_layer" id="front"></div>
  <!--커리큘럼 end 모달팝업table-->
    <h1 class="title">
      <strong
        >|&nbsp;&nbsp;&nbsp;일식 조리 자격증
        커리큘럼&nbsp;&nbsp;&nbsp;|</strong
      >
    </h1>
    
    <div id="curriculum">
      <table>
        <tr>
          <th scope="col" height="50" bgcolor="#d9e5ff">월</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">화</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">수</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">목</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">금</th>
        </tr>
        <tr>
          <th>
            <a href="../yamyam/food/japanese/japan_gabsquid_.html">
              <img
                src="../wpImages/food/japanese/gabSquidmyungranmuchim.png"
                width="200"
                height="200" /></a
            ><br />갑오징어 명란무침
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/doienjangsoup.png"
              width="200"
              height="200"
            /><br />된장국
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/daehapcleansoup.png"
              width="200"
              height="200"
            /><br />대합맑은국
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/domiheadcleansoup.png"
              width="200"
              height="200"
            /><br />도미머리맑은국
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/domijorim.png"
              width="200"
              height="200"
            /><br />도미조림
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/japanese/udongFri.png"
              width="200"
              height="200"
            /><br />우동볶음
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/meimilmyun.png"
              width="200"
              height="200"
            /><br />메밀국수
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/sogogidupbab.png"
              width="200"
              height="200"
            /><br />소고기덮밥
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/muneochosasimi.png"
              width="200"
              height="200"
            /><br />문어초회, 회삼초회
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/eggjjim.png"
              width="200"
              height="200"
            /><br />달걀찜, 도미술찜
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/japanese/kimchobab.png"
              width="200"
              height="200"
            /><br />김초밥, 생선초밥
          </th>
          <th class="item pull-left">
            <a href="../wpImages/recipe/chamchikimbab.png"  class="modal">
              <img
                src="../wpImages/food/japanese/tunachobab.png" alt="tunachobab"
                width="200"
                height="200" /></a
            ><br />참치김초밥
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/samchisaltgui.png"
              width="200"
              height="200"
            /><br />삼치소금구이
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/sogogisoygui.png"
              width="200"
              height="200"
            /><br />소고기 간장구이
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/junbokbuttergui.png"
              width="200"
              height="200"
            /><br />전복버터구이, 달걀말이
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
        >|&nbsp;&nbsp;&nbsp;일식 조리 자격증
        커리큘럼&nbsp;&nbsp;&nbsp;|</strong
      >
    </h1>
    
    <div id="curriculum">
      <table>
        <tr>
          <th scope="col" height="50" bgcolor="#d9e5ff">월</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">화</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">수</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">목</th>
          <th scope="col" height="50" bgcolor="#d9e5ff">금</th>
        </tr>
        <tr>
          <th>
            <a href="../yamyam/food/japanese/japan_gabsquid_.html">
              <img
                src="../wpImages/food/japanese/gabSquidmyungranmuchim.png"
                width="200"
                height="200" /></a
            ><br />갑오징어 명란무침
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/doienjangsoup.png"
              width="200"
              height="200"
            /><br />된장국
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/daehapcleansoup.png"
              width="200"
              height="200"
            /><br />대합맑은국
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/domiheadcleansoup.png"
              width="200"
              height="200"
            /><br />도미머리맑은국
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/domijorim.png"
              width="200"
              height="200"
            /><br />도미조림
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/japanese/udongFri.png"
              width="200"
              height="200"
            /><br />우동볶음
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/meimilmyun.png"
              width="200"
              height="200"
            /><br />메밀국수
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/sogogidupbab.png"
              width="200"
              height="200"
            /><br />소고기덮밥
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/muneochosasimi.png"
              width="200"
              height="200"
            /><br />문어초회, 회삼초회
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/eggjjim.png"
              width="200"
              height="200"
            /><br />달걀찜, 도미술찜
          </th>
        </tr>
        <tr>
          <th>
            <img
              src="../wpImages/food/japanese/kimchobab.png"
              width="200"
              height="200"
            /><br />김초밥, 생선초밥
          </th>
          <th class="item pull-left">
            <a href="../wpImages/recipe/chamchikimbab.png"  class="modal">
              <img
                src="../wpImages/food/japanese/tunachobab.png" alt="tunachobab"
                width="200"
                height="200" /></a
            ><br />참치김초밥
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/samchisaltgui.png"
              width="200"
              height="200"
            /><br />삼치소금구이
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/sogogisoygui.png"
              width="200"
              height="200"
            /><br />소고기 간장구이
          </th>
          <th>
            <img
              src="../wpImages/food/japanese/junbokbuttergui.png"
              width="200"
              height="200"
            /><br />전복버터구이, 달걀말이
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
