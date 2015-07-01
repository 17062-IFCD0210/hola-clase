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
			<h1>Header</h1>
			<h3 class="visible-xs-inline visible-sm-inline visible-md-inline visible-lg-inline">12 Columnas</h3>
			<form class="navbar-form navbar-right" role="login">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Usuario">
					<input type="password" class="form-control" placeholder="Password"> 
				</div>
				<button type="submit" class="btn btn-default">Login</button>
			</form>
		</div>
		
	</header>
	<div class="container">
		<section class="main row">
			<article class="col-xs-12 col-sm-8 col-md-9 col-lg-9">
				<h3>Articulo</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">8 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">9 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ullamcorper eros ut sapien 
				gravida, id interdum nulla congue. Nunc eget est mi. Vestibulum tristique non purus eget 
				feugiat. Ut elementum, turpis efficitur dapibus eleifend, justo nulla sollicitudin elit, 
				id mattis nunc sem et dolor. Pellentesque semper turpis vitae eros interdum consectetur. 
				Morbi blandit porta tellus, quis rhoncus metus accumsan eu. Pellentesque pellentesque lacus 
				non est suscipit blandit.</p>
			</article>
			<aside class="col-xs-12 col-sm-4 col-md-3 col-lg-3">
				<h3>Aside</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">4 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Sed a ipsum non metus lacinia ultricies a ut nisi. Aenean sed mauris ligula. Fusce a 
				congue nisl. Sed ex odio, consequat ut dui id, scelerisque viverra justo. Mauris efficitur 
				pretium finibus. Proin ultricies consequat metus. Vestibulum pulvinar neque quis commodo 
				bibendum. Fusce mattis, ligula a feugiat mollis, lectus felis vehicula est, ullamcorper 
				blandit sapien velit nec mauris.</p>
			</aside>
		</section>
		<div class="row">
			<div class="color1 col-xs-12 col-sm-6 col-md-3 col-lg-3">
				<h3>Columna</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">6 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ullamcorper eros ut sapien 
				gravida, id interdum nulla congue. Nunc eget est mi. Vestibulum tristique non purus eget 
				feugiat. Ut elementum, turpis efficitur dapibus eleifend, justo nulla sollicitudin elit, 
				id mattis nunc sem et dolor. Pellentesque semper turpis vitae eros interdum consectetur.
				Morbi blandit porta tellus, quis rhoncus metus accumsan eu. Pellentesque pellentesque 
				lacus non est suscipit blandit.</p>
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
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ullamcorper eros ut sapien 
				gravida, id interdum nulla congue. Nunc eget est mi. Vestibulum tristique non purus eget 
				feugiat. Ut elementum, turpis efficitur dapibus eleifend, justo nulla sollicitudin elit, 
				id mattis nunc sem et dolor. Pellentesque semper turpis vitae eros interdum consectetur.
				Morbi blandit porta tellus, quis rhoncus metus accumsan eu. Pellentesque pellentesque 
				lacus non est suscipit blandit.</p>
			</div>
<!-- 			<div class="clearfix visible-sm-block"></div> -->
			<div class="color1 col-xs-12 col-sm-6 col-md-3 col-lg-3">
				<h3>Columna</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">6 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ullamcorper eros ut sapien 
				gravida, id interdum nulla congue. Nunc eget est mi. Vestibulum tristique non purus eget 
				feugiat. Ut elementum, turpis efficitur dapibus eleifend, justo nulla sollicitudin elit, 
				id mattis nunc sem et dolor. Pellentesque semper turpis vitae eros interdum consectetur.
				Morbi blandit porta tellus, quis rhoncus metus accumsan eu. Pellentesque pellentesque 
				lacus non est suscipit blandit.</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
				<h3>Columna</h3>
				<h4 class="visible-xs-block">12 Columnas</h4>
				<h4 class="visible-sm-block">6 Columnas</h4>
				<h4 class="visible-md-block visible-lg-block">3 Columnas</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ullamcorper eros ut sapien 
				gravida, id interdum nulla congue. Nunc eget est mi. Vestibulum tristique non purus eget 
				feugiat. Ut elementum, turpis efficitur dapibus eleifend, justo nulla sollicitudin elit, 
				id mattis nunc sem et dolor. Pellentesque semper turpis vitae eros interdum consectetur.
				Morbi blandit porta tellus, quis rhoncus metus accumsan eu. Pellentesque pellentesque 
				lacus non est suscipit blandit.</p>
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

</html>