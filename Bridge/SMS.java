package org.example.Bridge;

public class SMS implements EnvioDeMensagem{
    private String numeroDestinatario;
    private String numeroRemetente;
    private String operadora;
    private int limiteCaracteres;

    public SMS(String numeroDestinatario, String numeroRemetente, String operadora) {
        this.numeroDestinatario = numeroDestinatario;
        this.numeroRemetente = numeroRemetente;
        this.operadora = operadora;
        this.limiteCaracteres = 140;
    }

    public void enviar(String mensagem){
        if(mensagem.length() > limiteCaracteres){
            mensagem = mensagem.substring(0, limiteCaracteres)+ "...";
        }
        System.out.println("Enviando SMS: " + numeroRemetente + " recebendo: " + numeroDestinatario);
        System.out.println("Operadora: " + operadora);
        System.out.println("Conteúdo: " + mensagem);
    }
}
