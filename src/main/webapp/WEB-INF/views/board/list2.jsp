<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@page import="com.mycom.myapp.member.MemberDAO"%>
<%@page import="com.mycom.myapp.member.MemberVO"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>팀 구성원 목록</title>
<style>
@font-face {
  font-family: 'LotteMartDream';
  font-style: normal;
  font-weight: 410;
  src: url('https://cdn.jsdelivr.net/korean-webfonts/1/corps/lottemart/LotteMartDream/LotteMartDreamMedium.woff2') format('woff2'), url('https//cdn.jsdelivr.net/korean-webfonts/1/corps/lottemart/LotteMartDream/LotteMartDreamMedium.woff') format('woff');
}

html {
 font-family: 'LotteMartDream', sans-serif;
}
table {
    width: 100%;
    border-top: 1px solid #444444;
    border-collapse: collapse;
  }
  th, td {
    border-bottom: 1px solid #444444;
    padding: 10px;
    text-align: center;
  }
  th:nth-child(2n), td:nth-child(2n) {
    background-color: #bbdefb;
  }
  th:nth-child(2n+1), td:nth-child(2n+1) {
    background-color: #e3f2fd;
  }
</style>
<script>
   function delete_ok(id){
      var a = confirm("정말로 삭제하겠습니까?");
      if(a) location.href='deleteok/'+id;
   }
</script>
</head>
<body>
   <h1>팀 구성원</h1>
   <table id="list2" width="90%">
      <tr>
         <th>Id</th>
         <th>학번</th>
         <th>이름</th>
         <th>전공</th>
         <th>생년월일</th>
         <th>성별</th>
         <th>거주지</th>
         <th>Edit</th>
         <th>Delete</th>
      </tr>
      <c:forEach items="${list}" var="u">
         <tr>
            <td>${u.seq}</td>
            <td>${u.snumber}</td>
            <td>${u.name}</td>
            <td>${u.major}</td>
            <td>${u.birth}</td>
            <td>${u.gender}</td>
            <td>${u.residence}</td>
            <td><a href="editpost2/${u.seq}">정보수정</a></td>
            <td><a href="javascript:delete_ok2('${u.seq}')">정보삭제</a></td>
         </tr>
      </c:forEach>
   </table>
   <br />
   <button type="button" onclick="location.href='add2'">구성원 등록하기</button>
   <button type="button" onclick="location.href='list'">공지사항</button>
</body>
</html>