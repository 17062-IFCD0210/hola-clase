<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<h1>Alta Nuevo Usuario</h1>


<form action="ejemplos/formularios/controlador_new_user.jsp" method="post" id="form_new_user" onsubmit="validar(this); return false;" name="formulario">

	<label for="usuario">Usuario:</label> 
	<input type="text" name="usuario" id="usuario" value="" />	
	<br>
	
	<label for="mail">Mail:</label> 
	<input type="email" name="mail" id="mail" value="" />	
	<br>
	 
	<label for="pass">Escribe Contrase&ntilde;a:</label> 
	<input type="password" name="pass" id="pass" value="" placeholder="solo numeros y letras"/>
	<br />
	
	<label for="repass">Repite Contrase&ntilde;a:</label> 
	<input type="password" name="repass" id="repass" value="" placeholder="solo numeros y letras"/>
	<br /> 
	 
	<input type="submit" value="Registrate" />

</form>

	<script type="text/javascript">
	
	function validar(formulario){
		var resul=false;
		
		var usuario = formulario.usuario.value;
		var mail = formulario.mail.value;
		var pass = formulario.pass.value;
		var repass = formulario.repass.value;
		
		if(usuario == ""){
			formulario.usuario.style.backgroundColor = "red";
		} else if(mail == ""){
			formulario.mail.style.backgroundColor = "red";
		} else if(pass == ""){
			formulario.pass.style.backgroundColor = "red";
		} else if(repass == ""){
			formulario.repass.style.backgroundColor = "red";
		} else {
			resul = true;
		}
		
		//Si todo es correcto submitar el formulario
		if(resul){
			
			if(!confirm('Desea enviar el formulario?')){
				resul = false;
				
			}else{						
				formulario.submit();
			}	
		}
		else return resul;
	}				
	//end function validar
	
	var user = document.getElementById('usuario');
	var email = document.getElementById('mail');
	var pass = document.getElementById('pass');
	var repass = document.getElementById('repass');
	
	user.onblur = function(event) {
		if(user.value != "") {
			user.style.backgroundColor = "white";
		}
	}
	
	email.onblur = function(event) {
		if(email.value != "") {
			email.style.backgroundColor = "white";
		}
	}
	
	pass.onblur = function(event) {
		if(pass.value != "") {
			pass.style.backgroundColor = "white";
		}
	}
	
	repass.onblur = function(event) {
		if(repass.value != "") {
			repass.style.backgroundColor = "white";
		}
	} 
</script>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>