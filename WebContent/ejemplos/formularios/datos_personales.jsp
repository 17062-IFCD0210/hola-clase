<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Datos personales</h1>

<form name="formDatosPersonales" id="formDatosPersonales" 
      action="ejemplos/formularios/controlador_datos_personales.jsp" method="post" >

		<fieldset>
		<legend>Datos Personales</legend>
			<p>
				<label for="nombre">Nombre:</label><br>
				<input type="text" id="nombre" name="nombre" value=""
					   required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}"	 
				       placeholder="Escribe tu nombre"
				       title="Por favor escribe tu nombre"				       
				       >
			</p>
			
			<p>
				<label for="apellidos">Apellidos:</label><br>
				<input type="text" id="apellidos" name="apellidos"
					   required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256} ([a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}?)"	  
				       value="" placeholder="Tus dos apellidos"
				       title="Por favor escribe tus dos apellidos" 
				       >
			</p>
			
			<p>
				<label for="profesion">Profesi&oacute;n:</label><br>
				<input type="text" id="profesion" name="profesion" value="Actor" 
					   readonly >
			</p>
			
			<p>
				<label for="edad">Edad:</label><br>
				<input type="text" id="edad" name="edad" value=""
				       placeholder="0-99"
				       required pattern="[0-9]{1,2}"				        
					   size="2" >
			</p>
			
			<p>
				<label for="rol">Rol:</label><br>
				<input type="text" id="rol" name="rol" value="usuario" 
					   disabled>
			</p>
			<p>
				<span>Sexo:</span><br>
				<input type="radio" name="sexo" id="datospersonalesSexoH" value="h" >
				<label for="datospersonalesSexoH">Hombre</label>
				<br>
				<input type="radio" name="sexo" id="datospersonalesSexoM" value="m" >
				<label for="datospersonalesSexoM">Mujer</label>
				<br>
				<input type="radio" name="sexo" id="datospersonalesSexoX" value="i" checked="checked">
				<label for="datospersonalesSexoX">Indefinido</label>
			</p>
		</fieldset>
		
			
		
		<fieldset>
		<legend>Conocimientos</legend>
			
			<input type="checkbox" name="conocimientos" id="datospersonalesConocimientos1" value="0" checked="checked">
			<label for="datospersonalesConocimientos1">HTML</label>
			<br>
			<input type="checkbox" name="conocimientos" id="datospersonalesConocimientos2" value="1" >
			<label for="datospersonalesConocimientos2">JavaScript</label>
			<br>
			<input type="checkbox" name="conocimientos" id="datospersonalesConocimientos3" value="2" checked="checked">
			<label for="datospersonalesConocimientos3">CSS</label>
			<br>
			<input type="checkbox" name="conocimientos" id="datospersonalesConocimientos4" value="3" >
			<label for="datospersonalesConocimientos4">JQuery</label>
			<br>
			<input type="checkbox" name="conocimientos" id="datospersonalesConocimientos5" value="4" >
			<label for="datospersonalesConocimientos5">Java</label>
			
		</fieldset>
		
		<fieldset>
		<legend>Nacionalidad</legend>
		
			<select name="nacionalidad" multiple size="10">
				<%
					for (int i=0; i < 100; i++){
				     		out.print("<option value='" + i + "'>Pais "+ i +"</option>");						
					}
				%>				
			</select>
						
		</fieldset>
		
	<fieldset>
	<legend>Gustos musicales</legend>
			<select name="gustos_musicales" id="gustos_musicales" size="10" >
				<optgroup label="Rock">
					<option value="1">Guns and Roses</option>
					<option value="2">Nirvana</option>
					<option value="3">AC/DC</option>
				</optgroup>
				
				<optgroup label="Pop">
					<option value="4">Green Day</option>
					<option value="5">Linkin Park</option>
					<option value="6">Paramore</option>
				</optgroup>
				
				<optgroup label="Clasica">
					<option value="7">Johann Sebastian Bach</option>
					<option value="8">Ludwig van Beethoven</option>
					<option value="9">Wolfgang Amadeus Mozart</option>
				</optgroup>

			</select>
			
	</fieldset>
	
	<fieldset>
	<legend>CV</legend>
	
		<textarea name="cv" cols="60" rows="10"  
		          placeholder="Introduce tu cv en texto plano(minimo 50 caracteres)"></textarea>
			         			
	</fieldset>	
		
	
	<br> 
	<br>
	
	<input type="submit" value="Guardar">
	<input type="reset"  value="Limpiar Formulario">

</form>

<br>
			
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>			
