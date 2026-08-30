package aula_25_08_2026;


import org.example.aula_25_08_2026.Desconto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class DescontoTest {
// Os testes entram dentro desta classe.

    //Se org.junit.jupiter.params não for encontrado,
    // confira se o projeto possui a dependência junit-jupiter.

    //Dica = Altere propositalmente um valor esperado e observe qual nome de execução aparece no relatório.

    @ParameterizedTest(name = "caso {index}: R$ {0} - {1}% = R$ {2}")

    @CsvSource({
            "100.00,  10,  90.00",
            "200.00,  25, 150.00",
            " 80.00,   0,  80.00",
            " 50.00, 100,   0.00"
    })
    void calcularDeveAplicarPercentual(
            double preco,
            int percentual,
            double esperado) {

        double obtido = Desconto.calcular(preco, percentual);

        assertEquals(esperado, obtido, 0.001);
    }


    //Dica = O corpo do teste não muda: todos os preços negativos
    // devem produzir o mesmo tipo e a mesma mensagem.

    @ParameterizedTest(name = "preço {0} deve ser rejeitado")
    @ValueSource(doubles = {-0.01, -1.0, -100.0})
    void precoNegativoDeveLancarExcecao(double preco) {
        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> Desconto.calcular(preco, 10)
        );

        assertEquals(
                "O preço não pode ser negativo.",
                excecao.getMessage()
        );
    }

    //Dica = Testar -1000 e 5000 também é válido, mas -1 e
    // 101 verificam com precisão a transição da regra.
    @ParameterizedTest(name = "percentual inválido: {0}")
    @ValueSource(ints = {-1, 101})
    void percentualForaDoIntervaloDeveFalhar(int percentual) {
        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> Desconto.calcular(100.0, percentual)
        );

        assertEquals(
                "O percentual deve estar entre 0 e 100.",
                excecao.getMessage()
        );
    }



    //Dica= @Timeout protege contra travamentos ou lentidão grosseira;
    // medições precisas exigem ferramentas de benchmark.
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void calcularDeveTerminarRapidamente() {
        // O teste passa se a chamada terminar antes do limite.
        Desconto.calcular(250.0, 15);
    }


    //Execute a classe inteira. Depois mude temporariamente 150.00 para 151.00 no CSV
    // e confirme que o relatório identifica somente esse conjunto.
    //
    //✓ calcularDeveAplicarPercentual: 4/4
    //✓ precoNegativoDeveLancarExcecao: 3/3
    //✓ percentualForaDoIntervaloDeveFalhar: 2/2
    //✓ calcularDeveTerminarRapidamente: 1/1
    //
    //Tests passed: 10 of 10

    //Dica = Um bom teste precisa falhar quando a expectativa é alterada. Se continuar verde,
    // ele talvez não esteja verificando o resultado correto.

}
