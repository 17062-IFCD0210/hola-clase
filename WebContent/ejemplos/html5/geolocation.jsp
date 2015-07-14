<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>


<section>
	<article>
	
		<header>
			<h1>Geolocation</h1>
		</header>
		
		<div class="cnt_article">
			<!-- Div sobre el que se cargará el mapa de google -->
			<div id="mapa"> </div>
		</div>
		
		<style>
      		#mapa {
			    height: 300px; /*Si no le das altura no se vería el objeto se quedaría como una línea*/
			    width: 100%;
			    margin: 0px;
			    padding: 0px;
	      		}
    	</style>
		
		<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
		
		<script>
			//Por orden de ejecución pero se escribe así		
			//1.-
			var map;
			var lat = 0;
			var lng = 0;
			var zoom = 15;
			
			//4.-
			function show_map(localizacion) {
				console.debug('estamos geolocalizados');
				
				//Obtener Geolocalización
				lat = localizacion.coords.latitude;
				lng = localizacion.coords.longitude;
				console.debug('latitud : '+ lat);
				console.debug('longitud : '+ lng);
				var myLatlng = new google.maps.LatLng(lat,lng); //La var con la que trabaja Google Maps
				
				//Inicializar mapa
			  	map = new google.maps.Map(document.getElementById('mapa'), {
			    	zoom: zoom,
			    	center: {lat: lat, lng: lng},
			    	zoomControlOptions: { style: google.maps.ZoomControlStyle.LARGE },
			    	mapTypeId: google.maps.MapTypeId.HYBRID
			  	});
			
			
			//marcador
			var marker = new google.maps.Marker({
			      position: myLatlng,
			      map: map,
			      title: 'Aquí estoy yo'
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
			
			//3.-
			//Geolocalizarme
			function geolocalizarme(){
				if (navigator.geolocation){
					console.debug('Geolocalizando ...');
					navigator.geolocation.getCurrentPosition(show_map);
				}else{
					console.error('Geolocation NO Soportado');
				}
			}

			//2.-
			google.maps.event.addDomListener(window, 'load', geolocalizarme);
			
		</script>
		
	
	</article>
	

</section>


<footer>
	<ul>
		<li><a href="http://diveintohtml5.info/geolocation.html target="_blank"">Art&iacute;culo sobre Geolocalizaci&oacute;n </a></li>
		<li><a href="" target="_blank">API Google Maps</a></li>
	</ul>
</footer>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>