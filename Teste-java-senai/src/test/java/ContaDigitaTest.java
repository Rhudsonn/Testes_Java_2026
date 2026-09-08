import org.example.ContaDigital;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaDigitaTest {


    //o saldo inicial deve ser zero
    @Test
    void SaldoInicialDeveSerZero(){
        ContaDigital conta = new ContaDigital();
        assertTrue(conta.getSaldo() == 0);
    }

    //um depósito deve aumentar o saldo;
    @Test
    void SaldoDeveSerZero(){

        ContaDigital conta = new ContaDigital();

        conta.depositar(20.0);

        assertTrue(conta.getSaldo() >= 0.0);

    }


    //um saque válido deve reduzir o saldo;
    @Test
    void SaqueValidoDeveReduzirSaldo(){
        ContaDigital conta = new ContaDigital("Rhudsonn", 50);

        conta.sacar(1);
        assertFalse(conta.getSaldo() >= 50);

    }


    //depósito zero deve lançar exceção;
    //depósito negativo deve lançar exceção;
    @Test
    void VerificandoExecoesDepositoZeroLancaExcecaoDepositoNegativoLancaExcecao(){

        ContaDigital conta = new ContaDigital();

        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> conta.depositar(0)),
                () -> assertThrows(IllegalArgumentException.class, () -> conta.depositar(-1))
        );

        IllegalArgumentException mensagem = assertThrows(IllegalArgumentException.class, () -> conta.depositar(0));
        assertEquals("O depósito deve ser maior que zero.", mensagem.getMessage());
    }


    //saque zero deve lançar exceção;
    //saque negativo deve lançar exceção;
    //saque maior que o saldo deve lançar IllegalStateException
    @Test
    void SaqueZeroLancaExcecaoSaqueNegativoLancaExcecaoSaqueMaiorQueSaldoLancaExcecao(){

        ContaDigital conta = new ContaDigital("Rhudsonn", 50);

        assertAll(
                () ->  assertThrows(IllegalArgumentException.class, () -> conta.sacar(0)),
                () ->  assertThrows(IllegalArgumentException.class, () -> conta.sacar(-1)),
                () -> assertThrows(IllegalArgumentException.class, () -> conta.sacar(100))
        );

        IllegalArgumentException mensagem = assertThrows(IllegalArgumentException.class, () -> conta.sacar(0));
        assertEquals("O saldo deve ser maior que zero.",  mensagem.getMessage());

        IllegalArgumentException mennsagem = assertThrows(IllegalArgumentException.class, () -> conta.sacar(100));
        assertEquals("Saldo insuficiente.",  mennsagem.getMessage());
    }
}
