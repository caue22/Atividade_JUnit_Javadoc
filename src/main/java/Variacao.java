/**
 * Essa classe simula a variação de produção e utiliza a classe Calculadora para realizar cálculos básicos.
 *
 * <p>
 * A classe `Variacao` depende de uma instância da classe `Calculadora` para realizar operações de multiplicação e divisão.
 * </p>
 * 
 * @author Caue Garcia
 */
public class Variacao {

    private Calculadora calculadora;

    /**
     * Construtor utilizado para injeção de dependência da classe Calculadora dentro de Variacao.
     * 
     * @param calculadora instância da classe Calculadora utilizada para realizar operações básicas
     */
    public Variacao(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    /**
     * Método utilizado para multiplicar dois valores e depois dividir o resultado pelo primeiro valor.
     * 
     * @param valor1 primeiro valor
     * @param valor2 segundo valor
     * @return o resultado da divisão da multiplicação dos dois valores pelo primeiro valor
     */
    public double multiplicaEDividePeloPrimeiro(int valor1, int valor2) {
        double multiplicacao = calculadora.multiplicar(valor1, valor2);
        return calculadora.dividir(multiplicacao, valor1);
    }

    /**
     * Método para calcular a variação de produção, comparando o valor real com o valor projetado.
     * 
     * <p>
     * Este método calcula a diferença entre o valor real e o valor projetado, divide essa diferença pelo valor projetado e multiplica o resultado por 100 para obter a porcentagem de variação.
     * </p>
     * 
     * @param real valor de produção real
     * @param projetada valor projetado de produção
     * @return a porcentagem da variação de produção
     */
    public double variacaoDeProducao(double real, double projetada) {
        double subtrair = calculadora.subtrair(real, projetada);
        System.out.println("Extraindo diferença de kg por batida.");
        double divisao = calculadora.dividir(subtrair, projetada);
        System.out.println("Extraindo porcentagem.");
        return calculadora.multiplicar(divisao, 100);
    }
}
