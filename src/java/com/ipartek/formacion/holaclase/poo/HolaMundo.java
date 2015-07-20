package com.ipartek.formacion.holaclase.poo;

import com.ipartek.formacion.holaclase.poo.bean.Circulo;
import com.ipartek.formacion.holaclase.poo.bean.Cuadrado;
import com.ipartek.formacion.holaclase.poo.bean.Linea;
import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

public class HolaMundo {

	public static void main(String[] args) throws ExcepcionPersona {
		try {
			
			//System.out.println("Hola Mundo");
			
			//Creamos o instanciamos objeto
			
	//		Persona persona = new Persona();
			
	//		persona.setNombre("Pepe");
	//		persona.setApellido("Gotera");
	//		persona.setAprobado(true);
	//		persona.setEdad(205);
	//		persona.setEmail("aa@aa.com");
	//		persona.setNota((long)-3.2);
			
	//		Persona persona = new Persona("Pepe","Gotera",205,"aa@aa.com",true,(long)5.0);
			
			//Persona persona = new Persona("Fran de la jungla",1);
			
	//		System.out.println("Nombre: " + persona.getNombre());
	//		System.out.println("Apellido: " + persona.getApellido());
	//		System.out.println("Edad: " + persona.getEdad());
	//		System.out.println("Email: " + persona.getEmail());
	//		System.out.print("Aprobado: ");
	//		if(persona.isAprobado()) {
	//			System.out.println("Si");
	//		} else {
	//			System.out.println("No");
	//		}
	//		System.out.println("Nota: " + persona.getNota());
			
			//System.out.println(persona.toString());
			
			Linea lin = new Linea();
			lin.dibujar();
			lin.redimensionar();
			System.out.println(lin.mover(10, 10));
			
			Circulo cir = new Circulo();
			cir.dibujar();
			cir.redimensionar();
			System.out.println(cir.mover(20, 20));
			
			Cuadrado cua = new Cuadrado();
			cua.dibujar();
			cua.redimensionar();
			System.out.println(cua.mover(20, 20));
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
