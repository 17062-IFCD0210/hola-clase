<!doctype html>

<html lang="es">
<head>

  <base href="<%=request.getContextPath()%>/">
  
  <meta charset="utf-8">

  <title>Maquetacion Surf</title>
  <meta name="description" content="Ejercicio de maquetacion">
  <meta name="author" content="David Garcia">

  <!-- ViewPort imprescindible para RWD -->	
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />

  <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
  <link rel="icon" href="favicon.ico" type="image/x-icon">
  
  <link rel="stylesheet" type="text/css" href="css/surf.css?v=1.0">

  <!--[if lt IE 9]>
  	  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	  <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
  <![endif]-->
  
</head>

<body>

<div id="container">

	<header id="head">
		<div id="logo">
			<img src="http://www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/sss-logo.png?d2015.03.25" alt="Surf Search Spot">
		</div>
	</header>
	
	<div id="menu-wrapper">
		<nav id="menu">
			<ul>
				<li>Item1</li>
				<li>Item2</li>
				<li>Item3</li>
				<li>Item4</li>
				<li>Item5</li>
			</ul>
		</nav>
	</div>
	
	<div id="content">
		<div id="content_top" class="clearfix">
			<div class="caja_1x1"></div>
			<div class="caja_2x1"></div>
			<div class="caja_1x1"></div>
		</div>
		<div id="content_middle" class="clearfix">
			<div class="caja_1x2"></div>
			<div id="box_container" class="clearfix">
				<div class="caja_1x1"></div>
				<div class="caja_1x1"></div>
				<div class="caja_1x1"></div>
				<div class="caja_1x1"></div>
			</div>
			<div class="caja_1x2"></div>
		</div>
		<div id="content_bottom" class="clearfix">
			<div class="caja_1x1"></div>
			<div class="caja_2x1"></div>
			<div class="caja_1x1"></div>
		</div>
	</div><!-- content -->
	
	<footer>
		<div id="foot">
			<p>Enlaces del footer</p>
		</div>
	</footer>
</div> <!-- container -->
</body>
</html>
