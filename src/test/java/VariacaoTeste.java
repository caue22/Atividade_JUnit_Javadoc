import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Classe para realizar testes das classes Variacao e Calculadora, que foram injetadas e mockadas.
 * 
 * <p>
 * Esta classe utiliza Mockito para criar mocks das dependências e testar o comportamento da classe Variacao.
 * </p>
 * 
 * @autor Caue Garcia
 */
public class VariacaoTeste {

    private Calculadora calculadora;
    private Variacao variacao;

    @BeforeEach
    public void setUp() {
        this.calculadora = mock(Calculadora.class);
        this.variacao = new Variacao(calculadora);
    }

    /**
     * Teste do método multiplicar e dividir.
     * 
     * <p>
     * Este teste verifica se o método multiplicaEDividePeloPrimeiro da classe Variacao funciona corretamente,
     * utilizando valores mockados para multiplicação e divisão.
     * </p>
     */
    @Test
    public void testMultiplicaEDividePeloPrimeiro() {
        when(calculadora.multiplicar(2, 3)).thenReturn(6.0);
        when(calculadora.dividir(6, 2)).thenReturn(3.0);

        double resultadoEsperado = variacao.multiplicaEDividePeloPrimeiro(2, 3);

        assertEquals(3.0, resultadoEsperado);
    }

    /**
     * Teste do método de variação de produção.
     * 
     * <p>
     * Este teste verifica se o método variacaoDeProducao da classe Variacao funciona corretamente,
     * utilizando valores mockados para subtração, divisão e multiplicação.
     * </p>
     */
    @Test
    public void testVariacaoDeProducao() {
        when(calculadora.subtrair(4233, 4250)).thenReturn(17.0);
        System.out.println("Mockando método subtrair com valores 4233 e 4250");
        when(calculadora.dividir(17, 4250)).thenReturn(0.004);
        System.out.println("Mockando método dividir diferença 17 por valor projetado 4250");
        when(calculadora.multiplicar(0.004, 100)).thenReturn(0.4);

        double resultadoEsperado = variacao.variacaoDeProducao(4233, 4250);

        assertEquals(0.4, resultadoEsperado);
    }
}
