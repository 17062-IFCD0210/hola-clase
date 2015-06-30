<h1>Controlador New User</h1>

<%
//recoger parametros de la request	
	String user = (String)request.getParameter("usuario");
  	String mail = (String)request.getParameter("mail");
  	String pass = (String)request.getParameter("usuario");
  	
  //pintar los parametros en el HTML
    out.print("<p>Usuario: " + user + " </p>");
    out.print("<p>Mail: " + mail + " </p>");
    out.print("<p>Pass: "   + pass + " </p>");

%>