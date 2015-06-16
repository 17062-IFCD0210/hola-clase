<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>Posicionamiento en CSS</h2>

	<article>	
		<header>
			<h1>Elementos Flotantes</h1>			
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
				float:left;							
			}	
			
			#capa2{
				background-color: red;		
				float:left;					
			}	
			
			#capa3{
				background-color: blue;
				float:left;		
				clear: left;						
			}
					
		</style>	
		
		<div class="cnt_article">			
			
			<div id="capa1">Capa1</div>
			<div id="capa2">Capa2</div>
			<div id="capa3">Capa3</div>
			
			<p style="clear: both; border:1px dotted grey">Parrafo invisible para hacer CLEAR BOTH</p>
						
		</div>
			
			
			
	
			
		<footer>
			Capitulo 9; pagina 207
			<a href="http://librosweb.es/libro/css_avanzado/capitulo_1/limpiar_floats.html" target="_blank">Css Avanzado: Limpiar floats</a>
			<a href="http://es.learnlayout.com/clearfix.html">ClearFix auto</a>
			<a href="http://jps.com.ve/flotando-elementos-en-css-y-la-magia-de-clearfix/">ClearFix con CSS</a>
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>