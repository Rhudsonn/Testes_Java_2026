package org.example.calcularFrete;

/**
        * Classe utilitária responsável por calcular o valor do frete de uma
 * encomenda com base no peso (em quilogramas) e na modalidade de entrega.
        *
        * Regras de negócio:
        * - Frete comum: R$ 8,00 (taxa fixa) + R$ 2,00 por quilograma.
        * - Frete expresso: valor do frete comum acrescido de 50%.
        * - O peso informado deve ser sempre maior que zero.
 *
         * Por ser uma classe utilitária, ela não deve ser instanciada:
        * possui apenas métodos estáticos.
        */
public final class CalculadoraFrete {

    // Taxa fixa cobrada em qualquer envio, independente do peso.
    private static final double TAXA_FIXA = 8.00;

    // Valor cobrado por quilograma transportado.
    private static final double VALOR_POR_KG = 2.00;

    // Percentual adicional cobrado quando a entrega é expressa (50%).
    private static final double ACRESCIMO_EXPRESSO = 0.50;

    /**
     * Construtor privado para impedir que a classe seja instanciada,
     * já que ela só oferece comportamento estático (utilitário).
     */
    private CalculadoraFrete() {
    }

    /**
     * Calcula o valor do frete de acordo com o peso e a modalidade de entrega.
     *
     * @param pesoKg          peso da encomenda em quilogramas; deve ser maior que zero.
     * @param entregaExpressa {@code true} para aplicar o acréscimo de 50% (entrega expressa),
     *                        {@code false} para o frete comum.
     * @return o valor final do frete.
     * @throws IllegalArgumentException se {@code pesoKg} for menor ou igual a zero.
     */
    public static double calcular(double pesoKg, boolean entregaExpressa) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }

        // Calcula o valor base do frete comum: taxa fixa + valor proporcional ao peso.
        double valorFreteComum = TAXA_FIXA + (VALOR_POR_KG * pesoKg);

        // Se for entrega expressa, aplica o acréscimo de 50% sobre o valor comum.
        if (entregaExpressa) {
            return valorFreteComum * (1 + ACRESCIMO_EXPRESSO);
        }

        return valorFreteComum;

    }

}