package aula_18_08_2026.desafio;

import org.example.aula_18_08_2026.desafio.Quarto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuartoTest {


    @Test
    void deveCriarQuarto() {
        Quarto quarto = new Quarto(1);
        assertEquals(1, quarto.getNumeroQuarto());
    }


    @Test
    void deveDarErroQuandoQuartoForMenorOuIgualZero() {
        Quarto quarto = new Quarto();

        IllegalArgumentException erro = assertThrows(
                IllegalArgumentException.class,
                () -> quarto.validarQuarto(0)
        );

        assertEquals("Numero do quarto é obrigatório!", erro.getMessage());
    }


}
