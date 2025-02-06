package org.example.Proxy;

public class Sistema {
    public static void main(String[] args) {
        Documento doc1 = new ProxyDocumento("admin", "Relatório financeiro confidencial");
        doc1.exibir();

        Documento doc2 = new ProxyDocumento("user", "Relatório financeiro confidencial");
        doc2.exibir();
    }
}