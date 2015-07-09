package com.ipartek.formacion.holaclase.poo;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class HolaMundo {
	
	public static void main(String[] args) {
		
	System.out.println("Hola Mundo");
		
	//crear una instancia, objeto
	
	//Constructor vacio
	Persona pepe     = new Persona();
	//Constructor con parametros
	Persona persona2 = new Persona("Fran de la Jungla", 78);
	
	//pepe.nombre  = "Pepito";
	//pepe.edad    = 3;
	
	pepe.setNombre("Pepito");
	pepe.setEdad(3);
	
	//System.out.println("pepe = " + pepe.nombre + " " + pepe.edad);
	System.out.println(pepe.getNombre() + " " + pepe.getEdad());
	System.out.println(pepe.toString());
	
	System.out.println(persona2.toString());
	
	}
	
}
