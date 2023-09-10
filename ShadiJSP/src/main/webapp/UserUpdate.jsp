<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>Update a User</H1>
<form action="shadi">

		Age<input type="text" name="age"> Name<input type="text"
			name="name"> Email<input type="text" name="email">
		Gender<input type="text" name="gender"> Country<input
			type="text" name="country"> City<input type="text"
			name="city"> M.Number<input type="text" name="mnumber">
			<input type="hidden" name="action" value="update">
		<input type="submit" value="update">
	</form>
	
</body>
</html>