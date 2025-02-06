package org.example.Decorator;

public class Espada extends PersonagemDecorator{
    public Espada(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + " com Espada";
    }

    @Override
    public String getNome() {
        return null;
    }

    public int getPoder(){
        return personagem.getPoder() + 30;
    }
}
