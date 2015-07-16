package com.ipartek.formacion.holaclase.poo;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class HolaMundo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	try{	
		System.out.println("Hola Mundo");
		//Instanciar o crear objeto
		
		//constructor vacio
		Persona pepe 		= new Persona();
		
		//constructor con parametros
		Persona persona2 	= new Persona( "Fran de la Jungla", 1 );
		System.out.println( persona2.toString() );
		
		
		//pepe.nombre = "Peperoni";
		pepe.setNombre("Peperoni");
		
		//pepe.edad 	= 3;
		pepe.setEdad(3);
		
		//System.out.println( "pepe = "+ pepe.nombre + " " + pepe.edad );
		System.out.println( pepe.toString() );
	}catch ( Exception e){
		e.printStackTrace();
	}	
		
		
	}
}
