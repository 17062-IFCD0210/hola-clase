<!DOCTYPE html>
<html lang="en">
  <head>
  	<base href="<%=request.getContextPath()%>/">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	 
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <header>
    	<div class= "container">
    		<h1>Header</h1>    		
    	</div>
    	 <!-- Login -->
    	<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
		            <div class="form-group">
		              <input type="text" placeholder="Email" class="form-control">
		            </div>
		            <div class="form-group">
		              <input type="password" placeholder="Password" class="form-control">
		            </div>
		            <button type="submit" class="btn btn-success">Sign in</button>
				</form>
          	</div>
    </header>
		<!-- Mensajes -->
    	<div class="row" id="mensajes"></div>
	    	<div id="msg" class="alert alert-warning alert-dismissible fade" role="alert"> <!-- Fade oculta fade in muestra -->
			  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <strong>Warning!</strong> Better check yourself, you're not looking too good.
			</div>
		
    
   <div class="container">   
   <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		  <!-- Indicadores -->
		  <ol class="carousel-indicators">
		    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
		  </ol>
		 
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		    <div class="item active">
		      <img src="img/abstract1.jpg" alt="abstract1" class="img-responsive adaptar">
		      <div class="carousel-caption">
		          <h3>Imagen Abstracta Naranja</h3>
		      </div>
		    </div>
		    <div class="item">
		      <img src="img/abstract2.jpg" alt="abstract2" class="img-responsive adaptar">
		      <div class="carousel-caption">
		          <h3>Imagen Abstracta Azul</h3>
		      </div>
		    </div>
		    <div class="item">
		      <img src="img/abstract3.jpg" alt="abstract3" class="img-responsive adaptar">
		      <div class="carousel-caption">
		          <h3>Imagen Abstracta Morada</h3>
		      </div>
		    </div>
		  </div>
		 
		  <!-- Controles -->
		  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left"></span>
		  </a>
		  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right"></span>
		  </a>
	</div> <!-- Carousel -->
</div>
	
  
    <div class="container">
    	<section class= "main row">
    		<article class="col-xs-12 col-sm-8 col-md-9 col-lg-9">
    			<p>
    			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
    			Nulla eu lectus pharetra, auctor turpis nec, cursus mi. 
    			Etiam at orci id turpis cursus cursus ultricies quis leo. 
    			Maecenas elementum metus tempus magna gravida, sed gravida massa lacinia. 
    			Nam nec mollis libero. 
    			In hac habitasse platea dictumst. Maecenas vitae tempus ante. 
    			Nunc ornare pretium condimentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    			</p>
    			<hr>
    			
    			<a href="http://lorempixel.com/" class="btn btn-default">Lorem Pixel</a>
    			
    			<!-- MENSAJE DE ALERTA -->
    			
    			<div type="button" class="btn btn-info" onclick="mostrarAlerta();">
    			Mostrar alerta
    			</div>
    			<div type="button" class="btn bt-warning" onclick="ocultarAlerta();">
    			Ocultar Alerta
    			</div>
    						
    			<!-- Botonera/dropdown para mostrar alertas de forma dinamica -->
				<div class="btn-group">
				<button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				   Crear Alerts Din&aacute;micamente <span class="caret"></span>
				    <span class="sr-only">Toggle Dropdown</span>
				  </button>
				  
				  <ul class="dropdown-menu">
				    <li><a href="ejemplos/reales/bootstrap.jsp#" onclick="crearAlerta('info');">INFO</a></li>
				    <li><a href="ejemplos/reales/bootstrap.jsp#" onclick="crearAlerta('success');">SUCCESS</a></li>
				    <li><a href="ejemplos/reales/bootstrap.jsp#" onclick="crearAlerta('warning');">WARNING</a></li>
				    <li><a href="ejemplos/reales/bootstrap.jsp#" onclick="crearAlerta('danger');">ERROR</a></li>
				  </ul>
				  
				</div>												  			
				<hr>
				
				<!-- Progress Bar -->
				
				<p><strong>Progress Bar :</strong></p>
				<div class="progress">
				  <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
				    60%
				  </div>
				</div>
				<hr>
				
				
				<!-- VENTANA MODAL: Botón de apertura -->
				<button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">
				  Ejemplo Ventana Modal
				</button>
				 
				<!-- Ventana Modal -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalLabel">Trasteando con Bootstrap</h4>
				      </div>
				      <div class="modal-body">
				        <p>Si quieres saber mas sobre Bootstrap, entra en <strong>www.getbootsrap.com</strong></p>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
				      </div>
				    </div>
				  </div>
				</div>
				<hr>
				
				    			 		
    		</article>
    		<aside class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
    			<p>
    			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
    			Nulla eu lectus pharetra, auctor turpis nec, cursus mi. 
    			Etiam at orci id turpis cursus cursus ultricies quis leo. 
    			Maecenas elementum metus tempus magna gravida, sed gravida massa lacinia.
    			<div class="list-group">
				  <a class="list-group-item active">
				    Enlaces Interesantes
				  </a>
				  <a href="http://lorempixel.com/" class="list-group-item">Lorem Pixel</a>
				  <a href="http://getbootstrap.com/" class="list-group-item">Bootstrap</a>
				  <a href="http://www.ipartek.com/" class="list-group-item">Ipartek</a>
				  <a href="http://www.w3schools.com/" class="list-group-item">W3Schools</a>
				</div>
    			</p> 	
    		</aside>	
    	</section>
    	<div class="row">
    		<div class="color1 col-xs-12 col-sm-6 col-md-3">
    			<p>
    			<h3>Columna</h3>
    			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
    			Nulla eu lectus pharetra, auctor turpis nec, cursus mi. 
    			Etiam at orci id turpis cursus cursus ultricies quis leo. 
    			Maecenas elementum metus tempus magna gravida, sed gravida massa lacinia. 
    			Nam nec mollis libero. 
    			In hac habitasse platea dictumst. Maecenas vitae tempus ante. 
    			Nunc ornare pretium condimentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    			</p>
    			
    		</div>
    		<div class="col-xs-12 col-sm-6 col-md-3">
    			<p>
    			<h3>Columna</h3>
    			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
    			Nulla eu lectus pharetra, auctor turpis nec, cursus mi. 
    			Etiam at orci id turpis cursus cursus ultricies quis leo. 
    			Maecenas elementum metus tempus magna gravida, sed gravida massa lacinia. 
    			Nam nec mollis libero. 
    			In hac habitasse platea dictumst. Maecenas vitae tempus ante. 
    			Nunc ornare pretium condimentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    			</p>
    		</div>
    		
    		<!-- <div class="clearfix visible-sm-block"></div> -->
    		
    		<div class="color1 col-xs-12 col-sm-6 col-md-3">
    			<p>
    			<h3>Columna</h3>
    			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
    			Nulla eu lectus pharetra, auctor turpis nec, cursus mi. 
    			Etiam at orci id turpis cursus cursus ultricies quis leo. 
    			Maecenas elementum metus tempus magna gravida, sed gravida massa lacinia. 
    			Nam nec mollis libero. 
    			In hac habitasse platea dictumst. Maecenas vitae tempus ante. 
    			Nunc ornare pretium condimentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    			</p>
    		</div>
    		<div class="col-xs-12 col-sm-6 col-md-3">
    			<p>
    			<h3>Columna</h3>
    			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
    			Nulla eu lectus pharetra, auctor turpis nec, cursus mi. 
    			Etiam at orci id turpis cursus cursus ultricies quis leo. 
    			Maecenas elementum metus tempus magna gravida, sed gravida massa lacinia. 
    			Nam nec mollis libero. 
    			In hac habitasse platea dictumst. Maecenas vitae tempus ante. 
    			Nunc ornare pretium condimentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    			</p>
    		</div>
    		
    	</div> <!-- Row -->
    	</div> <!-- Container -->
    	
    	<footer>
    		<div class="container">   		
    		<h3>Footer: larius</h3>
    		
    		<!-- Panel with heading -->
    		<div class="panel panel-default">
				  <div class="panel-heading"><strong>Boostrap</strong></div>
				  <div class="panel-body">
				    Getting Started |
				    CSS |
				    Components |
				    JavaScript |
				    Customize 
				  </div>
				</div>
    		</div>
    		
    	</footer>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		
		<script type="text/javascript">
			function mostrarAlerta(){
				$('#msg').addClass('in');
			}
			function ocultarAlerta(){
				$('#msg').removeClass('in');
			}
			
			function crearAlerta( tipo ){
				console.debug('creando alerta del tipo '+ tipo );
				//obtener el contenedor para los mensajes
				var contentAlerts = $('#mensajes');
				//limpiar todo el innerHTML; el contenedor
				contentAlerts.html('');
				//crear alerta
				contentAlerts.html("<div class='alert alert-"+tipo+" alert-dismissible' role='alert'><button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button><strong>"+tipo+"</strong> Better check yourself, you're not looking too good.</div>");
				
				 
			}
		</script>
		
  </body>
</html>
