<!doctype html>

<html lang="es">

<head>
	<base href="<%=request.getContextPath()%>/">
	<meta charset="utf-8">

	<title>MAQUETA SURF</title>
	<meta name="description" content="Maqueta de la pagina: Surf Search Spot">
	<meta name="author"      content="Cristina Martin Pumar">

	<!-- ViewPort imprescindible para RWD -->	
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
	
	<link rel="stylesheet"   type="text/css" href="css/surf.css?v=1.0">

	<!--[if lt IE 9]>
  	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  	<![endif]-->

</head>

<body>
	<header id="head">
		<h1>Cabecera</h1>
	</header>
	<nav id="wraper-menu">
		<div id="menu" class="clearfix"></div>
	</nav>
	<div id="content">
		<div id="box1" class="clearfix">
			<div class="caja1x1"></div>
			<div class="caja2x1"></div>
			<div class="caja1x1"></div>
		</div>
		<div id="box2" class="clearfix">
			<div class="caja1x2"></div>
			<div class="caja2x2">
				<div class="cajita1x1" id=cajita1x11></div>
				<div class="cajita1x1" id=cajita1x12></div>
				<div class="cajita1x1" id=cajita1x13></div>
				<div class="cajita1x1" id=cajita1x14></div>
			</div>
			<div class="caja1x2"></div>
		</div>
		<div id="box3" class="clearfix">
			<div class="caja1x1"></div>
			<div class="caja2x1"></div>
			<div class="caja1x1"></div>
		</div>
	</div>
	<footer id="foot">
		<span>Pie</span>
	</footer>
</body>

</html>