<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>JavaScript</h2>

	<article>	
		<header>
			<h1>String</h1>
		</header>
		<div class="cnt_article">
	 			<ul>
	 				<li><strong>indexOf: </strong><span id="sindex"></span></li>
	 				<li><strong>lastIndexOf: </strong><span id="slast"></span></li>
	 				<li><strong>substring: </strong><span id="ssubs"></span></li>
	 				<li><strong>charAt: </strong><span id="schar"></span></li>
	 				<li><strong>split: </strong><span id="ssplit"></span></li>
	 			</ul>
	 			<script type="text/javascript">
	 			//location
	 			var str = "Hello World!";
		 		document.getElementById('sindex').innerHTML= str.indexOf("Hello");
		 		document.getElementById('slast').innerHTML= str.lastIndexOf("Hello");
		 		document.getElementById('ssubs').innerHTML= str.substring(1,9);
		 		document.getElementById('schar').innerHTML= str.charAt(2);
		 		document.getElementById('ssplit').innerHTML= str.split(" ");
	 			</script>
	 	</div>
			
		<footer>
			Capitulo 13; pagina 318
		</footer>
			
	</article>
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>