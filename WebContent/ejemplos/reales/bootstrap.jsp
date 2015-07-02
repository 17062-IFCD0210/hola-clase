<!DOCTYPE html>
<html lang="es">
<head>
    
    <!-- 
    <base href="<%=request.getContextPath()%>/">
     -->
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
		.adaptar {width:100%; height:400px !important;}
		
	</style>

<!--  HEADER -->
	<header>
		<div class="container">
		
			<div class="navbar-header">
				<h1>Header</h1>

			</div>
	
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
		
		</div>
          	
	</header>

<!--  CONTAINER -->	
	<div class="container">

		<!--  ALERT -->
		<div class="row" id="mensajes">
		
			<!--  la clase alert-dismissible, nos permite cerrar el alert -->			
			<!--  la clase fade in muestra el alert -->
			<!--  la clase fade oculta el alert  -->
			<div id="msg" class="alert alert-warning alert-dismissible fade" role="alert">
		      <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		      	<span aria-hidden="true">X</span>
		      </button>
		      <strong>Holy guacamole!</strong> Best check yo self, you're not looking too good.
		    </div>
		    
		    
		</div>

		<!--  SLIDER -->
		<div id="myCarousel" class="carousel slide row" data-ride="carousel">

			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">

				<div class="item active">
					<img src="../../img/Invierno.jpg" alt="Invierno" class="img-responsive adaptar">
					<div class="carousel-caption">
						<h3>Invierno</h3>
						<p>Lorem ipsum dolor site amet.</p>
					</div>
				</div>
				<div class="item">
					<img src="../../img/PuestaSol.jpg" alt="Pueta de sol" class="img-responsive adaptar">
					<div class="carousel-caption">
						<h3>Puesta de Sol</h3>
						<p>Lorem ipsum dolor site amet.</p>
					</div>
				</div>
				<div class="item">
					<img src="../../img/Nenufares.jpg" alt="Nenufares" class="img-responsive adaptar">
					<div class="carousel-caption">
						<h3>Nenufares</h3>
						<p>Lorem ipsum dolor site amet.</p>
					</div>
				</div>

			</div>
			<!-- Controls -->
  			<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
  				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="icon-prev"></span>
			</a> 
			<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="icon-next"></span>
			</a>
		</div>

		<section class="main row">
			<article class="col-xs-12 col-sm-6 col-md-8 col-lg-9">
				<p>
				<h3>Articulo - Article</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original. 
				</p>
			
			
				<!-- Single button -->
			    <button type="button" class="btn btn-info" onclick="mostrarAlerta();">mostrar alerta</button>
				<button type="button" class="btn btn-warning" onclick="ocultarAlerta();">ocultar alerta</button>
				
				
				
				<!-- Botonera para mostrar alertas de forma dinamica -->
				<div class="btn-group">
				  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				    Crear Alerts dinamicamente <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu">
				    <li><a href="#" onclick="crearAlerta('info');">INFO</a></li>
				    <li><a href="#" onclick="crearAlerta('success');">SUCCESS</a></li>
				    <li><a href="#" onclick="crearAlerta('warning');">WARNING</a></li>
				    <li><a href="#" onclick="crearAlerta('danger');">ERROR</a></li>
				  </ul>
				</div>
				
				
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
				  Launch demo modal
				</button>
				
				<!-- Modal -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
								<h4 class="modal-title" id="myModalLabel">Modal title</h4>
							</div>
							<div class="modal-body">
								...
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								<button type="button" class="btn btn-primary">Save changes</button>
							</div>
						</div>
					</div>
				</div>

			</article>

			<aside class="col-xs-12 col-sm-6 col-md-4 col-lg-3">
				<p>
				<h3>Sidebar - Aside</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original.
				</p>
			</aside>
			
		</section>
		<div class="row">
		
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<p>
				<h3>Columna1</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original.
				</p>
			<!-- 
				<p>
				<h3>?Columna1.2</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original.
				</p>
			-->
				
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<p>
				<h3>Columna2</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original.
				</p>
			</div>
		<!-- 
			<div class="clearfix visible-sm-block"></div>
		-->
			<div class="color1 col-xs-12 col-sm-6 col-md-3 col-md-offset-3">
				<p>
				<h3>Columna3</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original.
				</p>
			</div>
		<!--
			<div class="col-xs-12 col-sm-6 col-md-3">
				<p>
				<h3>Columna4</h3>
				Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estandar de las industrias desde el ae&ntilde;o 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido uso una galeria de textos y los mezclo de tal manera que logro hacer un libro de textos especimen. No solo sobrevivio 500 ae&ntilde;os, sino que tambien ingreso como texto de relleno en documentos electronicos, quedando esencialmente igual al original.
				</p>
			</div>
		-->

		</div>
	</div>
<!--  CONTAINER -->	
	<footer>
		<div class="container">
			<h3>Cristina Martin</h3>
		</div>
	</footer>
	

	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
	<!-- controlar que se vea o no la alerta -->
	<script type="text/javascript">

		function mostrarAlerta(){
			$('#msg').addClass('in');
			
		}
		function ocultarAlerta(){
			$('#msg').removeClass('in');
		
		}

		function crearAlerta( tipo ){
			console.debug('creando alerta del tipo ' + tipo);
			
			//obtener el contenedor
			var contentAlertas = $('#mensajes');
			
			//limpiar todo el innerHTML
			contentAlertas.html('');
			
			//crear alerta
			
			contentAlertas.html("<div id='msg' class='alert alert-"+ tipo +" alert-dismissible fade in' role='alert'><button type='button' class='close' data-dismiss='alert' aria-label='Close'><span aria-hidden='true'>&times;</span></button><strong>Warning!</strong> Better check yourself, you're not looking too good.</div>");
		
		}
		
		console.debug('Probando la API classList');
		var alerta = document.getElementById('msg');
		
		console.debug( alerta.classList.length +      ' --> clases tiene');
		console.debug( alerta.classList.toString() +  ' --> nombres de las clases');
		
		console.debug( 'toggle con la clase "in"');
		alerta.classList.toggle('in');

		console.debug( alerta.classList.length +      ' --> clases tiene');
		console.debug( alerta.classList.toString() +  ' --> nombres de las clases');

		
		console.debug( 'toggle con la clase "in"');
		alerta.classList.toggle('in');

		console.debug( alerta.classList.length +      ' --> clases tiene');
		console.debug( alerta.classList.toString() +  ' --> nombres de las clases');
		
		console.debug( 'probar el metodo item de classList');
		for(i=0; i < alerta.classList.length; i++){
			
			console.debug( 'posicion ' + i + ' : ' + alerta.classList.item(i));
			
		}
		
		console.debug( 'probar el metodo containt la class "pepe" ' + alerta.classList.contains('pepe') );
		console.debug( 'probar el metodo containt la class "alert" ' + alerta.classList.contains('alert') );
		
		//definiendo uan funcion nueva
		
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
		
		
		alerta.classList.insert('pepe',2)
		
		console.debug( alerta.classList.toString() +  ' --> nombres de las clases');

	</script>

</body>
</html>