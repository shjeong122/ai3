<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>한식커리큘럼</title>
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
          <strong>
            |&nbsp;&nbsp;&nbsp; 한식 조리 자격증
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
                <img
                  src="../wpImages/food/korean/jaeryossulgi.png"
                  width="200"
                  height="200"
                /><br />재료썰기, 콩나물밥, 비빔밥
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/wanjatang.png"
                  width="200"
                  height="200"
                /><br />완자탕, 너비아니구이
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/tobujorim.png"
                  width="200"
                  height="200"
                /><br />두부조림, 홍합초
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/tobujeotgukjjigae.png"
                  width="200"
                  height="200"
                /><br />두부젓국찌개, 오징어볶음
              </th>
              <th class="item pull-left" ><a href="../wpImages/recipe/gochujeon.png" class="modal">
                <img
                  src="../wpImages/food/korean/phutgocujeok.png" alt="phutgocujeok"
                  width="200"
                  height="200" /></a><br>풋고추적
              </th>
            </tr>
            <tr>
              <th>
                <img
                  src="../wpImages/food/korean/janggukjuk.png"
                  width="200"
                  height="200"
                /><br />장국죽, 제육구이, 생선찌개
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/fishjeon.png"
                  width="200"
                  height="200"
                /><br />생선전, 육원전, 표고버섯전
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/seobsanjeok.png"
                  width="200"
                  height="200"
                /><br />섭산적, 화양적, 지짐누름적
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/bukeogui.png"
                  width="200"
                  height="200"
                /><br />북어구이, 더덕구이
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/fishyangnyumgui.png"
                  width="200"
                  height="200"
                /><br />생선양념구이, 무생채
              </th>
            </tr>
            <tr>
              <th>
                <img
                  src="../wpImages/food/korean/doragisaengchae.png"
                  width="200"
                  height="200"
                /><br />도라이생채, 더덕생채
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/guejachae.png"
                  width="200"
                  height="200"
                /><br />겨자채, 미나리강회
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/chiljeonphan.png"
                  width="200"
                  height="200"
                /><br />칠전판, 탕평채
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/japchae.png"
                  width="200"
                  height="200"
                /><br />잡채, 육회
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/baechukimchi.png"
                  width="200"
                  height="200"
                /><br />배추김치, 오이소박이
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
          <strong>
            |&nbsp;&nbsp;&nbsp; 한식 조리 자격증
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
                <img
                  src="../wpImages/food/korean/jaeryossulgi.png"
                  width="200"
                  height="200"
                /><br />재료썰기, 콩나물밥, 비빔밥
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/wanjatang.png"
                  width="200"
                  height="200"
                /><br />완자탕, 너비아니구이
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/tobujorim.png"
                  width="200"
                  height="200"
                /><br />두부조림, 홍합초
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/tobujeotgukjjigae.png"
                  width="200"
                  height="200"
                /><br />두부젓국찌개, 오징어볶음
              </th>
              <th class="item pull-left" ><a href="../wpImages/recipe/gochujeon.png" class="modal">
                <img
                  src="../wpImages/food/korean/phutgocujeok.png" alt="phutgocujeok"
                  width="200"
                  height="200" /></a><br>풋고추적
              </th>
            </tr>
            <tr>
              <th>
                <img
                  src="../wpImages/food/korean/janggukjuk.png"
                  width="200"
                  height="200"
                /><br />장국죽, 제육구이, 생선찌개
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/fishjeon.png"
                  width="200"
                  height="200"
                /><br />생선전, 육원전, 표고버섯전
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/seobsanjeok.png"
                  width="200"
                  height="200"
                /><br />섭산적, 화양적, 지짐누름적
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/bukeogui.png"
                  width="200"
                  height="200"
                /><br />북어구이, 더덕구이
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/fishyangnyumgui.png"
                  width="200"
                  height="200"
                /><br />생선양념구이, 무생채
              </th>
            </tr>
            <tr>
              <th>
                <img
                  src="../wpImages/food/korean/doragisaengchae.png"
                  width="200"
                  height="200"
                /><br />도라이생채, 더덕생채
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/guejachae.png"
                  width="200"
                  height="200"
                /><br />겨자채, 미나리강회
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/chiljeonphan.png"
                  width="200"
                  height="200"
                /><br />칠전판, 탕평채
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/japchae.png"
                  width="200"
                  height="200"
                /><br />잡채, 육회
              </th>
              <th>
                <img
                  src="../wpImages/food/korean/baechukimchi.png"
                  width="200"
                  height="200"
                /><br />배추김치, 오이소박이
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