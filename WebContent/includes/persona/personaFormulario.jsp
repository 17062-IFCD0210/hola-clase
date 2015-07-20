<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<article>	
		<header>
			<h1>Crear Persona nueva</h1>
		</header>
			
		<div class="cnt_article">
				
			<form action="alumnoControlador" method="post" novalidate>
			
				<fieldset>	
					
					<label for="mensaje">
					<%
					String msg = (String)request.getAttribute("msg");	
					if (msg != null){
						out.print("<h2>"+ msg +"</h2>");
					}
					
					%>
					
					</label><br>
		
					<p>
						<label for="nombre">Nombre:</label><br>
						<input type="text" id="nombre" name="nombre" value=""
							   required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}"	 
						       placeholder="Escribe tu nombre"
						       title="Por favor escribe tu nombre"	
						       autofocus>
					</p>
				
					<p>
						<label for="apellido">Apellido:</label><br>
						<input type="text" id="apellido" name="apellido" value=""
							   required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}"	 
						       placeholder="Escribe tu apellido"
						       title="Por favor escribe tu apellido"	
						       autofocus>
					</p>
				
					<p>
						<label for="email">Email:</label><br>
						<input type="text" id="email" name="email" value=""
							   required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ]{2,256}"	 
						       placeholder="Escribe tu email"
						       title="Por favor escribe tu email"	
						       autofocus>
					</p>
				
					<p>
						<label for="edad">Edad:</label><br>
						<input type="text" id="edad" name="edad" value=""
						       placeholder="0-99"
						       required pattern="[0-9]{1,2}"	        
							   size="2" >
					</p>
				
					<p>
						<span>Aprobado:</span><br>
						<input type="radio" name="aprobado" id="personaAprobado" value="true" >
						<label for="personaAprobadoS">Aprobado</label>
						<br>
						<input type="radio" name="aprobado" id="personaAprobadoN" value="false" >
						<label for="personaAprobadoN" checked>Suspendido</label>
						<br>
					</p>
				
					<p>
						<label for="nota">Nota:</label><br>
						<input type="text" id="nota" name="nota" value=""
						       placeholder="0-10"
						       required pattern="[0-9]{1,2}"						        
							   size="2" >
					</p>
				
					<input type="submit" value="Guardar">
				</fieldset>			
			</form>	
		</div>
			
		<footer>
		
		</footer>			
	</article>	
</section>
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>