package org.example.Facade;

public class Restaurante {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.fazerPedido("Pizza", 49.90, "Remígio; Lagoa Parque, 123");
        pedido.fazerPedido("Hamburguer", 25.50, "Esperança; Praça da Cultura, 456");
    }
}