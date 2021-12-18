<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>


<h1>게시물 수정</h1>
<form:form commandName="boardVO" method="post" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr><td>카테고리:</td><td><form:input path="category"  /></td></tr>
		<tr><td>제목:</td><td><form:input path="title" /></td></tr>
		<tr><td>글쓴이:</td><td><form:input path="writer" /></td></tr>
		<tr><td>내용:</td><td><form:textarea cols="50" rows="5" path="content" /></td></tr>
	</table>
	<input type="submit" value="수정하기"/>
	<input type="button" value="취소하기" onclick="history.back()"/>
</form:form>

</body>
</html>