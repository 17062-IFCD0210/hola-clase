<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Prueba bootstrap</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="css/bootstrap-theme.min.css">

<!-- Custom style -->
<link rel="stylesheet" href="css/styles.css">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<header>
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<h1>Header</h1>
				</div>
				<div class="col-md-6">

					<form class="form-inline mt20">
						<div class="form-group form-group-sm">
							<label class="sr-only" for="exampleInputEmail3">Email
								address</label> <input type="email" class="form-control"
								id="exampleInputEmail3" placeholder="Email">
						</div>
						<div class="form-group form-group-sm">
							<label class="sr-only" for="exampleInputPassword3">Password</label>
							<input type="password" class="form-control"
								id="exampleInputPassword3" placeholder="Password">
						</div>
						<div class="checkbox">
							<label> <input type="checkbox"> Remember me
							</label>
						</div>
						<button type="submit" class="btn btn-default btn-sm">Sign in</button>
					</form>
				</div>
			</div>
			

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
						<form class="navbar-form navbar-right" role="search">
							<div class="form-group">
								<div class="input-group">
									<input type="text" class="form-control"	placeholder="Buscando...">
									<span class="input-group-btn">
										<button class="btn btn-default" type="button">
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
									</span>
								</div>
								<!-- /input-group -->

							</div>
						</form>
					</div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>





		</div>
	</header>

	<div class="container">
		<div class="row">
			<div class="alert alert-warning alert-dismissible fade in hidden"
				role="alert" id="alerta">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
				</button>
				<strong>Soy una alert!</strong>
			</div>
		</div>

		<section class="row">
			<div id="carousel-example-generic" class="carousel slide"
				data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img class="img-responsive center-block"
							src="http://lorempixel.com/output/nature-q-c-1100-480-3.jpg"
							alt="...">
						<div class="carousel-caption"></div>
					</div>
					<div class="item">
						<img class="img-responsive center-block"
							src="http://lorempixel.com/output/sports-q-c-1100-480-4.jpg"
							alt="...">
						<div class="carousel-caption"></div>
					</div>
					<div class="item">
						<img class="img-responsive center-block"
							src="http://lorempixel.com/output/nature-q-c-1100-480-5.jpg"
							alt="...">
						<div class="carousel-caption"></div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>

		</section>
		<section class="main row">
			<article class="col-xs-12 col-sm-8 col-md-9">
				<h3>Articulo</h3>
				<h4 class="visible-md visible-lg">Columnas: 9</h4>
				<h4 class="visible-sm">Columnas: 8</h4>
				<h4 class="visible-xs">Columnas: 12</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur sed velit nec est ullamcorper tincidunt a at ipsum. Nulla
					facilisi. Vestibulum congue, lacus et commodo pharetra, nisi sem
					facilisis tellus, dapibus tristique nisl lectus ac augue. Phasellus
					pharetra ante felis, ut sollicitudin leo ultrices in. Suspendisse
					blandit rhoncus ligula a gravida.</p>
				<div class="row">
					<div class="col-md-4">
						<a class="btn btn-primary center-block"
							href="http://www.google.es" role="button">Google</a>
					</div>
					<div class="col-md-4">

						<!-- Button trigger modal -->
						<button type="button" class="btn btn-warning btn-lg center-block"
							data-toggle="modal" data-target="#myModal">Abrir ventana
							modal</button>

						<!-- Modal -->
						<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
							aria-labelledby="myModalLabel">
							<div class="modal-dialog" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
										<h4 class="modal-title" id="myModalLabel">Mi ventana
											modal</h4>
									</div>
									<div class="modal-body">Esto es una ventana modal</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">Cerrar</button>
										<button type="button" class="btn btn-primary">Aceptar</button>
									</div>
								</div>
							</div>
						</div>


					</div>
					<div class="col-md-4">

						<!-- Split button -->
						<div class="btn-group">
							<button type="button" class="btn btn-info">Action</button>
							<button type="button" class="btn btn-info dropdown-toggle"
								data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false">
								<span class="caret"></span> <span class="sr-only">Toggle
									Dropdown</span>
							</button>
							<ul class="dropdown-menu">
								<li><a href="#" onclick="lanzarAlerta('alert-info')">Info</a></li>
								<li><a href="#" onclick="lanzarAlerta('alert-success')">Success</a></li>
								<li><a href="#" onclick="lanzarAlerta('alert-warning')">Warning</a></li>
								<li><a href="#" onclick="lanzarAlerta('alert-danger')">Error</a></li>
							</ul>
						</div>

					</div>
				</div>
			</article>
			<aside class="col-xs-12 col-sm-4 col-md-3">
				<h3>Aside</h3>
				<h4 class="visible-md visible-lg">Columnas: 3</h4>
				<h4 class="visible-sm">Columnas: 4</h4>
				<h4 class="visible-xs">Columnas: 12</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur sed velit nec est ullamcorper tincidunt a at ipsum. Nulla
					facilisi. Vestibulum congue, lacus et commodo pharetra, nisi sem
					facilisis tellus, dapibus tristique nisl lectus ac augue. Phasellus
					pharetra ante felis, ut sollicitudin leo ultrices in. Suspendisse
					blandit rhoncus ligula a gravida.</p>
			</aside>
		</section>
		<div class="row">
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<h3>Columna</h3>
				<h4 class="visible-md visible-lg">Columnas: 3</h4>
				<h4 class="visible-sm">Columnas: 6</h4>
				<h4 class="visible-xs">Columnas: 12</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur sed velit nec est ullamcorper tincidunt a at ipsum. Nulla
					facilisi. Vestibulum congue, lacus et commodo pharetra, nisi sem
					facilisis tellus, dapibus tristique nisl lectus ac augue. Phasellus
					pharetra ante felis, ut sollicitudin leo ultrices in. Suspendisse
					blandit rhoncus ligula a gravida.</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h3>Columna</h3>
				<h4 class="visible-md visible-lg">Columnas: 3</h4>
				<h4 class="visible-sm">Columnas: 6</h4>
				<h4 class="visible-xs">Columnas: 12</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur sed velit nec est ullamcorper tincidunt a at ipsum. Nulla
					facilisi. Vestibulum congue, lacus et commodo pharetra, nisi sem
					facilisis tellus, dapibus tristique nisl lectus ac augue. Phasellus
					pharetra ante felis, ut sollicitudin leo ultrices in. Suspendisse
					blandit rhoncus ligula a gravida.</p>
			</div>
			<div class="color1 col-xs-12 col-sm-6 col-md-3">
				<h3>Columna</h3>
				<h4 class="visible-md visible-lg">Columnas: 3</h4>
				<h4 class="visible-sm">Columnas: 6</h4>
				<h4 class="visible-xs">Columnas: 12</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur sed velit nec est ullamcorper tincidunt a at ipsum. Nulla
					facilisi. Vestibulum congue, lacus et commodo pharetra, nisi sem
					facilisis tellus, dapibus tristique nisl lectus ac augue. Phasellus
					pharetra ante felis, ut sollicitudin leo ultrices in. Suspendisse
					blandit rhoncus ligula a gravida.</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3">
				<h3>Columna</h3>
				<h4 class="visible-md visible-lg">Columnas: 3</h4>
				<h4 class="visible-sm">Columnas: 6</h4>
				<h4 class="visible-xs">Columnas: 12</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur sed velit nec est ullamcorper tincidunt a at ipsum. Nulla
					facilisi. Vestibulum congue, lacus et commodo pharetra, nisi sem
					facilisis tellus, dapibus tristique nisl lectus ac augue. Phasellus
					pharetra ante felis, ut sollicitudin leo ultrices in. Suspendisse
					blandit rhoncus ligula a gravida.</p>
			</div>
		</div>
	</div>
	<footer>
		<div class="container">
			<h1>Footer</h1>
		</div>
	</footer>


	<script>
		function lanzarAlerta(tipo) {
			$("#alerta").removeClass('alert-info');
			$("#alerta").removeClass('alert-success');
			$("#alerta").removeClass('alert-warning');
			$("#alerta").removeClass('alert-danger');
			$("#alerta").removeClass('hidden');
			$("#alerta").addClass(tipo);
		}
	</script>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>