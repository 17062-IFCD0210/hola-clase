<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Alta nuevo Usuario</h1>


<form action="ejemplos/formularios/controlador_new_user.jsp" 
      method="post" id="form_new_user">

	<label for="usuario">Usuario:</label> 
	<input type="text" name="usuario" id="usuario" value="" /> 
	<br>
	 
	<label for="pass">Contrase&ntilde;a:</label> 
	<input type="password" name="pass" id="pass" value="" placeholder="solo numeros y letras"/>
	
	<label for="repass">Repite Contrase&ntilde;a:</label> 
	<input type="password" name="repass" id="repass" value="" placeholder="solo numeros y letras"/>
	
	<br />
	 
	<input type="submit" value="Registrate" />

</form>


<jsp:include page="../../plantillas/foot.jsp"></jsp:include>