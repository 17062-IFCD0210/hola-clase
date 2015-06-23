<jsp:include page="plantillas/head.jsp"></jsp:include>
<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="home" class="clearfix">
	 
	 <!-- Contenido principal de la pagina -->
	 <section> 

	   <h2>El afortunado en leer es:</h2>
	   <label for="btn_ganador" class="numero" id="afortunado" >0</label>
	  
	   <img alt="dado de seis caras blanco" 
			 title="Dado blanco" 
			 id="dado" 
			 src="img/dado.png" /> 
	  
	   <input type="button" class="btn"
			  value="Obtener nuevo afortunad@" 
			  id="btn_ganador" name="btn_ganador" 
			  onclick="obtener_ganador();"/>
	   
		<table border="1" class="tabla_azul">
			<tr>
				<td colspan="4">Ander</td>
			</tr>
			<tr>
				<td>Javier</td>
				<td>Cristina</td>
				<td>Jorge</td>
				<td>Mihai</td>
			</tr>
			<tr>
				<td>Ieltzu</td>
				<td>Aritz</td>
				<td>Ander</td>
				<td>Javi</td>
			</tr>
			<tr>
				<td>Jon</td>
				<td>Ra&uacute;l</td>
				<td>Jaione</td>
				<td>David</td>
			</tr>
			<tr>
				<td>Lara</td>
				<td>&nbsp;</td>
				<td>Unai</td>
				<td>MiKel</td>
			</tr>
		</table>
		
	</section>   
	
	
	<!--  SideBar con contenido no-pricipal de la pagina -->   
	<aside>
	
		<h3>Enlaces de interes</h3>
		<ul>			
			<li><a href="http://www.formacion.ipartek.com/campus/" target="_blank">Campus Ipartek</a></li>
			<li><a href="http://caniuse.com/" target="_blank">Can I use</a></li>
			<li><a href="https://github.com/" target="_blank">GitHub</a></li>
			<li><a href="http://librosweb.es/libro/pro_git/" target="_blank">Pro Git, el libro oficial de Git</a></li>
			<li><a href="http://librosweb.es/libro/css/" target="_blank">CSS B&aacute;sico</a></li>
			<li><a href="http://librosweb.es/libro/css_avanzado/" target="_blank">CSS Avzanzado</a></li>
		</ul>
	
	</aside>   
	   
<script type="text/javascript" src="js/index.js"></script>
<script>
	//llamada a  la funcion init() de index.js
	init();
</script>



	 
</div> <!-- home -->
<jsp:include page="plantillas/foot.jsp"></jsp:include>











