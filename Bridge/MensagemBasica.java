package org.example.Bridge;

public class MensagemBasica extends Mensagem{
    public MensagemBasica(EnvioDeMensagem envio){
        super(envio);
    }

    public void enviar(String conteudo){
        envio.enviar("Mensagem básica: " + conteudo);
    }
}
