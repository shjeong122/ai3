<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>회원가입</title>
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <link rel="stylesheet" href="../../yamyam/mypage5.css" />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
  </head>
<body>
<%@ include file="header2.jsp"%>

   <div class="steps-body">
      <div class="steps-container">
          <div class="step active">
              <div class="step-number">1</div>
              <div class="step-title1">서비스 약관 동의</div>
          </div>
          <div class="step">
              <div class="step-number">2</div>
              <div class="step-title2">회원 가입</div>
          </div>
      </div>
  </div>
  <main>
    <div id="middletitle">
      <h1>Yam Yam Academy 회원가입</h1>
    </div>
    <form action="ProcessJoin.jsp" id="user">
      <fieldset>
        <label for="userID">
          <div class = "userID-container">
          <h1>
            &nbsp;&nbsp;&nbsp;아&nbsp;&nbsp;이&nbsp;&nbsp;디&nbsp;&nbsp;&nbsp;
          </h1>
          <input type="text"
          id="userID"
          name="uid" 
          placeholder="아이디"
          class = "userID-input"
           />
          </div>
        </label>

        <label for="username">
          <div class = "username-container">
          <h1>
            &nbsp;&nbsp;&nbsp;이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름
            &nbsp;&nbsp;&nbsp;
          </h1>
          <input
            type="text" 
            id="username"
            name="uname"
            placeholder="이름"
            class = "username-input"
          />
        </div>
        </label>

        <label for="password">
          <div class = "password-container">
          <h1>&nbsp;&nbsp;&nbsp;비밀번호&nbsp;&nbsp;&nbsp;&nbsp;</h1>
          <input
            type="password"
            id="password"
            name="upw"
            placeholder="비밀번호"
            class = "password-input"
          />
          </div>
        </label>

        <label for="passwordConfirm">
          <div style="display: flex; align-items: center;">
            <h1>비밀번호&nbsp;확인</h1>
            <input
              type="password"
              id="passwordConfirm" 
              placeholder="비밀번호 확인"
              class="passwordConfirm-input"
            />
            <button type="button" class="password-confirm-button" onclick="checkPassword()">비밀번호 확인</button>
        
        </div>
        </label>

        <label for="passwordHint">
          <div class="passwordHint-container">
            <h1>비밀번호 힌트</h1>
            <select
              name="passwordHint"
              id="passwordselect" 
              onchange="HintCheck();"
              class="passwordHint-select"
            >
              <option value="0" selected="selected">비밀번호 힌트</option>
              <option value="내가 태어난 곳">내가 태어난 곳</option>
              <option value="기억에 남는 장소">기억에 남는 장소</option>
              <option value="나의 고향은?">나의 고향은?</option>
              <option value="내가 나온 학교">내가 나온 학교</option>
            </select>
            <input
              type="text"
              id="passwordHint"
              name="pwHint"
              class="passwordHint-input"
            />
          </div>
        </label>

        <label for="useremail">
          <h1>
            &nbsp;&nbsp;이&nbsp;&nbsp;메&nbsp;&nbsp;일&nbsp;&nbsp;&nbsp&nbsp;
          </h1>
          <div class="email-container">
            <input
              type="text"
              id="useremail"
              name="umail"
              placeholder="이메일"
              class="email-input"
            />
            <h1>&nbsp;&nbsp;@&nbsp;&nbsp;</h1>
            <input
              type="text"
              id="useremailDomain"
              name="mailDomain"
              placeholder="도메인"
              class="domain-input"
            />

            <select
              name="mailDomain"
              id="domainSelect"
              onchange="domainCheck();"
              class="domain-select"
            >
              <option value="0" selected="selected">직접입력</option>
              <option value="naver.com">naver.com</option>
              <option value="hanmail.net">hanmail.net</option>
              <option value="nate.com">nate.com</option>
              <option value="yahoo.com">yahoo.com</option>
            </select>
          </div>
        </label>
      </fieldset>
      <!--<div class="checkbox-container">
        <label>
          <input type="checkbox" name="check" value="check1" />정보 메일을
          수신합니다.
        </label>
      </div>-->
      <div class="button-container">
        <button type="submit">회원가입</button>
      </div>
    </form>

    <script>
    
    function domainCheck() {
    const selectElement = document.getElementById("domainSelect");
    const inputElement = document.getElementById("useremailDomain");

    inputElement.value =
      selectElement.value !== "0" ? selectElement.value : "";     
    }
  
  let cpw = false; 

  function checkPassword() {
      const password = document.getElementById("password").value;
      const passwordConfirm = document.getElementById("passwordConfirm").value;
      const submitButton = document.getElementById("submitButton");

      if (password.length < 8 || password.length >= 12) {
          alert("비밀번호는 8글자 이상 12글자 미만이어야 합니다.");
          submitButton.disabled = true; 
          return; 
      }

      if (password === passwordConfirm) {
          alert("사용가능한 비밀번호입니다.");
          cpw = true; 
          submitButton.disabled = false; 
      } else {
          alert("비밀번호를 다시 확인해주세요.");
          submitButton.disabled = true; 
      }
  }  
  

  document.getElementById("user").addEventListener("submit", function(FILL) {
      if (!cpw) {
          alert("비밀번호 중복확인을 해주세요.");
          event.preventDefault(); 
          return;
      }
      

      const userID = document.getElementById("userID").value.trim();
      const username = document.getElementById("username").value.trim();
      const password = document.getElementById("password").value.trim();
      const passwordConfirm = document.getElementById("passwordConfirm").value.trim();
      const useremail = document.getElementById("useremail").value.trim();
      const userdomain = document.getElementById("useremailDomain").value.trim();

      if (!userID || !username || !password || !passwordConfirm || !useremail || !userdomain  ) {
          alert("빈칸을 모두 입력해주세요.");
          FILL.preventDefault();
          return;
      }
      if (userID.length < 6) {
          alert("아이디는 6글자 이상 입력해야 합니다.");
          FILL.preventDefault();
          return;
      }
      if (userID.length >= 16) {
          alert("아이디는 16글자 미만 입력해야 합니다.");
          FILL.preventDefault();
          return;
      }
      if (username.length < 2) {
          alert("이름을 정상적으로 입력해주세요.");
          FILL.preventDefault();
          return;
      }
      if (username.length >= 20) {
          alert("이름은 20글자 미만이 되어야 합니다.");
          FILL.preventDefault();
          return;
      }
      if (password.length < 8) {
          alert("비밀번호는 8글자 이상 입력해야 합니다.");
          FILL.preventDefault();
          return; 
      }
      if (password.length >= 12) {
          alert("비밀번호는 12글자 미만 입력해야 합니다.");
          FILL.preventDefault();
          return; 
      }
      if (password !== passwordConfirm) {
          alert("비밀번호를 다시 확인해주세요.");
          FILL.preventDefault();
          return;
      }
      if (useremail.length < 3) {
          alert("이메일은 3글자 이상 입력해야 주세요.");
          FILL.preventDefault();
          return;
      } 
      if (useremail.length >= 20) {
          alert("이메일은 20글자 미만 입력해야 합니다.");
          FILL.preventDefault();
          return;
      } 
      if (userdomain.length < 3) {
          alert("도메인을 입력해주세요.");
          FILL.preventDefault();
          return;
      }
      if (userdomain.length >= 20) {
          alert("도메인은 20글자 미만 입력해야 합니다.");
          FILL.preventDefault();
          return;
      }
      

  

  });
</script>

    
  </main>

<%@ include file="footer2.jsp"%>
</body>
</html>