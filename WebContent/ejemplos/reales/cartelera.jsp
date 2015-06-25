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
							<div class="modal_contenedor clearfix"> <!-- Si no tiene el clearfix el contenedor no cogía el contenido -->
								
								<a href="<%=request.getRequestURL()%>#close" title="Close" class="close">X</a>
								
								<div class="desc_cartel">
									<h2>Titulo: eeeeeeee <%=1 %></h2>
									<h2>Descripci&oacute;n: descripci&oacuten <%=1 %> lksjdlfkjhasdk fgkajshd gfjkhga skjdhfgjhasdgf</h2>
									<h2>Autor: uuuuuuuuu <%=1 %></h2>
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













