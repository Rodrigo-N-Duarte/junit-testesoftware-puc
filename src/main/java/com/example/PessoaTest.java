package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaTest {
    public PessoaTest() {

    }

    @Test
    public void testToString() {
        Pessoa pl = new Pessoa();
        pl.setMaxLivros(5);
        pl.setNome("Rodrigão");
        String resultadoEsperado = "Nome: Rodrigão - Livros: 5.";
        assertEquals(resultadoEsperado, pl.toString());
    }

    @Test
    public void testPessoa() {
        Pessoa pl = new Pessoa();
        assertEquals("Usuário desconhecido", pl.getNome());
        assertEquals(3, pl.getMaxLivros());
    }

    @Test
    public void testGetNome() {
        Pessoa pl = new Pessoa();
        pl.setNome("Rodrig0d");
        assertEquals("Rodrig0d", pl.getNome());
    }

    @Test
    public void testSetNome() {
        Pessoa pl = new Pessoa();
        pl.setNome("Rodrig0d");
        assertEquals("Rodrig0d", pl.getNome());
    }

    @Test
    public void testGetMaxLivros() {
        Pessoa pl = new Pessoa();
        pl.setMaxLivros(3);
        assertEquals(3, pl.getMaxLivros());
    }

    @Test
    public void testSetMaxLivros() {
        Pessoa pl = new Pessoa();
        pl.setMaxLivros(3);
        assertEquals(3, pl.getMaxLivros());
    }
}
