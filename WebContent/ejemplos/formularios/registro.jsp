
<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Alta Nuevo Usuario</h1>


<form action="ejemplos/formularios/controlador_new_user.jsp" method="post"
	  id="form_new_user" onSubmit="return validar()">

	<label for="usuario">Usuario:</label> 
	<input type="text" name="usuario" id="usuario" value="" /> 
	<br>
	<label for="email">Email:</label> 
	<input type="text" name="email" id="email" value="" /> 
	<br>
	 
	<label for="pass">Contrase&ntilde;a:</label> 
	<input type="password" name="pass" id="pass" value="" placeholder="solo numeros y letras"/>
	
	<label for="repass">Repite Contrase&ntilde;a:</label> 
	<input type="password" name="repass" id="repass" value="" placeholder="solo numeros y letras"/>
	<br>		
	<input type="button" value="Registrate">
	

</form>

<script>
function validar(formulario) {
	var resul = false;

    var p1 = document.getElementById("pass").value;
    var p2 = document.getElementById("repass").value;

    var tam_p1 = p1.length;
	var tam_p2 = p2.length;
	
if (tam_p1 == 0 || tam_p2 == 0) {
	  console.info("Los campos de la password no pueden quedar vacios");
	  return false;
	}
if (p1 != p2) {
	  console.info("Los passwords deben coincidir");
	  return false;
	} else {
	  console.info("Todo esta correcto");
	  return true; 
	}
};

</script>



<jsp:include page="../../plantillas/foot.jsp"></jsp:include>