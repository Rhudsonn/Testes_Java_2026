package org.example.aula_18_08_2026;

public class Triangulo {
    private double ladoA, ladoB, ladoC;

    public Triangulo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Lados devem ser positivos.");
        this.ladoA = a; this.ladoB = b; this.ladoC = c;
    }

    public double calcularPerimetro() { return ladoA + ladoB + ladoC; }


    public Triangulo() {
    }


    public double getLadoC() {
        return 0;
    }

    public double getLadoB() {
        return 0;
    }

    public double getLadoA() {
        return 0;
    }
}

