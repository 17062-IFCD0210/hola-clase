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
  
	
	//codigo para las pestañas
		$('ul.tabs li:first').addClass('active');
		$('.block div').hide();
		$('.block div:first').show();
		$('ul.tabs li').on('click', function() {
			$('ul.tabs li').removeClass('active');
			$(this).addClass('active')
			$('.block div').hide();
			var activeTab = $(this).find('a').attr('href');
			$(activeTab).show();
			return false;
	
		})

		
	/* RESGISTRO USUARIOS control de usuarios existentes */
	
	//seleccionar usuario del formulario
	$("#form_new_user #usuario").blur(function(){
		
		//se ejecuta al perder el foco
		console.info("llamada Ajax");
		
		//Url donde se encuentra el servicio Ajax
		var url =  "ControladorAjaxRegistroUsuario";
		
		$.ajax( url , {
			"type": "get", // usualmente post o get
			"success": function(result) {
				console.info(result);
				$(".msg_delete").remove();
				if ( result.existe ){
					$("#usuario").after("<span class='msg_delete msg_error'>Usuario NO disponible</span>");
				}else{
					$("#usuario").after("<span class='msg_delete msg_success'>Usuario Disponible</span>");
				}	
				
				
			},
			"error": function(result) {
				console.error("Error ajax", result);
			},
			"data": { usuario: $("#usuario").val() ,
				      email : 'elmio@mail.com' },
			"async": true,
		});
		
		
		
		
		
		
	});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		
});