/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */

/******REGISTO USUARIOS Control de usuarios existentes*******/
function llamadaAjax() {		
//URL donde se encuentra el servicio AJAX
var url = "ControladorAjaxRegistroUsuario";

$.ajax( url , {
	"type": "get", // usualmente post o get
	"success": function(result) {
		console.info("Llego el contenido y no hubo error", result);
		$(".msg_delete").remove();
		if(result.user != "") {
			if(result.existe){
				$("#usuario").after("<span id=\"non-check\" class=\"msg_delete fa-stack fa-lg c-rojo\"><i class=\"fa fa-circle-o fa-stack-1x\"></i><i class=\"fa fa-times fa-stack-1x\"></i></span>");
			} else {
				$("#usuario").after("<i id=\"check\" class=\"msg_delete fa fa-check-circle-o c-verde\"></i>");
			}
		}
		if(result.mail != "") {
			if(result.existe_mail){
				$("#mail").after("<span id=\"non-check\" class=\"msg_delete fa-stack fa-lg c-rojo\"><i class=\"fa fa-circle-o fa-stack-1x\"></i><i class=\"fa fa-times fa-stack-1x\"></i></span>");
			} else {
				$("#mail").after("<i id=\"check\" class=\"msg_delete fa fa-check-circle-o c-verde\"></i>");
			}
		}
		
		if(result.pass != "" && result.repass != "") {
			if(result.iguales) {
				$("#repass").after("<i id=\"check\" class=\"msg_delete fa fa-check-circle-o c-verde\"></i>");
			} else {
				$("#repass").after("<span id=\"non-check\" class=\"msg_delete fa-stack fa-lg c-rojo\"><i class=\"fa fa-circle-o fa-stack-1x\"></i><i class=\"fa fa-times fa-stack-1x\"></i></span>");
			}
		}
	},
	"error": function(result) {
		console.error("Este callback maneja los errores", result);			},
	"data": {usuario: $("#usuario").val(), mail: $("#mail").val(), pass: $("#pass").val(), repass: $("#repass").val()},
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

	})
	
	
	//Llamada Usuario
	$("#form_new_user #usuario").blur(function() {
		//SE ejecuta la funcion
		llamadaAjax();
	});
	
	//Llamada Mail
	$("#form_new_user #mail").blur(function() {
		//SE ejecuta la funcion
		llamadaAjax();
	});
	
	$("#pass").blur(function() {
		llamadaAjax();
	});
	
	$("#repass").blur(function() {
		llamadaAjax();
	});
	
	
	
		 if (window.sessionStorage && window.localStorage) { 
			 console.info('Almacenamiento local soportado');
			 //localStorage.setItem('p0','hola');
			 //sessionStorage.setItem('p0','hola');
			 
			//Pintar todas las localstorages
			 var a_keys = Object.keys(localStorage);
			 
			 for(i=0;i<a_keys.length;i++) {
				 console.debug(a_keys[i] + ' tiene el valor de ' + localStorage.getItem(a_keys[i]));
			 }
			 
	
		 } else { 
			 console.info('Almacenamiento local NO soportado'); 
		 }
});