/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */

//Se ejecutaría antes de cargar todo el HTML

function llamadaAjax(){
	//Se ejecuta al perder el foco
	console.info("Llamada Ajax");
	var input_usuario = $("#usuario");
	var input_email = $("#email");
	
	//URL donde se encuentra el sevicio Ajax
	var url = "ControladorAjaxRegistroUsuario";


	$.ajax( url , {
		"type": "get", // usualmente post o get
		"success": function(result) {
			console.info(result);
			$(".msg_delete").remove(); //Elimino las que tenga clase .msg_delete
			
			//Si usuario != vacío escribir mensaje
			if( result.usuario != "" ){
				if( result.libre_usuario ){
					input_usuario.after( "<span class='msg_delete msg_success'> Usuario Disponible </span>");
				}else{
					input_usuario.after( "<span class='msg_delete msg_error'> Usuario NO disponible </span>");
				}
			}
			
			//Si email != vacío escribir mensaje
			if( result.email != "" ){
				if( result.libre_email ){
					input_email.after( "<span class='msg_delete msg_success'> Email Disponible </span>");
				}else{
					input_email.after( "<span class='msg_delete msg_error'> Email NO disponible </span>");
				}
			}
			

		},
		"error": function(result) {
			console.error("Error Ajax", result);
		},
		//"data": {usuario: "pepe"}, //usuario es la KEY/CLAVE
		"data": {usuario:input_usuario.val(),
				 email:input_email.val()},
			
			
			//input_usuario: $("#usuario").val(),
			//	 input_email: $("#email").val()}, //usuario e email es la KEY/CLAVE. Le llamo como en css. Usuario debe ser único la página
		"async": true,
		});
	
}



function validar(formulario){
	//Comprobar los datos si están bien introducidos
	
	//si no return false;
	
	//si si
	formulario.submit();
	
}







//Se ejecuta SIEMPRE cuando todo el HTML se ha cargado
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
	});
	
	$("#form_new_user #email").blur(function(){
		llamadaAjax(); //está arriba
	});
	
	$("#form_new_user").submit(function(){
		
		//Lo hemos controlado desde la etiqueta FORM
		
	});
	
	/* SESSION STORAGE Y LOCAL STORAGE compatible con el navegador */
	if (window.sessionStorage && window.localStorage) {
		console.info("Almacenamiento local soportado");
		
		localStorage.setItem('p0','hola');
		
		localStorage.setItem('last', window.location.href);
		
		//pintar todas las localStorages
		var a_keys = Object.keys(localStorage);
		
		for (i=0; i<a_keys.length; i++){
			console.debug( a_keys[i] + '=>'+ localStorage.getItem(a_keys[i]));
		}
		
		
		sessionStorage.setItem('ps0','hola');
		
	} else {
		alert('Lo siento, pero tu navegador no acepta almacenamiento local');
	}
	

}); //end ready