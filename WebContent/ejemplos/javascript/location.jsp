<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>JavaScript</h2>

	<article>	
		<header>
			<h1>Location</h1>
		</header>
		<div class="cnt_article">
	 			<ul>
	 				<li><strong>host: </strong><span id="location_host"></span></li>
	 				<li><strong>hostname: </strong><span id="location_hostname"></span></li>
	 				<li><strong>puerto: </strong><span id="location_port"></span></li>
	 				<li><strong>protocolo: </strong><span id="location_protocol"></span></li>
	 				<li><strong>href: </strong><span id="location_href"></span></li>
	 				<li><strong>pathname: </strong><span id="location_pathname"></span></li>
	 			</ul>
	 			<script type="text/javascript">
	 			//location
		 		document.getElementById('location_host').innerHTML= location.host;
		 		document.getElementById('location_hostname').innerHTML= location.hostname;
		 		document.getElementById('location_port').innerHTML= location.port;
		 		document.getElementById('location_protocol').innerHTML= location.protocol;
		 		document.getElementById('location_href').innerHTML= location.href;
		 		document.getElementById('location_pathname').innerHTML= location.pathname;
	 			</script>
	 	</div>
			
		<footer>
			Capitulo 11; pagina 263
		</footer>
			
	</article>
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>