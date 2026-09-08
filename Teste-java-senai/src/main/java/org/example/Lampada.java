package org.example;

public class Lampada {

    private String comodo;
    private boolean ligado = false;
    private int intensidade = 0;


    public void ligar(){
        ligado = true;
        intensidade = 100;
    }

    public void desligar(){
        ligado = false;
        intensidade = 0;
    }

    public Lampada(String comodo, boolean ligado, int intensidade) {
        this.comodo = comodo;
        this.ligado = ligado;
        this.intensidade = intensidade;
    }

    public String getComodo() {
        return comodo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getIntensidade() {
        return intensidade;
    }
}
