<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Alta nuevo Usuario</h1>


<form action="ejemplos/formularios/controlador_new_user.jsp"
	method="post" id="form_new_user"
	onsubmit="validar(this);return false;"> <!-- return false para que no se autoenvíe, ya lo enviaremos desde la función -->
	<!-- Cuando se submita va a esta página controlador_new_user.jsp -->
	<!-- Pero antes, en main.jsp, escuchamos al evento submit para comprobar que están bien los datos antes de enviar -->
	
	<label for="usuario">Usuario:</label> 
	<input type="text" name="usuario" id="usuario" value="" placeholder="Introduce nombre" /> 
	<br/>
	<br/>
	 
	<label for="email">Email:</label> 
	<input type="text" name="email" id="email" value="" placeholder="Introduce tu email" /> 
	<br/>
	<br/>
	 
	<label for="pass">Contrase&ntilde;a:</label> 
	<input type="password" name="pass" id="pass" value="" placeholder="s&oacute;lo n&uacute;meros y letras"/>
	<br/>
	<br/>
	 
	<label for="pass">Repite contrase&ntilde;a:</label>
	<input type="password" name="repass" id="repass" value="" placeholder="s&oacute;lo n&uacute;meros y letras"/>
	<br/>
	<br/>
	<br/>	
	 
	<input type="submit" value="Reg&iacute;strate" />

</form>

	<a href="ejemplos/formularios/registro.jsp" title="Registro usuarios nuevos">¿No tienes cuenta? reg&iacute;strate</a>


<jsp:include page="../../plantillas/foot.jsp"></jsp:include>