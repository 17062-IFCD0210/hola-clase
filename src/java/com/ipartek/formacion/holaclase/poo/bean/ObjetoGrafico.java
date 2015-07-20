package com.ipartek.formacion.holaclase.poo.bean;

public abstract class ObjetoGrafico {

	int x;
	int y;

	
	void moverA(int nuevaX, int nuevaY) {
		System.out.println(" Movido el objeto a la posicion ["+ x +"," + y + "]");
		}

		
		abstract void dibujar();
		
		abstract void redimensionar();
		
		/*
		 abstract class GraphObj
			{
			  int x, y; // La posición central
			  GraphObj(int ix, int iy)
			  { x= ix; y= iy; } // constructor
			  void Move(int dx, int dy)
			  { x+= dx; y+= dy; }
			  abstract void Paint(Graphics g);
			  // Paint es abstracto
			}
		 
		 */
		

}
