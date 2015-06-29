/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */

//Se ejecuta antes de cargar todo el HTML

function llamadaAjax(){
	//Se ejecuta al perder el foco
	console.info("Llamada Ajax");
	var msg = "";
	
	//URL donde se encuentra el sevicio Ajax
	var url = "ControladorAjaxRegistroUsuario";


	$.ajax( url , {
		"type": "get", // usualmente post o get
		"success": function(result) {
			console.info("Llego el contenido y no hubo error", result);
			$(".msg_delete").remove(); //Elimino las que tenga clase .msg_delete
			
			if( result.existe ){
				$("#usuario").after( "<span class='msg_delete msg_error'> Usuario NO disponible </span>");
			} else{
				$("#usuario").after( "<span class='msg_delete msg_success'> Usuario disponible </span>");
			}

		},
		"error": function(result) {
			console.error("Este callback maneja los errores", result);
		},
		//"data": {usuario: "pepe"}, //usuario es la KEY/CLAVE
		"data": {usuario: $("#usuario").val(),
				 email: $("#email").val()}, //usuario e email es la KEY/CLAVE. Le llamo como en css. Usuario debe ser único la página
		"async": true,
		});
	
}



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
	});	
		
		

	/* REGISTRO USUARIOS control de usuarios existentes */

	//Seleccionar usuario del formulario                                                                                                                                                      
	$("#form_new_user #usuario").blur(function(){
		llamadaAjax(); //está arriba

	}); //end ready

});