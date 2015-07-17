package com.ipartek.formacion.holaclase.poo;

//import com.ipartek.formacion.holaclase.poo.bean.*; Mejor no hacer esta práctica por posibles conflictos
import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaExcepcion;

/**
 * @author Curso
 *
 */
/**
 * @author Curso
 *
 */
public class HolaMundo {

	
	
	public static void main(String[] args) throws PersonaExcepcion{
		
		try{
		System.out.println("Hola Mundo");
		
		//Crear o instanciar un objeto
		
		//Constructor vacío
		Persona pepe = new Persona();
		//Constructor con parámetros
		Persona persona2 = new Persona( "Fran de laJungla",1 );
		System.out.println(persona2.toString());
		
		/*Nos saltamos el patrón de encapsulación accediendo a los atributos directamente
		pepe.nombre = "peperoni"; Ahora no funciona al ser atributos públicos
		pepe.edad   = 3; Ahora no funciona al ser atributos públicos
		*/
		
		//pepe.nombre = "peperoni"
		pepe.setNombre("peperoni");
		
		//pepe edad = 3;
		pepe.setEdad(3);
		
		
		//System.out.println("pepe " + pepe.nombre + " " + pepe.edad);
		System.out.println(pepe.toString()); //Insertado mediante Sources -> to String en la clase Persona.java y muestra 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
