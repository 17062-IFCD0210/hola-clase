<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>Posicionamiento en CSS</h2>

	<article>	
		<header>
			<h1>Relativo</h1>
			<p>Posicionamiento relativo a la posici&oacute;n orginal. Podemos jugar con la propiedad <mark>z-index</mark></mark> para el solapamiento de las capas</p>
		</header>
			
		<style>
			.cnt_article div{
				border:1px solid green;
				width: 100px;				
				height: 100px;				
				margin-bottom: 5px;
				position: relative;
			}				
			
			#capa1{
				left: 50px;
				top: 50px;
				background-color: green;
				z-index:1;
			}	
			
			#capa2{
				background-color: red;
				z-index:4;
			}	
			
			#capa3{
				background-color: blue;
				left: 50px;
				bottom: 50px;
				z-index:3;
			}
					
		</style>	
		
		<div class="cnt_article">			
			
			<div id="capa1">Capa1</div>
			<div id="capa2">Capa2</div>
			<div id="capa3">Capa3</div>
						
		</div>
			
		<footer>
			Capitulo 9; pagina 200
		</footer>
		
	</article>
	
	
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>