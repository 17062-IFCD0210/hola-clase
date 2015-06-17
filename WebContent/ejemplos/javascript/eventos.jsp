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
						<input type="radio" name="sexo" value="H" id="hom">
						<label for="hom">Hombre</label>
						<input type="radio" name="sexo" value="M" id="muj" checked>
						<label for="muj">Mujer</label>
						<input type="radio" name="sexo" value="I" id="ind">
						<label for="muj">Indeterminado</label><br>
					</fieldset>
					<fieldset>
						<legend>Conocimientos</legend>
						<input type="checkbox" name="con" value="0" id="html" checked>
						<label for="html">HTML</label><br>
						<input type="checkbox" name="con" value="1" id="js" checked>
						<label for="js">JS</label><br>
						<input type="checkbox" name="con" value="2" id="css3">
						<label for="css3">CSS3</label>
					</fieldset>
					
				</div>
			</div>
			
			<script type="text/javascript">
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
						txt.value += 'Has cambiado a (' + this.value + ') ' + this.nextElementSibling.innerHTML + '\n';
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