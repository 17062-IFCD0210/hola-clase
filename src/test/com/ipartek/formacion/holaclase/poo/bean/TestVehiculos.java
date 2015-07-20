package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestVehiculos {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVehiculoElectrico() {
		
		VehiculoElectrico ve = new VehiculoElectrico();
		
		assertEquals( "Sin determinar", ve.getModelo() );
		assertEquals( 1, ve.getNumeroPlazas() );
		assertEquals( "", ve.getDimensiones() );
		assertEquals( 100, ve.getPotencia() );
		
		assertEquals( 300, ve.getCapacidadBaterias() );
		assertEquals( "Check bateria - Vehiculo arrancado", ve.arrancar() );

	}
	
	
	@Test
	public void testVehiculoGasolina() {
		
		VehiculoGasolina vg = new VehiculoGasolina();
		
		assertEquals( "Sin determinar", vg.getModelo() );
		assertEquals( 1, vg.getNumeroPlazas() );
		assertEquals( "", vg.getDimensiones() );
		assertEquals( 500, vg.getPotencia() );
		
		assertEquals( "Capacidad minima 40 litros", 40, vg.getCapacidadDeposito() );
		assertEquals( "Por defecto usa Gasolina 95",VehiculoGasolina.GASOLINA95, vg.getCombustible() ); //Establecemos una constante
		assertEquals( "Calentar Inyectores - Vehiculo arrancado", vg.arrancar() );

	}
	
	@Test
	public void testListaMezclada(){
		
		ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
		
		listado.add( new VehiculoElectrico() );
		listado.add( new VehiculoGasolina() );
		listado.add( new VehiculoGasolina() );
		listado.add( new VehiculoElectrico() );
		listado.add( new VehiculoElectrico() );
		
		//utilizamos un iterador para recorrer, podria haber sido un for
		
		Iterator<Vehiculo> it = listado.iterator();
		Vehiculo v; //SIEMPRE declaramos las variables FUERA
		while (it.hasNext() ){
			v = it.next();
			
			//Si el vehiculo es electrico...
			if ( v instanceof VehiculoElectrico ){
				
				( (VehiculoElectrico) v).checkBateria();
			//i el vehiculo es gasolina...
			}else if (v instanceof VehiculoGasolina ){
				
				( (VehiculoGasolina) v).checkInyector();
			}else{
				fail ("No sabemos como arrancar este tipo de vehiculo");
			}
		}
		
	}
	


}
