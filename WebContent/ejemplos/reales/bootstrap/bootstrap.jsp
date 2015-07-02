<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>BOOTSTRAP</title>
	
	<!-- ViewPort imprescindible para RWD -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="estilos.css">	

</head>
<body>

	<!-- HEADER -->	
	<header>
		<div class="container">
			<h1>Header</h1>
			<h3>12 columnas</h3>
		</div>
	</header>
	<div class="container">
	
	<!-- MENSAJES -->
		<div class="row" id="mensajes">
		
			<div id="msg" class="alert alert-warning alert-dismissible fade" role="alert">
		      <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">X</span></button>
		      <strong>Holy guacamole!</strong> Best check yo self, you're not looking too good.
		    </div>
		    
		</div>
	
	<!-- SLIDER -->
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
			      <img src="http://lorempixel.com/output/sports-q-c-1170-350-5.jpg" alt="...">
			      <div class="carousel-caption">
			        MOTOCROSS
			      </div>
			    </div>
			    <div class="item">
			      <img src="http://lorempixel.com/output/sports-q-c-1170-350-2.jpg" alt="...">
			      <div class="carousel-caption">
			        BODYBOARD
			      </div>
			    </div>
			    
			  </div>
			
			  <!-- Controls -->
			  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
		</div>
		<!-- id="carousel-example-generic" -->
	
	<!-- MAIN -->
		<section class="main row">
			<article class="col-xs-12 col-sm-8 col-md-9 col-lg-9">
				<h2>Articulo - Article</h2>
				<h4>9 Columnas</h4>
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc posuere luctus tincidunt. Vestibulum ante ipsum 
					primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras lacinia neque euismod, fermentum tortor 
					varius, blandit ante. Proin tempor dapibus velit, blandit sagittis ex pretium id. In congue nec lectus in 
					commodo. Morbi in leo lorem. Donec ut purus tortor. Morbi aliquet arcu egestas tincidunt lacinia.
				</p>
				
				
				<div type="button" 
				     class="btn btn-info" 
				     onclick="mostrarAlerta();">
						mostrar alerta
				</div>
				
				<div type="button" 
				     class="btn btn-warning" 
				     onclick="ocultarAlerta();">
						ocultar alerta
				</div>
				
				
				<!-- Single button -->
				
				
				<!-- Botonera para mostrar alertas de forma dinamica -->
				<div class="btn-group">
				  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    Crear Alerts dinamicamente <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu">
				    <li><a href="#" onclick="crearAlerta('info');">INFO</a></li>
				    <li><a href="#" onclick="crearAlerta('success');">SUCCESS</a></li>
				    <li><a href="#" onclick="crearAlerta('warning');">WARNING</a></li>				    
				    <li><a href="#" onclick="crearAlerta('danger');">DANGER</a></li>
				  </ul>
				</div>
				
				
				
			</article>
			<aside class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
				<h2>Sidebar - Aside</h2>
				<h4>3 Columnas</h4>
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc posuere luctus tincidunt. Vestibulum ante ipsum 
					primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras lacinia neque euismod, fermentum tortor 
					varius, blandit ante. Proin tempor dapibus velit, blandit sagittis ex pretium id. In congue nec lectus in 
					commodo. Morbi in leo lorem. Donec ut purus tortor. Morbi aliquet arcu egestas tincidunt lacinia.
				</p>
			</aside>
		</section>
		<div class="row">
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<h3>3 Columnas</h3>
				<p>					
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc posuere luctus tincidunt. Vestibulum ante ipsum 
					primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras lacinia neque euismod, fermentum tortor 
					varius, blandit ante. Proin tempor dapibus velit, blandit sagittis ex pretium id. In congue nec lectus in 
					commodo. Morbi in leo lorem. Donec ut purus tortor. Morbi aliquet arcu egestas tincidunt lacinia.
				</p>
				<p>					
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc posuere luctus tincidunt. Vestibulum ante ipsum 
					primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras lacinia neque euismod, fermentum tortor 
					varius, blandit ante. Proin tempor dapibus velit, blandit sagittis ex pretium id. In congue nec lectus in 
					commodo. Morbi in leo lorem. Donec ut purus tortor. Morbi aliquet arcu egestas tincidunt lacinia.
				</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h3>3 Columnas</h3>
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc posuere luctus tincidunt. Vestibulum ante ipsum 
					primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras lacinia neque euismod, fermentum tortor 
					varius, blandit ante. Proin tempor dapibus velit, blandit sagittis ex pretium id. In congue nec lectus in 
					commodo. Morbi in leo lorem. Donec ut purus tortor. Morbi aliquet arcu egestas tincidunt lacinia.
				</p>
			</div>
			<div class="clearfix visible-sm-block"></div>
			<div class="color2 col-xs-12 col-sm-6 col-sm-offset-6 col-md-3 col-md-offset-3">
				<h3>3 Columnas</h3>
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc posuere luctus tincidunt. Vestibulum ante ipsum 
					primis in faucibus orci luctus et ultrices posuere cubilia Curae; Cras lacinia neque euismod, fermentum tortor 
					varius, blandit ante. Proin tempor dapibus velit, blandit sagittis ex pretium id. In congue nec lectus in 
					commodo. Morbi in leo lorem. Donec ut purus tortor. Morbi aliquet arcu egestas tincidunt lacinia.
				</p>
			</div>
		</div>
	</div>
	
<!-- FOOTER -->	
	<footer>
		<div class="container">
			<h1>Pie de pagina - footer</h1>
			<h3>12 columnas</h3>
		</div>
	</footer>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
	
	<style>
			.verde{ color:green !important; }
			.rojo{ color:red !important; }	
	</style>
	
	<script type="text/javascript">
		function mostrarAlerta(){
			$('#msg').addClass('in');
		}
		
		function ocultarAlerta(){
			$('#msg').removeClass('in');
		}
		
		function crearAlerta( tipo ){
			console.debug(' creando alerta del tipo ' + tipo );			
			//obtener el contenedor para los mensajes
			var contentAlertas = $('#mensajes'); 
			//limpiar todo el innerHTML
			contentAlertas.html('');
			//crear alerta
			contentAlertas.html("<div class='alert alert-"+tipo+" alert-dismissible' role='alert'><button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button><strong>"+tipo+"</strong> Better check yourself, you're not looking too good.</div>");
			
			
		}
		
		
		console.debug('Jugando con la API classList');
		var alerta = document.getElementById('msg');
		
		console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
		
		console.debug('toggle con la clase "in" ');
		alerta.classList.toggle('in');
		
		console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
		
		/*
		console.debug('toggle con la clase "in" ');
		alerta.classList.toggle('in');
		console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
		*/
		
		for (i=0; i < alerta.classList.length; i++ ){
			console.debug('posicion ' + i + ' ' + alerta.classList.item(i) );
		}
		
		console.debug ('contiene la clase "pepe" ' + alerta.classList.contains('pepe') );
		console.debug ('contiene la clase "alert" ' + alerta.classList.contains('alert') );
		
		
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
		
		
		//atributo value definiendo una funcion nueva
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
		
			
			alerta.classList.insert('pepe', 2 );	
			console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
		
			
			alerta.classList.add('verde');
			console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
			alerta.classList.insert('rojo',0);
			console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
			alerta.classList.insert('verde',0);
			console.debug( alerta.classList.length + ': ' + alerta.classList.toString() );
			
	</script>
				
				
</body>
</html>

