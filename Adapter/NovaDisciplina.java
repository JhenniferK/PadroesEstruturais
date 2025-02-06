package org.example.Adapter;

public class NovaDisciplina {
    private String nome;
    private int horasMinistradas;

    public NovaDisciplina(String nome, int horasMinistradas) {
        this.nome = nome;
        this.horasMinistradas = horasMinistradas;
    }

    public String obterNome(){
        return nome;
    }
    public int obterHorasMinistradas(){
        return horasMinistradas;
    }
}
