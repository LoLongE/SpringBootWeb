<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap/bootstrap.css">
</head>
<body>

ID : ${memberVO.member_id} // PW : ${memberVO.member_password}
<br>
출력테스트
<br>
<table class="table">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>내용</th>
		</tr>
	</thead>
		
	<tbody>
		<tr>
			<td>1</td>
			<td>테스트 제목</td>
			<td>테스트 작성자</td>
			<td>테스트 내용</td>
		</tr>
		<tr>
			<td>2</td>
			<td>제목 입니다...!!</td>
			<td>작성자</td>
			<td>테스트 내용내용내용내용</td>
		</tr>
		<tr>
			<td>3</td>
			<td>게시글 000003</td>
			<td>노동현</td>
			<td>내용내용내용내용내용내용내용내용내용내용내용내용</td>
		</tr>
	</tbody>
</table>

<script scr="js/jquery-3.3.1.min.js"></script>
<script scr="js/bootstrap.min.js"></script>
</body>
</html>