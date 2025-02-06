package org.example.Composite;

public class Disciplina implements ComponenteAcademico {
    private String nome;

    public Disciplina(String nome){
        this.nome = nome;
    }

    public void exibirComponente(String identacao){
        System.out.println(identacao + "Disciplina: " + nome);
    }
}
