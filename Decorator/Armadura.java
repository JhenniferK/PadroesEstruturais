package org.example.Decorator;

public class Armadura extends PersonagemDecorator {
    public Armadura(Personagem personagem){
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + " possui Armadura";
    }

    public String getNome(){
        return personagem.getNome();
    }

    public int getPoder(){
        return personagem.getPoder() + 20;
    }
}
