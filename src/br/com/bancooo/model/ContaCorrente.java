package br.com.bancooo.model;

public class ContaCorrente extends Conta {

    private Double limite = 0.0;

    public ContaCorrente(Double depositoInicial) {
        this.setSaldo(depositoInicial);
    }


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void transferir(Conta contaDestino, Double valor) {
        Double saldoLimite = this.getSaldo() + this.getLimite();
        if (saldoLimite >= valor) {

            this.setSaldo(this.getSaldo() - valor);
            contaDestino.depositar(valor);
        }
    }
}

