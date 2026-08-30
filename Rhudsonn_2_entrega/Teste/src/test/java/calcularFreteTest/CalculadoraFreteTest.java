package calcularFreteTest;


import org.example.calcularFrete.CalculadoraFrete;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

  // Testes unitários para {@link CalculadoraFrete}.
class CalculadoraFreteTest {

    // Margem de tolerância usada nas comparações de double.
    private static final double DELTA = 0.001;

    @DisplayName("Deve calcular o frete corretamente para peso, modalidade e valor esperado")
    @ParameterizedTest(name = "peso={0}kg, expressa={1} -> esperado=R${2}")
    @CsvSource({
            // peso, entregaExpressa, valorEsperado
            "1, false, 10.00",   // frete comum: 8 + 2*1 = 10
            "1, true, 15.00",    // frete expresso: 10 * 1.5 = 15  (mesmo peso do caso acima)
            "5, false, 18.00",   // frete comum: 8 + 2*5 = 18
            "5, true, 27.00",    // frete expresso: 18 * 1.5 = 27 (mesmo peso do caso acima)
            "10, false, 28.00",  // frete comum: 8 + 2*10 = 28
            "0.01, false, 8.02", // valor de fronteira válido: 8 + 2*0.01 = 8.02
            "0.01, true, 12.03"  // valor de fronteira válido, modalidade expressa: 8.02 * 1.5 = 12.03
    })
    void deveCalcularFreteComSucesso(double pesoKg, boolean entregaExpressa, double valorEsperado) {
        double resultado = CalculadoraFrete.calcular(pesoKg, entregaExpressa);
        assertEquals(valorEsperado, resultado, DELTA);
    }

    @DisplayName("Deve lançar IllegalArgumentException para pesos zero ou negativos")
    @ParameterizedTest(name = "peso={0} deve lançar exceção")
    @ValueSource(doubles = {0.0, -1.0, -5.5})
    void deveLancarExcecaoParaPesoInvalido(double pesoInvalido) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> CalculadoraFrete.calcular(pesoInvalido, false)
        );

        assertEquals("O peso deve ser maior que zero.", exception.getMessage());
    }
}


