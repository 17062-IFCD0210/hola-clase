<!doctype html>

<html lang="es">

<head>

  <base href="<%=request.getContextPath()%>/">
  
  <meta charset="utf-8">

  <title>Surf Search Spot</title>
  <meta name="description" content="Maquetación de la Web Ipartek -> http://formacion.ipartek.com/">
  <meta name="author" content="Unai Perea Cruz">

  <!-- ViewPort imprescindible para RWD (media queries) -->	
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
  
  <link rel="stylesheet" type="text/css" href="css/maquetacion3.css?v=1.0">

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
	
	<header id="head960" class="clearfix">	
		
		<div id="head_izda">
			<!-- <img src="img/sss-logo.png" alt="Surf Search Spot" title="Surf Search Spot"/> -->
		</div>
		
		<!-- MENÚ -->
		<nav id="menu"> 
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
		
	</header>
	

	<!-- CONTENIDO -->
	<div id="content960" class="clearfix">
	
		<!-- lateral izda -->
		<aside id="col_1" class="mr10">
			<div class="servicios">
				<div id="lista_izda">
					<ul>
						<li><div><a href="#top">Crea tu plan de formaci&oacute;n</a></div></li>
						<li><div><a href="#top">Formaci&oacute;n Subvencionada Empresas</a></div></li>
						<li><div><a href="#top">Consultor&iacute;a</a></div></li>
					</ul>
					<ul>
						<li>E-learning</li>
					</ul>
				</div>
				<div id="publicidad"></div>
			</div>
		</aside>
		
		<!-- central izda -->
		<div id="col_2" class="mr10">
			<div class="box_1x1"></div>
			<div class="box_1x1"></div>
			<div class="box_1x1 mb0"></div>
		</div>
		
		<!-- central dcha -->
		<aside id="col_3" class=" mr10">
			<div class="box_1x1"></div>
			<section class="noticias mb0">
				<h3>&Uacute;ltimas noticias</h3>
				<article class="articulo"></article>
				<hr>
				<article class="articulo"></article>
				<hr>
				<article class="articulo mb0"></article>
				<hr>
			</section>
		</aside>
		
		<!-- lateral dcha -->
		<aside id="col_4">
			<input type="text" id="buscar" class="mr10" placeholder="Buscador de cursos..."/>
			<div id="lista_dcha">
				<ul>
					<li><div><a href="#top">Usuarios Registrados</a></div></li>
					<li><div><a href="#top">Pr&oacute;ximos cursos</a></div></li>
					<li><div><a href="#top">Presupuesto on-line</a></div></li>
					<li><div><a href="#top">Campus virtual</a></div></li>
				</ul>
			</div>
			<div id="newsletter"></div>
		</aside>
		
	</div> <!-- fin content -->
	
	<!-- footer -->
	<footer id="wrapper_footer" class="clearfix">
		<div id="footer960">
		
		</div>
	</footer>
		

	
</body>

</html>
