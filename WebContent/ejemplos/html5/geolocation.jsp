<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>

	<header>
		<h1>Geolocation</h1>
	</header>
	
	<style>
      #map {
        height: 300px;
        width: 100%;
        margin: 0px;
        padding: 0px;
      }
    </style>
    
	<div class="cnt_article">
		<!-- Div sobre el que se cargará el mapa de google -->
		<div id="map"></div>
	</div>
    
    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
    
    <script>
		var map;
		var lat = 0;
		var lng = 0;
		
		function geolocalizarme(){
			if (navigator.geolocation) {
				console.debug('Geolocalizando...');
				navigator.geolocation.getCurrentPosition(show_map);
			} else {
				console.error('Geolocation NO soportado');
			}
			
			/* Mostrar en Google Maps nuestra localizacion */
			function show_map( localizacion ) {
				// obtener localizacion
				lat = localizacion.coords.latitude;
				lng = localizacion.coords.longitude;
				console.debug('lat: ' + lat);
				console.debug('lng: ' + lng);
				
				// inicializar mapa
				  map = new google.maps.Map(document.getElementById('map'), {
					    zoom: 8,
					    center: {lat: lat, lng: lng}
					  });
			}
		}
		
		google.maps.event.addDomListener(window, 'load', geolocalizarme);
	</script>
	
	<footer>
		<ul>
			<li><a href="http://diveintohtml5.info/geolocation.html">Articulo geolocalizacion</a></li>
			<li><a href="https://developers.google.com/maps/?hl=es">Articulo API Google maps</a></li>
		</ul>
	</footer>
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>