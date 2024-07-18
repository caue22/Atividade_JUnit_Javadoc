/** 
 * Essa classe simula uma calculadora com operações básicas.
 *
 * <p>
 * A classe fornece métodos para realizar operações de soma, subtração, multiplicação e divisão.
 * </p>
 * 
 * 
 */
public class Calculadora {

    /**
     * Método utilizado para somar dois valores inteiros.
     * 
     * @param a primeiro valor
     * @param b segundo valor
     * @return a soma dos valores
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Método utilizado para subtrair dois valores.
     * 
     * @param a primeiro valor
     * @param b segundo valor
     * @return a subtração dos valores
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Método utilizado para multiplicar dois valores.
     * 
     * @param a primeiro valor
     * @param b segundo valor
     * @return a multiplicação dos valores
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Método utilizado para dividir dois valores.
     * 
     * <p>
     * Se o divisor for zero, uma {@link IllegalArgumentException} será lançada.
     * </p>
     * 
     * @param a primeiro valor
     * @param b segundo valor
     * @return a divisão dos valores
     * @throws IllegalArgumentException se o divisor for zero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
