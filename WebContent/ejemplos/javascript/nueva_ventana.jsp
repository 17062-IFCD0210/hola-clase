	<jsp:include page="../../plantillas/head.jsp"></jsp:include>
	<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

	<script type="text/javascript">
		window.onresize = function() 
		{
		    window.resizeTo(500,500);
		}
		window.onclick = function() 
		{
		    window.resizeTo(500,500);
		}
	</script>


	<!-- Contenido principal de la pagina  -->
	<section>
	
		<h2>javascript</h2>

		<article>
			<header>
				<h1>Nueva ventana</h1>
			</header>
			
			<div class="cnt_article">
				<h2>Nueva ventana</h2>
				<ul>
					<li>
						<input type="button" id="w_cerrar" value="window.close()"></input>

					</li>
				</ul>
				<script type="text/javascript">
				
					///Obtener boton
					var btn_w_open = document.getElementById("w_cerrar");
					btn_w_open.onclick =  function()
					{
						window.close();
					};
					
				</script>
			</div>
		</article>
	</section>
	
	<footer>
		Capitulo 13 pagina 306
	</footer>