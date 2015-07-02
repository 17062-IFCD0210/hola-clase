<!doctype html>

<html lang="es">

<head>

  
  
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
		
		
		
		.carousel-inner>.item>img {margin: 0 auto;} /*no recomendable hacer esto*/
		
		body { padding-top: 60px; } /* por el navbar fixed */
		
		.ocultar{display: none;}
		
		section{color:black;}
		
		#myCarouselArticulos{min-height:300px;}
		
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
	
	<div id="msg" class="alert alert-warning alert-dismissible fade" role="alert">
	      <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">x</span></button>
	      <strong>Holy guacamole!</strong> Best check yo self, you're not looking too good.
    </div>
	
	<div id="alerts" class="row">
		
<!-- 		
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
			
 -->						
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
			      <div class="carousel-caption">
					Foto 1			
      			  </div>
			    </div>
			
			    <div class="item">
			      <img src="http://lorempixel.com/output/city-q-c-320-240-10.jpg" alt="Imagen 2">
			      <div class="carousel-caption">
					Foto 2			
      			  </div>			      
			    </div>
			
			    <div class="item">
			      <img src="http://lorempixel.com/output/city-q-c-320-240-2.jpg" alt="Imagen 3">
			      <div class="carousel-caption">
					Foto 3			
      			  </div>
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
					    <li><a href="#" onclick="mostrar_alert('alert-info')">Info</a></li>
					    <li><a href="#" onclick="mostrar_alert('alert-success')">Success</a></li>
					    <li><a href="#" onclick="mostrar_alert('alert-warning')">Warning</a></li>
					    <li><a href="#" onclick="mostrar_alert('alert-danger')">Error</a></li>
					  </ul>
				</div>

				<!-- Botones del profe -->
				<button type="button" class="bt btn-info" onclick="mostrarAlerta()">mostrar alerta</button>
				<button type="button" class="bt btn-warning" onclick="ocultarAlerta()">ocultar alerta</button>
				
	
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
<!-- 			
				<h2>Columna</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>
 -->
 				<h2>Slide de artículos</h2>

					<div id="myCarouselArticulos" class="carousel slide">
					
					  <ol class="carousel-indicators">
					    <li data-target="#myCarouselArticulos" data-slide-to="0" class="active"></li>
					    <li data-target="#myCarouselArticulos" data-slide-to="1"></li>
					    <li data-target="#myCarouselArticulos" data-slide-to="2"></li>
					  </ol>
					
					  <!-- Wrapper for slides -->
					  <div class="carousel-inner" role="listbox">
					    <div class="item active">
							<article>
								<header>Titulo 1</header>
								<section>
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque.
								</section>
							</article>
					      <div class="carousel-caption">
									
		      			  </div>
					    </div>
					
					    <div class="item">
							<article>
								<header>Titulo 2</header>
								<section>
									Lorem ipsum dolor sit amet, 
								</section>
							</article>

					      <div class="carousel-caption">
							
		      			  </div>			      
					    </div>
					
					    <div class="item">
							<article>
								<header>Titulo 3</header>
								<section>
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque.
								</section>
							</article>

					      <div class="carousel-caption">
									
		      			  </div>
					    </div>
					
					  </div>
					
					  <!-- Left and right controls -->
					  <a class="left carousel-control" href="#myCarouselArticulos" role="button" data-slide="prev">
					    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					    <span class="sr-only">Anterior</span>
					  </a>
					  <a class="right carousel-control" href="#myCarouselArticulos" role="button" data-slide="next">
					    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					    <span class="sr-only">Siguiente</span>
					  </a>
											
					</div> 				
 				
 				
 											
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h2>Columna</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>			
			</div>			
		</div>
		
		<section class="row">
			<div class="color1 col-xs-12 col-sm-6 col-md-6">
				<h2>Alta de usuario</h2>
					<form class="form-horizontal" action="ejemplos/formularios/controlador_new_user.jsp" method="post" id="form_new_user" onsubmit="comprobarFormulario(this); return false;">					

					  <div class="form-group">			  					  
					    <label for="usuario" class="col-sm-2 control-label">Usuario</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="usuario" placeholder="Usuario">
					    </div>
					  </div>
	
					  <div class="form-group">			  					  
					    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
					    <div class="col-sm-10">
					      <input type="email" class="form-control" id="email" placeholder="Email">
					    </div>
					  </div>
					  
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-7 control-label">Password</label>
					    <div class="col-sm-5">
					      <input type="password" class="form-control" id="pass" placeholder="Password">
					    </div>
					  </div>

					  <div class="form-group">
					    <label for="inputPassword4" class="col-sm-7 control-label">Repite password</label>
					    <div class="col-sm-5">
					      <input type="password" class="form-control" id="repass" placeholder="Repite password">
					    </div>
					  </div>

					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-5">
					      <div class="checkbox">
					        <label>
					          <input type="checkbox"> Recuerdame
					        </label>
					      </div>
					    </div>
					   </div>

					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-5">
					      <button type="submit" class="btn btn-default">Registrate</button>
					    </div>
					  </div>

					</form>			
			</div>
					
			<div class="col-xs-12 col-sm-6 col-md-6">
				<h2>Columna</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam vel diam et nulla varius pellentesque. Maecenas at justo rhoncus, accumsan elit a, semper mauris. Duis vel ante ac neque luctus ultrices non quis felis. Etiam vitae neque aliquam leo fermentum sollicitudin vitae sit amet turpis. In hac habitasse platea dictumst. Proin tempor fringilla nisi, et maximus leo varius ut. Aenean bibendum molestie arcu varius tincidunt. Nullam faucibus quam leo, iaculis malesuada ex pharetra sed. Phasellus eget urna sed tortor accumsan ornare vel ac ex. Maecenas quis diam in tellus elementum ornare at a augue.</p>			
			</div>
		
		</section>
	</div>	
	
	<footer>
		<div class="container">
			<h3>Javi</h3>
		</div>
	</footer>
	
	
<!--  jQuery -->
 <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
 
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script>
	function mostrar_alert(id_alert){
		//aqui deberia crearse desde cero el alert en #alerts
		var etiqueta="#"+id_alert;
		var contenido="";
		var nodo="";
/*
		switch(id_alert){
			case 'alert_warning':
				contenido="<strong>Warning!</strong> Alerta tipo warning.";
				nodo='<div id="alert_warning" class="alert alert-warning alert-dismissible" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button><strong>Warning!</strong> Alerta tipo warning.</div>';
				break;
			case 'alert_info':
				contenido="<strong>Info!</strong> Alerta tipo info.";
				nodo='<div id="alert_info" class="alert alert-info alert-dismissible" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button><strong>Info!</strong> Alerta tipo info.</div>';
				break;
			case 'alert_success':
				contenido="<strong>Success!</strong> Alerta tipo success.";
				nodo='<div id="alert_success" class="alert alert-success alert-dismissible" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button><strong>Success!</strong> Alerta tipo success.</div>';
				break;
			case 'alert_danger':
				contenido="<strong>Danger!</strong> Alerta tipo danger.";
				nodo='<div id="alert_danger" class="alert alert-danger alert-dismissible" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button><strong>Danger!</strong> Alerta tipo danger.</div>';
				break;		
		}
*/
		contenido="<strong>Danger!</strong> Alerta tipo " + id_alert;
		nodo1='<div id="'+id_alert+'" class="alert '+id_alert+' alert-dismissible" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>'+contenido+'</div>';
		$("#alerts").html(''); // limpia el contenedor de alertas
		$("#alerts").append(nodo1);
	
	}
	
	function mostrarAlerta(){
		$("#msg").addClass("in");
	}
	
	function ocultarAlerta(){
		$("#msg").removeClass("in");		
	}
	
	console.debug('Jugando con la API classList');
	var alerta=document.getElementById('msg');
	
	console.debug(alerta.classList.length + ' : ' + alerta.classList.toString());
	
	console.debug('toggle con la clase "in"');
	alerta.classList.toggle('in');
	
	console.debug(alerta.classList.length + ' : ' + alerta.classList.toString());
	
	console.debug('toggle con la clase "in"');
	alerta.classList.toggle('in');
	
	console.debug(alerta.classList.length + ' : ' + alerta.classList.toString());
	
	for(i=0;i<alerta.classList.length;i++){
		console.debug('posicion '+ i + ' : '+alerta.classList.item(i));
	}
	
	console.debug('contiene la clase "pepe": ' + alerta.classList.contains('pepe'));
	console.debug('contiene la clase "alert": ' + alerta.classList.contains('alert'));
	
	//atributo value definiendo una funcion nueva
	
			alerta.classList.replace = function(classes) {
			    var i = 0,
			        ii = this.length,
			        old_string = this.toString(),
			        old_array = old_string.split(' '),
			        new_array = classes.split(' '),
			        j = 0,
			        jj = new_array.length;
			
			    // remove all the existing classes
			    for(i; i<ii; i++) {
			        this.remove(old_array[i]);
			    }
			
			    // add the new ones
			    for(j; j<jj; j++) {
			        this.add(new_array[j]);
			    }
			};	
			alerta.classList.insert = function(insert,position) {
			    // check if the class is already in classList
			    if(this.contains(insert)) {
			        if(this.item(position) === insert) {
			            // if it is already at the right position there's no need to continue
			            return;
			        } else {
			            // remove it, we don't want it here
			            this.remove(insert);
			        }
			    }
			
			    var classes = this.toString(),
			        classes_array = classes.split(' ');
			
			        classes_array.splice(position, 0, insert);
			
			        new_list = classes_array.join(' ');
			
			        // use the custom replace method to replace the current classList
			        this.replace(new_list);
			};	
	
	alerta.classList.insert('pepe',2);
	console.debug(alerta.classList.length + ' : ' + alerta.classList.toString());
	
</script>

</body>
</html>
