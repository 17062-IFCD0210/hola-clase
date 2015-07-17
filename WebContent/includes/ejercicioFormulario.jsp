<jsp:include page="../plantillas/head.jsp"></jsp:include>
<jsp:include page="../plantillas/nav.jsp"></jsp:include>
  
<section>

	<h1>Ejercicio</h1>

	<article>	
				
		<div class="cnt_article">
	
		  <form action="ejercicioFormularioControlador" method="post" novalidate>
		  
				<label for="texto">Texto:</label><br>
				<input type="text" id="texto" name="texto" value="" 
				       placeholder="Escribe el texto"
				       title="Por favor escribe el texto"	
				       autofocus
				       tabindex="1">
				</p>
			
				<p>
				<label for="repeticiones">Repeticiones:</label><br>
				<input type="text" id="repeticiones" name="repeticiones" value="" 
				       placeholder="Escribe el número de epeticiones"
				       autofocus
				       tabindex="1">
				</p>
			
				<input type="submit" value="Guardar">
		  </form>
		</div>
 		<label for="salida">${requestScope.salida}</label><br>

			
		<footer></footer>
			
	</article>
	
</section>

<jsp:include page="../plantillas/foot.jsp"></jsp:include>