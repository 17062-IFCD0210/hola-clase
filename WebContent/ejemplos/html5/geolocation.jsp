<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<section>

	<article>

		<header>
			<h1>Geolocation</h1>
		</header>

		<div class="cnt_article">

			<div id="map-canvas"></div>
			<div id="pano"></div>
			<div class="clearfix"></div>
		</div>

		<style>
#map-canvas, #pano {
	width: 50%; 
	height : 400px;
	margin: 0px;
	padding: 0px;
	float: left;
}
</style>


		<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&signed_in=true"></script>
		<script type="text/javascript">
			var map;
			var lat;
			var lng;

			function show_map(localizacion) {
				
				lat=localizacion.coords.latitude;
				lng=localizacion.coords.longitude;
				
				var myLatlng = new google.maps.LatLng(lat, lng);
				var mapOptions = {
					zoom : 18,
					mapTypeId: google.maps.MapTypeId.HYBRID,
					center : myLatlng,
					mapTypeControlOptions: {
				        style: google.maps.MapTypeControlStyle.DROPDOWN_MENU,
				        position: google.maps.ControlPosition.BOTTOM_LEFT
				    }
				}
				map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
				
				var panoramaOptions = {
					    position: myLatlng,
					    pov: {
					      heading: 34,
					      pitch: 10
					    }
					  };
				var panorama = new google.maps.StreetViewPanorama(document.getElementById('pano'), panoramaOptions);
				map.setStreetView(panorama);
				

				var marker = new google.maps.Marker({
					position : myLatlng,
					map : map,
					draggable:true,
					animation: google.maps.Animation.DROP,
					title : 'Aqui estamos!'
				});
				google.maps.event.addListener(marker, 'click', toggleBounce);
			}
			
			function toggleBounce() {

				  if (marker.getAnimation() != null) {
				    marker.setAnimation(null);
				  } else {
				    marker.setAnimation(google.maps.Animation.BOUNCE);
				  }
				}

			function geolocalizar(){
				if (navigator.geolocation) {
					console.debug('Geolocalizando...');
					navigator.geolocation.getCurrentPosition(show_map);
				} else {
					console.error('Geolocation NO soportado');
				}
			}
			
			google.maps.event.addDomListener(window, 'load', geolocalizar);
		</script>

		<footer>
			<ul>
				<li><a href="http://diveintohtml5.info/geolocation.html"
					target="_blank">Documentacion Geolocalizacion</a></li>
				<li><a
					href="https://developers.google.com/maps/documentation/javascript/examples/?hl=es"
					target="_blank">API Google Map</a></li>
			</ul>
		</footer>

	</article>
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>