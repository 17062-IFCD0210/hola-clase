<!DOCTYPE html>

<html lang="es">

  <head>
  
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

	<!-- HEADER -->
	<header>
		<div class="container fondo_naranja">
				<h1>Cabecera</h1>
		</div>
	</header>
	
	<div class="container"> <!-- Container lo centra -->
		<section class="row" id="mensajes">
		
			<!-- Mensaje de Alerta -->
			<div id="msg_alerta" class="alert alert-warning alert-dismissible hidden fade" role="alert">
		      <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
		      <strong>Hostia!</strong> Ak&iacute; ha pasado algo
		    </div>
		    
	    </section>
	    
		<!-- SLIDER / CARRUSEL -->
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
				      <img src="../../img/elurra.jpg" alt="Elurra">
				      <div class="carousel-caption">
				      	&Eacute;sto es un carrusel
				      </div>
				    </div>
				    <div class="item">
				      <!-- Incluso un carrusel de noticias -->
				      <!-- También el src puede ser una url -->
				      <img src="../../img/lasaitasuna.jpg" alt="Lasaitasuna">
				      <div class="carousel-caption">
				        Ufffffff ...
				      </div>
				    </div>
				    <div class="item">
				      <img src="../../img/ski.jpg" alt="Ski">
				      <div class="carousel-caption">
				        Sssssssh ...
				      </div>
				    </div>
				    <div class="item">
				      <img src="../../img/mendiak.jpg" alt="Mendiak">
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

		<!-- MAIN -->		
		<section class="main row fondo_gris">
		
			<article class="col-sm-12 col-md-8 col-lg-9">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
				
				<div class="tab-content">
				  <div role="tabpanel" class="tab-pane fade in active" id="home_enlaces">...</div>
				  <div role="tabpanel" class="tab-pane fade" id="alertas">...</div>
				  <div role="tabpanel" class="tab-pane fade" id=alertas_dinamicas>...</div>
				  <div role="tabpanel" class="tab-pane fade" id="ventana_modal">...</div>
				</div>
				
				<!-- TABS / FICHAS -->
				<div>
				
				<!-- TODO Falta el login de Bootstrap y el controlador .jsp--> 
				
				  <!-- Nav tabs -->
				  <ul class="nav nav-tabs" role="tablist">
				    <li role="presentation" class="active"><a href="#home_enlaces" aria-controls="enlaces" role="tab" data-toggle="tab">Enlaces</a></li>
				    <li role="presentation"><a href="#alertas" aria-controls="alertas" role="tab" data-toggle="tab">Alertas</a></li>
				    <li role="presentation"><a href="#alertas_dinamicas" aria-controls="alertas_dinamicas" role="tab" data-toggle="tab">Alertas din&aacute;micas</a></li>
				    <li role="presentation"><a href="#ventana_modal" aria-controls="ventana_modal" role="tab" data-toggle="tab">Ventana Modal</a></li>
				  </ul>
				
				 <!-- Tab panes -->
				  <div class="tab-content">
				    <div role="tabpanel" class="tab-pane active" id="home_enlaces">
			    		<!-- Botón Enlace -->
			    		<div>
							<a href="http://www.desnivel.com" class="btn btn-default" role="button">Enlace 1</a>
							<div class="btn btn-default"><a href="http://www.desnivel.com">Enlace 2</a></div>
						</div>
				    </div>
				    
				    <div role="tabpanel" class="tab-pane" id="alertas">
				    	<!-- Alertas -->
						<button class="btn btn-default" type="button" onclick="mostrarAlerta();">Mostrar alerta</button>
						<button class="btn btn-default" type="button" onclick="ocultarAlerta();">Ocultar alerta</button>
					</div>
					
				    <div role="tabpanel" class="tab-pane" id="alertas_dinamicas">
					    <!-- Drop Down para mostrar Alertas de forma dinámica -->
						<div class="btn-group">
						  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						    Action <span class="caret"></span>
						  </button>
						  <ul class="dropdown-menu">
						    <li><a href="#" onclick="crearAlerta('info');">INFO</a></li>
						    <li><a href="#" onclick="crearAlerta('success');">SUCCESS</a></li>
						    <li><a href="#" onclick="crearAlerta('warning');">WARNING</a></li>
						    <!-- <li role="separator" class="divider"></li> Rayita para separar -->
						    <li><a href="#" onclick="crearAlerta('danger');">DANGER</a></li>
						  </ul>
						</div>	
				    </div>
				    
				    <div role="tabpanel" class="tab-pane" id="ventana_modal">
						<!-- Botón Ventana modal -->
						<button type="button" class="btn btn-default btn-lg" data-toggle="modal" data-target="#myModal">
						  	<span class="glyphicon glyphicon-modal-window" aria-hidden="true"></span>
						  	<h6>Ventana Modal</h6>
						</button>
			
						<!-- Ventana Modal -->
						<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
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
					</div>
				  </div>
				
				</div>
				
				<!-- BOTONES -->
				<div class="row">
				
					
				
					
		
					
					
					
					
				</div>
			</article>
			
			<aside class="col-sm-12 col-md-4 col-lg-3 fondo_negro">
				<p>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris quis ultricies nisi. Curabitur lacinia vitae quam vitae laoreet. Sed risus sapien, pellentesque in ullamcorper sed, aliquet id ipsum. Nulla ornare nulla augue, eget bibendum nunc consequat vitae. Suspendisse vel tortor risus. In maximus, nulla ut fringilla molestie, urna lorem consectetur sapien, eu euismod metus arcu eget lorem. In a tortor elementum, feugiat velit non, rhoncus est. Praesent convallis enim sodales malesuada sollicitudin. Suspendisse et aliquet ante, eu porta sapien.
				</p>
			</aside>
		

		</section>

		<!-- NOTICIAS -->
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


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

   	<script type="text/javascript">
		/* Alerta */
		function mostrarAlerta(){
			$("#msg_alerta").addClass('in'); //muestra
			$("#msg_alerta").removeClass('hidden');
		}
		
		function ocultarAlerta(){
			$("#msg_alerta").removeClass('in'); //Si quitamos el in sigue ocupando el espacio para ello usar hidden
			$("#msg_alerta").addClass('hidden'); //quita el espacio que está ocupando
		}
		
		/* Alerta dinámica */
		function crearAlerta(tipo){
			console.debug('creando alerta de tipo' + tipo);
			//obtener el contenedor para los mensajes
			var contentAlertas = $("#mensajes");
			//limpiar el innerHTML
			contentAlertas.html(''); //con jquery.       Y con javascript contentAlertas.innerhtml="";???)
			//crear alerta
			contentAlertas.html("<div class='alert alert-" + tipo + " alert-dismissible' role='alert'><button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button><strong>Warning!</strong> Better check yourself, you're not looking too good.</div>");
			//en la clase alert-warning modificarlo por alert- y el tipo (parametro recibido en la función) 
			//Sustituir las " por ' y cerrarlos con "
		}
		
		/* API classList de JavaScript*/
		console.debug("jugando con API classList de JavaScript");
		var alerta = document.getElementById('msg_alerta');
		
		console.debug(alerta.classList.length + ': ' + console.debug(alerta.classList.toString()) );
		
		console.debug(alerta.classList.length + ' clases tiene');
		console.debug(alerta.classList.toString() );
		
		console.debug('Toggle con la clase "in" ');
		console.debug(alerta.classList.toggle('in'));
		console.debug(alerta.classList.length + ': ' + console.debug(alerta.classList.toString()) );
		
		for (i=0; i< alerta.classList.length; i++){
			console.debug('posicion ' + i + ' ' + alerta.classList.item(i));
		}
		
		console.debug ('contiene la clase "pepe"? '+ alerta.classList.contains('pepe'));
		console.debug ('contiene la clase "alert"? '+ alerta.classList.contains('alert'));
		
		// atributo value definiendo una función nueva
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
		console.debug(alerta.classList.length + ': ' + console.debug(alerta.classList.toString()) );
		
		/* Tabs */
		$('#myTabs a').click(function (e) {
		  e.preventDefault()
		  $(this).tab('show')
		})
		
		/* Ventana Modal */
		$('#myModal').on('shown.bs.modal', function () {
		  $('#myInput').focus()
		})
		

	</script>
	
  </body>
</html>