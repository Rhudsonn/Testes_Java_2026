import org.example.Lampada;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LampadaTest {


    @Test
     void ligarDeveAlterarEstadoDaLampada(){

        // Arrange - organizar
        Lampada lampada = new Lampada("Quarto", false, 0);

        //Act - agir
        lampada.ligar();

        //Assert - verificar
        assertTrue(lampada.isLigado() == true);
        assertTrue(lampada.getIntensidade() == 100);

    }

    @Test
    void desligarDeveAlterarEstadoDaLampada(){

        Lampada lampada = new Lampada("Quarto", true, 100);

        lampada.desligar();

        assertTrue(lampada.isLigado() == false);
        assertTrue(lampada.getIntensidade() == 0);


    }
}
