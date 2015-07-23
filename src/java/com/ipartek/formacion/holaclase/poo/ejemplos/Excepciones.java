package com.ipartek.formacion.holaclase.poo.ejemplos;

public class Excepciones {
	
	private void metodoA() {
		System.out.println("Metodo A:entra");
		this.metodoB();
		System.out.println("Metodo A:sale");
	}
	
	private void metodoB(){
		System.out.println("    Metodo B:entra");
		this.metodoC();
		System.out.println("    Metodo B:sale");
	}
	
	private void metodoC(){
		System.out.println("        Metodo C:entra");
		try{
			String pete = null;
			pete.charAt(0);
			System.out.println("****No pasara nunca por aqui****");
		} catch (NullPointerException e) {
			System.out.println("EXCEPCION NULL");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("EXCEPCION ARRAY");
		} catch(Exception e) {
			System.out.println("Excepcion basica de java");
			//e.printStackTrace();
		} finally {
			System.out.println("Se ejecuta siempre");
		}
		
		System.out.println("        Metodo C:sale");
	}

	/**
	 * Metodo para probar el ejemplo de esta clase
	 * @param args
	 * @throws ExcepcionPersonalizada
	 */
	public static void main(String[] args) throws ExcepcionPersonalizada {
		Excepciones objeto = new Excepciones();
		objeto.metodoA();
		
		try{
			throw new ExcepcionPersonalizada("Excepcion capturada");
		} catch(ExcepcionPersonalizada e) {
			System.out.println("Excepcion capturada");
			System.out.println("Codigo: " + e.getCodigo());
			System.out.println("Mensaje: " + e.getMessage());
		}
		

	}

}
