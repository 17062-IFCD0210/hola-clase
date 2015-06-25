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
	
	<article>
		<header>
			<h1>Codigo</h1>
		</header>
		<div class="tabs">	
			<ul class="tabs">
		      <li><a href="#tab1">HTML</a></li>
		      <li><a href="#tab2">CSS</a></li>
		      <li><a href="#tab3">JS</a></li>
	    	</ul>
  			<div class="clr"></div>
			    <section class="block">
			      <article id="tab1">
			      	<p>PESTAÑA PARA HTML</p>
			      	<pre><code class="html">
			      		<span class="hljs-tag">div id="capa1"</span>
				      	<div id="capa1">Capa1</div>
						<div id="capa2">Capa2</div>
						<div id="capa3">Capa3</div>
			      	</code></pre>
			      
			      </article>
			      <article id="tab2">
			        <p>PESTAÑA PARA CSS</p>
			      </article>
			      <article id="tab3">
			        <p>PESTAÑA PARA JS</p>
			      </article>
			    </section>	    	
		</div>
	</article>
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>