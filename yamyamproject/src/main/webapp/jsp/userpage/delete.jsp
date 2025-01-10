<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>회원 탈퇴</title>
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <link rel="stylesheet" href="../../yamyam/mypage6.css" />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
  </head>
  <body>
  
   <%@ include file="header1.jsp"%>
   
<main>
<form action="processDelete.jsp">
  <div id="middletitle"> <h1>Yam Yam Academy 회원탈퇴</h1></div>
    <div id="user">
      <fieldset>
        <legend>회원탈퇴</legend>
        <div style="border: 1px solid #000; padding: 10px; margin-left: 30px;  border-radius: 5px;">
          <h1 style="text-align: left; font-size: 25px; margin: 0;">
            회원 탈퇴 안내
          </h1>
          <h1> </h1>
          <h1 style="text-align: left; font-size: 17px; margin: 0; ">
            <li>회원 탈퇴를 신청하신 것에 대해 안내 드립니다. <br></li>
            <li>탈퇴 후에는 등록된 회원 정보와 수강 내역이 모두 삭제되며, 복구가 불가능합니다. <br></li>
            <li>회원 혜택 및 서비스 이용이 중단 되오니 신중한 결정 부탁드립니다. <br></li>
            <li>궁금하신 사항이 있으시면 언제든지 고객센터로 문의해 주세요. 감사합니다.</li>
          </h1>
          <h1> </h1>
        </div>
        <h1> </h1>
        <div style="border: 1px solid #000; padding: 10px; margin-left: 30px;  border-radius: 5px;">
          <h1 style="text-align: left; font-size: 25px; margin: 0;">
            회원 탈퇴 시 꼭 확인해 주세요!
          </h1>
          <h1> </h1>
          <h1 style="text-align: left; font-size: 17px; margin: 0;">
            <li>사용하고 계신 아이디는 탈퇴할 경우 3개월 간 재사용이 불가능 합니다.<br></li>
            <li>탈퇴 이후 게시물과 이용 기록은 3개월동안 보관된 후, 모두 삭제 됩니다. <br></li>
          </h1>
          <h1> </h1>
        </div>

      </fieldset>
      <div class="checkbox-box">
        <h2 style="font-size: 25px;">탈퇴사유 선택</h2>
        <h1> </h1>
      <div class="checkbox-container">
        <label>
          <input type="checkbox" name="check" value="check1">시설에 대한 불만족
        </label>
        <label>
          <input type="checkbox" name="check" value="check2">커리큘럼에 대한 불만족
        </label>
        <label>
          <input type="checkbox" name="check" value="check3">목표 달성으로 수강 종료
        </label>
        <label>
          <input type="checkbox" name="check" value="check4">현재 학원에 대한 불만족
        </label>
        <label>
          <input type="checkbox" name="check" value="check5">강사에 대한 불만족
        </label>
        <label>
          <input type="checkbox" name="check" value="check6"> 기타
            <input type="text" id="withdraw" name="withdrow" />
        </label>
      </div>
      </div>
    <div class = "password-container">
      <label for="password">
        <h1>비밀번호 확인</h1>
        <input type="password" id="upw" name="upw" placeholder="비밀번호 확인" />
      </label>
    </div> 
      <div class="button-container">
        <button type="submit">회원탈퇴</button>
      </div>
    </form>
</main>

<%@ include file="footer1.jsp"%>
</body>
</html>
