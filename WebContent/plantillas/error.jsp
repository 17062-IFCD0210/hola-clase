<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/styles.css?v=1.0">
	<title>ERROR</title>
</head>

<body>
	
	<div id="error_page">
	
		<h1>Error Inesperado</h1>
		
		<div class="content_msg">
		<% 
			if ( request.getAttribute("msg")!=null ){
				out.print(request.getAttribute("msg"));
			}
		%>
		</div>
		
	</div>

</body>
</html>