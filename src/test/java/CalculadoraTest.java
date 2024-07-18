import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Classe para realizar teste da classe Calculadora.
 * 
 * <p>
 * Esta classe contém métodos para testar as operações básicas de uma calculadora.
 * </p>
 * 
 * @author Caue Garcia
 */
public class CalculadoraTest {
    private Calculadora calculadora;

    /**
     * Configuração inicial para os testes.
     * 
     * <p>
     * Este método é executado antes de cada teste, inicializando uma instância da calculadora.
     * </p>
     */
    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    /**
     * Limpeza após os testes.
     * 
     * <p>
     * Este método é executado após cada teste, liberando os recursos utilizados.
     * </p>
     */
    @AfterEach
    public void tearDown() {
        calculadora = null;
    }

    /**
     * Testa o método de soma.
     * 
     * <p>
     * Este método verifica se a soma de 5 e 3 é igual a 8.
     * </p>
     */
    @Test
    public void testSoma() {
        assertEquals(8, calculadora.somar(5, 3));
    }

    /**
     * Testa o método de subtração.
     * 
     * <p>
     * Este método verifica se a subtração de 10 por 4 é igual a 6.
     * </p>
     */
    @Test
    public void testSubtracao() {
        assertEquals(6, calculadora.subtrair(10, 4));
    }

    /**
     * Testa o método de multiplicação.
     * 
     * <p>
     * Este método verifica se a multiplicação de 3 por 5 é igual a 15.
     * </p>
     */
    @Test
    public void testMultiplicacao() {
        assertEquals(15, calculadora.multiplicar(3, 5));
    }

    /**
     * Testa o método de divisão.
     * 
     * <p>
     * Este método verifica se a divisão de 10 por 2 é igual a 5.0.
     * </p>
     */
    @Test
    public void testDivisao() {
        assertEquals(5.0, calculadora.dividir(10, 2));
    }

    /**
     * Testa a divisão por zero.
     * 
     * <p>
     * Este método verifica se a divisão por zero lança uma IllegalArgumentException.
     * </p>
     */
    @Test
    public void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
    }
}