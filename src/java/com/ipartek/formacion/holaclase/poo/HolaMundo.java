package com.ipartek.formacion.holaclase.poo;

import com.ipartek.formacion.holaclase.poo.bean.Perro;
import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class HolaMundo {

	public static void main(String[] args) {
		//System.out.println("Hola Mundo");
		
		//crear o instanciar objeto
		
		Persona pepe = new Persona();
		Persona persona2 = new Persona( "Frank de la Jungla", 78);

		//pepe.nombre = "Peperoni"
		pepe.setNombre("Peperoni");
		
		//pepe.edad = 3
		pepe.setEdad(3);
		
		//System.out.println ("pepe = "+ pepe.nombre + " " + pepe.edad);
		System.out.println(pepe.getNombre() + " "+ pepe.getEdad());
		System.out.println(pepe.toString());
		
		System.out.println(persona2.getNombre() + " "+ persona2.getEdad());
		System.out.println(persona2.toString());
		
		System.out.println(new Perro("Aska").ladrar());
	}
	
}