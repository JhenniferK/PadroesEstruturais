package org.example.Bridge;

import java.util.ArrayList;
import java.util.List;

public class Email implements EnvioDeMensagem{
    private String remetente;
    private String destinatario;
    private String assunto;
    private List<String> anexos;

    public Email(String remetente, String destinatario, String assunto){
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.anexos = new ArrayList<>();
    }

    public void addAnexos(String arquivo){
        anexos.add(arquivo);
    }

    public void enviar(String mensagem){
        System.out.println("Enviando email: " + remetente + " recebendo: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Conteúdo: " + mensagem);
        if(!anexos.isEmpty()){
            System.out.println("Anexos: "+ anexos);
        }
    }
}
