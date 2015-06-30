<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Controlador Datos Personales</h1>



<%
	//Controlador para recoger parametros del formulario registro.jsp
	
	
	//recoger parametros de la request
	String usuario = (String)request.getParameter("usuario");
	String email = (String)request.getParameter("email");
	String password = (String)request.getParameter("password");
	
	//pintar los parametros en el html(en pantalla)
	out.print("<p>Bienvenido, "		+ usuario + ". Te hemos enviado un email a " + email + "</p>");	

%>


<jsp:include page="../../plantillas/foot.jsp"></jsp:include>
