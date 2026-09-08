package org.example;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        this.preco = preco;
    }

     public void setEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque <= 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo.");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }


    //Método que calcula valor do estoque
    public double calcularValorEmEstoque(){
        double valor = preco * quantidadeEstoque;
        return valor;
    }

    //Método que ferifica se tem estoque se quantidade for maior que "0" retorna true, se não retorna false.
    public boolean temEstoque(){
        if (quantidadeEstoque <= 0){
            return false;
        }
        return true;
    }
}
