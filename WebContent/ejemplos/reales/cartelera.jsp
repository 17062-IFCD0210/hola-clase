<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<div id="cartelera">


	<h1>Cartelera</h1>

	<div class="clearfix">

		<ul data-list="cartelera">

			<%
				for (int i = 0; i < 5; i++) {
			%>
			<li>
				<div class="cartel ">
					<a data-role="modal"
						href="<%=request.getRequestURL()%>#openModal<%=i%>"
						title="Ver detalle pelicula">
						<img class="imgCartel"
						alt="Cartel de la pelicula X"
						src="http://www.cinesa.es/Manager/Peliculas/upsdndeestno/cartelera.jpg" />

						<div class="titulo">
							<h3>&quest;Donde esta Noe?</h3>
						</div>
					</a>
					<div id="openModal<%=i%>" class="modalDialog">
						<div id="carteleraModal">
							<a href="<%=request.getRequestURL()%>#close" title="Close"
								class="close">X</a>
							<h2>&iquest;Donde esta Noe?</h2>
							<div id="ficha">
								<p>
									<span class="destacado">Autor:</span> Periko el de los palotes
								</p>
								<p>
									<span class="destacado">Dirección:</span> Steven Spilberg
								</p>
								<p>
									<span class="destacado">Valoraci&oacute;n:</span> 5/10
								</p>
							</div>
							<img class="imgCartelModal" alt="Cartel de la pelicula X"
								src="http://www.cinesa.es/Manager/Peliculas/upsdndeestno/cartelera.jpg" />
							<div  class="clearfix"></div>
						</div>
					</div>
				</div>
			</li>
			<%
				}
			%>

		</ul>
	</div>


</div>
<!-- cartelera -->
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>













