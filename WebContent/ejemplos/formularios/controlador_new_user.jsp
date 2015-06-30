<h1>Controlador Nuevo Registro</h1>



<%
	//Controlador para recoger parametros del formulario de registro.jsp
	
	
	//recoger parametros de la request
	
	String usuario = (request.getParameter("usuario")==null)?"":request.getParameter("usuario");
	String email   = (request.getParameter("email")==null)?"":request.getParameter("email");
	String pass    = (request.getParameter("pass")==null)?"":request.getParameter("pass");
	String repass  = (request.getParameter("repass")==null)?"":request.getParameter("repass");
	
	//pintar los parametros en el html(en pantalla)
	out.print("<p>Usuario: "+ usuario + "</p>");	
	out.print("<p>Email: "	+ email + "</p>");
	out.print("<p>Pass: "	+ pass + "</p>");
	out.print("<p>repass: "	+ repass + "</p>");
	

%>
