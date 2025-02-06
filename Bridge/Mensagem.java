package org.example.Bridge;

abstract class Mensagem {
    EnvioDeMensagem envio;

    public Mensagem(EnvioDeMensagem envio){
        this.envio = envio;
    }
    public abstract void enviar(String conteudo);
}
