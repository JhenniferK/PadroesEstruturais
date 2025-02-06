package org.example.Composite;

public class Main {
    public static void main(String[] args){
        ComponenteAcademico disciplina1 = new Disciplina("Padrões de projeto");
        ComponenteAcademico disciplina2 = new Disciplina("BD");
        ComponenteAcademico disciplina3 = new Disciplina("EDA");
        ComponenteAcademico disciplina4 = new Disciplina("PDM");

        Periodo periodo1 = new Periodo("1°");
        Periodo periodo2 = new Periodo("2°");
        Periodo periodo3 = new Periodo("3°");
        Periodo periodo4 = new Periodo("4°");

        periodo1.add(disciplina1);
        periodo2.add(disciplina2);
        periodo3.add(disciplina3);
        periodo4.add(disciplina4);

        Periodo curso = new Periodo("Análise e desenvolvimento de sistemas");
        curso.add(periodo1);
        curso.add(periodo2);
        curso.add(periodo3);
        curso.add(periodo4);

        curso.exibirComponente(" ");


    }
}
