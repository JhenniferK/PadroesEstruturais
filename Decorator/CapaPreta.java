package org.example.Decorator;

public class CapaPreta extends PersonagemDecorator{
    public CapaPreta(Personagem personagem){
        super(personagem);
    }
    public String getDescricao(){
        return personagem.getDescricao() + " com Capa Preta";
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public int getPoder() {
        return personagem.getPoder() + 15;
    }
}
