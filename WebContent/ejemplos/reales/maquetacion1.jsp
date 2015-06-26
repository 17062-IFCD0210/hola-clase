<!doctype html>

<html lang="es">

<head>

  <base href="<%=request.getContextPath()%>/">
  
  <meta charset="utf-8">

  <title>Surf Search Spot</title>
  <meta name="description" content="Maquetación de la Web Surf Search Spot">
  <meta name="author" content="Unai Perea Cruz">

  <!-- ViewPort imprescindible para RWD (media queries) -->	
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
  
  <link rel="stylesheet" type="text/css" href="css/maquetacion1.css?v=1.0">

  <!-- http://tympanus.net/codrops/2013/04/19/responsive-multi-level-menu/ -->
  <!--   <link rel="stylesheet" href="js/ResponsiveMultiLevelMenu/css/default.css"> -->
  <link rel="stylesheet" href="js/ResponsiveMultiLevelMenu/css/component.css">
  <script src="js/ResponsiveMultiLevelMenu/js/modernizr.custom.js" ></script>

  <!--[if lt IE 9]>
  	  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	  <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
  <![endif]-->
  
</head>

<body>
	
	<header id="head960">	
		
		<div id="head_izda">
			<!-- <img src="img/sss-logo.png" alt="Surf Search Spot" title="Surf Search Spot"/> -->
		</div>
		
		<div id="head_centro">
		</div>
		
		<div id="head_dcha">
		</div>
		
	</header>
	
	<!-- MENÚS -->
	
	<!-- menú desktop--> 
	<div id="wrapper_menu"> <!-- Que ocupe el ancho de la pantalla -->
		<nav id="menu960"> 
		 	
		  <ul class="menu">	
			<li>
				<h2>Men&uacute;</h2>
				<ul>
					<li>Men&uacute; 1</li>
					<li>Men&uacute; 2</li>
					<li>Men&uacute; 3</li>
				</ul>
			</li>
		  </ul>
		
		</nav>
	
	
		<!-- menú móvil -->
		<nav id="dl_menu" class="dl-menuwrapper"> 
		  <button class="dl-trigger"><img src="img/sss-logo.png" alt="Surf Search Spot"/></button>	
		 	
		  <ul class="dl-menu">
		  	<li>
		  		<a href="index.jsp">HOME</a>
		  	</li>	
			<li>
				<a href="#">Men&uacute;</a>
				<ul class="dl-submenu">
					<li><a href="#">Men&uacute; 4</a></li>
					<li><a href="#">Men&uacute; 3</a></li>
					<li><a href="#">Men&uacute; 2</a></li>
				</ul>
			</li>
		  </ul>
		</nav>
	</div>

	<!-- CONTENIDO -->
	<div id="content960" class="clearfix">
		
		<aside id="seccion_izda" class="clearfix">
			<div class="box_1x1 margin_abajo"></div>
			<div class="box_1x2 margin_abajo"></div>
			<div class="box_1x1 margin_abajo"></div>
		</aside>
		
		<section id="seccion_central" class="clearfix">
			<div class="box_2x1 margin_abajo"></div>
			
			<div id="cajas" class="clearfix">
				<div class="box_1x1 flotar_margin_abajo_dcha clearfix"></div>
				<div class="box_1x1 flotar    margin_abajo   clearfix"></div>
				<div class="box_1x1 flotar_margin_abajo_dcha clearfix"></div>
				<div class="box_1x1 flotar   margin_abajo   clearfix"></div>
			</div>
			<div class="box_2x1 flotar margin_abajo clearfix"></div>
		</section>
		
		<aside id="seccion_dcha" class="clearfix">
			<div class="box_1x1 margin_abajo clearfix"></div>
			<div class="box_1x2 margin_abajo clearfix"></div>
			<div class="box_1x1 margin_abajo clearfix"></div>
		</aside>
		
		
		<!-- <section id="seccion_alta">
			<div class="box_1x1 clearfix"></div>
			<div class="box_2x1 clearfix"></div>
			<div class="box_1x1 clearfix"></div>
		</section> -->
		
		<!-- <section id="seccion_central">
				<div class="box_1x2 clearfix"></div>
				
				<div class="box_1x1 clearfix"></div>
				<div class="box_1x1 clearfix"></div>
				<div class="box_1x1 clearfix"></div>
				<div class="box_1x1 clearfix"></div>
				
				<div class="box_1x2 clearfix"></div>
		</section> -->

		<!-- <section id="seccion_baja">
		 	<div class="box_1x1 clearfix"></div>
			<div class="box_1x2 clearfix"></div>
			<div class="box_1x1 clearfix"></div>
		</section>-->
	
	</div>
	
	
	<!-- FOOTER -->
	<footer id="footer960">
	
	</footer>
	
	
</body>

</html>