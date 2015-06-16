<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>Posicionamiento en CSS</h2>

	<article>	
		<header>
			<h1>Absoluto</h1>
			<p>Al posicionar un elemento de forma Absoluta sale del flujo de la pagina, se posiciona respecto al primer padre que encuentre posicionado de forma NO estatica, si no encuentra a nadie se posiona respecto al navegador</p>
		</header>
			
			<style>
			
			/* contenedor posicionado de forma relativa para que 
			   la div#capa2 puede posicionarse 
			   de forma absoluta respecto a este elemento.
			   Si quitamos el posicionamiento el div#capa2 se posiciona respecto
			   al navegador y nos queda arriba del todo
			*/
			.cnt_article{
				position: relative;
			}	
			
			.cnt_article div{
				border:1px solid green;
				width: 100px;				
				height: 100px;				
				margin-bottom: 5px;		
				
			}				
			
			#capa1{				
				background-color: green;				
			}	
			
			#capa2{
				background-color: red;		
				position: absolute;
				top:50px;
				left:50px;		
			}	
			
			#capa3{
				background-color: blue;					
			}
					
		</style>	
		
		<div class="cnt_article">			
			
			<div id="capa1">Capa1</div>
			<div id="capa2">Capa2</div>
			<div id="capa3">Capa3</div>
						
		</div>
			
		<footer>
			Capitulo 9; pagina 203
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>