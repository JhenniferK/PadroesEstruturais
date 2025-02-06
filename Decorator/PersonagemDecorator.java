package org.example.Decorator;

abstract class PersonagemDecorator implements Personagem{
    protected Personagem personagem;

    public PersonagemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    public String getDescricao(){
        return personagem.getDescricao();
    }
    public int getPoder(){
        return personagem.getPoder();
    }
}
