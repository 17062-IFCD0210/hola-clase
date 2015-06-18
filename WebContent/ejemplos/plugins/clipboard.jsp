<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>Plugin clipboard</h2>
	<article>	
		<header>
			<h1>Copiar al portapapeles</h1>
		</header>
		<div class="cnt_article">
				<textarea id="txt" rows="20" cols="50"></textarea>
				<br><br>
				<input type="button" id="clear" value="Limpiar" >
				
				<script type="text/javascript">
				//Boton limpiar
				clear.onclick = function(event) {
					console.debug('Boton pulsado');
					txt.value = '';
				}
				</script>
				
				<button id="copy-button" data-clipboard-target="txt" title="Copiar al portapapeles">Copiar al portapapeles</button>
		</div>
		<footer>
			<a href="http://zeroclipboard.org/" title="Enlace a plugin ZeroClipboard">ZeroClipboard</a>
		</footer>
			
	</article>	
	
</section>	
			
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>
