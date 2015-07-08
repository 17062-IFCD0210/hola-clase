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
				padding: 0px
			}
		</style>
		<div class="cnt_article clearfix">
			<!-- div sobre el que cargara el mapa de google -->
			<div id="map"></div>
		</div>
		<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
		<script>
			var map;
			var lat;
			var lng;
			var myLatLng;
			var marker;
			
			function show_map(localizacion) {
				lat = localizacion.coords.latitude;
				lng = localizacion.coords.longitude;
				myLatLng = new google.maps.LatLng(lat,lng);
				console.debug('lat: ' + lat);
				console.debug('lng: ' + lng);
				map = new google.maps.Map(
						document.getElementById('map'), {
							zoom : 18,
							center : myLatLng,
							mapTypeId: google.maps.MapTypeId.HYBRID
				});
				
				marker = new google.maps.Marker({
				      position: myLatLng,
				      map: map,
				      title: 'Posicion Actual',
				 });
			}
			
			function geolocalizarme() {
				if (navigator.geolocation) {
					console.debug('Geolocalizando...');
					navigator.geolocation.getCurrentPosition(show_map);
				} else {
					console.error('Geolocalizacion NO Soportado');
				}
			}
			
			google.maps.event.addDomListener(window, 'load', geolocalizarme);
		</script>
		<footer>
			<a href="http://diveintohtml5.info/geolocation.html" alt="Geolocation" target="_blank">Geolocation</a>
		</footer>
	</article>
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>