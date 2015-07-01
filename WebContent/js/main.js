/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */

//Se ejecuta cuando todo el HTML se ha cargado

function llamadaAjax(origen){
	
	//se ejucta al perder el foco
//	console.info("llamada Ajax");
	
	var url = "ControladorAjaxRegistroUsuario";
	
	
	
	if ($(origen).val()!=""){
		
		$.ajax(url, {
			"type": "get",
			"success": function(result) {
				var mensaje = "";
								
					$(origen).css("background-color", "white");
					if (!result.existe){
						$(origen).css("background-color", "red");
						mensaje = "<span class='msg_error msg_delete_"+$(origen).attr('id')+"'>"+result.mensaje+"</span>" 
					}else{
						$(origen).css("background-color", "green");
						mensaje = "<span class='msg_success msg_delete_"+$(origen).attr('id')+"'>"+result.mensaje+"</span>"
					}
					$(".msg_delete_" + $(origen).attr('id')).remove();					
					$(origen).after(mensaje);
			},
			"error": function(result) {
			},
			"data": {val: $(origen).val(),
					 id: $(origen).attr('id')},
			"async": true,
			});
	}else{
		$(origen).css("background-color", "white");
		$(".msg_delete_" + $(origen).attr('id')).remove();
	}
}

function validarEmail(valor) {
	if (valor.value!=""){
		if (/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(valor.value)) {
			$(".msg_delete_" + $(valor).attr('id')).remove();	
			return true;
		} else {
			$(valor).css("background-color", "red");
			mensaje = "<span class='msg_error msg_delete_" + $(valor).attr('id')
					+ "'>El formato de email no es correcto</span>";
			$(".msg_delete_" + $(valor).attr('id')).remove();	
			$(valor).after(mensaje);
			return false;
		}
	}else{
		$(valor).css("background-color", "white");
		$(".msg_delete_" + $(valor).attr('id')).remove();
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
		if (validarEmail(this)){
			llamadaAjax(this);
		};
	});
	$("#form_new_user #repass").blur(function(){
		
		if(($("#pass").val()!="")&&($("#repass").val()!="")){
			$("#pass").css("background-color", "white");
			$(this).css("background-color", "white");
			if ($(this).val()==$("#pass").val()){
				$(this).css("background-color", "green");
				$("#pass").css("background-color", "green");
				mensaje = "<span class='msg_success msg_delete_pass'>El password es valido</span>"
			}else{
				$(this).css("background-color", "red");
				$("#pass").css("background-color", "red");
				mensaje = "<span class='msg_error msg_delete_pass'>Los password no coinciden</span>"
			}
			$(".msg_delete_pass").remove();
			$(this).after(mensaje);
		}else{
			$(".msg_delete_pass").remove();
			$("#pass").css("background-color", "white");
			$(this).css("background-color", "white");
		}
	});
});
