package com.teste;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	/*obs quando o maven init inicia se tiver algum teste com erro vai gerar erro no console
	os testes sao justamentes para garantir uma qualidade no sistema */
	
	@Test(expected = IndexOutOfBoundsException.class)//esperando uma exception como nao foi atribuido valores vai dar certo 
	public void empty() {
		new ArrayList<Object>().get(0);//força erro tentando pegar o array vazio 
	}
	
	@Test(expected = IndexOutOfBoundsException.class)//esperando uma exception como esta tudo certo vai dar erro 
	public void empty1() {
		List<String> lista = new ArrayList<String>();
		lista.add("Heliton");
		lista.get(0);
	}
	
	//------- testando a mensagem da exception 
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{
		List<Object> list = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index: 0, Size: 0");//msg nao é esta 
		list.get(0);
	}
	//----------------mensagem correta que esta vindo
	@Rule
	public ExpectedException thrown1 = ExpectedException.none();
	
	@Test
	public void shouldTestExceptionMessage1() throws IndexOutOfBoundsException{
		List<Object> list = new ArrayList<Object>();
		
		thrown1.expect(IndexOutOfBoundsException.class);
		thrown1.expectMessage("Index 0 out of bounds for length 0");
		list.get(0);
	}	
	
	//----------------testando o try
	
	@Test 
	public void testExceptionMessage(){
	
		try{
			new ArrayList<Object>().get(0); //forçando o erro
			fail("esperando que IndexOutOfBoundsException seja lançada");//padrao de uso no try catch
		} catch (IndexOutOfBoundsException ex){
			assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0")); //verifica se msg esta correta comparação mais usando o CoreMatchers "is" 
		}
	}

}
