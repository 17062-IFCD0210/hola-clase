<!doctype html>
<head>

  <base href="<%=request.getContextPath()%>/">
  <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1">
  <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
  <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.2/raphael-min.js"></script>
  <script src="js/morris.js-0.5.1/morris.js"></script>  
  <link rel="stylesheet" href="js/morris.js-0.5.1/morris.css">
  <link rel="stylesheet" href="css/tabla-surf.css">
  
</head>

<body>

<h1>Tabla Previsiones</h1>


<div id="cnt_previsiones" class="grid colABC">
<!-- dias -->
	<div class="cnt_selector">
	<ul>
		<li><a href="#" class="selector">Hoy</a></li>
		<li><a href="#" class="selector">3 Días</a></li>
		<li><a href="#" class="selector">7 Días</a></li>
	</ul>	
	</div>
<!-- horas -->
	<div>
		<div class="cnt_selector bg_blue2">
			<a href="#" class="selector">Todas</a>
			<a href="#" class="selector">3 Horas</a>
			<a href="#" class="selector">5 Horas</a>
		</div>
	</div>
<!-- tabla -->	
	<div >
		<div class="cnt_selector bg_orange">
			<a href="#" class="selector">Tabla</a>
			<a href="#" class="selector">Grafico</a>			
		</div>
	</div>
	
	<div id="tabla"></div>
	
	
</div>

<br><br><hr><br><br>

<div id="grafico"></div>

<script>

	var json_data;
	var graph_data = [];
	const HOUR = 7;
	
	$.getJSON('<%=request.getContextPath()%>/ejemplos/plugins/prevision.json', function(data) {		
		console.info('json cargado con exito');
		
		$.each( data['forecasts'], function( index, value) {			
			if ( undefined != value['forecast'][HOUR] ){					
				graph_data.push( { d: value['day'], s: value['forecast'][HOUR]['swell']['size'] } );
			}	
			
		});
		
		

		Morris.Area({
			  element: 'grafico',
			  data:graph_data,
			  xkey: 'd',
			  ykeys: ['s'],
			  labels: ['Olas'],
			  padding: 10,
			  behaveLikeLine: true,
			  gridEnabled: false,
			  gridLineColor: '#DDD',
			  axes: true,
			  fillOpacity:.1,	    
			  lineColors:['#6EB0C3']
			});
		
		
	});

	
	
	

</script>
</body>
