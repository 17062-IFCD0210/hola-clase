<!DOCTYPE html>
<html lang="es">
<head>
    
    <base href="<%=request.getContextPath()%>/">
    <meta charset="utf-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />

	<title>EMPEZANDO CON BOOTSTRAP</title>
	<meta name="description" content="Empezando con Bootstrap">
	<meta name="author" content="Cristina Martin Pumar">

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    
    <!-- Optional theme -->
	<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"> -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
      <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>

		<style>
			header  {background:#2c3e50; color:#fff;}
			.main   {background:#f2f2f3;}
			.color1 {background:#34495e; color:#fff;}
			aside   {background:#c0392b; color:#fff;}
			footer  {background:#16a085; color:#fff;}
			
		</style>

	<header>
		<div class="container">
			<h1>Header</h1>
		</div>
	</header>
	
	<div id="myCarousel" class="carousel">
	
		<ol class="carousel-indicators">
			<li data-target = "#myCarousel" data-slide-to = "0" class="active"></li>
			<li data-target = "#myCarousel" data-slide-to = "1"></li>
			<li data-target = "#myCarousel" data-slide-to = "2"></li>
		</ol>
		<div class="carousel-inner">
		
			<div class="item active">
			
				<img src="img/cronicas_narnia.jpg" alt="imagne" class="img-responsive">
			</div>
			
		</div>
	</div>

	<div class="container">
		<section class="main row">
			<article class="col-xs-12 col-sm-6 col-md-8 col-lg-9">
				<p>
				<h3>Ariculo - Article</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creacion de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y mas recientemente con software de autoedicion, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
				</p>
			</article>
			
			<aside class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				<p>
				<h3>Sidebar - Aside</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creacion de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y mas recientemente con software de autoedicion, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
				</p>
			</aside>
			
		</section>
		<div class="row">
		
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<p>
				<h3>Columna1</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creacion de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y mas recientemente con software de autoedicion, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
				</p>
			<!-- 
				<p>
				<h3>?Columna1.2</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creacion de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y mas recientemente con software de autoedicion, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
				</p>
			-->
				
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<p>
				<h3>Columna2</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creacion de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y mas recientemente con software de autoedicion, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
				</p>
			</div>
		<!-- 
			<div class="clearfix visible-sm-block"></div>
		-->
			<div class="color1 col-xs-12 col-sm-6 col-md-3 col-md-offset-3">
				<p>
				<h3>Columna3</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creacion de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y mas recientemente con software de autoedicion, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
				</p>
			</div>
		<!--
			<div class="col-xs-12 col-sm-6 col-md-3">
				<p>
				<h3>Columna4</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creacion de las hojas "Letraset", las cuales contenian pasajes de Lorem Ipsum, y mas recientemente con software de autoedicion, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.
				</p>
			</div>
		-->

		</div>
	</div>
	<footer>
		<div class="container">
			<h3>Cristina Martin</h3>
		</div>
	</footer>
	

	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>