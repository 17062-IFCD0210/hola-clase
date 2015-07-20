package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {
	
	Cuadrado cu = new Cuadrado();
	private int size;
	
	
		public Cuadrado(){
			super();
			cu.size = 100;
			cu.x = 10;
			cu.y = 10;
			cu.dibujar();
			
		}
	@Override
	void dibujar() {
		System.out.println("Cuadrado dibujado");
		
	}

	@Override
	void redimensionar() {
		System.out.println("Cuadrado redimensionado");
		
	}

	/*
	 / Una caja
		class Box extends GraphObj
		{
		  int height, width;
		  Box(int lx, int ly, int hx, int hy)
		  {
		    super( ... ); // Ejercicio
		    ...
		  }
		  void Paint(Graphics g)
		  {
		    ... // Ejercicio
		  }
		}
	 */
	
}
