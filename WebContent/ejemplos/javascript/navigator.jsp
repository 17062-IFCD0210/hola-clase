<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>JavaScript</h2>

	<article>	
		<header>
			<h1>Objetos b&aacute;sicos de JavaScript</h1>
		</header>
			
		<div class="cnt_article">
			<h3>Navigator</h3>
			<p>Capitulo 13; pagina 313</p>	
			<ul>
				<li>
					<strong>language:</strong>
					<span id="n_language"></span>
				</li>
				<li>
					<strong>userAgent:</strong>
					<span id="n_userAgent"></span>
				</li>
				<li>
					<strong>cookieEnabled:</strong>
					<span id="n_cookieEnabled"></span>
				</li>
			</ul>
			<script>
				/****************************
						   NAVIGATOR
				****************************/
				//Propiedad n_language
				document.getElementById('n_language').innerHTML = navigator.language;
				//Propiedad userAgent
				document.getElementById('n_userAgent').innerHTML = navigator.userAgent;
				//Propiedad cookieEnabled
				document.getElementById('n_cookieEnabled').innerHTML = navigator.cookieEnabled;
			</script>
			
		</div>
			
		<footer>
			Capitulo 13; pagina 306
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>