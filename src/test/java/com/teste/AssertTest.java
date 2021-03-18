package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void testeAssertArrayEguals(){
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste1".getBytes();
		assertArrayEquals(esperado,atual);
	}			
		
	@Test
	public void testeAssertEguals(){
		assertEquals("text","text");
	}	

	@Test
	public void testeAssertFalse(){
		assertFalse(false);
	}	

	@Test
	public void testAssertNotNull(){
		assertNotNull(new Object());
	}

	@Test
	public void testAssertNull(){
		assertNull(null);
	}

	@Test
	public void testAssertNotSame(){  //verificar se os obj nao sao os msm
		assertNotSame(new Object(),new Object());
	}

	@Test
	public void testAssertSame(){  //verificar se os obj nao sao os msm
		Integer aNumber = Integer.valueOf(765);
		assertSame(aNumber, aNumber);
	}


}
