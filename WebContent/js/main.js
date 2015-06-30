/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */

//Se ejecuta cuando todo el HTML se ha cargado

function llamadaAjax(origen){
	
	//se ejucta al perder el foco
//	console.info("llamada Ajax");
	
	var url = "ControladorAjaxRegistroUsuario";
	$(origen).css("background-color", "white");
	$(".msg_delete").remove();
	if ($(origen).val()!=""){
		
		$.ajax(url, {
			"type": "get",
			"success": function(result) {
				var mensaje = "";
				switch ($(origen).attr('id')){
				
				case 'usuario':
				case 'email':
				
					if (!result.existe){
						$(origen).css("background-color", "red");
						mensaje = "<span class='msg_error msg_delete'>"+result.mensaje+"</span>" 
					}else{
						$(origen).css("background-color", "green");
						mensaje = "<span class='msg_success msg_delete'>"+result.mensaje+"</span>"
					}
										
					$(origen).after(mensaje);
				break;
				
				case 'repass':
				
					if (result.igual){
						$(origen).css("background-color", "green");
						mensaje = "<span class='msg_success msg_delete'>"+result.mensaje+"</span>"
					}else{
						$(origen).css("background-color", "red");
						mensaje = "<span class='msg_error msg_delete'>"+result.mensaje+"</span>"
					}
					$(origen).after(mensaje);
					break;
				default:
				}
	
	//		console.log("Llego el contenido y no hubo error\n", result);
			},
			"error": function(result) {
	//		console.error("Este callback maneja los errores\n", result);
			},
			"data": {val: $(origen).val(),
					 id: $(origen).attr('id'),
					 pass: $(pass).val()},
			"async": true,
			});
	}
}


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
	
/* REGISTRO USUARIOS control de usuarios existentes*/
	

	
	$("#form_new_user #usuario").blur(function(){
		llamadaAjax(this);
	});
	$("#form_new_user #email").blur(function(){
		llamadaAjax(this);
	});
	$("#form_new_user #repass").blur(function(){
		llamadaAjax(this);
	});
});
