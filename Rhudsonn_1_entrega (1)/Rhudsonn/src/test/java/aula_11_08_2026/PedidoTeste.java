package aula_11_08_2026;

import org.example.aula_11_08_2026.Pedido;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTeste {

    private Pedido pedido;

    @BeforeEach
    void configurar() {
        pedido = new Pedido();
    }


    @Test
    void pedidoDeveNascerComValorZero() {
        assertEquals(0.0, pedido.getValorTotal());
    }

    @Test
    void adicionarItemDeveSomarAoTotal() {
        pedido.adicionarItem(50.0);
        pedido.adicionarItem(30.0);
        assertEquals(80.0, pedido.getValorTotal());
    }

}
