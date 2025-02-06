package org.example.Flyweight;

class Caracter {
    private final char simbolo;

    public Caracter(char simbolo) {
        this.simbolo = simbolo;
    }

    public void exibir(String fonte, int tamanho) {
        System.out.println("Caractere: " + simbolo + " - Fonte: " + fonte + " - Tamanho: " + tamanho);
    }
}