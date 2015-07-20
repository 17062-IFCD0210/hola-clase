package com.ipartek.formacion.holaclase.poo.bean;

public class Linea extends ObjetoGrafico {


	@Override
	void dibujar() {
		System.out.println("Linea dibujada");

	}

	@Override
	void redimensionar() {
		System.out.println("Linea redimensionada");
	}
	
	/*
	 class Line extends GraphObj
		{
		  // x e y se heredan
		  int ix, iy;
		  GraphObj(int aix, int aiy,
		           int afx, int afy)
		  {
		    super((aix+afx)/2, (aiy+afy)/2);
		    ix= aix; iy= aiy;
		  }
		  void Paint(Graphics g)
		  { g.DrawLine(xi,yi,x+(x-xi),y+(y-yi)); }
		  // Move se hereda de GraphObj
		}
		
		// Ahora sí!
		Line line= new Line(0,0, 10,20); 
			 
	 * */
	
}

