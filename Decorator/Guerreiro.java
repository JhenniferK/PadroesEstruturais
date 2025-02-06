package org.example.Decorator;

public class Guerreiro implements Personagem{
    public String getDescricao(){
        return "Guerreiro básico";
    }
    public String getNome(){
        return "Joalysson";
    }
    public int getPoder(){
        return 20;
    }
}
