package com.ipartek.formacion.holaclase.poo.ejemplos;

public class Excepciones {

	private void metodoA(){
		
		System.out.println("MetodoA: entra");
		try{
			this.metodoB();

		} catch (Exception e){
			
			System.out.println("Exception capturada en metoda A");
			e.printStackTrace();
		}
		
		System.out.println("MetodoA: sale");
	}
	
	private void metodoB() throws Exception {
		
		System.out.println("\tMetodoB: entra");
		this.metodoC();
		System.out.println("\tMetodoB: sale");
		
	}

	private void metodoC() throws Exception {
		
		System.out.println("\t\tMetodoC: entra");
		
		try{
			//Vamovs probocar un fallo
			String pete = null;
			pete.charAt(0);
			
			System.out.println("\t\t\t*** No pasara nunca por aqui!!!");
		
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("\t\t\tExcepcion ArrayIndexOutOfBoundsException");

		} catch(NullPointerException e){
			System.out.println("\t\t\tExcepcion" + e.getMessage());

			//Ademas de coger la expecion indicamos a la funcion que nos ha llamado (throw)
			throw new NullPointerException();

		} catch(Exception e){
			System.out.println("\t\t\tExcepcion basica de java");
			e.printStackTrace();
			
		}finally{
			System.out.println("\t\t\tSe ejecuta siempre");
		}
		System.out.println("\t\tMetodoC: sale");
		
	}

	/**
	 * Metodo para probar el ejemplo de esta clase
	 * @param args
	 */
	public static void main(String[] args) {
		Excepciones objeto = new Excepciones();
		objeto.metodoA();

	}

}
