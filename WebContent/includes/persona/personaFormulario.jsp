<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>

	<h1>Crear persona nueva</h1>

	<article>	
		<header>
			<h1>Alta nueva Persona</h1>
		</header>
			
		<div class="cnt_article">
	
		  <form action="personaControlador" method="post" novalidate>
		  
			<fieldset>
				<% 
					String msg = (String)request.getAttribute("msg"); 
					if (msg == null ){ msg="";}
				%>
				<label for="mensaje"><%=msg%></label><br>

<!--  otra forma mas abreviada de hacerlo
				<label for="mensaje">${requestScope.msg}</label><br>
 -->	
				<p>
				<label for="nombre">Nombre:</label><br>
				<input type="text" id="nombre" name="nombre" value="" 
				       placeholder="Escribe tu nombre"
				       title="Por favor escribe tu nombre"	
				       autofocus
				       tabindex="1">
				</p>
			
				<p>
				<label for="apellido">Apellido:</label><br>
				<input type="text" id="apellido" name="apellido" value="" 
				       placeholder="Escribe tu apellido"
				       title="Por favor escribe tu apellido"	
				       autofocus
				       tabindex="1">
				</p>
			
			<p>
				<label for="email">Email:</label><br>
				<input type="text" id="email" name="email" value=""
				       placeholder="Escribe tu email"
				       title="Por favor escribe tu email"	
				       autofocus
				       tabindex="1">
				</p>
			
			<p>
				<label for="edad">Edad:</label><br>
				<input type="text" id="edad" name="edad" value=""
				       placeholder="0-99"
				       tabindex="2"					        
					   size="2" >
			</p>
			
			<p>
				<span>Aprobado:</span><br>
				<input type="radio" name="aprobado" id="personaAprobado" value="si" tabindex="2">
				<label for="personaAprobadoS">Aprobado</label>
				<br>
				<input type="radio" name="aprobado" id="personaAprobadoN" value="no" tabindex="2">
				<label for="personaAprobadoN" checked="checked">Suspendido</label>
				<br>
			</p>
			
				<p>
				<label for="nota">Nota:</label><br>
				<input type="text" id="nota" name="nota" value=""
				       placeholder="0-10"
				       required pattern="[0-9]{1,2}"	
				       tabindex="2"					        
					   size="2" >
			</p>
			
			<input type="submit" value="Guardar">
			
			</fieldset>
		  </form>
		</div>
			
		<footer></footer>
			
	</article>
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>