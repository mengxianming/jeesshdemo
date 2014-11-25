<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/dynaweb/upload" enctype="multipart/form-data" method="POST">
<label>choose file to upload:</label><input type="file" name="file"/><br>
<input type="submit" value="Upload">
</form>
</body>
</html>