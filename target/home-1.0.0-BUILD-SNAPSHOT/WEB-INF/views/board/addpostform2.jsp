<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>팀 구성원 추가</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h1>팀원 추가</h1>
		<form action="addok2" method="post" class="was-validated">
			<div class="form-group">
				<label for="name">이름:</label> <input type="text"
					class="form-control" id="name" placeholder="ex)박순용" name="name"
					required>
				<div class="valid-feedback">Valid.</div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="snumber">학번:</label> <input type="text"
					class="form-control" id="snumber" placeholder="ex) 21801028" name="snumber"
					required>
				<div class="valid-feedback">Valid.</div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="sel1">성별:</label> <select class="form-control"
					id="gender" name="gender">
					<option>남자</option>
					<option>여자</option>
				</select>
			</div>
			<div class="form-group form-check">
				<label class="form-check-label"> <input
					class="form-check-input" type="checkbox" name="residence" value="기숙사">
					기숙사 거주
					<br><input
					class="form-check-input" type="checkbox" name="residence" value="외부거주">
					외부 거주
				</label>
			</div>
			<div class="form-group">
				<label for="birth">생년월일:</label> <input type="text"
					class="form-control" id="birth" placeholder="ex)1995.01.01"
					name="birth" required>
				<div class="valid-feedback">Valid.</div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			
			<div class="form-group">
				<label for="name">전공:</label> <input type="text"
					class="form-control" id="major" placeholder="ex)전산전자공학부" name="major"
					required>
				<div class="valid-feedback">Valid.</div>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			
			<button type="submit" class="btn btn-primary">등록하기</button>
		</form>
	</div>

</body>
</html>

