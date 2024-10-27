package com.example;

import java.text.MessageFormat;

public class Pessoa {
    private String nome;
    private int maxLivros;

    public Pessoa() {
        this.nome = "Usuário desconhecido";
        this.maxLivros = 3;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxLivros() {
        return this.maxLivros;
    }
    public void setMaxLivros(int max) {
        this.maxLivros = max;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Nome: {0} - Livros: {1}.", this.nome, this.maxLivros);
    }
}
