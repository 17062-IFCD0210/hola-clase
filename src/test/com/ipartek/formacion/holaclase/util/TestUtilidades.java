package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtilidades {

	@Test
	public void testRound() {
		
		float n = (float)0.49999999997;		
		assertTrue( (float)0.50 == Utilidades.round(n , 2 ) );
				
	}

	@Test
	public void testOrdenar() {
		
	}
	
}
