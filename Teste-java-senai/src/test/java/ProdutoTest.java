import org.example.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {


    private Produto produto;


    @BeforeEach
    void setUp() { produto = new Produto();}


    @Test
     void calcularValorEmEstoqueDeveMultiplicarPrecoPelaQuantidade(){

        Produto produto = new Produto("Caneta", 2.00, 3);

        double obtido = produto.calcularValorEmEstoque();

        assertEquals(6.00, obtido);
    }



    @Test
    void retornarTrueQuandoHOuverProdutosNoEstoque(){

        Produto produto = new Produto("Caneta", 2.00, 1);

        assertTrue(produto.temEstoque() == true);
    }



    @Test
    void retornarFalseQuandoEstoqueForZero(){

        Produto produto = new Produto("Caneta", 2.00, 0);

        assertTrue(produto.temEstoque() == false);

    }



    @Test
    void LancaExcessaoQuandoPrecoigualZero(){
        IllegalArgumentException mensagem = assertThrows(IllegalArgumentException.class, () -> produto.setPreco(0));
        assertEquals("O preço deve ser maior que zero.", mensagem.getMessage());
    }

    @Test
    void LacaExcessaoQuandoPrecoNegativo(){
        IllegalArgumentException mensagem = assertThrows(IllegalArgumentException.class, () -> produto.setPreco(-1));
        assertEquals("O preço deve ser maior que zero.", mensagem.getMessage());
    }

    @Test
    void LancaExcessaoQuandoQuantidadeInicialForNegativa(){

        IllegalArgumentException mensagem = assertThrows(IllegalArgumentException.class, () -> produto.setEstoque(0));

        assertEquals("O estoque não pode ser negativo.", mensagem.getMessage());
    }











}
