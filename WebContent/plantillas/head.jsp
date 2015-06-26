<!doctype html>

<html lang="es">

<head>

  <base href="<%=request.getContextPath()%>/">
  
  <meta charset="utf-8">

  <title>TODO: A que kambiarloooooooooo</title>
  <meta name="description" content="Mio primera pagina en HTML5, espero que no sea la ultima">
  <meta name="author" content="Ander Uraga Real">

  <!-- ViewPort imprescindible para RWD -->	
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />

  <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
  <link rel="icon" href="favicon.ico" type="image/x-icon">
  
  <link rel="stylesheet" type="text/css" href="css/styles.css?v=1.0">

  <!-- Jquery UI  -->		
  <link rel="stylesheet" type="text/css" href="js/jquery-ui-1.11.4.custom/jquery-ui.min.css">

  <!-- Font Awesome  -->		
  <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.3.0/css/font-awesome.css">
  
  <!-- Custom IconMoon  -->
  <link rel="stylesheet" type="text/css" href="fonts/iconmoon/style.css">

  <!-- http://tympanus.net/codrops/2013/04/19/responsive-multi-level-menu/ -->
<!--   <link rel="stylesheet" href="js/ResponsiveMultiLevelMenu/css/default.css"> -->
  <link rel="stylesheet" href="js/ResponsiveMultiLevelMenu/css/component.css">
  <script src="js/ResponsiveMultiLevelMenu/js/modernizr.custom.js" ></script>

  <!-- highlight code -->
  <link rel="stylesheet" href="js/highlight/styles/railscasts.css">
  	

  <!--[if lt IE 9]>
  	  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	  <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
  <![endif]-->
  
</head>

<body>

<div id="container">

<noscript> 
  <h1>JAVASCRIPT no habilitado</h1>
   <!-- anchor linking to external file -->
  <a href="#">¿Como solucionarlo?</a>
</noscript>


<header id="head">	

	
	
		
	<!-- Menu movil -->
	<div id="dl-menu" class="dl-menuwrapper"> 
	  <button class="dl-trigger"><img src="img/dado.png" alt="dado de 6 caras icono de la App Web"/></button>	
	 	
	  <ul class="dl-menu">
	  	<li>
	  		<a href="index.jsp">HOME</a>
	  	</li>	
		<li>
			<a href="#">B&aacute;sicos</a>
			<ul class="dl-submenu">
				<li><a href="ejemplos/basicos/parrafos.jsp">Parrafos y enlaces internos</a></li>
				<li><a href="#">Block e inline</a></li>
				<li><a href="#">Listas</a></li>
			</ul>
		</li>
		<li>
			<a href="#">Nuevos Elementos HTML5</a>
			<ul class="dl-submenu">
				<li><a href="ejemplos/html5/figure.jsp">Figure</a></li>
				<li><a href="ejemplos/html5/hgroup.jsp">Hgroup</a></li>
				<li><a href="ejemplos/html5/hgroup.jsp">Time</a></li>
				<li><a href="ejemplos/html5/video.jsp">Video</a></li>
				<li><a href="ejemplos/html5/proges_y_meter.jsp">Progress y Meter</a></li>
				<li><a href="ejemplos/html5/datalist.jsp">DataList</a></li>
			</ul>
		</li>
		
		<li>
			<a href="#">CSS3</a>
			<ul class="dl-submenu">
				<li>
					<a href="#">Selectores</a>
					<ul class="dl-submenu">
						<li><a href="ejemplos/css/selectores/atributos.jsp">Atributos</a></li>
						<li><a href="ejemplos/css/selectores/hijos.jsp">Hijos</a></li>
						<li><a href="ejemplos/css/selectores/adyacentes.jsp">Adyacentes</a></li>
						<li><a href="ejemplos/css/selectores/p_clases.jsp">Pseudo-clases</a></li>
						<li><a href="ejemplos/css/selectores/p_elementos.jsp">Pseudo-elementos</a></li>
						<li><a href="ejemplos/css/selectores/css3.jsp">CSS3</a></li>
					</ul>
				</li>	
				<li>
					<a href="#">Poscionamiento</a>
					<ul class="dl-submenu">
						<li><a href="ejemplos/css/posicionamiento/normal.jsp">Normal</a></li>
						<li><a href="ejemplos/css/posicionamiento/relativo.jsp">Relativo</a></li>
						<li><a href="ejemplos/css/posicionamiento/absoluto.jsp">Absoluto</a></li>
						<li><a href="ejemplos/css/posicionamiento/fijo.jsp">Fijo</a></li>
						<li><a href="ejemplos/css/posicionamiento/inherit.jsp">Inherit</a></li>					
						<li><a href="ejemplos/css/posicionamiento/float.jsp">Elementos Flotantes</a></li>
					</ul>
				</li>
				<li>
					<a href="#">Tecnicas Avanzadas</a>
					<ul class="dl-submenu">
						<li><a href="ejemplos/css/avanzado/sprite.jsp">Sprite Pacman</a></li>
						<li><a href="ejemplos/css/avanzado/fontawesome.jsp">FontAwesome</a></li>					
					</ul>
				</li>	
			</ul>
		</li>
		
		
		<li>
			<a href="#">Reales</a>
			<ul class="dl-submenu">
				<li><a href="ejemplos/reales/cartelera.jsp">Cartelera</a></li>
				<li><a href="ejemplos/reales/cartelera_detalle.jsp">Detalle Cartelera</a></li>
			</ul>
		</li> 
		<li> 
			<a href="#">Formularios</a>
			<ul class="dl-submenu">
				<li><a href="ejemplos/formularios/login.jsp">Login</a></li>			
				<li><a href="ejemplos/formularios/datos_personales.jsp">Datos Personales</a></li>
			</ul>
		</li>  
		<li>
			<a href="#">JavaScript</a>		
			<ul class="dl-submenu">
				<li>
					<a href="#">B&aacute;sicos</a>
					<ul class="dl-submenu">
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
					<a href="#">Plugins</a>
					<ul class="dl-submenu">
						<li><a href="ejemplos/plugins/datatable.jsp">dataTables</a></li>
						<li><a href="ejemplos/plugins/clipboard.jsp">ZeroClipboard</a></li>
						<li><a href="ejemplos/plugins/grafico.jsp">Graficos - Morris.js</a></li>
					</ul>
				</li>
				<li>
					<a href="#">Test</a>
					<ul class="dl-submenu">
						<li><a href="ejemplos/javascript/test.jsp">Qunit</a></li>
					</ul>
				</li>				
			</ul>
		</li>  
	  </ul>
	</div>
		<!-- menu movil -->
		
	<div class="clearfix">	
		<div id="logo">
		  	<a href="" title="Volver a la home">
		  		<img src="img/dado.png" alt="dado de 6 caras icono de la App Web"/>
		  	</a>
		</div>		
		<h1>Ejemplos de HTML5, CSS3 y JS</h1>		
	</div>
	
	<!-- Navegacion menu principal  -->


