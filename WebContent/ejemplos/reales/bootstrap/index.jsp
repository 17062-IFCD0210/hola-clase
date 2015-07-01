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
  		.alert { visibility: hidden; display: none; }
  	</style>
  </head>
  
  <body>
    <header>
    	<div class="container">
    		<h1>Header</h1>
    	</div>
    </header>

	<!-- Alerts -->
	<div class="alert alert-success alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		Well done! You successfully read this important alert message.
	</div>
	<div class="alert alert-info alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		Heads up! This alert needs your attention, but it's not super important.
	</div>
	<div class="alert alert-warning alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		Warning! Better check yourself, you're not looking too good.
	</div>
	<div class="alert alert-danger alert-dismissible" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		Oh snap! Change a few things up and try submitting again.
	</div>

	<div class="container">
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
				    <div class="item active">
				      <img src="../../../img/technics-q-c-1140-500-9.jpg" alt="Imagen de tv">
				      <div class="carousel-caption">
				        ...
				      </div>
				    </div>
				    
				    <div class="item">
				      <img src="../../../img/city-q-c-1140-500-9.jpg" alt="Imagen de ciudad">
				      <div class="carousel-caption">
				        ...
				      </div>
				    </div>
				    
				    <div class="item">
				      <img src="../../../img/nightlife-q-c-1140-500-5.jpg" alt="Imagen de fiesta">
				      <div class="carousel-caption">
				        ...
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
							
				<!-- Split button -->
				<div class="btn-group">
				  <button type="button" class="btn btn-danger">Alertas</button>
				  <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    <span class="caret"></span>
				    <span class="sr-only">Toggle Dropdown</span>
				  </button>
				  <ul class="dropdown-menu">
				    <li><a href="#" class="btn btn-info"">Info</a></li>
				    <li><a href="#" class="btn btn-warning">Warning</a></li>
				    <li><a href="#" class="btn btn-success">Success</a></li>
				    <li><a href="#" class="btn btn-danger">Error</a></li>
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
  </body>
</html>