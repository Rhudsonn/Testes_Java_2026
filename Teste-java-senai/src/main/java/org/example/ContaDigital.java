package org.example;

public class ContaDigital {

    private String titular;
    private double saldo = 0;



    public double depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O depósito deve ser maior que zero.");
        }
         valor += saldo;

        return  valor;
    }


    public double sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O saldo deve ser maior que zero.");
        }

        if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        saldo -= valor;
        return  valor;
    }





    public ContaDigital() {
    }

    public ContaDigital(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }



    public double getSaldo() {
        return saldo;
    }
}
