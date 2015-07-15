package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUtilidades {

	@Test
	public void testRound() {
		float n = (float)0.4999999997;
				
		assertTrue( (float)0.50 == Utilidades.round(n, 2) );
	}
	
	@Test
	public void testOrdenar() {
		int [] numeros = {3, 55, 0, 9, -2, 14};
		//int [] numeros2 = {-2, 0, 3, 9, 14, 55};
		
		
	}


}
