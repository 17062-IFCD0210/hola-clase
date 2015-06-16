<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>Selectores de CSS</h2>

	<article>	
		<header>
			<h1>Selector de Hijos</h1>
		</header>
			
		<div class="cnt_article">
			
			<style>
				
				div a   { color: blue; }
				
				div > a { color: red; }
				
			</style>
			
			<div>
				<h3><a href="#">Enlace-1</a></h3>
				<a href="#">Enlace-2</a>
			</div>
			
			<p>* Cuidado porque el orden de las reglas importa, 
			     si las ponemos al reves se vera todo azul</p>
			
		</div>
			
		<footer>
			Capitulo 8; pagina 186
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>