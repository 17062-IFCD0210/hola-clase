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
			var lat  = 0;
			var lng  = 0;
			var zoom = 15;
			
			function show_map(localizacion) {
				
				//obtener localizacion
				lat = localizacion.coords.latitude;
				lng = localizacion.coords.longitude;
				console.debug('lat: ' + lat);
				console.debug('lng: ' + lng);
				var myLatlng = new google.maps.LatLng(lat,lng);
				
				//inicializar Mapa
				map = new google.maps.Map(document.getElementById('map'), {
				   zoom: zoom,
				   center: myLatlng,
				   mapTypeId: google.maps.MapTypeId.SATELLITE
				});
				
				//marcador
				var marker = new google.maps.Marker({
				      position: myLatlng,
				      map: map,
				      title: 'Estas Aqui!'
				  });
				
				
				//circulo
			    var circuloOptions = {
			    	      strokeColor: '#0000FF',
			    	      strokeOpacity: 0.5,
			    	      strokeWeight: 2,
			    	      fillColor: '#0000FF',
			    	      fillOpacity: 0.35,
			    	      map: map,
			    	      center: myLatlng,
			    	      radius: 500 
			    	    };
			   // Add the circle for this city to the map.
			   cityCircle = new google.maps.Circle(circuloOptions);
				
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