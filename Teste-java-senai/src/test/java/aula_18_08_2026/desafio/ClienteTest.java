package aula_18_08_2026.desafio;

import org.example.aula_18_08_2026.desafio.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteTest {


    // assertEquals = Método de Validação.
    // assertEquals("Rhudsonn") = valor esperado.
    // cliente.getNome() = Valor Atual
    @Test
    void deveCriarCliente() {
        Cliente cliente = new Cliente("Rhudsonn");
        assertEquals("Rhudsonn", cliente.getNome());
    }


    @Test
    void deveDarErroQuandoNomeForNulo() {
        Cliente cliente = new Cliente();

        IllegalArgumentException erro = assertThrows(
                IllegalArgumentException.class,
                () -> cliente.validarNome(null)
        );

        assertEquals("Nome é obrigatório!", erro.getMessage());
    }



}
