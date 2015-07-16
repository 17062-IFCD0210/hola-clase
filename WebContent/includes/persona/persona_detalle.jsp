<%@page import="com.ipartek.formacion.holaclase.poo.bean.Persona"%>
<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
<article>
	<header>
		<h1>Detalle de Persona</h1>
	</header>
	<div class="cnt_article">
		<%
		String msg = (String)request.getAttribute("msg");
		Persona persona = (Persona)request.getAttribute("persona");
		if (msg!=null&&persona!=null){
			out.print("<h3>"+msg+"</h3>");
			out.print("<h3>"+persona.getNombre()+"</h3>");
			out.print("<h3>"+persona.getApellidos()+"</h3>");
			out.print("<h3>"+persona.getEdad()+"</h3>");
			out.print("<h3>"+persona.getEmail()+"</h3>");
			out.print("<h3>"+persona.isAprobado()+"</h3>");
			out.print("<h3>"+persona.getNota()+"</h3>");
			
		}
		%>
	</div>
</article>



<jsp:include page="../../plantillas/foot.jsp"></jsp:include>