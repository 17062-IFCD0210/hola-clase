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
	        width: 100%;
	        margin: 0px;
	        padding: 0px;
	      }
    	</style>
		
		<div class="cnt_article">
			<!-- DIV sobre el que se cargara el mapa de Google -->
			 <div id="map"></div>

		</div>
		
		<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
		<script>
			var map = 0;
			var lat = 0;
			var lng = 0;
			
			function show_map( localizacion ){
			
			//obtener geolocalizacion
			lat = localizacion.coords.latitude;
			lng = localizacion.coords.longitude;
			console.debug('lat: ' + lat);
			console.debug('lng: ' + lng);
			
			//inicializar mapa
			map = new google.maps.Map(document.getElementById('map'), {
				zoom: 8,
				center: {lat: lat, lng: lng}
				
				  });
			
			
			}
				
		
			function geolocalizarme(){
				
				if (navigator.geolocation){
					console.debug("Geolocalizando...");
					navigator.geolocation.getCurrentPosition(show_map);
					
				}else{
					console.error("Geolocation NO soportado");
				}
			}
			
			google.maps.event.addDomListener(window, 'load', geolocalizarme);
			
			var marker = new google.maps.Marker({
			      position: latlng,
			      map: map,
			      title: 'Hello World!',
			 });
			
				
			</script>
		





	</article>	
	
</section>

<footer>
<ul>
	<li><a href="http://diveintohtml5.info/geolocation.html">Articulo sobre Geolocation</a></li>
	<li><a href="https://developers.google.com/maps/?hl=es">API Google Maps</a></li>
</ul>
</footer>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>
