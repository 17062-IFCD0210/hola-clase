<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>Eventos</h2>

	<article>	
		<header>
			<h1>Onclick en etiqueta</h1>
		</header>
		<div class="cnt_article">
			
			<i class="fa fa-align-justify fa-4x" onclick="alert('pulsado icono');"></i>			
						
	 	</div>			
		<footer>
			Capitulo 14; pagina 328
		</footer>
	</article>
	
	<article>	
		<header>
			<h1>Onclick en el Objeto con JavaScript</h1>
		</header>
		<div class="cnt_article">
			
			<i class="fa fa-align-justify fa-4x" id="btn_menu"></i>			
			<script>
				
				var btn_menu = document.getElementById("btn_menu");
				btn_menu.onclick = function(){
					alert('Boton pulsado, evento relacionado con javaScript');
				};
			
			</script>			
	 	</div>			
		<footer>
			Capitulo 14; pagina 328
		</footer>
	</article>
	
	<article>	
		<header>
			<h1>Asociar evento con Listener</h1>
		</header>
		<div class="cnt_article">
			
			<i class="fa fa-align-justify fa-4x"></i>
			<i class="fa fa-align-justify fa-4x"></i>
			<i class="fa fa-align-justify fa-4x"></i>
			<i class="fa fa-align-justify fa-4x"></i>
						
			<script>
				
				//declaramos una referencia a la funcion
				var referencia_funcion_saluda = function saluda(){
					alert('Hola');
				}
			
				var listaBotones = document.getElementsByTagName("i");
				//recorro todos los elementos para asociarle el Listener
				for (i=0; i < listaBotones.length; i++){
					listaBotones[i].addEventListener("click", referencia_funcion_saluda );
				}	
				
			
			</script>			
	 	</div>			
		<footer>
			Capitulo 14; pagina 328
		</footer>
	</article>
	
	
	<article>	
		<header>
			<h1>Mostrar eventos en TextArea</h1>
		</header>
		
		<div class="cnt_article">
			<div class="clearfix cnt_cols">
				<div class="col1">
					<textarea id="txt" cols="50" rows="20"></textarea>
				</div>
				<div class="col2">
				
					<form action="#" method="post" onsubmit="validar(this); return false;">
						<div id="div_error" class="div_error"></div>
						<input type="button" id="boton" value="Pulsame">
						<input type="button" id="clear" value="Limpiar">
						<br><br>
						<select id="selec">
							<option value="bio">Bilbao</option>
							<option value="bar">Barakaldo</option>
						</select>
						<br><br>
						<label>Introduce Texto:</label>
						<input type="text" id="texto" class="text">
						
						<fieldset name="fsexo">
							<legend>Sexo</legend>
							
							<input data-label="hombre" type="radio" name="sexo" value="H" id="hom">						
							<label for="hom">Hombre</label>
							
							<input data-label="mujer" type="radio" name="sexo" value="M" id="muj" checked>						
							<label for="muj">Mujer</label>
							
							<input data-label="indeterminado" type="radio" name="sexo" value="I" id="ind">
							<label for="muj">Indeterminado</label><br>
						</fieldset>
						
						<fieldset name="fcon">
							<legend>Conocimientos</legend>
							<input type="checkbox" name="con" value="0" id="html">
							<label for="html">HTML</label><br>
							<input type="checkbox" name="con" value="1" id="js">
							<label for="js">JS</label><br>
							<input type="checkbox" name="con" value="2" id="css3">
							<label for="css3">CSS3</label>
						</fieldset>
						
						<!-- botones -->
						<input type="submit" value="Guardar">
						<input type="reset"  value="Limpiar">
						
					</form>
							
				</div><!-- col2 -->
				
			</div><!-- cnt_cols -->
			
			<script type="text/javascript">
			
				/**
					Validacion del formulario
					Si retorno true se submita
					Si retorno false NO se submita
					
					Estado inicial: 
							Sexo          - indeterminado
							conocimientos - Sin checkear
					
					Validaciones:
						
						    Texo:  entre 5 y 255 caracteres
						    Sexo indeterminado: sin conocimientos obligatorios
						    Sexo hombre       : minimo 1 conocimiento
						    Sexo mujer        : minimo 2 conocimiento
					
				    Fedback para el usuario: caja de texto mostrando los errores	
						    
				*/
				function validar(formulario){
					var resul = false;
					var div_error = document.getElementById("div_error");
					var sexo = formulario.sexo.value;
					var con = formulario.con;
					var cons = 0;
					
					for (var i = 0; i<con.length; i++){
						if (con[i].checked){
							cons++;
						}
					}
					
					//validar texto
					if (formulario.texto.value!=""){
						if (formulario.texto.value.length<5 || formulario.texto.value.length>255){
							div_error.innerHTML="El texto tiene que tener mas de 5 caracteres y menos de 255.";
							div_error.style.display="block";
							formulario.texto.className+=" campo_error";
							resul = false;
							return resul;
						} else {
							formulario.texto.className="text";
							resul = true;
// 							alert('resul true');
						}
					}else{
						div_error.innerHTML="El texto no puede estar vacio.";
						div_error.style.display="block";
						formulario.texto.className+=" campo_error";
						return resul;
					}
					
					
					switch (sexo){
					case 'H':
						if (cons<1){
							div_error.innerHTML="Los hombres tienen que tener minimo un conocimiento.";
							div_error.style.display="block";
							formulario.fcon.className+=" campo_error";
							resul = false;
							return resul;
						}else{
							resul = true;
// 							alert('resul true');
						}
						break;
						
					case 'M':
						if (cons<2){
							div_error.innerHTML="Las mujeres tienen que tener minimo dos conocimientos.";
							div_error.style.display="block";
							formulario.fcon.className+=" campo_error";
							resul = false;
							return resul;
						}else{
							resul = true;
// 							alert('resul true');
						}
						break;
						
					case 'I':
						resul = true;
// 						alert('resul true');
						break;
						
					default:
						div_error.innerHTML="Error desconocido, pongase en contacto con el administrador.";
						div_error.style.display="block";
						result=false;
						return resul;
					}
					
					//Si todo correcto submitar formulario
					if ( resul ){
						if (confirm('¿Deseas enviar los datos?')){
							formulario.submit();	
						}else{
							return false;
						}
					}else{					
						return resul;
					}	
				}
			
			
			
				//Buscar objetos por su ID
				var txt = document.getElementById("txt");
				var boton = document.getElementById("boton");
				var clear = document.getElementById("clear");
				var selec = document.getElementById("selec");
				var cajatext = document.getElementById("texto");
				var sexo = document.getElementsByName("sexo");
				var con = document.getElementsByName("con");
				
				//Boton pulsar
				boton.onclick = function(event) {
					console.debug('Boton Pulsado');
					txt.value += 'Boton Pulsado[x,y] ['+ event.x +','+ event.y +']\n';
				}
				
				//Boton limpiar
				clear.onclick = function(event) {
					console.debug('Boton pulsado');
					txt.value = '';
				}
				
				//Select-option
				selec.onchange = function(event) {
					console.debug('Selec ha cambiado');
					var indice = selec.selectedIndex;
					var texto = selec.options[indice].text;
					var valor = selec.options[indice].value;
					txt.value += 'Opcion cambiada: '+ texto + '['+ valor +']\n';
				}
				
				//Caja de texto
				cajatext.onblur = function(event) {
					console.debug("Ha entrado en el foco");
					if(cajatext.value != '') {
						txt.value += 'Texto Escrito: ' + cajatext.value + '\n';
					}
				}
				
				//RadioButton
				for(i=0; i<sexo.length; i++) {
					sexo[i].onchange = function(event) {
						
						//var label = this.nextElementSibling.innerHTML;
						var label = this.dataset.label;						
						txt.value += 'Has cambiado a (' + this.value + ') ' + label + '\n';
					}
				}
				
				for(i=0; i<con.length; i++) {
					con[i].onchange = function(event) {
						
						if(this.checked) {
							txt.value += 'Has activado (' + this.value + ') ' + this.nextElementSibling.innerHTML + '\n';
						} else {
							txt.value += 'Has desactivado (' + this.value + ') ' + this.nextElementSibling.innerHTML + '\n';
						}
												
					}
				}
				
			</script>
		</div>
			
		<footer>
			Sin Referencia
		</footer>
			
	</article>	
	
</section>	
			
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>