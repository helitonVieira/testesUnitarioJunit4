package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(4, soma);
	}
	
	//exemplo de mock 
	/*@Test 
	public void testeSomaComMock() {
		Calculadora calc = nock(Calculadora.class);
		
		vhen(calc.somar("1+2")).thenReturn(10);
		
		int resultado =calc.somar("1+2");
		
		assertEquals(10,resultado);
		
		
	}*/

}
