package com.ipartek.formacion.holaclase.poo;

import com.ipartek.formacion.holaclase.poo.bean.Perro;
import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

public class HolaMundo {

	
		public static void main(String[] args) throws PersonaException {
			System.out.println("Hola Mundo");
			
			
			//crear o instanciar objeto
			
			//constructor vacio
			Persona  pepe 	  = new Persona();
			
			//constructor con parametros
			Persona  persona2 = new Persona("Fran de la Jungla",1);
			System.out.println(persona2.toString());
			
			/*
			pepe.nombre="Peperoni";
			pepe.edad=3;
			
			System.out.println("pepe = " + pepe.nombre + " " + pepe.edad );
			*/
			
			pepe.setNombre("Peperoni");
			pepe.setEdad(3);
			System.out.println("pepe = "+pepe.getNombre()+" " +pepe.getEdad());
			System.out.println(pepe.toString());
			
			
			Perro perro1 = new Perro("lagun");
			System.out.println(perro1.toString());
			System.out.println(perro1.ladrar());
			
		}
}
