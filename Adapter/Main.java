package org.example.Adapter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Disciplina> disciplinas = new ArrayList<>();
        NovaDisciplina novaDisciplina = new NovaDisciplina("Padrões de projeto", 120);
        NovaDisciplina novaDisciplina2 = new NovaDisciplina("Banco de dados", 120);
        
        disciplinas.add(new DisciplinaAdapter(novaDisciplina));
        disciplinas.add(new DisciplinaAdapter(novaDisciplina2));

        System.out.println("Disciplinas Disponíveis:");
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome() + " - " + d.getCargaHoraria() + " horas");
        }
    }
}