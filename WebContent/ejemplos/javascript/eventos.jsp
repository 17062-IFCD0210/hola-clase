<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
 
<section>
	<h2>JavaScript</h2>

	<article>	
		<header>
			<h1>Onclick en etiqueta i</h1>
		</header>

		<div class="cnt_article">
			<i class= "fa fa-align-justify fa-4x" onclick="alert('Pulsado icono')"></i>
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
			<i class= "fa fa-align-justify fa-4x" id="btn_menu"></i>
			<script type="text/javascript">
				var btn_menu = document.getElementById("btn_menu");
				btn_menu.onclick=function(){
					alert('Boton pulsado, evento relacionado con javascript');
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
			<i class= "fa fa-align-justify fa-4x"></i>
			<i class= "fa fa-align-justify fa-4x"></i>
			<i class= "fa fa-align-justify fa-4x"></i>
			<i class= "fa fa-align-justify fa-4x"></i>
			<script>
				var saluda = function saluda(){
					alert("Boton pulsado!")
				}
			
				var listaBotones = document.getElementsByTagName("i");
				for (i=0; i < listaBotones.length; i++){
					listaBotones[i].addEventListener("click", saluda);	
				}
				
			</script>			
	 	</div>
			
		<footer>
			Capitulo 14; pagina 328
		</footer>
			
	</article>
	<article>	
		<header>
			<h1>Mostrar eventos</h1>
		</header>

		<div class="cnt_article">
			<div class = "clearfix cnt_cols">
			<div class = "col1">
				<textarea id="txt" rows="20" cols="50"></textarea>
				<input type="button" id="clear" value="Limpiar">
				<input type="button" id="copy" value="Copiar al portapapeles">
			</div>
			<div class = "col2">
				<input type="button" id="boton" value="Pulsame">
				<select id="select">
					<option value="bio">Bilbao</option>
					<option value="bar">Barakaldo</option>
				</select>
				<input type="text" id="txt_box">
				
				<br><br>
				
				<span>Sexo:</span><br>
				<input type="radio" name="sexo" id="rSexoH" value="h" >
				<label for="rSexoH">Hombre</label>
				<br>
				<input type="radio" name="sexo" id="rSexoM" value="m" >
				<label for="rSexoM">Mujer</label>
				<br>
				<input type="radio" name="sexo" id="RSexoI" value="i">
				<label for="RSexoI">Indefinido</label>
				
				<br><br>
				
				<fieldset>
				<legend>Conocimientos</legend>
				<input type="checkbox" name="conocimientos" id="con1" value="0">
				<label for="con1">HTML</label>
				<br>
				<input type="checkbox" name="conocimientos" id="con2" value="1">
				<label for="con2">JavaScript</label>
				<br>
				<input type="checkbox" name="conocimientos" id="con3" value="2">
				<label for="con3">CSS3</label>
				</fieldset>
				
			</div>
			</div>
	 	</div>
	 	
		<script type="text/javascript">
		
			//buscar objetos por su id
			
			var txt = document.getElementById("txt");
			var boton = document.getElementById("boton");
			var select = document.getElementById("select");
			var clear = document.getElementById("clear");
			var txt_box = document.getElementById("txt_box");
			var radio = document.getElementsByName("sexo");
			var check = document.getElementsByName("conocimientos");
			var copy = document.getElementById("copy");
			//registrar eventos
			
			boton.onclick=function(event){
				txt.value += 'Boton pulsado('+event.x+','+event.y+')\n';
			}
			
			select.onchange = function(event){
				txt.value += 'Opcion cambiada: '+select.options[select.selectedIndex].text+"("+select.value+")\n";
			}
			
			clear.onclick = function(event){
				txt.value = "";
			}
			
			txt_box.onblur = function(event){
				txt.value += "Text_box: "+txt_box.value+"\n";
			}
			
			for (i=0; i<radio.length; i++){
				radio[i].onchange = function (event){
				txt.value += "Sexo cambiado a: "+this.nextElementSibling.innerHTML+" ("+this.value+")\n";
				}
			}
			
			for (i=0; i<check.length; i++){
				check[i].onchange = function (event){
					var checkeado = false;
					if (this.checked){
						checkeado = true;
					}
				txt.value += "Conocimiento: "+this.nextElementSibling.innerHTML+" ("+this.value+") " 
				+ checkeado +"\n";
				}
			}			
			
			copy.onclick=function(event){
				window.clipboardData.setData('Text',str);
			}

		</script>
		<footer>
			Sin referencia
		</footer>
			
	</article>	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>