<jsp:include page="../../plantillas/head.jsp"></jsp:include>
<jsp:include page="../../plantillas/nav.jsp"></jsp:include>

<html>
<head>
   <title>Cabvas Sencillo</title>
<script>
window.onload = function(){
   //Recibimos el elemento canvas
   var elemento = document.getElementById('micanvas');
   //Comprobación sobre si encontramos un elemento
   //y podemos extraer su contexto con getContext(), que indica compatibilidad con canvas
   if (elemento && elemento.getContext) {
      //Accedo al contexto de '2d' de este canvas, necesario para dibujar
      var contexto = elemento.getContext('2d');
      if (contexto) {
         //Si tengo el contexto 2d es que todo ha ido bien y puedo empezar a dibujar en el canvas
         //Comienzo dibujando un rectángulo
         contexto.fillRect(0, 0, 150, 100);
         //cambio el color de estilo de dibujo a rojo
         contexto.fillStyle = '#cc0000';
         //dibujo otro rectángulo
         contexto.fillRect(10, 10, 100, 70);
      }
   }
}

</script>
</head>

<body>

<canvas id="micanvas" width="200" height="100">
Este texto se muestra para los navegadores no compatibles con canvas.
<br>
Por favor, utiliza Firefox, Chrome, Safari u Opera.
</canvas>

</body>
</html>
<jsp:include page="../../plantillas/foot.jsp"></jsp:include>