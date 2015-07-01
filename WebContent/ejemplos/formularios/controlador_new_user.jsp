<h1>Controlador New User</h1>



<%
	//Controlador para recoger parametros del formulario de datos_personales.jsp
	
	
	//recoger parametros de la request
	String user = (String)request.getParameter("usuario");
	String email = (String)request.getParameter("email");
	String pass = (String)request.getParameter("pass");
	String repass = (String)request.getParameter("repass");
	
	
	//pintar los parametros en el html(en pantalla)
	out.print("<p>Usuario: "		+ user + "</p>");	
	out.print("<p>Email: "			+ email + "</p>");
	out.print("<p>Pass: "			+ pass + "</p>");
	out.print("<p>Repass: "			+ repass + "</p>");
	%>
