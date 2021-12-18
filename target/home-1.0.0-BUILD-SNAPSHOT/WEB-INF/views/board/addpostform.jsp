<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지 작성</title>
</head>
<body>

<h1>게시물 작성</h1>
   <div class="container">
      <div class="row">
         <form method="post" action="addok">
            <table class="table table-striped"
               style="text-align: center; border: 1px solid #dddddd">
               <thead>
                  <tr>
                     <th colspan="2"
                        style="background-color: #eeeeee; text-align: center;">게시판
                        글쓰기 양식</th>
                  </tr>
               </thead>
               <tbody>
                  <tr>
                     <td><input type="text" class="form-control"
                        placeholder="카테고리" name="category" maxlength="10"></td>
                  </tr>
                  <tr>
                     <td><input type="text" class="form-control"
                        placeholder="글 제목" name="title" maxlength="50"></td>
                  </tr>
                  <tr>
                     <td><input type="text" class="form-control"
                        placeholder="작성자" name="writer" maxlength="10"></td>
                  </tr>
                  <tr>
                     <td><textarea class="form-control" placeholder="글 내용"
                           name="content" maxlength="2048" style="height: 350px;"></textarea></td>
                  </tr>
               </tbody>
            </table>
            <!-- 글쓰기 버튼 생성 -->
            <input type="submit" class="btn btn-primary pull-right" value="글쓰기">
            <button type="button" onclick="location.href='list'">목록보기</button>
         </form>
      </div>
   </div>
   <!-- 게시판 글쓰기 양식 영역 끝 -->

   <!-- 부트스트랩 참조 영역 -->
   <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
   <script src="js/bootstrap.js"></script>
</body>
</html>
