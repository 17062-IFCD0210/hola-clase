<!doctype html>

<html lang="es">

<head>  
  	<meta charset="utf-8">
  	<base href="<%=request.getContextPath()%>/">
  	
	<title>Layouts</title>
	
	<link rel="stylesheet" type="text/css" href="css/ipartek.css?v=1.0">

	<link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
	<link rel="icon" href="favicon.ico" type="image/x-icon">
	
	<!-- ViewPort imprescindible para RWD -->	
  	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
</head>

<body>
	<div id="header" class="clearfix">
		<div id="logo">
			<img src="img/ipartek.gif" class="img_cent" alt="Ipartek">
		</div>
		<div id="menu">
			<ul class="lista_menu">
				<li><span>Presentacion</span></li>
				<li><span>Acreditaciones</span></li>
				<li><span>Contactanos</span></li>
				<li><span>Localizacion</span></li>
				<li><span>Noticias</span></li>
				<li><span>Empleo</span></li>
			</ul>
		</div>
	</div>
	
	<main class="clearfix">
		<aside id="sidebar1" class="sidebar">
			<ul>
				<li class="gris">Crea tu plan de Formacion</li>
				<li class="gris">Formacion Subvencionada Empresas</li>
				<li class="gris">Consultoria</li>
				<li class="gris">E-Learning</li>
			</ul>
			<img src="img/erkide_home.png" alt="erkide" class="img_cent">
 			<img src="img/aek_home.png" alt="aek" class="img_cent">
		</aside>
		<div id="content" class="clearfix">
			<div id="content_izq" class="partir">
				<div id="caja1" class="rectangulo granate"></div>
				<div id="caja2" class="rectangulo azul"></div>
				<div id="caja3" class="rectangulo naranja mb0"></div>
			</div>
			<div id="content_dch" class="partir mr0">
				<div id="caja4" class="rectangulo cacahuete"></div>
				<div id="caja5" class="cuadrado col_gris"></div>
			</div>
		</div>
		<aside id="sidebar2" class="sidebar mr0">
			<ul>
				<li class="gris">Tienda Online</li>
				<li class="gris">Usuarios Registrados</li>
				<li class="gris">Proximos Cursos</li>
				<li class="gris">Presupuesto Online</li>
				<li class="gris">Campus Virtual</li>
				<li class="gris newsletter">NewsLetter</li>
			</ul>
		</aside>
	</main>
	
	<div id="wrapper_footer">
		<div id="footer">Ipartek 2015</div>
	</div>
</body>

</html>