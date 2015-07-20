package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestVehiculos {
	
	Vehiculo v;
	VehiculoElectrico ve;
	VehiculoDiesel vd;
	VehiculoGasolina vg;
	
	ArrayList<Vehiculo> listaVehiculos;

	
	@Before
	public void setUp() throws Exception {
		v  = new Vehiculo();
		ve = new VehiculoElectrico();	//Clase hija de Vehiculo()
		vd = new VehiculoDiesel();
		vg = new VehiculoGasolina();
		
		listaVehiculos = new ArrayList<Vehiculo>();
		listaVehiculos.add(ve);
		listaVehiculos.add(vg);
		listaVehiculos.add(vg);
		listaVehiculos.add(ve);
		listaVehiculos.add(ve);		
	}

	@After
	public void tearDown() throws Exception {
		v  = null;
		ve = null;
		vd = null;
		vg = null;
		listaVehiculos = null;
	}

	@Test
	public void testVehiculo() {
		assertEquals("Sin determinar", v.getModelo());
		assertEquals(1, v.getNumeroPlazas());
		assertEquals("", v.getDimensiones());
		assertEquals(0, v.getPotencia());
	}
	
	@Test
	public void testVehiculoElectrico() {
		assertEquals("Sin determinar", ve.getModelo());
		assertEquals(1, ve.getNumeroPlazas());
		assertEquals("", ve.getDimensiones());
		assertEquals(100, ve.getPotencia());
		
		assertEquals(300, ve.getCapacidadBaterias());
		
		assertEquals("Check bateria - Vehiculo arrancado", ve.arrancar());
	}
	
	@Test
	public void testVehiculoGasolina() {
		assertEquals("Sin determinar", vg.getModelo());
		assertEquals(1, vg.getNumeroPlazas());
		assertEquals("", vg.getDimensiones());
		
		assertEquals(500, vg.getPotencia());
		assertEquals("Capacidad minima 40 litros", 40, vg.getCapacidadDeposito());
		assertEquals("por efecto GASOLINA95", VehiculoGasolina.GASOLINA95, vg.getCombustible());
		
		assertEquals("Calentar inyectores - Vehiculo arrancado", vg.arrancar());
	}
	
	@Test
	public void testlistaVehiculos() {
		
		Iterator<Vehiculo> it = listaVehiculos.iterator();
		
		Vehiculo v;
		
		while(it.hasNext()){
			
			v = it.next();
			
			if (v instanceof VehiculoElectrico){
				((VehiculoElectrico) v).checkBateria();
			} else if (v instanceof VehiculoGasolina){
				((VehiculoGasolina) v).checkInjector();
			} else{
				fail("No sabemos arrancar este tipo de vehiculo");
			}
			
		}	
		
	}
	
	
//	@Test
//	public void testVehiculoDiesel() {
//		assertEquals("Sin determinar", vd.getModelo());
//		assertEquals(1, vd.getNumeroPlazas());
//		assertEquals("", vd.getDimensiones());
//		
//		assertEquals(450, vd.getPotencia());
//		assertEquals("Capacidad minima 50 litros", 50, vd.getCapacidadDeposito());
//		assertEquals("por efecto DIESEL", VehiculoDiesel.DIESEL, vd.getCombustible());
//	}
	
}
