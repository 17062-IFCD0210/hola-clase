<!doctype html>

<html lang="es">

<head>
	<base href="<%=request.getContextPath()%>/">
	<meta charset="utf-8">

	<title>MAQUETA PAGINA IPARTEK</title>
	<meta name="description" content="Maqueta de la pagina: Ipartek">
	<meta name="author"      content="Cristina Martin Pumar">

	<!-- ViewPort imprescindible para RWD -->	
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
	
	<link rel="stylesheet"   type="text/css" href="css/ipartek.css?v=1.0">

	<!--[if lt IE 9]>
  	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  	<![endif]-->

</head>

<body>
	<header id="head" class="clearfix">
		<div id="logo">
			<a href= "http://www.formacion.ipartek.com">
			<img src="http://www.formacion.ipartek.com/images/logo-ipartek-nuevo.gif">
			</a>
		</div>
		<nav id="menu"></nav>
	</header>

	<div id="content" class="clearfix">

		<aside id="izquierdo">
		</aside>
		<div id="main1">
		
			<div class="info">
				<a href="http://www.formacion.ipartek.com/elearningenqueconsiste.asp">
				<img src="http://www.formacion.ipartek.com/images/banner-home-e-learning.jpg" 
				     alt="e-learning, comozca toda nuestra oferta de cursos">
				</a>			
			</div>
			<div class="info"></div>
			<div class="info mb0"></div>
			
			 
		</div>
		<div id="main2">
			<div class="info"></div>
			<section class="articulo">
			
				<h2>Ultimas noticias</h2>
				
				<ul>
					
					<li class="fecha-noticia">22/06/2015</li>
					<li class="cuerpo-noticia"><a href="noticia_detalle.asp?noticia=295">Tendencias que cambiaran el mercado del eLearning en Espana</a></li>
					
					<li class="fecha-noticia">03/06/2015</li>
					<li class="cuerpo-noticia"><a href="noticia_detalle.asp?noticia=294">Promocion de Cursos OnLine subvencionados para trabajadores</a></li>
					
					<li class="fecha-noticia">01/06/2015</li>
					<li class="cuerpo-noticia"><a href="noticia_detalle.asp?noticia=293">Las claves de Android M</a></li>
						
				</ul>
			
			</section>
			 
		</div>

		<aside id="derecho">
		</aside>
	
	</div>

	<footer id="foot">
		<div id="enlaces">
			<span>Pie</span>
		</div>
	</footer>
</body>

</html>