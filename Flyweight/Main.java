package org.example.Flyweight;

public class Main {
    public static void main(String[] args) {
        CaracterFactory factory = new CaracterFactory();

        Caracter c1 = factory.getCaracter('A');
        Caracter c2 = factory.getCaracter('B');
        Caracter c3 = factory.getCaracter('A');

        c1.exibir("Arial", 12);
        c2.exibir("Times New Roman", 14);
        c3.exibir("Verdana", 16);

        System.out.println("c1 == c3? " + (c1 == c3));
    }
}
