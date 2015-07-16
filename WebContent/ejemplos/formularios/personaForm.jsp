<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Datos personales</h1>

<form name="formPersona" id="formPersona" 
      action="#" method="post" >

		<fieldset>
		<legend>Datos Personales</legend>
			<p>
				<label for="nombre">Nombre:</label><br>
				<input type="text" id="nombre" name="nombre" value=""
					   required	 
				       placeholder="Escribe tu nombre"
				       title="Por favor escribe tu nombre"				       
				       >
			</p>
			<br>
			<p>
				<label for="apellido">Apellido:</label><br>
				<input type="text" id="apellido" name="apellido"
					   required 	  
				       value="" placeholder="Tu apellido"
				       title="Por favor escribe tu apellido" 
				       >
			</p>
			<br>
			<p>
				<label for="edad">Edad:</label><br>
				<input type="text" id="edad" name="edad" value=""
				       placeholder="18-99"
				       required				        
					   size="2" >
			</p>
			<br>
			<p>
				<label for="mail">E-mail:</label><br>
				<input type="email" id="mail" name="mail" value=""
				       required				        
					   title="Por favor, escriba su e-mail">
			</p>
		</fieldset>
		<br><br>
		<fieldset>
			<legend>Notas</legend>
			<p>
				<input type="checkbox" name="conocimientos" id="datospersonalesConocimientos1" value="0">
				<label for="datospersonalesConocimientos1">Aprobado</label>
			<br>
			</p>
			<br>
			<p>
				<label for="nota">Nota:</label><br>
				<input type="text" id="nota" name="nota" value=""
				       placeholder="0.0-10.0"			        
					   size="3" >
			</p>	
		</fieldset>
	<br> 
	<br>
	
	<input type="submit" value="Guardar">
	<input type="reset"  value="Limpiar Formulario">

</form>

<br>


			
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>			
