package org.example.aula_18_08_2026.desafio;

public class Cliente {

    private String nome;


    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
        //validarNome(nome);
    }


    public void validarNome(String nome){
        if (nome == null){
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }
}
