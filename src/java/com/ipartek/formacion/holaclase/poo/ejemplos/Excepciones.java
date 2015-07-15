package com.ipartek.formacion.holaclase.poo.ejemplos;

public class Excepciones {

	private void metodoA(){
		
		System.out.println("MetodoA:entra");
		
		try {
			this.metodoB();
		} catch (Exception e) {
			System.out.println("***Excepcion: " + e.getClass() + " capturada en MetodoA****");
		}
		
		System.out.println("MetodoA:sale");
	
	}
	
	private void metodoB() throws Exception{
		
		System.out.println("    MetodoB:entra");
		
		this.metodoC();
		
		System.out.println("    MetodoB:sale");
	
	}
	
	private void metodoC() throws Exception{
		
		System.out.println("        MetodoC:entra");
		
		try {
			
			String crash = null;
			crash.charAt(0);
			System.out.println("            ***No pasara nunca por aqui!!!");
			
		} catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("            ****Excepcion ARRAY****");			
		
		} catch(NullPointerException e){
			
			System.out.println("            ****Excepcion NULL****");
			throw new NullPointerException();
			
		} catch(Exception e){
			
			System.out.println("            ****Excepcion MAS GENERAL****");
//			e.printStackTrace();		//Pinta la traza de la excepcion
		
		} finally {			
			System.out.println("            Se ejecuta siempre");
		}
		
		System.out.println("        MetodoC:sale");		
	
	}
	
	
	/**
	 * Metodo para probar el ejemplo de esta clase
	 * @param args
	 * @throws ExcepcionPersonalizada 
	 */
	public static void main(String[] args){
		
		Excepciones objeto = new Excepciones();
		objeto.metodoA();		
		
		try {
			
			throw new ExcepcionPersonalizada("Lanzando Exception Persnalizada");
		
		} catch (ExcepcionPersonalizada e) {
			System.out.println("Exception capturada");
			System.out.println("Codigo: " + e.getCodigoError());
			System.out.println("Mensaje: " + e.getMessage());
		}
		
	}

}
