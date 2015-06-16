<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<div id="cartelera">
  
				
		<h1>Cartelera</h1>
		
		<div class="clearfix">
		
			<ul data-list="cartelera">
			
				<% for (int i=0; i<5;i++){ %>
					<li>				
						<div class="cartel">							
							<a href="cartelera_detalle.html" title="Ver detalle pelicula">							
								<img alt="Cartel de la pelicula X" src="http://www.cinesa.es/Manager/Peliculas/upsdndeestno/cartelera.jpg" />
								
								<div class="titulo">
									<h3>&quest;Donde esta Noe?</h3>							
								</div>
							</a>							
						</div>
					</li>		
				<%} %>	
				
			</ul>
		</div>	
		
		
</div> <!-- cartelera -->  
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>













