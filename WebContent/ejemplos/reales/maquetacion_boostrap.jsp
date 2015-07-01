<!DOCTYPE html>

<html lang="es">

  <head>
  
	<base href="<%=request.getContextPath()%>/">
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>
    	
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
  </head>
  
  <body>

	<style>
		.fondo_naranja { background-color: orange; }
		.fondo_gris { background-color: grey; }
		.fondo_negro { background-color: black; color: white; }
	</style>

	<header>
		<div class="container fondo_naranja">
				<h1>Cabecera</h1>
		</div>
	</header>
	
	<div class="container">
	
		<section class="row">
		
				<!-- Slider de imágenes, Carousel en el apartado JavaScript de Bootstrap -->
				<div id="carousel" class="carousel slide" data-ride="carousel">
				
				<!-- Indicators -->
				  <ol class="carousel-indicators">
				    <li data-target="#carousel" data-slide-to="0" class="active"></li>
				    <li data-target="#carousel" data-slide-to="1"></li>
				    <li data-target="#carousel" data-slide-to="2"></li>
				  </ol>
				
				  <!-- Wrapper for slides -->
				  <div class="carousel-inner" role="listbox">
				    <div class="item active">
				      <img src="img/elurra.jpg" alt="Elurra">
				      <div class="carousel-caption">
				      	&Eacute;sto es un carrusel
				      </div>
				    </div>
				    <div class="item">
				      <img src="img/lasaitasuna.jpg" alt="Lasaitasuna">
				      <div class="carousel-caption">
				        Ufffffff ...
				      </div>
				    </div>
				    <div class="item">
				      <img src="img/ski.jpg" alt="Ski">
				      <div class="carousel-caption">
				        Sssssssh ...
				      </div>
				    </div>
				    <div class="item">
				      <img src="img/mendiak.jpg" alt="Mendiak">
				      <div class="carousel-caption">
				        Oh ! ...
				      </div>
				    </div>
				  </div>
				
				  <!-- Controls -->
				  <a class="left carousel-control" href="#carousel" role="button" data-slide="prev">
				    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				    <span class="sr-only">Previous</span>
				  </a>
				  <a class="right carousel-control" href="#carousel" role="button" data-slide="next">
				    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				    <span class="sr-only">Next</span>
				  </a>
				</div>
		
		</section>
		
		<section class="row fondo_gris">
		
			<article class="col-sm-12 col-md-8 col-lg-9">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
			</article>
			
			<aside class="col-sm-12 col-md-4 col-lg-3 fondo_negro">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
			</aside>
			
		</section>		
		
		
		<section class="row">	
				<!-- Botón Enlace -->
				<a href="http://www.desnivel.com" class="btn btn-default" role="button">Enlace</a>
				
				<button class="btn btn-default" type="submit">Button</button>
				<input class="btn btn-default" type="button" value="Input">
				<input class="btn btn-default" type="submit" value="Submit">

				
				<!-- Botón Ventana modal -->
				<button type="button" class="btn btn-default btn-lg" data-toggle="modal" data-target="#myModal">
				  	<span class="glyphicon glyphicon-modal-window" aria-hidden="true"></span>
				  	<h6>Ventana Modal</h6>
				</button>

				<!-- Botón Ventana Modal -->
				<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
				  	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					  <div class="modal-dialog" role="document">
					  	dialog
					    <div class="modal-content">
					    	content
					      <div class="modal-header">
					      	header
					        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
					      </div>
					      <div class="modal-body">
					        Ventana Modal ...      Cierra
					      </div>
					      <div class="modal-footer">
					      	footer
					        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					        <button type="button" class="btn btn-primary">Save changes</button>
					      </div>
					    </div>
					  </div>
					</div>
				</button>
			</section>
		
		<div class="row">
			<div class="col-sm-9 col-md-9 col-lg-3 fondo_negro">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
			</div>
			
			<div class="col-sm-9 col-md-9 col-lg-3 fondo_gris">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
			</div>
		
			<div class="col-sm-9 col-md-9 col-lg-3 fondo_negro">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
			</div>
			
			<div class="col-sm-9 col-md-9 col-lg-3 fondo_gris">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
			</div>
		</div>

	</div> <!-- end container -->

		

	<script type="text/javascript">
	
		/* Ventana Modal */
		$('#myModal').on('shown.bs.modal', function () {
		  $('#myInput').focus()
		})
	
	</script>
	


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  </body>
</html>