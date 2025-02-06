package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

public class Periodo implements ComponenteAcademico{
    private String numeracao;
    private List<ComponenteAcademico> componentes;

    public Periodo(String numeracao){
        this.numeracao = numeracao;
        this.componentes = new ArrayList<>();
    }

    public void add(ComponenteAcademico componenteAcademico){
        componentes.add(componenteAcademico);
    }
    public void remove(ComponenteAcademico componenteAcademico){
        componentes.remove(componenteAcademico);
    }

    public void exibirComponente(String identacao){
        System.out.println(identacao + "Período: " + numeracao);
        for(ComponenteAcademico componenteAcademico : componentes){
            componenteAcademico.exibirComponente(identacao + " ");
        }
    }
}
