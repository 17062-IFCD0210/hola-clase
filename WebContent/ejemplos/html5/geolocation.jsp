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
	        width: 60%;
	        margin: 0px;
	        padding: 0px
	      }
	      
	      #pano{
	        height: 300px; //Altura para que se vea el mapa, sino puede que no se vea
	        width: 40%;
	        margin: 0px;
	        padding: 0px

	      }
	      
	      .infoWindow h1, .infoWindow p{
				margin: 0;
				padding: 0;
				border: 0;
				font-size: 100%;
				font: inherit;
				vertical-align: baseline;	
				color:black;
				background-color:white;      
		  }
	      
	      .infoWindow h1{
	      		font-size: large;
	      		font-weight: bold;
	      		padding_bottom:10px;
	      }
	    </style>					
			
		<div class="cnt_article">
		
			<!--  Div sobre el que se cargara el mapa de google -->
			<div id="map"></div>
			
			<!-- Div sobre el que se cargará el street view -->
			<div id="pano"></div>

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
				    zoom: 11,
				    center: {lat: lat, lng: lng},
				    mapTypeId: google.maps.MapTypeId.SATELLITE
				  });

				//Agregar un marcador
				  var lugar = new google.maps.LatLng(lat,lng);
				  var marker = new google.maps.Marker({
				        position: lugar,
				        title: 'Ipartek',
				        map: map
				  });
				  var mi_casa = new google.maps.LatLng( 43.319731, -2.987762 );
				  marker = new google.maps.Marker({
				        position: mi_casa,
				        title: 'Mi casa',
				        map: map
				  });
				  
				//Marcador en Ipartek
				  var ipartek = new google.maps.LatLng( 43.256435, -2.913502);
				  marker = new google.maps.Marker({
				        position: ipartek,
				        title: 'Ipartek de verdad',
			    	    map: map
			  	});
				  
				  //circulo
				  var circuloOptions={
						strokeColor:'#0000FF',
						strokeOpacity:0.5,
						strokeWeight:2,
						fillColor:'#000000',
						fillOpacity:0.35,
						map:map,
						center:ipartek,
						radius:500
				  }
				  
				  cityCircle=new google.maps.Circle(circuloOptions);
				  
				//Foto de streetview delante de Ipartek
				  var panoramaOptions = {
						position: ipartek,
						pov: {
						      heading:-100,
						      pitch: 1
						}
					};
					var panorama = new google.maps.StreetViewPanorama(document.getElementById('pano'), panoramaOptions);
					map.setStreetView(panorama);
					
					//Prueba de InfoWindow
					var contentString = '<div class="infoWindow">'+
				      '<h1>Ipartek</h1>'+
				      '<p><b>Ipartek</b>, es el centro de formación ' +
				      'donde estamos realizando el curso.'+
				      '</div>';

				  var infowindow = new google.maps.InfoWindow({
				      content: contentString
				  });

				  google.maps.event.addListener(marker, 'click', function() {
					    infowindow.open(map,marker);
					  });

				  

			} // function show_map



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