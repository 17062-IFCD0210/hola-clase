var last_page = [];

function validar(formulario){
	var resul=false;

	var usuario = formulario.usuario.value;
	var email   = formulario.email.value;
	var pass    = formulario.pass.value;
	var repass  = formulario.repass.value;

	//TODO comprobar que todo es correcto para poder submitar
	if(resul){
		
		if (false){
			return false;
			
		}else{						
			formulario.submit();
		}	
	}
	else return resul;
}				



function comprobarPassWd(){
	
		
	//se ejecuta al perder el foco
	
	console.info("aquí vamos a hacer la llamada a Ajax")
	
	//Comprobar la contraseña, tienes que que iguales pass y repass
	var pass = $("#pass").val();
	var repass   = $("#repass").val();
	
	//Eliminamos los mensajes que añadimos 
	$(".msg_borrar").remove();
	
	if ( pass.length > 0 && repass.length > 0){

		if ( pass == repass ){
			
			$("#repass").after( "<span class='msg_borrar msg_sucecess'>Passwd Correcta</span>" );
			$("#pass").css({ color: "#FFFFFF;", background: "#008000" });
			$("#repass").css({ color: "#FFFFFF;", background: "#008000" });
			
		} else { 

			$("#repass").after( "<span class='msg_borrar msg_error'>La passwd No coincide</span>" );
			$("#pass").css({ color: "#FFFFFF;", background: "#FF0000" });
			$("#repass").css({ color: "#FFFFFF", background: "#FF0000" });
		}
	}
};

function llamadaAjax(){
	
	
	//se ejecuta al perder el foco
	
	console.info("aquí vamos a hacer la llamada a Ajax")
	
	//Url donde se encuentra el servidio Ajax
	var url = "ControladorAjaxRegistroUsuario";
	
	$.ajax( url, {
		"type": "get", // usualmente post o get
		"success": function(result) {
			console.info("Llego el contenido y no hubo error", result);
			//Eliminamos los mensajes que añadimos 
			$(".msg_delete").remove();
			
			if(result.existeUsuario) {
				
				$("#usuario").after( "<span class='msg_delete msg_error'>Usuario NO disponible</span>" );
				$("#usuario").css({ color: "#FFFFFF", background: "#FF0000" });
				
			} else if(result.existeUsuario != null){ 

				$("#usuario").after( "<span class='msg_delete msg_sucecess'>Usuario Disponible</span>" );
				$("#usuario").css({ color: "#FFFFFF;", background: "#008000" });

			}
			if(result.existeEmail) {
				
				$("#email").after( "<span class='msg_delete msg_error'>Email NO disponible</span>" );
				$("#email").css({ color: "#FFFFFF", background: "#FF0000" });
				
			} else if(result.existeEmail != null){ 

				$("#email").after( "<span class='msg_delete msg_sucecess'>Email Disponible</span>" );
				$("#email").css({ color: "#FFFFFF;", background: "#008000" });

			}
			
			/* Lo hacemos en el cliente con javascript

			if(result.passCorrecta) {
				
				$("#repass").after( "<span class='msg_delete msg_sucecess'>Passwd Correcta</span>" );
				$("#pass").css({ color: "#FFFFFF;", background: "#008000" });
				$("#repass").css({ color: "#FFFFFF;", background: "#008000" });
				
			} else if(result.passCorrecta != null){ 

				$("#repass").after( "<span class='msg_delete msg_error'>La passwd No coincide</span>" );
				$("#pass").css({ color: "#FFFFFF;", background: "#FF0000" });
				$("#repass").css({ color: "#FFFFFF", background: "#FF0000" });

			}
			*/

		},
		
		"error": function(result) {
		console.error("Este callback maneja los errores", result);
		},
		"data": { usuario: $("#usuario").val() ,
		          email:   $("#email").val()   },
		"async": true,
	});
};


function ultimasVisitas(){
	
	//Comprobar si soporta el almacenamiento local 
	if (window.sessionStorage && window.localStorage) { 
			console.info('Almacenamiento local Soportado');
			
			//limpiar listado visitas
			//$('#visitas').html('');
			$('#fechaVisita').html('');
			
			//cargar pagina visitada
			/**
			if ( localStorage.getItem('last_page') != undefined ){
				
				var pagina = "Enlace a la ultima pagina visitada";
				
				//crear elemento de la lista
				var last = "<li><a href='" + localStorage.getItem('last_page') + "'>"+pagina+"</a></li>";
				$('#visitas').append( last );
				
			}
			**/
			
			
			//last_page = JSON.parse(localStorage.getItem("last_page"));
			
			last_page.push(window.location.href);
			
			localStorage.setItem("last_page", JSON.stringify(last_page));
			

			//cargar la fecha 
			if ( localStorage.getItem('last_time') != undefined ){
				
				$('#fechaVisita').append( "Ultima Visita: ");
				$('#fechaVisita').append( localStorage.getItem('last_time'));
				
			}
			
			//var last_page =new Array(); 
			//guardar ultima pagina visitada
			//localStorage.setItem('last_page', window.location.href );

			//la fecha de la ultima visita
			var fecha = new Date();
			localStorage.setItem('last_time', fecha.toLocaleString());


			//pintar todas las LocalStorages
			var a_keys = Object.keys ( localStorage );
			
			for ( i=0; i < a_keys.length; i++ ){
				console.debug( a_keys[i] + '=>' + localStorage.getItem(a_keys[i]) );
			}

			//pintar todas las LocalStorages
			var a_keys = Object.keys ( localStorage );
			
			for ( i=0; i < a_keys.length; i++ ){
				console.debug( a_keys[i] + '=>' + localStorage.getItem(a_keys[i]) );
			}
			
			
		 } else { 
			 alert('Lo siento, pero tu navegador no acepta almacenamiento local'); 
		 } 
		
}
/*
 * JavaScript Module Patterm
 * http://addyosmani.com/resources/essentialjsdesignpatterns/book/#modulepatternjavascript
 */
var troll = {
 
    nombre: 'NOMBRE',
    apellido: 'APELLIDO',
    
    init: function ( name , firtName ) {
    	this.nombre = name;
    	this.apellido = firtName;
    },
    saluda: function () {

    	console.info("soy un troll y me llamo " + this.nombre + " " + this.apellido);
    }
};


/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */

//Se ejecuta cuando todo el HTML se ha cargado
$(function() {
	
	//Registrar las ultimas visitas
	
	ultimasVisitas();
	
	//Ejemplo de utilizacion de javascript module patterm
	troll.init("Cristina", "Martin");
	troll.saluda();
	
	
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

	/* REGISTRO USUARIOS control de usuarios existentes */
	//seleccionar usuario del formulario, evento cuando pierde el foco
	$("#form_new_user #usuario").blur(function(){
		
		llamadaAjax();
		
	});

	//Determinar que el email es correcto 
	$("#form_new_user #email").blur(function(){
		
		llamadaAjax();
		
	});

	//Determinar que las contraseñas introducidas son iguales 
	$("#form_new_user #pass").blur(function(){
		
		comprobarPassWd();
		
	});

	//Determinar que las contraseñas introducidas son iguales 
	$("#form_new_user #repass").blur(function(){
		
		comprobarPassWd();
		
	});
	



});