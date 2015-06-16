<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<script src="js/utilidades.js"></script>

<section id="javaScript" class="clearFix">

	<h2>JavaScript</h2>
	<article>
		<header>
			<h2>Objetos basicos de JavaScriptt</h2>
			<p></p>
		</header>
		
		
		<div class="cnt_article">
		

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
			
			<script type="text/javascript">
			
				
				
				//Objeto screen
				
				//obtener id del elemento availHeight
				console.info("Probar el funcionamiento de la propiedad screen.availHeight");
				document.getElementById("s_availHeight").innerHTML = screen.availHeight;

				//obtener id del elemento availWidth
				console.info("Probar el funcionamiento de la propiedad screen.availWidth");
				document.getElementById("s_availWidth").innerHTML = screen.availWidth;

				//obtener id del elemento Height
				console.info("Probar el funcionamiento de la propiedad screen.Height");
				document.getElementById("s_height").innerHTML = screen.height;
				
				//obtener id del elemento Width
				console.info("Probar el funcionamiento de la propiedad screen.Width");
				document.getElementById("s_width").innerHTML = screen.width;

				//obtener id del elemento colorDepth
				console.info("Probar el funcionamiento de la propiedad screen.colorDepth");
				document.getElementById("s_colorDepth").innerHTML = screen.colorDepth;

			</script>

		</div>		
		
		<footer>
			<a target=" _black" href="http://fortawesome.github.io/Font-Awesome/">JavaScript</a>
		</footer>
	
	</article>

</section>
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>