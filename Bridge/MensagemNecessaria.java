package org.example.Bridge;

public class MensagemNecessaria extends Mensagem{
    public MensagemNecessaria(EnvioDeMensagem envio){
        super(envio);
    }
    public void enviar(String conteudo){
        envio.enviar("Mensagem urgente: " + conteudo);
    }
}
