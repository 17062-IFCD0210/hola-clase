package com.ipartek.formacion.holaclase.poo.ejemplos;

public class Excepciones {

	
	private void metodoA(){
		System.out.println("MetodoA:entra");
		try {
			this.metodoB();
		} catch (Exception e) {
			System.out.println("Excepcion capturada, viene de B");
			e.printStackTrace();
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

		try{
			String pete=null;
			pete.length();
			System.out.println("*** No pasara nunca por aqui!!!!***");
		}catch(ArrayIndexOutOfBoundsException e){ //podemos usar varios catch
			System.out.println("Excepcion ARRAY");
		}catch(NullPointerException e){
			System.out.println("Excepcion NULL");
		throw new NullPointerException(); //lanzamos la excepcion a B, pero este no la recoge
			//podemos obligarles a recogerlas poniendo throws Exception en la definicion del metodo C
			
		}catch(Exception e){ //esta es la excepcion mas general y se pone la ultima
			System.out.println("Excepcion basica de java");
			e.printStackTrace(); // para poder ver la traza del fallo
		}finally{
			System.out.println("        Se ejecuta siempre");
		};

		System.out.println("        MetodoC:sale");		
	}
	
	/**
	 * Metodo para probar el ejemplo de esta clase
	 * @param args
	 * @throws ExcepcionPersonalizada 
	 */
	public static void main(String[] args) {
		Excepciones objeto = new Excepciones();
		objeto.metodoA();
		
		try {
			throw new ExcepcionPersonalizada("Lanzando Excepcion");
		} catch (ExcepcionPersonalizada e) {
			System.out.println("Excepcion capturada");
			System.out.println("Codigo:" + e.getCodigo());
			System.out.println("Mensaje:" + e.getMessage());
		}
		
	}

}
