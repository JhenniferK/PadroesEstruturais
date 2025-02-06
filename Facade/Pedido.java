package org.example.Facade;

class Pedido {
    private Cozinha cozinha;
    private Pagamento pagamento;
    private Entrega entrega;

    public Pedido() {
        this.cozinha = new Cozinha();
        this.pagamento = new Pagamento();
        this.entrega = new Entrega();
    }

    public void fazerPedido(String prato, double valor, String endereco) {
        pagamento.processarPagamento(valor);
        cozinha.prepararPedido(prato);
        entrega.agendarEntrega(endereco);
        System.out.println("Pedido concluído!");
    }
}