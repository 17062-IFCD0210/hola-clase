<jsp:include page="../../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../../plantillas/nav.jsp"></jsp:include>
  
<section>

	<h2>CSS Tecnicas Avanzadas</h2>
	
	<article>	
		<header>
			<h1>Sprite</h1>
			<p>Una imagen en Sprite es un conjunto de imagenes agrupadas en una sola imagen</p>
		</header>
			
			<style>
				#sprite	li { 
						  border: 1px solid #000;
						  padding: 15px 40px;
						  background: url('img/sprite.png') no-repeat 0 0;
						  list-style: none;						
					}
			
				#sprite .pacman {
					 background-position: 0 -50px;
				}
			
				#sprite .fantasma {
					 background-position: 0 -100px;
				}
			
			</style>
			
			
		
		
		<div class="cnt_article">			
			
			<ul id="sprite">
				<li class="pacman">Pacman</li>
				<li class="fantasma">Fantasma</li>
				<li class="robot">Robot</li>
			</ul>
			
						
		</div>
			
		<footer>
			Campus: <a href="http://www.formacion.ipartek.com/campus/mod/resource/view.php?id=2792">Sprites</a>
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../../plantillas/foot.jsp"></jsp:include>