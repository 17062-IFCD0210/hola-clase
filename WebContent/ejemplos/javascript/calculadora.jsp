<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<section id="calculadora">

	<h1>JavaScript B&aacute;sico</h1>
	<article  class="clearfix">
		<table id="tabla_numeros">
			<tr>
				<th colspan=3><input type="text" value="0" id="resultado" name="resultado"/></th>
			</tr>
			<tr>
				<td><input type="button" value="1" id="btn_1" name="btn_1" onclick="btn_numero(btn_1);"/></td>
				<td><input type="button" value="2" id="btn_2" name="btn_2" onclick="btn_numero(btn_2);"/></td>
				<td><input type="button" value="3" id="btn_3" name="btn_3" onclick="btn_numero(btn_3);"/></td>
			</tr>
			<tr>
				<td><input type="button" value="4" id="btn_4" name="btn_4" onclick="btn_numero(btn_4);"/></td>
				<td><input type="button" value="5" id="btn_5" name="btn_5" onclick="btn_numero(btn_5);"/></td>
				<td><input type="button" value="6" id="btn_6" name="btn_6" onclick="btn_numero(btn_6);"/></td>
			</tr>
			<tr>
				<td><input type="button" value="7" id="btn_7" name="btn_7" onclick="btn_numero(btn_7);"/></td>
				<td><input type="button" value="8" id="btn_8" name="btn_8" onclick="btn_numero(btn_8);"/></td>
				<td><input type="button" value="9" id="btn_9" name="btn_9" onclick="btn_numero(btn_9);"/></td>
			</tr>
			<tr>
				<td><input type="button" value="c" id="btn_c" name="btn_c" onclick="btn_borrar(btn_c);"/></td>
				<td><input type="button" value="0" id="btn_0" name="btn_0" onclick="btn_numero(btn_0);"/></td>
				<td><input type="button" value="=" id="btn_resul" name="btn_resul" onclick="calcular();"/></td>
			</tr>
		</table>
		
		<table id="tabla_operadores">
			<tr>
				<td><input type="button" value="+" id="sumar" name="btn_sumar" onclick="operacion(sumar);"/></td>
				<td><input type="button" value="-" id="restar" name="btn_restar" onclick="operacion(restar);"/></td>
			</tr>
			<tr>
				<td><input type="button" value="/" id="dividir" name="btn_dividir" onclick="operacion(dividir);"/></td>
				<td><input type="button" value="%" id="resto" name="btn_resto" onclick="operacion(resto);"/></td>

			</tr>
			<tr>
				<td><input type="button" value="*" id="multiplicar" name="btn_multiplicar" onclick="operacion(multiplicar);"/></td>
				<td></td>
			</tr>
		</table>
	</article>
	
	<script type="text/javascript">
	
		/**
		 * Recoge el valor del número pulsado y lo muestra en pantalla
		 * @param this pasa como parámetro el propio elemento
		 * @return devuelve el caracter según el botón pulsado 
		 */

			
		const sumar = 1;
		const restar = 2;
		const multiplicar = 3;
		const dividir = 4;
		const resto = 5;
		
		var numero = 0; 
		var oper = 0;
			
		function btn_numero(boton){
			//var boton = btn.getElementById(btn).value;
			
			//Si el 0 se queda a la izda del número quitar
			/*if (btn.value == "btn_0"){
				document.getElementById("resultado").value = boton.value;
			}else{*/
				document.getElementById("resultado").value += boton.value;
				}
			
		function btn_borrar(boton){
			document.getElementById("resultado").value = "";
			numero="";
			oper="";
		}

		function operacion(operador){
			//Guardamos la primera cifra 
			numero = document.getElementById("resultado").value;
			
			//borramos la pantalla
			document.getElementById("resultado").value = 0;
			
			//Guardamos la operación a realizar
			oper = operador;
		}
		
		function calcular(){
			
			switch (oper){
				case sumar:
					document.getElementById("resultado").value = parseInt(numero) + parseInt(document.getElementById("resultado").value);
					break;
				case restar:
					document.getElementById("resultado").value = parseInt(numero) - parseInt(document.getElementById("resultado").value);
					break;
				case multiplicar:
					document.getElementById("resultado").value = parseInt(numero) * parseInt(document.getElementById("resultado").value);
					break;
				case dividir:
					document.getElementById("resultado").value = parseInt(numero) / parseInt(document.getElementById("resultado").value);
					break;
				case resto:
					document.getElementById("resultado").value = parseInt(numero) % parseInt(document.getElementById("resultado").value);
					break;
			}
		}
		
	</script>

</div>

<jsp:include page="../../plantillas/foot.jsp"></jsp:include>