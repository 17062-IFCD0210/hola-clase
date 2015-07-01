<h1>Lo controlo casi todo - controlador_new_user</h1>


<%

	//Controlador para recoger parametros del formulario de login.jsp

	//recoger parametros de la request	
	
	String p1 = (String)request.getParameter("usuario");
	String p2 = (String)request.getParameter("email");
	String p3 = (String)request.getParameter("pass");
	
    //pintar los parametros en el HTML
    out.print("<p>Usuario: " + p1 + " </p>");
    out.print("<p>Email: " + p2 + " </p>");
    out.print("<p>Pass: "   + p3 + " </p>");
    
%>
