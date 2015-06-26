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
								
			</style>
		 	
		 	<img data-image="icon" data-value="wind" src="//www.surfsearchspot.com/wp-content/themes/surfSearchSpot/img/icons/wind/calm-orange.svg" scale="0.2">
			<input type="range" name="range_wind" id="range_wind" value="0" min="0" max="5">
			<br>
			
			<a href="http://www.w3schools.com/jquerymobile/tryit.asp?filename=tryjqmob_forms_slider_range">Doble</a>
				<label for="price-min">Price:</label>
		        <input type="range" name="price-min" id="price-min" value="200" min="0" max="1000">
		        <label for="price-max">Price:</label>
		        <input type="range" name="price-max" id="price-max" value="800" min="0" max="1000">
		     
		     
		     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		     <script>
		     	$(function(){
		     		console.info('ready');
		     		console.info();
		     		$( "#range_wind" ).on("input change", function( event ) { 
		     			console.info('parado con valor ' + this.value );
		     		});
		     		//$('[data-value="wind"]')[0].val()
		     		
		     	});
		     </script>
		     
		</div>
			
		<footer></footer>
			
	</article>
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>

