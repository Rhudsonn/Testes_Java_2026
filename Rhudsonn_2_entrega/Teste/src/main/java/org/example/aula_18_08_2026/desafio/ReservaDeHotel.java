package org.example.aula_18_08_2026.desafio;

public class ReservaDeHotel {


    private Cliente cliente;
    private Quarto quarto;



    public ReservaDeHotel() {
    }

    public ReservaDeHotel(Cliente cliente, Quarto quarto) {
        this.cliente = cliente;
        this.quarto = quarto;
    }


    public void validarCliente(Cliente cliente){
        if (cliente == null){
            throw new IllegalArgumentException("Cliente é obrigatório!");
        }
        this.cliente = cliente;
    }


    public void validarQuarto(Quarto quarto){
        if (quarto == null){
            throw new IllegalArgumentException("Quarto é obrigatório!");
        }
        this.quarto = quarto;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }
}
