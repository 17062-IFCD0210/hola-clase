<%@page import="com.ipartek.formacion.holaclase.poo.bean.Persona"%> <!-- le damos a Persona+ ctrl+espacio -->
<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Detalle Persona</h1>

<%
	String msg = (String)request.getAttribute("msg");
	if( msg != null){
		out.print("<h2>" + msg + "</h2>");
	}
	
	//recoger el atributo persona de la request
	Persona p = ( Persona )request.getAttribute("persona");
	
		//preguntamos que no sea nulo -> lo saca por pantalla
	if ( p != null ){
		out.print ( p.toString() );
	}
	
%>


<jsp:include page="../../plantillas/foot.jsp"></jsp:include>