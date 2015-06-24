<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<div id="cartelera">
  
				
		<h1>Cartelera</h1>
		
		<div class="clearfix">
		
			<ul data-list="cartelera">
			
				<% for (int i=0; i<5;i++){ %>
					<li>				
						<div class="cartel">							
							<a data-role="modal" href="<%=request.getRequestURL()%>#openModal<%=i%>" title="Ver detalle pelicula">							
								<img alt="Cartel de la pelicula X" src="http://www.cinesa.es/Manager/Peliculas/upsdndeestno/cartelera.jpg" />
								
								<div class="titulo">
									<h3>&quest;Donde esta Noe?</h3>							
								</div>
							</a>							
						</div>
						
						<!--  ventana modal  -->
						<div id="openModal<%=i%>" class="modalDialog">
							<div id="ventana_modal">
								<a href="<%=request.getRequestURL()%>#close" title="Cerrar" class="close">X</a>
								<h2 id="titulo_modal">Cronicas de Narnia</h2>
								<img id="caratula_modal" alt="Cartel pelicula 'Cronicas de Narnia'" src="img/cronicas_narnia.jpg"/>
								<div id="ficha_modal">
									<p><span class="encabezado_modal">Titulo:</span></p>
									<p>Periko el de los palotes</p>
									<p><span class="encabezado_modal">Autor:</span></p>
									<p>Steven Spilberg</p>
									<p><span class="encabezado_modal">Duracion:</span></p>
									<p>120'</p>
								</div>	
							</div>
						</div>
					</li>		
				<%} %>	
				
			</ul>
		</div>	
		
		
</div> <!-- cartelera -->  
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>













