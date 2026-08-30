package org.example.aula_25_08_2026;

public class CalculadoraFrete {

    private double pesoKg;

    private boolean entregaExpressa;


    //O frete comum custa R$ 8,00 mais R$ 2,00 por quilograma. Na entrega expressa, o valor final recebe acréscimo de 50%.

    //O peso deve ser maior que zero.
    //Peso zero ou negativo lança IllegalArgumentException.
    //Mensagem: “O peso deve ser maior que zero.”
    //O resultado deve ser verificado como double com delta.


    // metodo para garantir que peso seja maior que zero
    public void ValidaPeso(double pesoKg){
        if (pesoKg <= 0 ){
            throw new IllegalArgumentException("O peso deve ser maior que zero.");
        }
        this.pesoKg = pesoKg;
    }








    public CalculadoraFrete() {
    }

    public CalculadoraFrete(double pesoKg, boolean entregaExpressa) {
        this.pesoKg = pesoKg;
        this.entregaExpressa = entregaExpressa;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public boolean isEntregaExpressa() {
        return entregaExpressa;
    }
}
