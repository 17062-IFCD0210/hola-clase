package com.ipartek.formacion.holaclase.poo;

public class EjercicioVueltas {
	
	public static final float[] BILLETES_MONEDAS={50f,20f,10f,5f,2f,1f,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
	
	public static void main(String[] args) {
		float precio = 1326.24f;
		float pagado = 2000f;
		float vueltas = pagado-precio;
		int resul = 0;
		
		System.out.println("Las vueltas son: "+vueltas);
		
		for (int i = 0; i<BILLETES_MONEDAS.length; i++){
			resul=(int)(vueltas/BILLETES_MONEDAS[i]);
			vueltas=vueltas%BILLETES_MONEDAS[i];
			if(BILLETES_MONEDAS[i]>2){
				System.out.print(resul+ " billetes de ");
				System.out.printf("%.0f",BILLETES_MONEDAS[i]);
				System.out.println("€");
			}else if(BILLETES_MONEDAS[i]>=1){
				System.out.print(resul+ " monedas de ");
				System.out.printf("%.0f",BILLETES_MONEDAS[i]);
				System.out.println("€");
			}else{
				System.out.print(resul+ " monedas de ");
				System.out.printf("%.2f",BILLETES_MONEDAS[i]);
				System.out.println("€");
			}
		}

	}

}
