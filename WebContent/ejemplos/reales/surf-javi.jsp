<!doctype html>

<html lang="es">

<head>

  <base href="<%=request.getContextPath()%>/">
  
  <meta charset="utf-8">

  <title>Pagina de Surf</title>
  
  <!-- ViewPort imprescindible para RWD -->	
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />

  <link rel="stylesheet" type="text/css" href="css/surf-javi.css?v=1.0">
</head>
 
<body>

	<div id="head">
		<img src="img/dado.png" alt="Logotipo"/>
	</div>  
				
	<div id="wrapper_menu" class="clearfix">
		<div id="menu">
			<nav> 
	 		<ul id="" class="menu clearfix">	
				<li>
					<h2>B&aacute;sicos</h2>
					<ul>
						<li><a href="ejemplos/basicos/parrafos.jsp">Parrafos y enlaces internos</a></li>
						<li><a href="#">Block e inline</a></li>
						<li><a href="#">Listas</a></li>
					</ul>
				</li>
				<li>
					<h2>Nuevos Elementos HTML5</h2>
					<ul>
						<li><a href="ejemplos/html5/figure.jsp">Figure</a></li>
						<li><a href="ejemplos/html5/hgroup.jsp">Hgroup</a></li>
						<li><a href="ejemplos/html5/hgroup.jsp">Time</a></li>
						<li><a href="ejemplos/html5/video.jsp">Video</a></li>
						<li><a href="ejemplos/html5/proges_y_meter.jsp">Progress y Meter</a></li>
						<li><a href="ejemplos/html5/datalist.jsp">DataList</a></li>
					</ul>
				</li>
				
				<li>
					<h2>CSS3</h2>
					<ul>
						<li>
							<h3>Selectores</h3>
							<ul>
								<li><a href="ejemplos/css/selectores/atributos.jsp">Atributos</a></li>
								<li><a href="ejemplos/css/selectores/hijos.jsp">Hijos</a></li>
								<li><a href="ejemplos/css/selectores/adyacentes.jsp">Adyacentes</a></li>
								<li><a href="ejemplos/css/selectores/p_clases.jsp">Pseudo-clases</a></li>
								<li><a href="ejemplos/css/selectores/p_elementos.jsp">Pseudo-elementos</a></li>
								<li><a href="ejemplos/css/selectores/css3.jsp">CSS3</a></li>
							</ul>
						</li>	
						<li>
							<h3>Poscionamiento</h3>
							<ul>
								<li><a href="ejemplos/css/posicionamiento/normal.jsp">Normal</a></li>
								<li><a href="ejemplos/css/posicionamiento/relativo.jsp">Relativo</a></li>
								<li><a href="ejemplos/css/posicionamiento/absoluto.jsp">Absoluto</a></li>
								<li><a href="ejemplos/css/posicionamiento/fijo.jsp">Fijo</a></li>
								<li><a href="ejemplos/css/posicionamiento/inherit.jsp">Inherit</a></li>					
								<li><a href="ejemplos/css/posicionamiento/float.jsp">Elementos Flotantes</a></li>
							</ul>
						</li>
						<li>
							<h3>Tecnicas Avanzadas</h3>
							<ul>
								<li><a href="ejemplos/css/avanzado/sprite.jsp">Sprite Pacman</a></li>
								<li><a href="ejemplos/css/avanzado/fontawesome.jsp">FontAwesome</a></li>					
							</ul>
						</li>	
					</ul>
				</li>
				
				
				<li>
					<h3>Reales</h3>
					<ul>
						<li><a href="ejemplos/reales/cartelera.jsp">Cartelera</a></li>
						<li><a href="ejemplos/reales/cartelera_detalle.jsp">Detalle Cartelera</a></li>
						<li><a href="ejemplos/reales/surf.jsp">Surf</a></li>
					</ul>
				</li> 
				<li> 
					<h3>Formularios</h3>
					<ul>
						<li><a href="ejemplos/formularios/login.jsp">Login</a></li>			
						<li><a href="ejemplos/formularios/datos_personales.jsp">Datos Personales</a></li>
					</ul>
				</li>  
				<li>
					<h2>JavaScript</h2>		
					<ul>
						<li>
							<h3>B&aacute;sicos</h3>
							<ul>
								<li><a href="ejemplos/javascript/introduccion.jsp">introduccion</a></li>
								<li><a href="ejemplos/javascript/location.jsp">location</a></li>
								<li><a href="ejemplos/javascript/objetos.jsp">Objetos JavaScript</a></li>
								<li><a href="ejemplos/javascript/screen.jsp">Objeto Screen de JavaScript</a></li>
								<li><a href="ejemplos/javascript/navigator.jsp">Objeto navigator de JavaScript</a></li>
								<li><a href="ejemplos/javascript/date.jsp">Objeto Date de JavaScript</a></li>
								<li><a href="ejemplos/javascript/string.jsp">Objeto String</a></li>
							</ul>
						</li>		
						<li>
							<a href="ejemplos/javascript/eventos.jsp">
								<h3>Eventos</h3>
							</a> 			
						</li>
						<li>
							<h3>Plugins</h3>
							<ul>
								<li><a href="ejemplos/plugins/datatable.jsp">dataTables</a></li>
								<li><a href="ejemplos/plugins/clipboard.jsp">ZeroClipboard</a></li>
							</ul>
						</li>
						<li>
							<h3>Test</h3>
							<ul>
								<li><a href="ejemplos/javascript/test.jsp">Qunit</a></li>
							</ul>
						</li>				
					</ul>
				</li>  
			  </ul>
			</nav>
		</div>
	</div>
	
	<div id="content">
		<div id="fila1" class="clearfix">
			<div id="caja1" class="caja1x1">Caja 1: 1x1</div>
			<div id="caja2" class="caja1x2">Caja 2: 2x1</div>
			<div id="caja3" class="caja1x1">Caja 3: 1x1</div>
		</div>
		<div id="fila2"  class="clearfix">
			<div id="caja4" class="caja2x1">Caja 4: 2x1</div>
			<div id="caja5" class="caja2x2 clearfix">
 			
				<div id="caja5_1" class="caja1x1">Caja 5_1:1x1</div>
				<div id="caja5_2" class="caja1x1">Caja 5_2:1x1</div>
				<div id="caja5_3" class="caja1x1">Caja 5_3:1x1</div>
				<div id="caja5_4" class="caja1x1">Caja 5_4:1x1</div>
	 		
			</div>
			<div id="caja6" class="caja2x1">Caja 6: 2x1</div>		
		</div>
		<div id="fila3" class="clearfix">
			<div id="caja7" class="caja1x1">Caja 7: 1x1</div>
			<div id="caja8" class="caja1x2">Caja 8: 2x1</div>
			<div id="caja9" class="caja1x1">Caja 9: 1x1</div>		
		</div>		
	</div>
	
	<div id="footer">FOOTER
	</div>
			
</body>
  
</html>













