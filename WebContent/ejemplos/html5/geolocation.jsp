<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>

	<article>
	
		<header>
			<h1>Geolocation</h1>
		</header>
			
		<style>
	      #map {
	        height: 300px; //Altura para que se vea el mapa, sino puede que no se vea
	        width: 100%;
	        margin: 0px;
	        padding: 0px
	      }
	    </style>					
			
		<div class="cnt_article">
		
			<!--  Div sobre el que se cargara el mapa de google -->
			<div id="map"></div>


		</div>
		
		<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
		
	   	<script>
			var map;
			var lat=0;
			var lng=0;
			
			function show_map(localizacion) {
				//Obtener localizacion
				lat = localizacion.coords.latitude; 
				lng = localizacion.coords.longitude;
				console.debug('Latitud: '+lat);
				console.debug('Longitud: '+lng);
					
				//Inicializar mapa
				  map = new google.maps.Map(document.getElementById('map'), {
				    zoom: 12,
				    center: {lat: lat, lng: lng},

				  });
			}



			function geolocalizarme(){
				if (navigator.geolocation){
					console.debug('Geolocalizando...');
					navigator.geolocation.getCurrentPosition(show_map);
					
				}else{
					console.error('Geolocation NO soportado');
				}
			}

			google.maps.event.addDomListener(window, 'load', geolocalizarme);
		console.debug('Estamos Geolocalizados');
			
		</script>


			
		<footer>
			<ul>
				<li><a href="http://diveintohtml5.info/geolocation.html" target="_blank">Articulo sobre Geolocation</a></li>
				<li><a href="https://developers.google.com/maps/documentation/javascript/?hl=es" target="_blank">Apis Google Maps</a></li>
			</ul>				
		</footer>
			
	</article>
	
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>