package org.example;

public class Usuario {

    private String nome;
    private String email;
    private String telefone = null;
    private boolean ativo = true;

    public Usuario() {
    }

    public Usuario(String nome, String email, String telefone, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getTelefone() {
        return telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    // public Usuario(String telefone) {
     //   this.telefone = telefone;
    //}




    //Método que define que o telefone seja valido.
    public void definirTelefoneValido(String telefone) {

        if (telefone == null && telefone.length() !=11){
            throw new IllegalArgumentException("O telefone é obrigatório.");
        }

        this.telefone = telefone;
    }

    //Método que lança excessao se telefone for nullo.
    public void telefoneNulo(String telefone) {
        if(telefone==null){
            throw new IllegalArgumentException("O telefone é obrigatório.");
        }
        this.telefone = telefone;
    }


    //Método que lança excessao se telefone for  em branco.
    public void telefoneEmBranco(String telefone) {
        if(telefone == ""){
            throw new IllegalArgumentException("O telefone é obrigatório.");
        }
        this.telefone = telefone;
    }

    //Método desativar usuario.
    public void desativar(){
        this.ativo = false;
    }


}
