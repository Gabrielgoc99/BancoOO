package br.com.bancooo.model;

public class ContaPoupanca extends Conta {

    private Double rentabilidadeMensal;

    public ContaPoupanca(Double depositoInicial) {
        this.setSaldo(depositoInicial);
    }

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    // Retirar Dinheiro da contaPoupança e enviar para a contaDestino
    public void resgatar(Conta contaDestino, Double valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.depositar(valor);
        }
    }


}
