<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Alta nuevo Usuario</h1>


<!-- caja para mensajes al usuario -->
<div id="msg_box"></div>

<form action="ejemplos/formularios/controlador_new_user.jsp" 
      method="post" id="form_new_user"
	  onsubmit="validar(this); return false;">	

	<label for="usuario">Usuario:</label> 
	<input type="text" name="usuario" id="usuario" value="" /> 
	<br><br>
	
	<label for="email">Email:</label> 
	<input type="text" name="email" id="email" value="" /> 
	<br><br>
	 
	<label for="pass">Contrase&ntilde;a:</label> 
	<input type="password" name="pass" id="pass" value="" placeholder="solo numeros y letras"/>
	<br>
	
	<label for="repass">Repite Contrase&ntilde;a:</label> 
	<input type="password" name="repass" id="repass" value="" placeholder="solo numeros y letras"/>
	
	<br />
	 
	<input type="submit" value="Registrate" />

</form>


<h1>Alta nuevo usuario</h1>

<form name="form_new_user" id="form_new_user" 
		action="ejemplos/formularios/controlador_new_user.jsp" method="post">

	<label for="usuario">Usuario:</label> 
	<input type="text" name="usuario" id="usuario" value="" /> 
	<br>
	  
	<label for="email">Email:</label> 
	<input type="text" name="email" id="email" value="" /> 
	<br>
	
	<label for="pass">Contrase&ntilde;a:</label> 
	<input type="password" name="pass" id="pass" value="" placeholder="solo numeros y letras"/>
	<br />
	
	<label for="pass">Repite Contrase&ntilde;a:</label> 
	<input type="password" name="repass" id="repass" value="" placeholder="solo numeros y letras"/>
	<br />
	 
	<input type="submit" value="Registrar" />

</form>


<jsp:include page="../../plantillas/foot.jsp"></jsp:include>
