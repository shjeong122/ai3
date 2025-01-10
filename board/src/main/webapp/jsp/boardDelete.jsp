<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제 코드만 작성 </title>
<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: 'Arial', sans-serif;
    background-color: #f4f7f6;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.form-container {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    max-width: 400px;
    width: 100%;
    text-align: center;
}

form label {
    font-size: 1.2rem;
    color: #333;
    margin-bottom: 10px;
    display: block;
}

form input[type="text"] {
    width: 100%;
    padding: 10px;
    margin: 10px 0;
    border: 2px solid #ddd;
    border-radius: 5px;
    font-size: 1rem;
    transition: border-color 0.3s;
}

form input[type="text"]:focus {
    border-color: #4CAF50;
    outline: none;
}

form input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    border: none;
    padding: 12px 20px;
    border-radius: 5px;
    font-size: 1rem;
    cursor: pointer;
    transition: background-color 0.3s;
}

form input[type="submit"]:hover {
    background-color: #45a049;
}

</style>
</head>
<body>
  <form action="processDelete.jsp" method="get">
     <label> 삭제할 게시글 번호를 입력하기 </label>
     <input type="text" name="num">
     <input type="submit" value="삭제하기">
  </form>
 
</body>
</html>