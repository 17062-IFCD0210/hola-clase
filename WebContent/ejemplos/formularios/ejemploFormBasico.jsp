<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Ejemplo Form Basico Hola</h1>

<form name="formEjemplo" id="formEjemplo" 
      action="ejemploControlador" method="post" >

		<fieldset>
		<legend>Datos</legend>
			<p>
				<label for="texto">Texto:</label><br>
				<input type="text" id="texto" name="texto" value=""
					   pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}">
			</p>			
			<p>
				<label for="numero">Numero:</label><br>
				<input type="text" id="numero" name="numero" value=""
				       placeholder="0-99"
				       required pattern="[0-9]{1,2}"				        
					   size="2" >
			</p>
				
	<input type="submit" value="Crear">
	
</form>

<%
String msg[] = (String[])request.getAttribute("num");
if(msg != null) {
	out.print("<h2>" + msg + "</h2>");
}
%>

<br>


			
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>	