<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>건의사항 쓰기</title>
    <link rel="stylesheet" href="../../yamyam/write.css" />
    <link rel="stylesheet" href="../../yamyam/main1.css" />
    <link rel="stylesheet" href="../../yamyam/header.css" />
    <style>
      @import url("https://fonts.googleapis.com/css2?family=Hahmlet:wght@100..900&display=swap");
    </style>
  </head>
  <body>
	<%@ include file="header1.jsp"%>
	
	<main>
      <h1>|&nbsp;&nbsp;&nbsp;건의사항&nbsp;&nbsp;&nbsp;|</h1>
      <div id="write_area">
        <form action="processSuggestWrite.jsp" method="post">
          <table>
            <tr>
              <td><h2>글쓰기</h2></td>
            </tr>
            <tr>
              <td id="header">Title</td>
            </tr>
            <tr>
              <td>
                <input
                  type="text"
                  placeholder="제목을 입력하세요"
                  name="suggestTitle"
                />
              </td>
            </tr>
            <tr>
              <td id="header">Comment</td>
            </tr>
            <tr>
              <td>
                <textarea
                  placeholder="내용을 입력하세요"
                  name="suggestContent"
                ></textarea>
              </td>
            </tr>
            <tr>
              <td>
                <input
                  type="submit"
                  value="등록"
                  onclick="alert('작성 완료!')"
                />
              </td>
            </tr>
          </table>
        </form>
      </div>
    </main>
	
	<%@ include file="footer1.jsp"%>
</body>
</html>