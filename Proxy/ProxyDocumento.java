package org.example.Proxy;

class ProxyDocumento implements Documento {
    private DocumentoReal documentoReal;
    private String usuario;

    public ProxyDocumento(String usuario, String conteudo) {
        this.usuario = usuario;
        this.documentoReal = new DocumentoReal(conteudo);
    }

    @Override
    public void exibir() {
        if (verificarPermissao()) {
            documentoReal.exibir();
        } else {
            System.out.println("Acesso negado! O usuário " + usuario + " não tem permissão.");
        }
    }

    private boolean verificarPermissao() {
        return "admin".equalsIgnoreCase(usuario);
    }
}