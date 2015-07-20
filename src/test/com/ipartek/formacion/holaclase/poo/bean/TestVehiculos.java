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
		
		assertEquals(1, ve.getNumPlazas());
		assertEquals("", ve.getDimensiones());
		assertEquals(100, ve.getPotencia());
		assertEquals("Sin Determinar", ve.getModelo());
		assertEquals(300, ve.getCapacidadBateria());
		assertEquals("Check Bateria - Vehiculo Arrancado", ve.arrancar());
	}
	
	@Test
	public void testVehiculoGasolina() {
		VehiculoGasolina vg = new VehiculoGasolina();
		
		assertEquals(1, vg.getNumPlazas());
		assertEquals("", vg.getDimensiones());
		assertEquals(500, vg.getPotencia());
		assertEquals("Sin Determinar", vg.getModelo());
		assertEquals(40, vg.getCapacidadDeposito());
		assertEquals(VehiculoGasolina.GASOLINA95, vg.getCombustible());
		assertEquals("Calentar inyectores - Vehiculo Arrancado", vg.arrancar());
	}
	
	@Test
	public void testListaMezclada() {
		ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
		
		listado.add(new VehiculoElectrico());
		listado.add(new VehiculoGasolina());
		listado.add(new VehiculoGasolina());
		listado.add(new VehiculoElectrico());
		listado.add(new VehiculoElectrico());
		
		Iterator<Vehiculo> it = listado.iterator();
		Vehiculo v;
		while(it.hasNext()) {
			v = it.next();
			if(v instanceof VehiculoElectrico) {
				((VehiculoElectrico) v).checkBateria();
			} else if(v instanceof VehiculoGasolina) {
				((VehiculoGasolina) v).checkInyector();
			} else {
				fail("No sabemos como arrancar este tipo de vehiculo");
			}
		}
	}

}
