package org.example.aula_11_08_2026;

public class Livro {

    //Lista de 4 tipos de testes que posso fazer
    // 1° validar se (titulo não é null) se for ele lança a excessão.
    // 2° validar se (nome do altor não é null) se for ele lança a excessão.
    // 3° validar se (genero não é null) se for ele lança a excessão.
    // 4° validar se (o numero de paginas não é menor que 0) se for ele lança a excessão.


    private String titulo;
    private String nomeAltor;
    private String genero;
    private int paginas;

    public Livro(String titulo, String nomeAltor, String genero, int paginas) {
        this.titulo = titulo;
        this.nomeAltor = nomeAltor;
        this.genero = genero;
        this.paginas = paginas;
    }

    //Metodo valida se o titulo é nulo.
    public void validandoTitulo(String titulo){

        if (titulo == null){
            throw new IllegalArgumentException("Titulo é obrigatório!");
        }
        this.titulo = titulo;
    }

    //Metodo valida se nome do altor é nulo.
    public void validandoAltor(String nomeAltor){
        if (nomeAltor == null){
            throw new IllegalArgumentException("Nome do altor é obrigatório!");
        }
        this.nomeAltor = nomeAltor;
    }

    //Metodo valida se genero é nulo.
    public void validandoGenero(String genero){
        if (genero == null){
            throw new IllegalArgumentException("Genero  é obrigatório!");
        }
        this.genero = genero;
    }

    //Metodo que valida se paginas é maior que zero
    public void numeroDePaginas(int paginas){
        if (paginas <= 0){
            throw new IllegalArgumentException("Numero de paginas deve ser maior que zero!");
        }
        this.paginas = paginas;

    }


    public String getTitulo() {
        return titulo;
    }

    public String getNomeAltor() {
        return nomeAltor;
    }

    public String getGenero() {
        return genero;
    }

    public int getPaginas() {
        return paginas;
    }
}
