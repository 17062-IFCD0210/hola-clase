package com.ipartek.formacion.holaclase.constantes;

/*
 * Un tipo enumerado "complejo", tiene sus propios m�todos y constructor
 */
 
enum Vaso {
    // Tipos de vaso disponibles. Pasan al constructor su capacidad en cc.
    KATXI(1000), JARRA(500), TUBO(250), TERCIO(333), CANA(200);
 
    private int cc; // Variable interna donde almacenaremos la capacidad
 
    // Nuestro constructor nos fuerza a pasar par�metros al definir un nuevo tipo
    Vaso(int cc) {
        this.cc = cc;
    }
 
    // Devuelve la capacidad del vaso
    public int getCentimetrosCubicos() {
        return cc;
    }
}
 
/*
 * Definimos un tipo de bebida
 */
 
public class BebidaCerveza {
    enum MarcaCerveza { AMBAR, GUINNESS, HEINEKEN, KELER } // Tipos enumerados sencillos. Solo tenemos estas marcas
 
    private Vaso vaso;
    private MarcaCerveza marca;
 
    public BebidaCerveza(MarcaCerveza marca, Vaso vaso) {
        this.marca = marca;
        this.vaso = vaso;
    }
 
    public String servir() {
        return "Sirviendo " + vaso.getCentimetrosCubicos() + "cc. de cerveza " + marca;
    }
}