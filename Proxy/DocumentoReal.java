package org.example.Proxy;

class DocumentoReal implements Documento {
    private String conteudo;

    public DocumentoReal(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo documento: " + conteudo);
    }
}
