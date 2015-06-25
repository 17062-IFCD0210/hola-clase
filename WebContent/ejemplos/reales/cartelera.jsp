<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<div id="cartelera">
  
				
		<h1>Cartelera</h1>
		
		<div class="clearfix">
		
			<ul data-list="cartelera">
			
				<% for (int i=0; i<5;i++){ %>
					<li>				
						<div class="cartel">							
							<a data-role="modal" 
							   href="<%=request.getRequestURL()%>#openModal<%=i%>" 
							   title="Ver detalle pelicula">
							   							
								<img alt="Cartel de la pelicula X" src="http://www.cinesa.es/Manager/Peliculas/upsdndeestno/cartelera.jpg" />
								
								<div class="titulo">
									<h3>&quest;Donde esta Noe?</h3>							
								</div>
							</a>							
						</div>					
						<!-- ventana modal -->
						<div id="openModal<%=i%>" class="modalDialog">
							<div class="clearfix">
								<a href="<%=request.getRequestURL()%>#close" title="Close" class="close">X</a>
								
								<div class="sinopsisTexto">
									<h3>Titulo   : &quest;Donde esta Noe?</h3>
									<h3>Director : Director Pelicula</h3>
									<h3>Sinopsis : </h3>
									<p>sinopsis de la pelicula</p>
								</div>
								
								
								<img alt="Cartel de la pelicula X" src="http://www.cinesa.es/Manager/Peliculas/upsdndeestno/cartelera.jpg" />
								

							</div>
						</div>
						
					</li>		
				<%} %>	
				
			</ul>
		</div>	
		
		
</div> <!-- cartelera -->  
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>













