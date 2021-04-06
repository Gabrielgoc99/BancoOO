package br.com.bancooo.model;

public class Conta {

    private String numero;
    private Double saldo;

        public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Realizar um depósito na conta
    public void depositar (Double valor) {
        this.setSaldo(this.getSaldo() + valor);

    }

    // Realizar um saque na conta
    public void retirar (Double valor) {
        if (this.getSaldo() >= valor)
        this.setSaldo(this.getSaldo() - valor);
    }

}
