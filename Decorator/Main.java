package org.example.Decorator;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Guerreiro();
        System.out.println(personagem.getDescricao() + " com poder de: " + personagem.getPoder());

        personagem = new Armadura(personagem);
        System.out.println(personagem.getDescricao() + " com poder de: " + personagem.getPoder());

        personagem = new CapaPreta(personagem);
        System.out.println(personagem.getDescricao() + " com poder de: " + personagem.getPoder());

        personagem = new Espada(personagem);
        System.out.println(personagem.getDescricao() + " com poder de: " + personagem.getPoder());
    }
}
