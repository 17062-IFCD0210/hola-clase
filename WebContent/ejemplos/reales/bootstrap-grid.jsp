<!doctype html>

<html lang="es">

<head>

  <base href="<%=request.getContextPath()%>/">
  
  <meta charset="utf-8">

  <title>Grid en Bootstrap</title>

  <!-- ViewPort imprescindible para RWD -->	
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />	

  <!--[if lt IE 9]>
  	  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	  <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
  <![endif]-->

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

	<style>
		header{
			background-color:#2D3D4F;
			color:white;
		}
		
		aside{
			background-color:#C0382E;
			color:white;
		}
		
		article{
			background-color:#F3F2F3;
		}
		
		footer{
			background-color:#169F86;
			color:white;
		}
		
		.color1{
			background-color:#2D3D4F;
			color:white;
		}
		
		.carousel-inner>.item>img {margin: 0 auto;}
		body { padding-top: 60px; } /* por el navbar fixed */
		
		.ocultar{display: none;}
		
	</style>  

</head>

<body>
	<header>
		<div class="container">
<!-- 		
 			<h1>Header</h1>
 -->
			<nav class="navbar navbar-inverse  navbar-fixed-top">
		      <div class="container">
		        <div class="navbar-header">
		          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
		            <span class="sr-only">Toggle navigation</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		          </button>
 		          <a class="navbar-brand" href="#">Pruebas de Bootstrap</a>
 		        </div>
		        <div id="navbar" class="navbar-collapse collapse">
		          <form class="navbar-form navbar-right">
		            <div class="form-group">
		              <input type="text" placeholder="Usuario" class="form-control">
		            </div>
		            <div class="form-group">
		              <input type="password" placeholder="Password" class="form-control">
		            </div>
		            <button type="submit" class="btn btn-success">Entrar</button>
		          </form>
		        </div>
		      </div>
		    </nav>
		    
		</div>
	</header>
	
	
	<div id="alerts" class="container">
		    <div id="alert_warning" class="alert alert-warning alert-dismissible ocultar" role="alert">
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <strong>Warning!</strong> Alerta tipo warning.
			</div>
			
			<div id="alert_info" class="alert alert-info alert-dismissible ocultar" role="alert">
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <strong>Info!</strong> Alerta tipo info.
			</div>

		    <div id="alert_success" class="alert alert-success alert-dismissible ocultar" role="alert">
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <strong>Success!</strong> Alerta tipo success.
			</div>
			
		    <div id="alert_danger" class="alert alert-danger alert-dismissible ocultar" role="alert">
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <strong>Danger!</strong> Alerta tipo danger.
			</div>			
	</div>
		    
	
	<div class="container">
	
		<section class="row">
			<div id="myCarousel" class="carousel slide">
			
			  <ol class="carousel-indicators">
			    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			    <li data-target="#myCarousel" data-slide-to="1"></li>
			    <li data-target="#myCarousel" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
			    <div class="item active">
			      <img src="http://lorempixel.com/output/city-q-c-320-240-3.jpg" alt="Imagen 1">
			    </div>
			
			    <div class="item">
			      <img src="http://lorempixel.com/output/city-q-c-320-240-10.jpg" alt="Imagen 2">
			    </div>
			
			    <div class="item">
			      <img src="http://lorempixel.com/output/city-q-c-320-240-2.jpg" alt="Imagen 3">
			    </div>
			
			  </div>
			
			  <!-- Left and right controls -->
			  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Anterior</span>
			  </a>
			  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Siguiente</span>
			  </a>
									
			</div>
		</section>
		
		<section class="main row">
			<article class="col-xs-12 col-sm-8 col-md-9 col-lg-9">
				<h2>Articulo - Article</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>
				
				<!--  Boton enlace -->
				<a class="btn btn-default" href="http://www.google.es" target="_blank" role="button">Enlace a Google</a>
				
				<!-- Boton Ventana modal -->
				<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
				  Abrir ventana modal
				</button>
				
					<!-- Modal -->
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog" role="document">
					    <div class="modal-content">
					      <div class="modal-header">
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					        <h4 class="modal-title" id="myModalLabel">Ventana modal</h4>
					      </div>
					      <div class="modal-body">
					        Contenido
					      </div>
					      <div class="modal-footer">
					        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
<!-- 					        <button type="button" class="btn btn-primary">Save changes</button>  -->
					      </div>
					    </div>
					  </div>
					</div>				
				
				<!--  Alertas -->			
				<div class="btn-group">
					  <button type="button" class="btn btn-danger">Alertas</button>
					  <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    <span class="caret"></span>
					    <span class="sr-only">Toggle Dropdown</span>
					  </button>
					  <ul class="dropdown-menu">
					    <li><a onclick="mostrar_alert('alert_info')">Info</a></li>
					    <li><a onclick="mostrar_alert('alert_success')">Success</a></li>
					    <li><a onclick="mostrar_alert('alert_warning')">Warning</a></li>
					    <li><a onclick="mostrar_alert('alert_danger')">Error</a></li>
					  </ul>
				</div>

				
	
			</article>
		
			<aside class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
				<h2>Sidebar - Aside</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>		
			</aside>
		</section>
		
		<div class="row">
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<h2>Columna</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>			
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h2>Columna</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>			
			</div>
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<h2>Columna</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>			
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h2>Columna</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>			
			</div>			
		</div>
	</div>	
	
	<footer>
		<div class="container">
			<h3>Javi</h3>
		</div>
	</footer>
	
	
<!--  jQuery -->
 <script src="js/jquery-2.1.4.min.js"></script>
 
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>
	function mostrar_alert(id_alert){
		//aqui deberia crearse desde cero el alert en #alerts
		var etiqueta="#"+id_alert;
		
		
		$(etiqueta).css("display","block");
		$("body container").css("display","block");
	}
</script>

</body>
</html>
