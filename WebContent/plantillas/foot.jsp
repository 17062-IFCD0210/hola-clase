
</div> <!-- <div id="content"> -->

<footer>
		<div id="foot">
			<!-- Copyright -->
			<span class="copy">COPYRIGHT &copy; Ipartek</span>
			
			<!-- Enlaces de paginas estaticas -->
			<ul id="list_paginas" class="clearfix">
				<li><a href="#">Contacto</a></li>
				<li><a href="#">Aviso legal</a></li>
			</ul>
			
			<!-- Enlaces de redes sociales -->
			<ul id="list_rrss" class="clearfix">
				<li class="facebook">
					<a href="http://www.facebook.com/#" target="_blank" title="Facebook"></a>
				</li>
				<li class="twitter">
					<a href="http://www.twitter.com/#" target="_blank" title="Twitter"></a>
				</li>
				<li class="youtube">
					<a href="http://www.youtube.com/#" target="_blank" title="YouTube"></a>
				</li>
				<li class="instagram">
					<a href="http://www.instagram.com/#" target="_blank" title="Instagram"></a>
				</li>
			</ul> 
		</div>
		
		<!-- boton para ir hasta la cabecera de la pagina -->
			<nav id="nav_top">
				<a href="<%=request.getRequestURL()%>#container" title="Ir inicio pagina">
					<i class="fa fa-arrow-circle-up fa-4x"></i>
				</a>
			</nav>
		
	</footer>
	
	

</div>	<!-- container -->
 
 <!--  jQuery -->
 <script src="js/jquery-2.1.4.min.js"></script>
 
 <!--  jQuery UI : User Interfaces -->
 <script src="js/jquery-ui-1.11.4.custom/jquery-ui.min.js"></script>
 
 <!--  Convertir todos los TextAreas en TinyMce -->
 <script src="js/tinymce/tinymce.min.js"></script>
  
 <!--  Filter plugin -->
 <script src="js/filter_by_text.js"></script>
 
 <!-- http://responsive-nav.com/ -->
 
 <script src="js/ResponsiveMultiLevelMenu/js/jquery.dlmenu.js" ></script>  
 <script>
			$(function() {
				$( '#dl-menu' ).dlmenu({
					animationClasses : { classin : 'dl-animate-in-2', classout : 'dl-animate-out-2' }
				});
			});
</script>

 
 <!--  Custom JavaScript despues de cargar todas las librerias  -->
 <script src="js/main.js"></script>
 
 <!-- ZeroClipboard -->
 <script type="text/javascript" src="js/zeroclipboard-2.2.0/dist/ZeroClipboard.js">
 ZeroClipboard.config( { swfPath: "js/zeroclipboard-2.2.0/dist/ZeroClipboard.swf" } );
 </script>
 <script src="js/highlight/highlight.pack.js"></script>
 <script>hljs.initHighlightingOnLoad();</script>
 
</body>
</html>
