/**
 *   JavaScript para ejecutar en todas las paginas del proyecto
 *   Se carga en foot.jsp despues de incluir todas las librerias necesarias de JS 	
 */


function llamadaAjax(origen){
	console.info("llamada Ajax");
	var input_usuario=$("#usuario");
	var input_email=$("#email");
	
	//URL donde se encuentra el servicio Ajax (servlet que hemos creado)
	var url = "ControladorAjaxRegistroUsuario";
	
	$.ajax(url, {
		"type": "get", // usualmente post o get
		"success": function(result) {
			console.info("Llego el contenido y no hubo error", result);
			console.info(result);
/*				if ((result)=="OK"){
					console.info("Mostrado OK");
					$("#estado_ok").css("display","inline");
					$("#estado_error").css("display","none");			
				}else{
					$("#estado_ok").css("display","none");
					$("#estado_error").css("display","inline");		
				}
*/

			$(".msg_delete").remove(); // para eliminar los spans creados anteriormente
			//Si usuario != vacio escribir mensaje
			if (result.usuario!="") {
				if (result.libre_usuario){
					input_usuario.after("<span class='msg_delete msg_success'>Usuario disponible</span>");
				}else{
					input_usuario.after("<span class='msg_delete msg_error'>Usuario NO disponible</span>");
				}
			}
			// gestion mensajes email
			if (result.email!="") {
				if (result.libre_email){
					input_email.after("<span class='msg_delete msg_success'>Email disponible</span>");
				}else{
					input_email.after("<span class='msg_delete msg_error'>Email NO disponible</span>");
				}
			}
			
		},
		"error": function(result) {
		console.error("Este callback maneja los errores", result);
		},
		"data": { 	usuario	: input_usuario.val(),
					email	: input_email.val() },
		"async": true,
		});		
} // llamadaAjax

function comprobarPassword(){

	$("#comprobar_pass").remove();
	
	//comprobamos que repass == pass
	if (pass.value==repass.value){
		$("#repass").after("<span id='comprobar_pass' class='msg_success'>Las contraseñas coinciden</span>");
	}else{
		$("#repass").after("<span id='comprobar_pass' class='msg_error'>Las contraseñas NO coinciden</span>");
	}
} // comprobarPassword


function comprobarFormulario(formulario){
	//comprueba si los campos estan vacios
		if(formulario.usuario.value.length==0) return false;
		if(formulario.email.value.length==0) return false;
		if(formulario.pass.value.length==0) return false;
		
	//ver si hay algun span con class="msg_error"
		if ($(".msg_error").size()==0) {
			formulario.submit();
			return true;
		} 
		return false;
		
} // comprobarFormulario 


//http://addyosmani.com/resources/essentialjsdesignpatterns/book/#modulepatternjavascript
var troll = {			 
		nombre: 'PepeGrog',
		apellido:'mokerf',
		
		init:function(nombre){
			this.nombre=nombre;
		},
		saluda: function(){
			console.info('soy un troll y me llamo '+this.nombre);
		}//este al ser el ultimo no lleva coma
	};
/*
var visitas = {
		url:'url',
		titulo:'titulo',
		fecha:'fecha',
		
		init:function(p_url,p_titulo,p_fecha){
			url=p_url;
			titulo=p_titulo;
			fecha=p_fecha;
		}
}
*/

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
		json_visita: { "url": undefined,"nombre": undefined,"fecha": undefined,"hora": undefined	},
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
			//gestion hora ultima visita
			this.saveHora();
			
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
			console.debug(' loadFecha');
			$(this.selec_fecha).html( this.json_visita.fecha + " a las " + this.json_visita.hora );
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
			 var today = dd+'/'+mm+'/'+yyyy;
			//localStorage.setItem('last_time', today );
			this.json_visita.fecha = today;
			console.debug(' end:saveFecha');		
		},
		
	
		//Guarda la hora actual en localStorage#selec_fecha
		saveHora:function(){
			console.debug(' saveHora');			
			 var today = new Date();
			 var hora = today.getHours();
			 var minuto = today.getMinutes();
			 if (minuto<10) minuto='0'+minuto;
			 var segundo = today.getSeconds();
			 if (segundo<10) segundo='0'+segundo;
			 var ahora = hora +':'+ minuto +':'+ segundo;
			this.json_visita.hora = ahora;
			console.debug(' end:saveHora');		
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
				 
			
				 var li = "<li><a href='"+ this.json_visita.url+"'>"+ this.json_visita.nombre + " a las " + this.json_visita.hora + "</a></li>";
				 $(this.selec_contenedor).append( li );
			
			}
			console.debug(' end:loadVisita');
		}
		
};
/*
function ultimas_visitas(){
	
	if (window.sessionStorage && window.localStorage) { 
		var a_visitadas=[''];
		var a_keys=Object.keys(localStorage); //array de keys
		
		console.info('almacenamiento local Soportado');
		//Carga los valores en el array
		for (i=0;i<5;i++){
			a_visitadas[i]=localStorage.getItem(a_keys[i]);		 
		}
		
		//muestra el array en el aside
		for (i=0;i<a_visitadas.length;i++){
			if(a_visitadas[i]!=null){
				paginas=a_visitadas[i].split('/');
				pagina=paginas[paginas.length-1];
				pagina=pagina.substring(0,pagina.lastIndexOf(".")); //para quitar la extension
				if (pagina=='') pagina=paginas[paginas.length-2];
				nodo='<li><a href="'+ a_visitadas[i] +'"</a>'+pagina+'</li>';
				$('#ultimas_visitas').append(nodo);
			}
		}
		 
		//guarda la pagina actual en el array y elimina la mas antigua
		a_visitadas.push(location.href);
		if(a_visitadas.length>5){
			a_visitadas.shift();
		}
		
		//guarda el array en el localStorage
		for(i=0;i<a_visitadas.length;i++){
			localStorage.setItem('v'+i,a_visitadas[i]);
		}
		 
	} else { 
		alert('Lo siento, pero tu navegador no acepta almacenamiento local'); 
	} 			 	
	
}
*/
//Se ejecuta cuando todo el HTML se ha cargado
$(function() {
	
	console.debug('document ready!');	
	troll.init('ander');
	troll.saluda();

	ultimas_visitas();
	

	
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
	
	/* funcionalidad de las pestañas */
	$('ul.tabs li:first').addClass('active');
	$('.block article').hide();
	$('.block article:first').show();
	$('ul.tabs li').on('click',function(event){
		event.preventDefault(); //previene el evento del ancla, ya no funciona como ancla
		$('ul.tabs li').removeClass('active');
		$(this).addClass('active')
		$('.block article').hide();
		var activeTab = $(this).find('a').attr('href');
		$(activeTab).show();
	});
	
	/* inicializacion de highlightjs */
	 $('pre code').each(function(i, block) {
		    hljs.highlightBlock(block);
		  });
 

	/* REGISTRO USUARIOS control de usuarios existentes */

	//seleccionar usuario del formulario
	$("#form_new_user #usuario").blur(function(){
		//se ejecuta al perder el foco
		llamadaAjax();
	});
	
	//seleccionar usuario del formulario
	$("#form_new_user #email").blur(function(){
		llamadaAjax();
	});	
	
	$("#form_new_user #pass").blur(function(){
		comprobarPassword();
	});	
	
	$("#form_new_user #repass").blur(function(){
		comprobarPassword();
	});	


}); // end