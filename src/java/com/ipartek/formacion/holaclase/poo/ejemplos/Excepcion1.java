package com.ipartek.formacion.holaclase.poo.ejemplos;
	

//Cambia el código para que entre en todos los catch
public class Excepcion1 {
	 

	 // propiedades necesarias
	static int array_corto[] = new int[5];
	 
		public static void main(String args[]){
	 
		 try {
			 System.out.println();
			 System.out.println(".antes de la primera excepcion");
			 array_corto[10] = 10;
			 
			 System.out.println(".no hay primera excepcion");
		 }
		 catch (ArrayIndexOutOfBoundsException e) {
			 // se captura una excepción por intentar acceder a una posición
			 // fuera de los límites del array.
			 System.out.println(".hay una excepcion por acceso incorrecto");
		 } 
		 
		 
		 try {
			System.out.println(".antes de la segunda excepcion");
		 	int b = 0;
		 	int a = 23/b;
		 	System.out.println(".no hay segunda excepcion");
		 } catch (ArithmeticException e) {
		 		// se captura una excepción aritmética.
			 	System.out.println(".hay una excepcion por error aritmetico");
		 }

		 finally {
			 // después del try catch...
			 System.out.println(".siempre se ejecuta [finally]");
		 }


	 }
	 

}
