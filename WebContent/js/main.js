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

var ultimasVisitas = {
		
		selec_contenedor: '#visitas',
		selec_fecha:  '#last_time',	
		json_visita: { "url": undefined,"nombre": undefined,"fecha": undefined	},
		num_visitas: 5, //numero maximo de vistas a guardar
		aVisitas: new Array(),
		
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
			for(i=0;i<this.num_visitas;i++) {
				localStorage.setItem('last'+i, JSON.stringify(this.json_visita));
				this.aVisitas.push(localStorage.getItem('last'+i))
			}
		},
		
		//Muestra la Fecha guardada en localStorage#selec_fecha
		loadFecha: function(){			
			console.debug(' loadFecha');
			$(this.selec_fecha).html( this.json_visita.fecha );
			console.debug(' end:loadFecha');
		},
		
		//Guarda la fecha actual en localStorage#selec_fecha
		saveFecha:function(){
			console.debug(' saveFecha');			
			 var today = new Date();
			 var dd = today.getDate();
			 var mm = today.getMonth()+1; //January is 0!

			 var yyyy = today.getFullYear();
			 if(dd<10){
			      dd='0'+dd
			 } 
			 if(mm<10){
			      mm='0'+mm
			 } 
			 var today = dd+'/'+mm+'/'+yyyy+' ' + today.getHours()+':'+today.getMinutes()+':'+today.getSeconds();
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
			
			for(i=0;i<this.num_visitas;i++) {
				if(this.json_visita.url != url) {
					this.json_visita.url    = url;
					this.json_visita.nombre = nombre;
				}
			}
			
			
			//localStorage.setItem('last', JSON.stringify(json_visita) );
			
			console.debug(' end:saveVisita');	
			
		},
		
		//carga la ultima visita en el listado		
		loadVisita: function(){
			console.debug(' loadVisita');
			
			var visita = undefined;
			if ( this.json_visita != undefined ){
				 
			
				 var li = "<li><a href='"+ this.json_visita.url+"'>"+ this.json_visita.nombre + "</a></li>";
				 for(i=0; i<=this.aVisitas.length;i++) {
					 $(this.selec_contenedor).append( );
				 }
				 $(this.selec_contenedor).append( li );
			}
			console.debug(' end:loadVisita');
		}
		
};

//function ultimasVisitas(){
//	
//	 if (window.sessionStorage && window.localStorage) { 
//			console.info('Almacenamiento local Soportado');
//			
//			//limpiar listado visitas
//			$('#visitas').html('');
//			
//			//cargar pagina visitada
//			if ( localStorage.getItem('last') != undefined ){
//				
//				var pagina = "ultima";
//				
//				//crear elemento de la lista
//				var last = "<li><a href='" + localStorage.getItem('last') + "'>"+pagina+"</a></li>";
//				$('#visitas').append( last );
//				
//			}
//			
//			//guardar ultima pagina visitada
//			localStorage.setItem('last', window.location.href );
//			
//			//pintar todas las LocalStorages
//			var a_keys = Object.keys ( localStorage );
//			
//			for ( i=0; i < a_keys.length; i++ ){
//				console.debug( a_keys[i] + '=>' + localStorage.getItem(a_keys[i]) );
//			}
//			
//			
//		 } else { 
//			 alert('Lo siento, pero tu navegador no acepta almacenamiento local'); 
//		 } 
//		
//}

//Se ejecuta cuando todo el HTML se ha cargado
$(function() {
	
	console.debug('document ready!');	
	$('#select').filterByText($('#textbox'), false);
	
	console.warn ('tinymce deshabilitado');
 	//tinymce.init({selector:'textarea'});
	
	
	ultimasVisitas.init();
	//ultimasVisitas();
 
	
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