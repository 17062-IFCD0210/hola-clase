<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>JavaScript</h2>

	<article>	
		<header>
			<h1>Objeto String</h1>
		</header>
		<div class="cnt_article">
			
			<script type="text/javascript">
			
			var cadena ="Ejemplos de uso de los metodos del ojeto String"
			document.write("Cadena de texto: " + cadena +"<br><br>");
			document.write("Longitud de la cadena de texto: " + cadena.length +"<br><br>");
			
			var pos = cadena.indexOf("uso");
			document.write("Posicion de la palabra 'uso': " + pos +"<br><br>");
			
			var last=cadena.lastIndexOf('String');
			document.write("Posicion del indice de la ultima palabra 'String': " + last +"<br><br>");
			
			var subcadena=cadena.substring(pos,15);
			document.write("Subcadena 'uso': " + subcadena +"<br><br>");
			
			var charat=cadena.charAt(2);
			document.write("Retorna el caracter situado en la posicion indicada '(2)': " + charat +"<br><br>");
			
			var res=cadena.split(' ');				
			document.write("<h3>String troceado con split(' ')<h3><ol>");
				for (i=0 ; i<res.length; i++ ){
					document.write("<li>"+res[i]+"</li>");
				}
			document.write("</ol>");
			</script>
			
	 	</div>
			
		<footer>
			Capitulo 13; pagina 319
		</footer>
			
	</article>
	
	
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>