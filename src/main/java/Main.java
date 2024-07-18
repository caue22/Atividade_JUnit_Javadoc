/**
 * Classe Main.
 * 
 * <p>
 * Esta classe demonstra a utilização de métodos básicos de cálculo usando a classe {@link Calculadora}.
 * </p>
 * 
 * @author Caue Garcia
 */
public class Main {
    /**
     * Ponto de entrada do programa.
     * 
     * <p>
     * Este método demonstra a utilização dos métodos de soma, subtração, multiplicação e divisão da classe {@link Calculadora}.
     * </p>
     * 
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(10, 5);
        System.out.println("Soma: " + soma);

        double subtracao = calculadora.subtrair(10, 5);
        System.out.println("Subtração: " + subtracao);

        double multiplicacao = calculadora.multiplicar(10, 5);
        System.out.println("Multiplicação: " + multiplicacao);

        try {
            double divisao = calculadora.dividir(10, 5);
            System.out.println("Divisão: " + divisao);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Tentativa de divisão por zero
        try {
            double divisaoPorZero = calculadora.dividir(10, 0);
            System.out.println("Divisão por zero: " + divisaoPorZero);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
