<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.Board" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> updateForm.jsp </title>
<style>
        body {
            font-family: Arial, sans-serif;
        }
        h2 {
            text-align: center;
        }
        .board-form {
            width: 80%;
            margin: 0 auto;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 10px;
            background-color: #f9f9f9;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-group input, .form-group textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        .form-group textarea {
            resize: vertical;
        }
        .form-group input[type="date"] {
            padding: 5px;
            font-size: 16px;
        }
        .submit-btn {
            text-align: center;
        }
        .submit-btn button {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .submit-btn button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
  <%
     // 수정할 폼을 띄우고 원래 자료를 보여준다. 
     // 사용자가 수정하고 수정버튼을 누르면 데이터베이스에 수정되게 한다. 
     
    Board board =( Board )  session.getAttribute("board");
  %>
  <h2>게시글 수정하기</h2>

    <div class="board-form">
        <form action="processUpdateBoard.jsp" method="POST">
            <!-- 게시글 번호 -->
            <div class="form-group">
                <label for="post_id">게시글 번호</label>
                <input type="number" value=<%= board.getNum() %> id="post_id" name="post_id" placeholder="게시글 번호를 입력하세요" required>
            </div>

            <!-- 게시글 제목 -->
            <div class="form-group">
                <label for="title">게시글 제목</label>
                <input type="text" value=<%= board.getTitle() %> id="title" name="title" placeholder="게시글 제목을 입력하세요" required>
            </div>

            <!-- 게시글 내용 -->
            <div class="form-group">
                <label for="content">게시글 내용</label>
                <textarea id="content"  name="content" rows="10" placeholder="게시글 내용을 입력하세요" required>  <%= board.getContent() %> </textarea>
            </div>

            <!-- 작성자 -->
            <div class="form-group">
                <label for="author">작성자</label>
                <input type="text" value=<%= board.getWriter() %> id="author" name="author" placeholder="작성자를 입력하세요" required>
            </div>

            <!-- 작성일 -->
            <div class="form-group">
                <label for="date">작성일</label>
                <input type="date" id="date" name="date" required>
            </div>

            <!-- 제출 버튼 -->
            <div class="submit-btn">
                <button type="submit">게시글 수정</button>
            </div>
        </form>
    </div>
</body>
</html>