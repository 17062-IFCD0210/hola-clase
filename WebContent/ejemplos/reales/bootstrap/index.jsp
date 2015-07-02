<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <!--     <link href="css/bootstrap.min.css" rel="stylesheet">    --> 
		    
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <style>
 		header { background: #2c3e50; color: #fff; }
  		.main { background:f2f2f2; }
  		.color1 { background: #34495e; color: #fff; }
  		aside { background: #c0392b; color: #fff; }
  		footer { background: green;  color: #fff;}
  		/*.alert { visibility: hidden;  display: none; }*/
  		
  	</style>
  </head>
  
  <body>
    <header>
    <a href="../../../../../index.jsp">Volver</a>
    	<div class="container">
    		<h1>Header</h1>
    	</div>
    	
		<form class="form-inline" action="../../../ejemplos/formularios/controlador.jsp" method="post">
		  <div class="form-group">
		    <label for="exampleInputName3"></label>
		    <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Nombre">
		  </div>
		  <div class="form-group">
		    <label class="sr-only" for="exampleInputPassword3"></label>
		    <input type="password" class="form-control" name="pass" id="pass" placeholder="Contrase&ntilde;a">
		  </div>
		  <div class="checkbox">
		    <label>
		      <input type="checkbox"> Recordar
		    </label>
		  </div>
		  <button type="submit" class="btn btn-default">Acceder</button>
		</form>
    </header>

	<!-- MENSAJES -->
	<div class="row" id="mensajes">
		<div id="msg" class="alert alert-warning alert-dismissible fade" role="alert">
		  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		  <strong>Warning!</strong> Better check yourself, you're not looking too good.
		</div>
	</div>

	<!-- MAIN -->
		<div id="carousel-example-generic" class="row carousel slide" data-ride="carousel">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
				    <div class="item active">
				      <img src="../../../img/technics-q-c-1293-500-4.jpg" alt="Imagen de circuito">
				      <div class="carousel-caption">
				        Circuito
				      </div>
				    </div>
				    
				    <div class="item">
				      <img src="../../../img/city-q-c-1293-500-6.jpg" alt="Imagen de edificio">
				      <div class="carousel-caption">
				        Edificio
				      </div>
				    </div>
				    
				    <div class="item">
				      <img src="../../../img/nightlife-q-c-1293-500-6.jpg" alt="Imagen de vida de nocturna">
				      <div class="carousel-caption">
				        Vida de nocturna
				      </div>
				    </div>
			   </div>  
		
			  <!-- Controls -->
			  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Anterior</span>
			  </a>
			  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Siguiente</span>
			  </a>
		</div>
	
	
	<div class="container">
		<section class="main row">
			<article class="col-xs-12 col-sm-8 col-md-9 col-lg-9">
			
				<h3>Article</h3>
				<p>
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
				</p>
				
				<!-- Standard button -->
				<button type="button" class="btn btn-default"><a href="http://getbootstrap.com/">Bootstrap</a></button>
				
				<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#ventanaModal">Ventana modal</button>
							<!-- Modal -->
							<div class="modal fade" id="ventanaModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
							  <div class="modal-dialog" role="document">
							    <div class="modal-content">
							      <div class="modal-header">
							        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							        <h4 class="modal-title" id="myModalLabel">Titulo ventana modal</h4>
							      </div>
							      <div class="modal-body">
							        <p>
									Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
									</p>
							      </div>
							      <div class="modal-footer">
							        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
							        <button type="button" class="btn btn-primary">Guardar</button>
							      </div>
							    </div>
							  </div>
							</div>
							
				<!-- Button alerts -->
				<button type="button" class="btn btn-info" onclick="mostrarAlerta();">Mostrar alerta</button>
				<button type="button" class="btn btn-warning" onclick="ocultarAlerta();">Ocultar alerta</button>
				
				<!-- Single button -->
				<!-- Dropdown para mostrar alertas de forma dinamica -->
				<div class="btn-group">
				  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    Crear alertas dinamicamente <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu">
				    <li><a href="#" onclick="crearAlerta('info');">INFO</a></li>
				    <li><a href="#" onclick="crearAlerta('success');">SUCCESS</a></li>
				    <li><a href="#" onclick="crearAlerta('warning');">WARNING</a></li>
				    <li><a href="#" onclick="crearAlerta('danger');">ERROR</a></li>
				  </ul>
				</div>
				
			</article>
			
			<aside class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
				<h3>Aside</h3>
				<p>
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
				</p>
			</aside>
		</section>
		
		<div class="row">
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<h3>Columna 1</h3>
				<p>
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
				</p>
				
				<p>
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
				</p>
			</div>
			
			<!-- <div class="clearfix visible-sm-block"></div> -->
			
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h3>Columna 2</h3>
				<p>
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
				</p>
			</div>
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<h3>Columna 3</h3>
				<p>
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
				</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h3>Columna 4</h3>
				<p>
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mi tellus, dignissim vel neque id, blandit rhoncus sem. Aliquam erat volutpat. Aenean accumsan dolor est, at porttitor eros pellentesque rhoncus. Quisque porttitor efficitur neque in sodales.
				</p>
			</div>
		</div>
	</div>
	
	<!-- FOOTER -->
	<footer>
		<div class="container">
			<h3>Footer</h3>
		</div>
	</footer>



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
   		 <!--   <script src="js/bootstrap.min.js"></script>    -->
    <!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
	
		function mostrarAlerta() {
			$('#msg').addClass('in');
		}
		
		function ocultarAlerta() {
			$('#msg').removeClass('in');
		}
		
		
		function crearAlerta( tipo ) {
			console.debug('Creando alerta del tipo' + tipo);
			// obtener el contenedor para los mensajes
			var contentAlertas = $('#mensajes');
			// limpiar todo el innerHTML
			contentAlertas.html('');
			// crear alerta
			contentAlertas.html("<div id='msg' class='alert alert-"+ tipo +" alert-dismissible fade in' role='alert'><button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button><strong>Warning!</strong> Better check yourself, you're not looking too good.</div>");																							
		}
		
		
		// Jugando con la API classList
		console.debug('Jugando con la API classList');
		var alerta = document.getElementById('msg');
		
		console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
		
		console.debug('toggle con la clase "in" ')
		alerta.classList.toggle('in');
		
		console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
		
		for (i=0; i < alerta.classList.length; i++ ) {
			console.debug ('posicion ' + i + ' ' + alerta.classList.item(i) );
		}
	
		console.info ('contiene la clase "pepe" ' + alerta.classList.contains('pepe') );
		console.info ('contiene la clase "alert" ' + alerta.classList.contains('alert') );
		
		// Atributo value. Definiendo una funcion nueva
				element.classList.insert = function(insert,position) {
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
				
				console.info ( element.classList.insert( ) );
				console.info ( element.classList.insert( ) ); // x
				
		
	</script>
	
  </body>
</html>