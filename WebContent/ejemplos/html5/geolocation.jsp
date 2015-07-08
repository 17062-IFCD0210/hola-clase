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
			var latitud = 0;
			var longitud = 0;
			var rectangle;
			
			function show_map(localizacion) {
				
				//obtener localizacion
				latitud = localizacion.coords.latitude;
				longitud = localizacion.coords.longitude;
				console.debug('lat: ' + latitud);
				console.debug('lng: ' + longitud);
				
				var myLatLng = new google.maps.LatLng(latitud,longitud);
				
				//inicializar Mapa
				map = new google.maps.Map(document.getElementById('map'), {
				   zoom: 20,
				   center: myLatLng,
				   mapTypeId: google.maps.MapTypeId.SATELLITE
				});
				
				var marker = new google.maps.Marker({
				    map: map,
				    position: myLatLng
				});
				
				// Construct a new InfoWindow.
				var infowindow = new google.maps.InfoWindow({
				    content: 'Google Bilbao'
				});

				// Opens the InfoWindow when marker is clicked.
				marker.addListener('click', function() {
				    infowindow.open(map, marker);
				});

				
				rectangle = new google.maps.Rectangle();
				 
				google.maps.event.addListener(map, 'zoom_changed', function() {

				    // Get the current bounds, which reflect the bounds before the zoom.
				    var rectOptions = {
				      strokeColor: '#00FF00',
				      strokeOpacity: 0.8,
				      strokeWeight: 2,
				      fillColor: '#00FF00',
				      fillOpacity: 0.35,
				      map: map,
				      bounds: map.getBounds()
				    };
				    rectangle.setOptions(rectOptions);
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