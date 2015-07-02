<!doctype html>

<html lang="es">

<head>
<!-- Metas -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
	<base href="<%=request.getContextPath()%>/">
	
<!-- Titulo Página -->
	<title>Bootstrap Grid</title>

<!-- Estilos -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap.css">

<!-- Icono -->	
	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
  	<link rel="icon" href="favicon.ico" type="image/x-icon">
</head>

<body>
	<header>
		<div class="container">
			<h1 class="container row">Header</h1>
			<div class="row">			
				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<div class="navbar-header">
							<span class="navbar-brand">Header</span>
						</div>
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a href="http://getbootstrap.com/">Bootstrap</a></li>
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">Ejemplos<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="#">Pagina Principal</a></li>
										<li role="separator" class="divider"></li>
										<li><a href="#myModal" data-toggle="modal">Ventana Modal</a></li>
										<li role="separator" class="divider"></li>
										<li><a onclick="mostrarAlerta()">Mostrar Alerta</a></li>
										<li role="separator" class="divider"></li>
										<li><a onclick="ocultarAlerta()">Ocultar Alerta</a></li>
									</ul>
								</li>
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">Alertas<span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="ejemplos/reales/bootstrap_grid.jsp#info" onclick="crearAlerta('info');">Info</a></li>
										<li><a href="ejemplos/reales/bootstrap_grid.jsp#success" onclick="crearAlerta('success');">Success</a></li>
										<li><a href="ejemplos/reales/bootstrap_grid.jsp#warning" onclick="crearAlerta('warning');">Warning</a></li>
										<li><a href="ejemplos/reales/bootstrap_grid.jsp#danger" onclick="crearAlerta('danger');">Danger</a></li>
									</ul>
								</li>
							</ul>
							<form class="navbar-form navbar-right" role="login">
								<div class="form-group">
									<input type="text" class="form-control" placeholder="Usuario">
									<input type="password" class="form-control"
										placeholder="Password">
								</div>
								<button type="submit" class="btn btn-success">Login</button>
							</form>
						</div>
					</div>
				</nav>
			</div>
		</div>
		
	</header>
	<div class="container">
		<div id="alerts" class="row"></div> <!-- Alertas Info... -->
		<!-- Opcion Alerta Mostrar y Ocultar -->
		<div id="msg" class="alert alert-warning alert-dismissible fade in row"
				role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">x</span>
				</button>
				<strong>Holy guacamole!</strong> Best check yo self, you're not
				looking too good.
			</div>
		<div class="row">
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
						<img src="img/lorempixel1.jpg" alt="Imagen 1" class="responsive-image">
						<div class="carousel-caption">Imagen 1</div>
					</div>
					<div class="item">
						<img src="img/lorempixel2.jpg" alt="Imagen 2" class="responsive-image">
						<div class="carousel-caption">Imagen 2</div>
					</div>
					<div class="item">
						<img src="img/lorempixel3.jpg" alt="Imagen 3" class="responsive-image">
						<div class="carousel-caption">Imagen 3</div>
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
		
		<section class="main row">
			<article class="col-xs-12 col-sm-8 col-md-9 col-lg-9">
				<h3>Articulo</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">8 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">9 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut
					ullamcorper eros ut sapien gravida, id interdum nulla congue. Nunc
					eget est mi. Vestibulum tristique non purus eget feugiat. Ut
					elementum, turpis efficitur dapibus eleifend, justo nulla
					sollicitudin elit, id mattis nunc sem et dolor. Pellentesque semper
					turpis vitae eros interdum consectetur. Morbi blandit porta tellus,
					quis rhoncus metus accumsan eu. Pellentesque pellentesque lacus non
					est suscipit blandit.
				</p>
			</article>
			<aside class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
				<h3>Aside</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">4 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Sed a ipsum non metus lacinia ultricies a ut nisi. Aenean sed
					mauris ligula. Fusce a congue nisl. Sed ex odio, consequat ut dui
					id, scelerisque viverra justo. Mauris efficitur pretium finibus.
					Proin ultricies consequat metus. Vestibulum pulvinar neque quis
					commodo bibendum. Fusce mattis, ligula a feugiat mollis, lectus
					felis vehicula est, ullamcorper blandit sapien velit nec mauris.</p>
			</aside>
		</section>
		<div class="row">
			<div class="color1 col-xs-12 col-sm-6 col-md-3 col-lg-3">
				<h3>Columna</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">6 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut
					ullamcorper eros ut sapien gravida, id interdum nulla congue. Nunc
					eget est mi. Vestibulum tristique non purus eget feugiat. Ut
					elementum, turpis efficitur dapibus eleifend, justo nulla
					sollicitudin elit, id mattis nunc sem et dolor. Pellentesque semper
					turpis vitae eros interdum consectetur. Morbi blandit porta tellus,
					quis rhoncus metus accumsan eu. Pellentesque pellentesque lacus non
					est suscipit blandit.</p>
				<!-- 				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ullamcorper eros ut sapien  -->
				<!-- 				gravida, id interdum nulla congue. Nunc eget est mi. Vestibulum tristique non purus eget  -->
				<!-- 				feugiat. Ut elementum, turpis efficitur dapibus eleifend, justo nulla sollicitudin elit,  -->
				<!-- 				id mattis nunc sem et dolor. Pellentesque semper turpis vitae eros interdum consectetur. -->
				<!-- 				Morbi blandit porta tellus, quis rhoncus metus accumsan eu. Pellentesque pellentesque  -->
				<!-- 				lacus non est suscipit blandit.</p> -->
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
				<h3>Columna</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">6 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut
					ullamcorper eros ut sapien gravida, id interdum nulla congue. Nunc
					eget est mi. Vestibulum tristique non purus eget feugiat. Ut
					elementum, turpis efficitur dapibus eleifend, justo nulla
					sollicitudin elit, id mattis nunc sem et dolor. Pellentesque semper
					turpis vitae eros interdum consectetur. Morbi blandit porta tellus,
					quis rhoncus metus accumsan eu. Pellentesque pellentesque lacus non
					est suscipit blandit.</p>
			</div>
			<!-- 			<div class="clearfix visible-sm-block"></div> -->
			<div class="color1 col-xs-12 col-sm-6 col-md-3 col-lg-3">
				<h3>Columna</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">6 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut
					ullamcorper eros ut sapien gravida, id interdum nulla congue. Nunc
					eget est mi. Vestibulum tristique non purus eget feugiat. Ut
					elementum, turpis efficitur dapibus eleifend, justo nulla
					sollicitudin elit, id mattis nunc sem et dolor. Pellentesque semper
					turpis vitae eros interdum consectetur. Morbi blandit porta tellus,
					quis rhoncus metus accumsan eu. Pellentesque pellentesque lacus non
					est suscipit blandit.</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
				<h3>Columna</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">6 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut
					ullamcorper eros ut sapien gravida, id interdum nulla congue. Nunc
					eget est mi. Vestibulum tristique non purus eget feugiat. Ut
					elementum, turpis efficitur dapibus eleifend, justo nulla
					sollicitudin elit, id mattis nunc sem et dolor. Pellentesque semper
					turpis vitae eros interdum consectetur. Morbi blandit porta tellus,
					quis rhoncus metus accumsan eu. Pellentesque pellentesque lacus non
					est suscipit blandit.</p>
			</div>
		</div>
	</div>

	<footer>
		<div class="container">
			<h3>Footer</h3>
			<h4>12 Columnas</h4>
		</div>
	</footer>
</body>

<script src="js/jquery-2.1.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script>
/************OTRA FORMA DE HACER LAS ALERTAS************/
// 	$('.mostrar_info').click(function () {
// 		$('#alerts').html("<div id=\"info\" class=\"alert alert-info alert-dismissible fade in\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">x</span></button>Info Alert</div>")
// 	});
// 	$('.mostrar_suc').click(function () {
// 		$('#alerts').html("<div id=\"success\" class=\"alert alert-success alert-dismissible fade in\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">x</span></button>Success Alert</div>")
// 	});
// 	$('.mostrar_warn').click(function () {
// 		$('#alerts').html("<div id=\"warn\" class=\"alert alert-warning alert-dismissible fade in\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">x</span></button>Warning Alert</div>")
// 	});
// 	$('.mostrar_err').click(function () {
// 		$('#alerts').html("<div id=\"error\" class=\"alert alert-danger alert-dismissible fade in\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">x</span></button>Danger Alert</div>")
// 	});
</script>
<script type="text/javascript">
	function mostrarAlerta() {
		$("#msg").addClass('in');
	}
	
	function ocultarAlerta() {
		$("#msg").removeClass('in');
	}
	
	//Crear Alertas Info, Success...
	function crearAlerta(alert) {
		$('#alerts').html("<div id=\""+alert+"\" class=\"alert alert-"+alert+" alert-dismissible fade in\"><button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">x</span></button>"+alert+" alert</div>")
	}
	
	
	
	
	
	console.debug('Jugando con la API classList');
	var alerta = document.getElementById('msg');
	
	console.debug(alerta.classList.length + ' clases tiene.');
	console.debug(alerta.classList.toString() );
	
	console.debug('toggle con la clase in')
	alerta.classList.toggle('in');
	
	console.debug(alerta.classList.length + ' clases tiene.');
	console.debug(alerta.classList.toString() );
	
	function compruebaCompatibilidad() {
		 if (window.sessionStorage && window.localStorage) { alert('Tu navegador acepta almacenamiento local');
		 } else { alert('Lo siento, pero tu navegador no acepta almacenamiento local'); } }
	
</script>

</html>