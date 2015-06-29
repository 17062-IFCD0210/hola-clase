<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>


<h1>Alta nuevo Usuario</h1>

<form action="ejemplos/formularios/controlador_new_user.jsp" method="post" id="form_new_user">

<!--  caja para mensajes al usuario -->
	<div id="msg_box"></div>
	
	<label for="usuario">Usuario:</label> 
	<input type="text" name="usuario" id="usuario" value="" pattern="^[a-zA-Z][a-zA-Z0-9-_\.]{2,20}$"/>
	<br>

	<label for="email">Email:</label> 
	<input type="email" name="email" id="email" value="" />
	<br>

	 
	<label for="pass">Contrase&ntilde;a:</label> 
	<input type="password" name="pass" id="pass" value="" placeholder="solo numeros y letras"/>
	<br />
	 
	<label for="repass">Repite contrase&ntilde;a:</label> 
	<input type="password" name="repass" id="repass" value="" placeholder="solo numeros y letras"/>
	<br />

	<input type="submit" value="Registrate" />

</form>


<jsp:include page="../../plantillas/foot.jsp"></jsp:include>