<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Alta Nueva Persona</h1>

<label for="mensaje">${requestScope.msg}</label><br>
<form action="personaControlador" method="post">

		<fieldset>
		<legend>Datos Personales</legend>
			<p>
				<label for="nombre">Nombre:</label><br>
				<input type="text" id="nombre" name="nombre" value=""
					   required	pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}"
					   autofocus
					   tabindex="1"
				       placeholder="Escribe tu nombre"
				       title="Por favor escribe tu nombre"				       
				       >
			</p>
			<br>
			<p>
				<label for="apellido">Apellido:</label><br>
				<input type="text" id="apellido" name="apellido"
					   required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}"	  
				       value="" placeholder="Tu apellido"
				       title="Por favor escribe tu apellido"
				       tabindex="1" 
				       >
			</p>
			<br>
			<p>
				<label for="edad">Edad:</label><br>
				<input type="text" id="edad" name="edad" value=""
				       placeholder="18-99"
				       required
				       tabindex="1"				        
					   size="2" >
			</p>
			<br>
			<p>
				<label for="mail">E-mail:</label><br>
				<input type="email" id="mail" name="mail" value=""
				       required				        
					   title="Por favor, escriba su e-mail"
					   tabindex="1">
			</p>
		</fieldset>
		<br><br>
		<fieldset>
			<legend>Notas</legend>
			<p>
				<input type="checkbox" name="aprobado" id="aprobado" value="0" tabindex="1">
				<label for="aprobado">Aprobado</label>
			<br>
			</p>
			<br>
			<p>
				<label for="nota">Nota:</label><br>
				<input type="text" id="nota" name="nota" value=""
				       placeholder="0-10"
				       required			        
					   size="3"
					   tabindex="1" >
			</p>	
		</fieldset>
	<br> 
	<br>
	
	<input type="submit" value="Guardar">

</form>

<br>
	
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>