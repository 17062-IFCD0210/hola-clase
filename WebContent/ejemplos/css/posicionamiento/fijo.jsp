<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>Posicionamiento en CSS</h2>

	<article>	
		<header>
			<h1>Fijo</h1>
			<p>Importante especificar los atributos top, bottom,left y right si no no se ve.</p>
			<p>Se posiciona respecto al navegador y no al padre</p>
		</header>
		
		<style>				
				
			.cnt_article div{
				border:1px solid green;
				width: 100px;				
				height: 100px;				
				margin-bottom: 5px;			
			}				
			
			#capa1{				
				background-color: green;	
				position: fixed;	
				top: 0px;
				left: 100px;				
			}	
			
			#capa2{
				background-color: red;
				position: fixed;	
				bottom: 200px;
				left: 0px;					
			}	
			
			#capa3{
				background-color: blue;
				position: fixed;	
				bottom: 0px;
				left: 500px;				
			}
					
		</style>	
		
		<div class="cnt_article">			
			
			<div id="capa1">Capa1</div>
			<div id="capa2">Capa2</div>
			<div id="capa3">Capa3</div>
						
		</div>
			
			
			
	
			
		<footer>
			Capitulo 9; pagina 206
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>