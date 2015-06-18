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
				
					<form action="#" method="post" onsubmit="validar(this); return false;" name="formulario">
					
						<input type="button" id="boton" value="Pulsame">
						<input type="button" id="clear" value="Limpiar">
						
						<select id="selec">
							<option value="bio">Bilbao</option>
							<option value="bar">Barakaldo</option>
						</select><br>
						<label>Introduce Texto:</label>
						<input type="text" id="texto" class="text">
						
						<fieldset>
							<legend>Sexo</legend>
							
							<input data-label="hombre" type="radio" name="sexo" value="H" id="hom">						
							<label for="hom">Hombre</label>
							
							<input data-label="mujer" type="radio" name="sexo" value="M" id="muj">						
							<label for="muj">Mujer</label>
							
							<input data-label="indeterminado" type="radio" name="sexo" value="I" id="ind" checked>
							<label for="muj">Indeterminado</label><br>
						</fieldset>
						
						<fieldset>
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
						<div id="errores"></div>
					</form>
							
				</div><!-- col2 -->
				
			</div><!-- cnt_cols -->
			
			<script type="text/javascript">
			
				/* aplicar estilos al div errores */
				
				var errores=document.getElementById('errores');
				errores.style.backgroundColor='red';
			
			
				/**
					Validacion del formulario
					Si retorno true se submita
					Si retorno false NO se submita
					
					Estado inicial: 
							Sexo          - indeterminado
							con - Sin checkear
					
					Validaciones:
						
						    Texo:  entre 5 y 255 caracteres
						    Sexo indeterminado: sin con obligatorios
						    Sexo hombre       : minimo 1 conocimiento
						    Sexo mujer        : minimo 2 conocimiento
					
				    Fedback para el usuario: caja de texto mostrando los errores	
						    
				*/
				function validar(formulario){
					var resul=false;
					var mensaje='';

					errores.innerHTML='';
					if(!confirm('Desea enviar el formulario?')){
						errores.innerHTML='Envio cancelado';
						return false;
						
					}
					//TODO validar nosotros el formulario
					
					if(formulario.texto.value.length<5){
						mensaje+="El cuadro de texto tiene menos de 5 caracteres<br/>";
						formulario.texto.style.backgroundColor='red';
					}
					
					if(formulario.texto.value.length>255){
						mensaje+="El cuadro de texto tiene mas de 255 caracteres<br/>";
						formulario.texto.style.backgroundColor='red';
					}
					
					if(formulario.sexo.value=='H'){ //sexo Hombre, debe tener al menos 1 conocimiento
						var conoce=false;
						for(i=0;i<formulario.con.length;i++){
							if(formulario.con[i].checked){
								conoce=true;
								break
							}
						}
						if(!conoce)mensaje+="Siendo hombre deberia tener al menos 1 conocimiento<br/>";
					}
					
					if(formulario.sexo.value=='M'){ //sexo Mujer, debe tener al menos 2 con
						var conoce1=false;
						var conoce2=false;
						for(i=0;i<formulario.con.length;i++){
							if(formulario.con[i].checked)conoce1=true;
							if((formulario.con[i].checked)&&(conoce1)){
								conoce2=true;
								break;
							}
							
						}
						if(!conoce2)mensaje+="Siendo mujer deberia tener al menos 2 conocimientos<br/>";
					}
					
					errores.innerHTML=mensaje;
					//Si todo es correcto submitar el formulario
					if(mensaje=='')resul=true;
					if(resul){
						formulario.submit();
					}
					else return resul;
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