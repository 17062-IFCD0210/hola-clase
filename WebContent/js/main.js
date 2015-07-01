/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */


function llamadaAjax(){
	//se ejecuta al perder el foco
	console.info("llamada Ajax");
	var input_usuario = $("#usuario");
	var input_email   = $("#email");
	
	
	//Url donde se encuentra el servicio Ajax
	var url =  "ControladorAjaxRegistroUsuario";
	
	$.ajax( url , {
		"type": "get", // usualmente post o get
		"success": function(result) {
			console.info(result);			
			$(".msg_delete").remove();
			//Si usuario != "" escribir mensaje
			if ( result.usuario != "" ){
				if ( result.libre_usuario ){
					input_usuario.after("<span class='msg_delete msg_success'>Usuario Disponible</span>");
				}else{
					input_usuario.after("<span class='msg_delete msg_error'>Usuario NO disponible</span>");
				}	
			}	
			//gestion mensajes email
			if ( result.email != "" ){
				if ( result.libre_email ){
					input_email.after("<span class='msg_delete msg_success'>Email Disponible</span>");
				}else{
					input_email.after("<span class='msg_delete msg_error'>Email NO disponible</span>");
				}	
			}	
			
		},
		"error": function(result) {
			console.error("Error ajax", result);
		},
		"data": { usuario: input_usuario.val() ,
			      email  : input_email.val() },
		"async": true,
	});
	
}

function validar(formulario){
	var check = $(".msg_success");
	
	if (check.length == 3 ){
		formulario.submit();
	}else{	
		return false;
	}
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
	
		})

		
	/* RESGISTRO USUARIOS control de usuarios existentes */
	
	//seleccionar usuario del formulario
	$("#form_new_user #usuario").blur(function(){		
		llamadaAjax();		
	});
		
	
	$("#form_new_user #email").blur(function(){	
			llamadaAjax();
	});
	
	$("#form_new_user #repass").blur(function(){
		var pass = document.getElementById("pass").value;
		var repass = document.getElementById("repass").value;
		var input_repass  = $("#repass");

		//gestion mensajes email
		$(".msg_pass_delete").remove();
		if ( pass != "" ){
			if ( pass == repass ){
				input_repass.after("<span class='msg_pass_delete msg_success'>Password identicos</span>");
			}else{
				input_repass.after("<span class='msg_pass_delete msg_error'>Password distintos</span>");
			}	
		}			
	});		
		
});//end ready



