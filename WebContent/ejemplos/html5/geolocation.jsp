<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>

	<article>
	
		<header>
			<h1>Geolocation</h1>
		</header>
			
		<style>
	      #map {
	        height: 300px;
	        width:100%;
	        margin: 0px;
	        padding: 0px
	      }
	    </style>	
			
		<div class="cnt_article">
			<!-- Div sobre el que se cargara el mapa de google -->
			<div id="map"></div>
		</div>
		
		
		<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
		<script>
			var map;
			var lat = 0;
			var lng = 0;
			
			function show_map(localizacion) {
				
				//obtener localizacion
				latitud = localizacion.coords.latitude;
				longitud = localizacion.coords.longitude;
				console.debug('lat: ' + latitud);
				console.debug('lng: ' + longitud);
				
				//inicializar Mapa
				map = new google.maps.Map(document.getElementById('map'), {
				   zoom: 8,
				   center: {lat: latitud, lng: longitud}
				});
				
				var marker = new google.maps.Marker({
				    map: map,
				    // Define the place with a location, and a query string.
				    place: {
				      location: {lat: latitud, lng: longitud},
				      query: 'Google, Getxo, Spain'

				    },
				    // Attributions help users find your site again.
				    attribution: {
				      source: 'Google Maps JavaScript API',
				      webUrl: 'https://developers.google.com/maps/'
				    }
				});
				
				// Construct a new InfoWindow.
				var infowindow = new google.maps.InfoWindow({
				    content: 'Google Getxo'
				});

				// Opens the InfoWindow when marker is clicked.
				marker.addListener('click', function() {
				    infowindow.open(map, marker);
				});

			}
			
			function geolocalizarme(){
				
				if ( navigator.geolocation ){
					console.debug('Geolocalizando...');
					navigator.geolocation.getCurrentPosition(show_map);				
				}else{
					console.error('Geolocation NO soportado');
				}
			}	
			
			google.maps.event.addDomListener(window, 'load', geolocalizarme);
			
		</script>
			
		<footer>
			<ul>
				<li><a href="http://diveintohtml5.info/geolocation.html" target="_blank">Articulo sobre Geolocation</a></li>
				<li><a href="https://developers.google.com/maps/documentation/javascript/examples/?hl=es" target="_blank">API Google Maps</a></li>
			</ul>
		</footer>
			
	</article>
	
	
	
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>