/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */

//Se ejecuta cuando todo el HTML se ha cargado
$(function() {
	
	console.debug('document ready!');	
	$('#select').filterByText($('#textbox'), false);

	
	console.warn ('tinymce deshabilitado');
 	//tinymce.init({selector:'textarea'});
 
	
	// asociar a todos los elementos input[data-widget='calendario']
	// el datePicker de Jquery UI	
	$("input[data-widget='calendario']").datepicker();	
	console.info('datePicker habilitado');
    
    // ZeroClipboard
	var client = new ZeroClipboard( document.getElementById("copy-button") );

	client.on( "ready", function( readyEvent ) {
	  // alert( "ZeroClipboard SWF is ready!" );

	client.on( "aftercopy", function( event ) {
	    // `this` === `client`
	    // `event.target` === the element that was clicked
		//	event.target.style.display = "none";
		//	alert("Copied text to clipboard: " + event.data["text/plain"] );
	  } );
	} );
	
	/* funcionalidad de las pestañas */
	$('ul.tabs li:first').addClass('active');
	$('.block article').hide();
	$('.block article:first').show();
	$('ul.tabs li').on('click',function(event){
		event.preventDefault(); //previene el evento del ancla, ya no funciona como ancla
		$('ul.tabs li').removeClass('active');
		$(this).addClass('active')
		$('.block article').hide();
		var activeTab = $(this).find('a').attr('href');
		$(activeTab).show();
	});
	
	/* inicializacion de highlightjs */
	 $('pre code').each(function(i, block) {
		    hljs.highlightBlock(block);
		  });
  });