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
����׽�Ʈ
<br>
<table class="table">
	<thead>
		<tr>
			<th>��ȣ</th>
			<th>����</th>
			<th>�ۼ���</th>
		</tr>
	</thead>
		
	<tbody>
		<tr>
			<td>1</td>
			<td>�׽�Ʈ ����</td>
			<td>�׽�Ʈ �ۼ���</td>
		</tr>
	</tbody>
</table>

<script scr="js/jquery-3.3.1.min.js"></script>
<script scr="js/bootstrap.min.js"></script>
</body>
</html>