<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>

	<article>
	
		<header>
			<h1>Datalist</h1>
		</header>
			
		<div class="cnt_article">
			<p>El soporte del elemento <mark>&lt;datalist&gt;</mark> no esta del todo soportado</p>			
			<input list="elementos">
			<datalist id="elementos">
				<%
				for(int i=0; i<200; i++){
					out.print("<option value='"+i+"'>MostrarValor"+i+"</option>");	
				} 
				%>
			</datalist>
		</div>
			
		<footer>
			<a href="http://caniuse.com/#feat=datalist" target="_blank">Soporte para navegadores - CAN I USE</a>
		</footer>
			
	</article>
	
	
	
	
	<article>
	
		<header>
			<h1>Solucion con Select-Options + Plugin</h1>
		</header>
			
		<div class="cnt_article">
			<p>Podemos simular el comportamiento de un <mark>&lt;datalist&gt;</mark> con un select options usando un plugin de jquery</p>
			
			<label for="textbox">Filtro:</label>
			<input type="text" id="textbox">
			<br>			
			<select id="select" size="10">
				<%
				for(int i=0; i<200; i++){
					out.print("<option value='"+i+"'>MostrarValor"+i+"</option>");	
				} 
				%>
			</select>			
		</div>
			
		<footer>
			<a href="http://www.lessanvaezi.com/filter-select-list-options/" target="_blank">Referencia: Filtro para select option </a>
		</footer>
			
			
	</article>
	
	
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>