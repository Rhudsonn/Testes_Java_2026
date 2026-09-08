package org.example.aula_18_08_2026.desafio;

public class Quarto {

    private int numeroQuarto;

    public Quarto() {
    }

    public Quarto(int numeroQuarto) {
        validarQuarto(numeroQuarto);
        //this.numeroQuarto = numeroQuarto;
    }

    public void validarQuarto(int numeroQuarto){
        if (numeroQuarto <= 0 ){
            throw new IllegalArgumentException("Numero do quarto é obrigatório!");
        }
        this.numeroQuarto = numeroQuarto;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }
}
