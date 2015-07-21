package com.ipartek.formacion.holaclase.constantes;

/*
 * Definimos un tipo de bebida
 */
 
class BebidaCerveza {
    enum MarcaCerveza { KELER, AMBAR, GUINNESS, HEINEKEN } // Tipos enumerados sencillos. Solo tenemos estas marcas
 
    private Vaso vaso;
    private MarcaCerveza marca;
 
    BebidaCerveza(MarcaCerveza marca, Vaso vaso) {
        this.marca = marca;
        this.vaso = vaso;
    }
 
    public String servir() {
        return "Sirviendo " + vaso.getCentimetrosCubicos() + "cc. de cerveza " + marca;
    }
}
