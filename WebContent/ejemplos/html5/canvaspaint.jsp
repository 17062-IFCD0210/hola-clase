<!DOCTYPE html/>
 <head>
 <!-- http://jsbasico.blogspot.mx/2013/06/animacion-canvas.html -->
  <meta charset="utf-8"/>  
  <style> 
      #canvas {
 border: 1px solid #FF4500;
 -o-border-radius: 10px;
 -moz-border-radius: 10px;
 -ms-border-radius: 10px;
 -webkit-border-radius: 10px;
 border-radius: 10px;
 -o-box-shadow: 4px 5px 6px #FF4500;
 -moz-box-shadow: 4px 5px 6px #FF4500;
 -ms-box-shadow: 4px 5px 6px #FF4500;
 -webkit-box-shadow: 4px 5px 6px #FF4500;
 box-shadow: 4px 5px 6px #FF4500;
 background-color: #ffffff;
      }
  </style>
  <script type="text/javascript">
  if(!window.requestAnimationFrame) {
 window.requestAnimationFrame = window.webkitRequestAnimationFrame || 
        window.mozRequestAnimationFrame ||      
        window.oRequestAnimationFrame || 
        window.msRequestAnimationFrame ||
 function(callback) {
  return window.setTimeout(callback, 1000 / 60);
 }

   }
   function Particula(radius,color){
 radius = (radius || 40);
 color=(color || '#dce23a')
 this.x=0;
 this.y=0;
 this.rotation=0;
 this.scaleX=1;
 this.scaleY=1;
 this.color=color;
 this.radius=radius;
 this.lineWidth=1;
}
Particula.prototype.draw=function(context){
 context.save();
 context.translate(this.x,this.y);
 context.scale(this.scaleX,this.scaleY);
 context.lineWidth=this.lineWidth;
 context.fillStyle=this.color;
 context.beginPath();
 context.arc(0,0,this.radius,0,(Math.PI*2),true);
 context.closePath();
 if(this.lineWidth>0){
  context.stroke();
 }
 context.restore();
}

  </script>
 </head>

 <body>
  <div>
   <header>
    <h1>Animacion Canvas de Una Particula/Senoidal</h1>
   </header>

   <div>
    <canvas id="canvas" width="500" height="500">
     no tienes sooperte para canvas cambia de navegador
    </canvas>
   </div>
   <script type="text/javascript">
window.onload = function() {
  var canvas = document.getElementById('canvas');
  context = canvas.getContext('2d');
  angle = 0;
  var particula = new Particula();
  particula.x = canvas.width / 2;
  particula.y = canvas.height / 2;
 (function drawFrame() {
     window.requestAnimationFrame(drawFrame, canvas);
     context.clearRect(0, 0, canvas.width, canvas.height);
     particula.y = canvas.height / 2 + Math.sin(angle) * 50;
     angle += 0.1;
     particula.draw(context);
  }());
}
   </script>
   <footer>
    <p>
     © Copyright  by @gelhex Nah No tiene copyright :-)
    </p>
   </footer>
  </div>
 </body>
</html>