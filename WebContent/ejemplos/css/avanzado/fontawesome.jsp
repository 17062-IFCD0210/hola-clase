<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>
  
<section id="fontawesome">

	<h2>CSS Tecnicas Avanzadas</h2>
	
	<article>	
		<header>
			<h1>FontAwesome</h1>

		</header>
			
			<style>
			
				.fa-c-green { color:green;}
				.fa-c-red { color:red;}
				.fa-bc-green { background-color:green;}  
			
			</style>
			
		<div class="cnt_article">			
			
			<h2>Iconos de diferentes tama&ntilde;os</h2>
			
				<i class="fa fa-venus-mars fa-c-green"></i>
				<i class="fa fa-venus-mars fa-2x"></i>
				<i class="fa fa-venus-mars fa-3x"></i>
				<i class="fa fa-venus-mars fa-4x"></i>
				<i class="fa fa-venus-mars fa-5x fa-bc-green"></i>
			
			<h2>Iconos Combinados</h2>
			
				<span class="fa-stack fa-lg">
				  <i class="fa fa-square-o fa-stack-2x"></i>
				  <i class="fa fa-twitter fa-stack-1x"></i>
				</span>
				
				<span class="fa-stack fa-lg">
				  <i class="fa fa-circle fa-stack-2x"></i>
				  <i class="fa fa-flag fa-stack-1x fa-inverse"></i>
				</span>
				
				
				<span class="fa-stack fa-lg">
				  <i class="fa fa-camera fa-stack-1x"></i>
				  <i class="fa fa-ban fa-stack-2x fa-c-red"></i>
				</span>
			
			<h2>Iconos Rotados</h2>
			
				<i class="fa fa-venus-mars fa-3x fa-spin"></i>
				<i class="fa fa-venus-mars fa-3x fa-rotate-90"></i>
				<i class="fa fa-venus-mars fa-3x fa-rotate-270"></i>
				<i class="fa fa-venus-mars fa-3x fa-pulse"></i>
				<i class="fa fa-venus-mars fa-3x fa-flip-vertical fa-c-green"></i>
						
		</div>
			
		<footer>
			<a target="_blank" href="http://fortawesome.github.io/Font-Awesome/">font awesome</a>
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>