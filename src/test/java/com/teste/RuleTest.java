package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {
    //simula uma saida io
	@Rule
	public TemporaryFolder tmpFolder = new TemporaryFolder(); //criado uma pasta tmp simulada 

	@Test
	public void ahouldCreateNewFileInTemporaryFolder() throws IOException{
		File created = tmpFolder.newFile("file.txt");  // criando o arquivo na pasta simulada 
	
		assertTrue(created.isFile()); // verifica se arq foi criado 
		assertEquals(tmpFolder.getRoot(), created.getParentFile());
	}
}


