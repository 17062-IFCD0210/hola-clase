<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>
  
<section>
	<h2>JavaScript</h2>

	<article>	
		<header>
			<h1>Introduccion</h1>
		</header>
			
		<div class="cnt_article">
			
			<script>
			
				//declaracion variables globales
				var cantidad1=45;
				var cantidad2=20;
				
				
				
				
				/*
					Funcion para sumar dos paramtros y retornar la suma de ambos
				*/
				function sumar ( parametro1, parametro2 ){
					//sumar de variables y guardar en otra
					var resultado; //undefined
					resultado = parametro1 + parametro2 ;
					return resultado;
					
				}
				
				
				//definir operaciones para la calculadora
				const SUMAR       = 0;
				const RESTAR      = 1;
				const MULTIPLICAR = 2;
				const DIVIDIR     = 3;
				const MODULO      = 4;				
				//operaciones para el parametro1
				const INCREMENTO  = 5;
				const DECREMENTO  = 6;
				const ES_PAR      = 7; //true si es par, false en caso contrario
				
				
						
								
				/**
					Calcula la operacion solicitada para los dos parametros
				*/
				function calculadora ( parametro1, parametro2, operacion ){
				
						var resultado=null;
					
						//realizar operacion solicitada
						if ( operacion == SUMAR ){
							resultado = parametro1 + parametro2;							
						}else if  ( operacion == RESTAR ){
							resultado = parametro1 - parametro2;
						}else if  ( operacion == INCREMENTO ){
							parametro1++;
							resultado = parametro1;	
						}else{
							console.error( operacion + ' operacion no soportada');
						}
						
						
					
						return resultado;
				}
				
				console.info('Calculadora \n');
				
								
				console.info('5+5='   + calculadora(5 , 5, SUMAR)  );
				console.info('10++ ' + calculadora(10, null, INCREMENTO ) );
				console.info('10-67=  ' + calculadora(10, 67,RESTAR) );
				
				console.info('10*10=' + calculadora(10, 67, MULTIPLICAR) );
				
				//llamada a la funcion			
				console.info('El \'resultado\' : \n\t es igual a ' + sumar( 1, 3) );
				
				
				/**
					funci�n para comprobar si una letra es vocal o no
					@param var1: letra a comprobar
					@return: true si es vocal, false en caso contrario
				*/
				function es_vocal(var1) {
					var result = false;
					
					//minusculas var1
					//var1 = var1.toLowerCase();
					
					switch (var1) {
					
						case 'a':						
						case 'e':
						case 'i':							
						case 'o':							
						case 'u':
						case 'A':						
						case 'E':
						case 'I':							
						case 'O':							
						case 'U':	
							result = true;
							break;		
							
						/*	
						sobra default pues que si no es vocal result=false
						default:
						   result = 'no es vocal';
						   break;
						*/	
						
					}//switch
					return result;
				}
				//end: es_vocal
				
				var datos=['a','e','A',13,null,undefined,0.5,'and','n','\u00f1'];
				
 				for (i = 0; i < datos.length; i++) {
 				  console.debug( datos[i]+' es vocal ' + es_vocal(datos[i]) );
 				}
				
				
 			/*****************************************
				CINE DE ALMENDRALEJO (PAG 283)
			******************************************/
			
			
			/**
				Calcula el precio de la entrada del Cine de Almendralejo
				@param dia: Dia de la semana escrito en minusculas, ej: ['lunes','martes',...'domingo'] 
				@param edad: edad de la persona que compra la entrada, formato numero entero
				@return precio en euros, null si 	
			*/			
			function entradas (dia,edad) {
				var precio = null;
				switch (dia) {
					case 'lunes':
						if(edad <= 35){
							precio = 2;
						} else {
							precio = 5;
						}
						break;
					case 'martes':
						if (edad <=25) {
							precio = 2;
						} else if (edad > 25 && edad <= 50) {
							precio = 5;
						} else {
							precio = 7;
						}
						break;
					case 'miercoles':
						if (edad <=18) {
							precio = 3;
						} else if (edad > 18 && edad <= 50) {
							precio = 5;
						} else {
							precio = 8;
						}
						break;
					case 'jueves':
						if (edad <= 18) {
							precio = 5;
						} else {
							precio = 7;
						}
						break;
					case 'viernes':
					case 'sabado':
					case 'domingo':
						precio = 10;
					break;
					
				}//end switch
				
				return precio;
			}
			//end:function entradas (dia,edad)
				
			//testear el lunes
			console.info (' lunes <35 años = 2 € '  + (entradas('lunes',34 ) == 2));
			console.info (' lunes 35  años = 2 € '  + (entradas('lunes',35 ) == 2));
			console.info (' lunes >35 años = 5 € '  + (entradas('lunes',36 ) == 5));
			
			
					
				
				
			
			</script>
			
		</div>
			
		<footer>
			Capitulo 11; pagina 263
		</footer>
			
	</article>
	
	
	
	
	
	
	
</section>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>