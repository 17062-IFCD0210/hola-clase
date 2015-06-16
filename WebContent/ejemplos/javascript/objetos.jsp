<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>JavaScript</h2>

	<article>	
		<header>
			<h1>Objetos básicos de JavaScript</h1>
		</header>
			
		<div class="cnt_article">
			
			
			<h2>Window</h2>
			<ul>
				<li><strong>location:</strong><span id="w_location"></span></li>
				
				<li>
					<strong>name:</strong><span id="w_name"></span>
					<p><code>document.title</code> para el nombre de la pestaña</p>
				</li>
				<li>
					<span>window.open </span><input type="button" id="w_open" value="window.open(url, nombre, opciones)">
					<span>* Chrome no funciona <code>resizable=no</code> por lo cual hemos metido javascript en la nueva_ventana.jsp</span>
				</li>
				
				<li>
						<input type="button" id="w_alert" value="window.alert()"></input>
					</li>
					<li>
						<input type="button" id="w_confirm" value="window.confirm()"></input>
					</li>
					<li>
						<input type="button" id="w_prompt" value="window.prompt()"></input>
					</li>				
				
			</ul>
			
			<script type="text/javascript">
			/*Window*/
				var span_location = document.getElementById('w_location');
				span_location.innerHTML = window.location;					
				document.getElementById('w_name').innerHTML = window.name;	
				
				//obtener boton
				
				var btn_w_open = document.getElementById("w_open");
					btn_w_open.onclick =  function()
					{
						console.info('Hemos hecho click');
						window.open("ejemplos/javascript/nueva_ventana.jsp","nueva_ventana","heigth=500px, width=500px, menubar=no, toolbar=no, resizable=no");
					};        
				
				var btn_w_alert = document.getElementById("w_alert");
				btn_w_alert.onclick =  function()
				{
					window.alert('Se muestra un mensaje');
				};  
				
				var btn_w_confirm = document.getElementById("w_confirm");
				btn_w_confirm.onclick =  function()
				{
					if (window.confirm('Selecciona una opcion')== true)
					{
						window.alert('Le has dado a aceptar');
					}
					else
					{
						window.alert('Le has dado a cancelar');
					}
				};  
				
				var btn_w_prompt = document.getElementById("w_prompt");
				btn_w_prompt.onclick =  function()
				{
					var respuesta = window.prompt('Escribe algo: ','');
					
					if (respuesta!=undefined)
					{
						if (respuesta=="")
						{
							window.alert('No has escrito nada.');
						}
						else
						{
							window.alert('Has escrito: '+respuesta);
						}
					}
					else
					{
						window.alert('No has querido escribir nada.');
					}
				};  
				
			</script>
			
			<h2>Document</h2>
			<ul>
						<li>
							<span><strong>bgColor</strong></span>
							<input type="button" id="d_bgcolor" value="bgColor"></input>
						</li>
						
						<li>
							<span><strong>images</strong></span>
							<input type="button" id="d_images" value="images"></input>
						</li>
						
						<li>
							<span><strong>links</strong></span>
							<input type="button" id="d_links" value="links"></input>
						</li>
						
					</ul>
			
			<style>
				body { background-image: none !important;}
			</style>	
				
			<script>
				//propiedad bgcolor
				var btn_d_bgcolor = document.getElementById ('d_bgcolor');
				btn_d_bgcolor.onclick = function() {
						document.bgColor="red";
				};
				
				//imagenes
				var btn_d_images = document.getElementById ('d_images');
				btn_d_images.onclick = function() {

						//recojer todas las imagnes en una variable
						var aImagenes = document.images;
						//preparar un mensaje para el alert
						var mensaje = "Este documento tiene " + aImagenes.length + " imagenes \n";
						
						//recorrer el array de imagenes
						for ( i=0; i < aImagenes.length; i++){
							
							//anadir al mensaje el 'src' de cada imagen
							mensaje += aImagenes[i].src + "\n";
							
							//si hay mas de 5 salir del bucle
							if (i==5)break;
						}
						
						//mostrar mensaje
						alert(mensaje);
						
						
					
				};
				

				//Links
				var btn_d_links = document.getElementById ('d_links');
				btn_d_links.onclick = function() {

						//recojer todas las imagnes en una variable
						var aLinks = document.links;
						//preparar un mensaje para el alert
						var mensaje = "Este documento tiene " + aLinks.length + " enlaces \n";
						
						//recorrer el array de imagenes
						for ( i=0; i < aLinks.length; i++){							
							//si hay mas de 5 salir del bucle
							if (i==5)break;							
							//anadir al mensaje el 'src' de cada imagen
							mensaje += "["+i+"] - " + aLinks[i] + "\n";							
						}						
						//mostrar mensaje
						alert(mensaje);						
				};
				
				
			</script>
			
			<h2>screen</h2>
			<ul>
				<li>
					<strong>availHeight:</strong>
					<span id="s_availHeight"></span>
				</li>

				<li>
					<strong>availWidth:</strong>
					<span id="s_availWidth"></span>
				</li>
				<li>
					<strong>width:</strong>
					<span id="s_width"></span>
				</li>
				<li>
					<strong>height:</strong>
					<span id="s_height"></span>
				</li>
				<li>
					<strong>colorDepth:</strong>
					<span id="s_colorDepth"></span>
				</li>
			</ul>
			<script>
			//Objeto screen
			
			//obtener id del elemento availHeight
			console.info("Probar el funcionamiento del metodo location.availHeight");
			document.getElementById("s_availHeight").innerHTML = screen.availHeight;

			//obtener id del elemento availWidth
			console.info("Probar el funcionamiento del metodo location.availWidth");
			document.getElementById("s_availWidth").innerHTML = screen.availWidth;

			//obtener id del elemento Height
			console.info("Probar el funcionamiento del metodo location.Height");
			document.getElementById("s_height").innerHTML = screen.height;
			
			//obtener id del elemento Width
			console.info("Probar el funcionamiento del metodo location.Width");
			document.getElementById("s_width").innerHTML = screen.width;

			//obtener id del elemento colorDepth
			console.info("Probar el funcionamiento del metodo location.colorDepth");
			document.getElementById("s_colorDepth").innerHTML = screen.colorDepth;
			</script>
			
		</div>
			
		<footer>
			Capitulo 13; pagina 306
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>