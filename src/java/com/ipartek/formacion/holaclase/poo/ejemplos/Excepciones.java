package com.ipartek.formacion.holaclase.poo.ejemplos;

public class Excepciones {
	
	private void metodoA() {
		System.out.println("  MetodoA:entra");
		try {
			this.metodoB();
		} catch (Exception e) {
			System.out.println(" *Excepcion capturada en metodoA* ");
			e.printStackTrace();
		}
		System.out.println("  MetodoA:sale");
	}
	
	private void metodoB() throws Exception {
		System.out.println("      MetodoB:entra");
		this.metodoC();
		System.out.println("      MetodoB:sale");
	}
	
	private void metodoC() throws Exception{
		System.out.println("         MetodoC:entra");
		
		try {
		String pete = null;
		pete.charAt(0);
		System.out.println("***No pasar� nunca por aqu�!!!");
		
		} catch ( ArrayIndexOutOfBoundsException e ){
			System.out.println("Excepcion ARRAY");
		} catch (NullPointerException e){
			System.out.println("Excepcion NULL");
			throw new NullPointerException();
	
			
			
		} catch( Exception e ) {
			System.out.println("Excepcion basica de Java");
			e.printStackTrace();
			
		}finally{ 
				System.out.println("        Se ejecuta siempre");
		};
		
		System.out.println("         MetodoC:sale");
	}
	
	/**
	 * Metodo para probar el ejemplo de esta clase
	 * @param args
	 */
	public static void main(String[] args) {

		Excepciones objeto = new Excepciones();
		objeto.metodoA();
		
		try{
			throw new ExcepcionPersonalizada("Lanzando Excepcion", 0);
		
		}catch (ExcepcionPersonalizada e ){
			System.out.println("Excepcion capturada");
			System.out.println("Codigo: "+ e.getCodigo() );
			System.out.println("Mensaje: "+ e.getMessage() );
		}
	}

}
