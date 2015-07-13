package com.ipartek.formacion.holaclase.poo;

public class EjercicioVueltas {
	
	public static final float[]BILLETES_MONEDAS = 
		{50f, 20f, 10f, 5f, 2f, 1f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
	public static float valorCompra = 1326.24f;
	public static float dineroPagado = 2000f;
	
	public static void main(String[] args) {
		
		float cambio = dineroPagado - valorCompra;
		int indice = 0;
		float parteEntera=0f;
		float resto=0f;
		
		System.out.println("------------- RESULTADO ---------------------");
		System.out.println("Vueltas de " + cambio + " Euros:");
		
		
		do{
			parteEntera=(int) (cambio/BILLETES_MONEDAS[indice]);
			resto=cambio%BILLETES_MONEDAS[indice];
			if(indice<=3){
				System.out.println("En " + (int)parteEntera + " Billetes de " + (int)BILLETES_MONEDAS[indice] + "   resto:" + resto);
			}
			else{
				System.out.println("En " + (int)parteEntera + " Monedas de " + (int)BILLETES_MONEDAS[indice] + "   resto:" + resto);
			}
			cambio=resto;
			indice++;
		}
		while(cambio>0 && indice<11);
		System.out.println("---------------------------------------------");

	}
	
}
