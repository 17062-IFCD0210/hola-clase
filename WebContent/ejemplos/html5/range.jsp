<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>

	<h2>Selectores de CSS</h2>

	<article>	
		<header>
			<h1>Selector Adyacentes</h1>
		</header>
			
		<div class="cnt_article">
			
			<style>					
					
				[data-image="icon"] { width: 100px; height: 100px;}
				[data-value="swell"] { fill:#DDD;}				
			</style>
		 	
		 	
		 	<div>
		 		
		 		<img data-image="icon" data-value="swell" class="svg-inject" src="//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/swell/small.svg" />
		 		<img data-image="icon" data-value="swell" class="svg-inject" src="//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/swell/medium.svg" />
		 		<img data-image="icon" data-value="swell" class="svg-inject" src="//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/swell/big.svg" />
		 		<img data-image="icon" data-value="swell" class="svg-inject" src="//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/swell/enormous.svg" />
		 		<img data-image="icon" data-value="swell" class="svg-inject" src="//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/swell/monstrous.svg" />
		 	
		 	</div>
		 	
		 	
		 	<img data-image="icon" data-value="wind" src="//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/wind/calm-orange.svg" scale="0.2">
			<input type="range" name="range_wind" id="range_wind" value="0" min="0" max="3" step="1">
			<br>
			
			<a href="http://www.w3schools.com/jquerymobile/tryit.asp?filename=tryjqmob_forms_slider_range">Doble</a>
				<label for="price-min">Price:</label>
		        <input type="range" name="price-min" id="price-min" value="200" min="0" max="1000">
		        <label for="price-max">Price:</label>
		        <input type="range" name="price-max" id="price-max" value="800" min="0" max="1000">
		     
		     
		    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		     <script src="js/jquery.svginject.js"></script>
		     <script>
		     $(document).ready(function () {
		     		console.info('ready');
		     		
		     		$('.svg-inject').svgInject();
										
					
		     		
		     		var a_wind = [
		     		              	"//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/wind/calm-orange.svg",
		     		              	"//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/wind/loose-orange.svg",
		     		              	"//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/wind/moderate-orange.svg",
		     		             	"//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/wind/cool-orange.svg"
		     		              ]
		     		
		     		var img_wind = $('[data-value="wind"]')[0]; 
		     		$( "#range_wind" ).on("input change", function( event ) { 
		     			console.info('parado con valor ' + this.value );		     			
		     			img_wind.src = a_wind[this.value];
		     			
		     		});
		     		
		     		
		     	});
		     </script>
		     
		</div>
			
		<footer></footer>
			
	</article>
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>

