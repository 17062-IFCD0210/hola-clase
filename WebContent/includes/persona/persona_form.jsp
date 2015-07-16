<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>


<article>
	<header>
		<h1>Formulario de alta para Personas</h1>
	</header>
	<%
		String error = (String)request.getAttribute("error");
		if (error!=null){
			out.print("<label for='mensaje' class='msg_error_alta_persona'>"+error+"</label><br>");
		}
	%>
	<div class="cnt_article">
		<form id="alta_persona" action="personaControlador" method="post">
			<fieldset>
				<legend>Datos Personales</legend>
				<div>
					<label for="nombre">Nombre:</label>
					<input type="text" name="nombre" id="nombre" value="" placeholder="Nombre" />
					
					
					<label for="apellidos">Apellidos:</label>
					<input type="text" name="apellidos" id="apellidos" value="" placeholder="Apellidos" />
				</div>
				
				<div>
					<label for="edad">Edad:</label>
					<input type="text" name="edad" id="edad" value="" placeholder="0-99" />
					
					<label for="email">Email:</label>
					<input type="text" name="email" id="email" value="" placeholder="Email" />
				</div>
			</fieldset>
			<fieldset>
			<legend>Expediente Academico</legend>
				<label for="aprobado">Aprobado</label>
				<input type="checkbox" name="aprobado" id="aprobado" value="1">
				<br>
				<label for="nota">Nota:</label>
				<input type="text" name="nota" id="nota" value="" placeholder="0-10" />
			</fieldset>
			
			<div id="guardar_alta_personas">
			<input type="submit" value="Guardar" />
			<input type="reset"  value="Limpiar Formulario">
			</div>
		
		</form>
	</div>
</article>
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>