package org.example.Bridge;

public class Main {
    public static void main(String[] args) {
        Email email = new Email("alice@email.com", "bob@email.com", "Relatório Semanal");
        email.addAnexos("relatorio.pdf");

        SMS sms = new SMS("+5511999999999", "+5511888888888", "Claro");

        Mensagem mensagem1 = new MensagemBasica(email);
        Mensagem mensagem2 = new MensagemNecessaria(sms);

        mensagem1.enviar("Segue abaixo o relatório de finanças!!");
        mensagem2.enviar("O sistema caiu e não tem como continuar o trabalhooooo");
    }
}
