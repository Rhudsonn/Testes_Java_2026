package aula_18_08_2026.desafio;


import org.example.aula_18_08_2026.desafio.Cliente;
import org.example.aula_18_08_2026.desafio.Quarto;
import org.example.aula_18_08_2026.desafio.ReservaDeHotel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReservaDeHotelTest {


    @Test
    void deveCriarReserva() {

        Cliente cliente = new Cliente(
                "Rhudsonn"
        );

        Quarto quarto = new Quarto(
                1
        );

        ReservaDeHotel reserva = new ReservaDeHotel(
                cliente,
                quarto
        );

        assertEquals(cliente, reserva.getCliente());
        assertEquals(quarto, reserva.getQuarto());
    }


    @Test
    void deveDarErroQuandoClienteForNulo() {

        Quarto quarto = new Quarto(
                1
        );

        ReservaDeHotel reserva = new ReservaDeHotel();

        IllegalArgumentException erro = assertThrows(
                IllegalArgumentException.class,
                () -> reserva.validarCliente(null)
        );

        assertEquals(
                "Cliente é obrigatório!",
                erro.getMessage()
        );
    }

    @Test
    void deveDarErroQuandoQuartoForNulo(){
        ReservaDeHotel reserva = new ReservaDeHotel();

        IllegalArgumentException erro = assertThrows(
                IllegalArgumentException.class,
                () -> reserva.validarQuarto(null)
        );

        assertEquals("Quarto é obrigatório!", erro.getMessage());
    }







}
