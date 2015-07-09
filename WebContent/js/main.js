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

/*
function ultimasVisitas(){
	
	 if (window.sessionStorage && window.localStorage) { 
			console.info('Almacenamiento local Soportado');
			
			//limpiar listado visitas
			$('#visitas').html('');
			
			//cargar pagina visitada
			if ( localStorage.getItem('last') != undefined ){
				
				var pagina = "ultima";
				
				//crear elemento de la lista
				var last = "<li><a href='" + localStorage.getItem('last') + "'>"+pagina+"</a></li>";
				$('#visitas').append( last );
				
			}
			
			//guardar ultima pagina visitada
			localStorage.setItem('last', window.location.href );
			
			//pintar todas las LocalStorages
			var a_keys = Object.keys ( localStorage );
			
			for ( i=0; i < a_keys.length; i++ ){
				console.debug( a_keys[i] + '=>' + localStorage.getItem(a_keys[i]) );
			}
			
			
		 } else { 
			 alert('Lo siento, pero tu navegador no acepta almacenamiento local'); 
		 } 
		
}
*/


//http://addyosmani.com/resources/essentialjsdesignpatterns/book/#modulepatternjavascript
var troll = {
		 
	    nombre: 'PepeGrog',
	    apellido: 'mokerf',
	 
	    init: function( nombre ){
	    	this.nombre = nombre;
	    },
	    saluda: function () {
	      console.info ('soy un Troll y me llamo ' + this.nombre );
	    }// este al ser el ultimi no lleva coma
};


/**
 * Objeto para gestionar las ultimas visitas y fecha
 * 
 *  Necesario tener una maquetacion de este modo:
 *  
 *  <h3>Ultimas Visita <span id="last_time"></span></h3>
 *	<ul id="visitas">			
 *		<li>Sin visitas</li>		
 *	</ul>
 *  
 */
var ultimasVisitas = {
		
		selec_contenedor: '#visitas',
		selec_fecha:  '#last_time',
		json_visita: { "url": undefined,"nombre": undefined,"fecha": undefined	},
		num_visitas: 5, //numero maximo de vistas a guardar
		
		//Inicializa el objeto
		init: function(){
			console.debug('init');
			this.limpiar();
			//recupera datos de LocalStorage
			this.loadStorageData();
			//gestion de ultima pagina visitada
			this.loadVisita();
			this.saveVisita();			
			//gestion fecha ultima visita
			this.loadFecha();
			this.saveFecha();
			//salva datos de LocalStorage
			this.saveStorageData();
			
			console.debug('end:init');
			
		},
		
		//Carga los datos de Storage en el atributo this.json_visita
		loadStorageData: function(){
			
			if ( localStorage.getItem('last') != undefined ){
				 this.json_visita = JSON.parse( localStorage.getItem('last'));
			}	 
			
		},
		
		saveStorageData: function(){
			localStorage.setItem('last', JSON.stringify(this.json_visita));
		},
		
		//Muestra la Fecha guardada en localStorage#selec_fecha
		loadFecha: function(){
			console.debug('loadFecha');
			$(this.selec_fecha).html( localStorage.getItem('last_time') );
		},
		
		//Guarda la fecha actual en localStorage#selec_fecha
		saveFecha:function(){
			console.debug('saveFecha');
			 var today = new Date();
			 var dd = today.getDate();
			 var mm = today.getMonth()+1; //January is 0!
			 var yyyy = today.getFullYear();
			 /*
			 var hh = today.getHours();
			 var min = today.getMinutes();
			 */
			 if(dd<10){
			      dd='0'+dd
			 } 
			 if(mm<10){
			      mm='0'+mm
			 } 
			 var today = dd+'/'+mm+'/'+yyyy+' '+ today.getHours()+':'+today.getMinutes()+':'+today.getSeconds();
			//localStorage.setItem('last_time', today );
			this.json_visita.fecha = today;
			console.debug(' end:saveFecha');		
		},
		
		//limpiar listado de visitas
		limpiar: function (){
			console.debug(' limpiar');		
			$(this.selec_contenedor).html('');
			console.debug(' end:limpiar');		
		},
		
		//salva la ultima visita en localStorage en formato Json
		saveVisita: function(){
			console.debug(' saveVisita');	
			var url    = window.location.href;			
			var nombre = 'home';			
			
			var array_url = url.split("/");
			//si no es mayor uno estamos en la HOME
			if ( array_url.length > 1 ){
				//obtener ultima posicion de la url
				nombre = array_url [(array_url.length-1)];
				if ( nombre == "" ){
					nombre = 'home';		
				}else{
					//limpiar .jsp
					nombre = nombre.replace(".jsp","");
				}	
			}
			
			/*
			this.json_visita = {
									"url": url,
									"nombre": nombre
							   };
			*/
			
			
			this.json_visita.url    = url;
			this.json_visita.nombre = nombre;
			
			//localStorage.setItem('last', JSON.stringify(json_visita) );
			
			console.debug(' end:saveVisita');	
			
		},
		
		
		//carga la ultima visita en el listado		
		loadVisita: function(){
			console.debug(' loadVisita');
			
			var visita = undefined;
			if ( this.json_visita != undefined ){
				 
			
				 var li = "<li><a href='"+ this.json_visita.url+"'>"+ this.json_visita.nombre + "</a></li>";
				 $(this.selec_contenedor).append( li );
			
			}
			console.debug(' end:loadVisita');
		}
		
};



//Se ejecuta cuando todo el HTML se ha cargado
$(function() {
	
	troll.init('ander');
	troll.saluda();
	
	
	//ultimasVisitas();
	ultimasVisitas.init();
	
	
	
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