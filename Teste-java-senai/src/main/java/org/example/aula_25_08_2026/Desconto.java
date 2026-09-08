package org.example.aula_25_08_2026;

public class Desconto {

    //Teste mentalmente: preço 200 e percentual 25 produzem desconto 50 e resultado 150.

    // Construtor privado: a classe oferece apenas métodos estáticos.
    private Desconto() { }

    public static double calcular(double preco, int percentual) {
        if (preco < 0) {
            throw new IllegalArgumentException(
                    "O preço não pode ser negativo."
            );
        }

        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException(
                    "O percentual deve estar entre 0 e 100."
            );
        }

        double valorDoDesconto = preco * percentual / 100.0;
        return preco - valorDoDesconto;
    }
}
