package com.ipartek.formacion.holaclase.poo.bean;

public class Vueltas {
	
	private double precio;
	private double entregado;
	static double  	B50=0;
	static double  	B20=0;
	static double  	B10=0;
	int 			B5=0;
	static double  	M2=0;
	static double  	M1=0;
	static double   C50=0;
	static double   C20=0;
	static double   C10=0;
	static double   C5=0;
	static double   C1=0;
	
	//Getters y Setters
	
	public Vueltas (int precio, double entregado){
		this.precio = precio;
		this.entregado	= entregado;
	}

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getEntregado() {
		return entregado;
	}


	public void setEntregado(double entregado) {
		this.entregado = entregado;
	}

	public static double getB50() {
		return B50;
	}

	public static void setB50(int b50) {
		B50 = b50;
	}

	public static double getB20() {
		return B20;
	}

	public static void setB20(int b20) {
		B20 = b20;
	}

	public static double getB10() {
		return B10;
	}

	public static void setB10(int b10) {
		B10 = b10;
	}

	public int getB5() {
		return B5;
	}

	public void setB5(int b5) {
		B5 = b5;
	}

	public static double getM2() {
		return M2;
	}

	public static void setM2(int m2) {
		M2 = m2;
	}

	public static double getM1() {
		return M1;
	}

	public static void setM1(int m1) {
		M1 = m1;
	}

	public static double getC50() {
		return C50;
	}

	public static void setC50(double c50) {
		C50 = c50;
	}

	public static double getC20() {
		return C20;
	}

	public static void setC20(double c20) {
		C20 = c20;
	}
	public static double getC10() {
		return C10;
	}

	public static void setC10(double c10) {
		C10 = c10;
	}

	public static double getC5() {
		return C5;
	}

	public static void setC5(double c5) {
		C5 = c5;
	}

	public static double getC1() {
		return C1;
	}

	public static void setC1(double c1) {
		C1 = c1;
	}

	//Final Getters y Setters

	public static void muestraVueltas(double precio, double entregado){
		if(entregado == precio){
			System.out.println("No hay cambio, el importe es exacto");
		}else if(entregado < precio){
			System.out.println("El dinero entregado no es suficiente");
		}else{
			double total = entregado - precio;
			System.out.println("Total del cambio:" + total + ".");
			if(total >= 50){
				B50=(double) entregado / 50;
				System.out.println(B50 +" billete/s de 50.");
				total = total % 50;
			}
			if(total >= 20){
				B20=(double) entregado / 20;
				System.out.println(B20 +" billete/s de 20.");
				total = total % 20;					
			}
			if(total >= 10){
				B10=(double) entregado / 10;
				System.out.println(B10 +" billetes/s de 10.");
				total = total % 2;					
			}
			if(total >= 2){
				M2=(double) entregado / 2;
				System.out.println(M2 +" moneda/s de 2.");
				total = total % 1;					
			}
			if(total >= 1){
				M1=(double) entregado / 1;
				System.out.println(M1 +" moneda/s de 0.50.");
				total = total % 1;					
			}
			if(total >= 0.50){
				C50=(double) entregado / 0.50;
				System.out.println(C50 +" moneda/s de 0.50.");
				total = total % 0.50;					
			}
			if(total >= 0.20){
				C20=(double) entregado / 0.20;
				System.out.println(C20 +" moneda/s de 0.20.");
				total = total % 0.20;					
			}
			if(total >= 0.10){
				C10=(double) entregado / 0.10;
				System.out.println(C10 +" moneda/s de 0.10.");
				total = total % 0.10;					
			}
			if(total >= 0.05){
				C5=(double) entregado / 0.05;
				System.out.println(C5 +" moneda/s de 0.05.");
				total = total % 0.10;					
			}
			if(total >= 0.01){
				C1=(double) entregado / 0.01;
				System.out.println(C1 +" moneda/s de 0.01.");
				total = total % 0.01;					
			}
		}
	}
	public static void main(String[] args){	
		 
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try{
			System.out.println("Introduzca el precio del artículo:");
			double precio = sc.nextDouble();
			System.out.println("Introduzca dinero entregrado por el cliente:");
			double entregado = sc.nextDouble();
			muestraVueltas(precio, entregado);
		}catch (Exception e) {
			System.out.println("Se ha generado un error");
					
		}
	}
}

	
 