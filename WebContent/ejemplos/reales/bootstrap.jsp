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
    </header>
    <br/>
    
    
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
		      <img src="img/abstract1.jpg" alt="...">
		      <div class="carousel-caption">
		          <h3>Caption Text</h3>
		      </div>
		    </div>
		    <div class="item">
		      <img src="img/abstract2.jpg" alt="...">
		      <div class="carousel-caption">
		          <h3>Caption Text</h3>
		      </div>
		    </div>
		    <div class="item">
		      <img src="img/abstract3.jpg" alt="...">
		      <div class="carousel-caption">
		          <h3>Caption Text</h3>
		      </div>
		    </div>
		  </div>
		 
		  <!-- Controls -->
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
    			
    			<a href="http://lorempixel.com/" class="btn btn-default">Lorem Pixel</a>
    			
    			<!-- Botón de apertura -->
				<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">
				  Info
				</button>
				 
				<!-- Ventana Modal -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalLabel">Mi ventana Modal</h4>
				      </div>
				      <div class="modal-body">
				        <p>Aquí puedes poner un <strong>video de YouTube</strong></p>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
				      </div>
				    </div>
				  </div>
				</div>
    			 		
    		</article>
    		<aside class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
    			<p>
    			Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
    			Nulla eu lectus pharetra, auctor turpis nec, cursus mi. 
    			Etiam at orci id turpis cursus cursus ultricies quis leo. 
    			Maecenas elementum metus tempus magna gravida, sed gravida massa lacinia. 
    			Nam nec mollis libero. 
    			In hac habitasse platea dictumst. Maecenas vitae tempus ante. 
    			Nunc ornare pretium condimentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
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
    		<h3>Footer</h3>
    		</div>
    	</footer>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/jquery-2.1.4.min.js"></script>
    <script>
    $('#myModal').modal(options)
    </script>
  </body>
</html>
