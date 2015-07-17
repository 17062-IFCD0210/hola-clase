
package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaExcepcion;

/**
 * Bean para modelar una persona física
 * @author Unai
 *
 */
public class Persona {

	//Constantes
	public static final int EDAD_MINIMA = 18; //Al poner static se podrá acceder al atributo mediante la propia clase (Persona.EDAD_MINIMA)
	public static final int EDAD_MAXIMA = 99;
	
	//Atributos
	private String nombre = "Anónimo"; //Así se puede acceder desde fuera de la clase. Ya no está encapsulado. Debería ser con un getter
	private String apellido;
	private int edad; //Así se puede acceder desde fuera de la clase. Ya no está encapsulado. Debería ser con un getter
	private String email;
	private boolean aprobado;
	private float nota;

	
	//Constructores
	public Persona() {
		super();
		this.nombre   = "Anónimo";
		this.apellido = "Sin Determinar";
		this.edad     = EDAD_MINIMA;
		this.email    = "";
		this.aprobado = false;
		this.nota     = (float)0.0; //hay que castear el valor con el propio long
	}

	/**
	 * Constructor con parámetros
	 * @param nombre Nombre de la Persona
	 * @param edad de la Persona
	 * @throws PersonaExcepcion 
	 */
	public Persona(String nombre, int edad) throws PersonaExcepcion {
		//super(); quitamos la llamada al constructor por defecto y ponemos el nuestro
		this(); //Llamamos al constructor por defecto (Persona) con los atributos inicializados
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	
	public String setNombre(String nombre) {
		this.nombre = nombre;
		return this.nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}

	// Para que luego genere los comentarios como HTML
	/**
	 * Edad comprendida entre 18 y 99, casos:
	 * <ul>
	 *  <li>si es menor que 18 seteamos a 18 </li>
	 *  <li>si es mayor que 99 seteamos a 99 </li>
	 *  <li>Null no existe en un entero si es 0 seteamos a 18 </li>
	 * </ul>
	 * @param edad
	 * @throws PersonaExcepcion 
	 */
	public void setEdad(int edad) throws PersonaExcepcion {

		if (edad < 0){
			this.edad=EDAD_MINIMA;
			throw new PersonaExcepcion(PersonaExcepcion.EXCEPCION_RANGO_NO_VALIDO);
		}else if ( edad < EDAD_MINIMA ){			
				this.edad=EDAD_MINIMA;
				throw new PersonaExcepcion(PersonaExcepcion.MSG_EDAD_MENOR);
			}else if ( edad > EDAD_MAXIMA ){
				this.edad = EDAD_MAXIMA;
				throw new PersonaExcepcion(PersonaExcepcion.MSG_EDAD_MAYOR);
			} else{
				this.edad = edad;
			}
	}

	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}


	public float getNota() {
		return nota;
	}


	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	//Métodos y Utilidades
	
	@Override //Sobreescribe sobre el padre
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", email=" + email + ", aprobado="
				+ aprobado + ", nota=" + nota + "]";
	}
	

	
	
	
}
