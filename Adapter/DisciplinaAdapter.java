package org.example.Adapter;

public class DisciplinaAdapter implements Disciplina {
    private NovaDisciplina novaDisciplina;

    DisciplinaAdapter(NovaDisciplina novaDisciplina){
        this.novaDisciplina = novaDisciplina;
    }

    public String getNome(){
        return novaDisciplina.obterNome();
    }
    public int getCargaHoraria(){
        return novaDisciplina.obterHorasMinistradas();
    }
}
