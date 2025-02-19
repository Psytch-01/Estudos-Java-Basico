public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        // Declaração de variáveis
        int a = 10, b = 5;

        // Operações básicas
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b; // Módulo (resto da divisão)

        // Exibindo os resultados
        System.out.println("Soma: " + a + " + " + b + " = " + soma);
        System.out.println("Subtração: " + a + " - " + b + " = " + subtracao);
        System.out.println("Multiplicação: " + a + " * " + b + " = " + multiplicacao);
        System.out.println("Divisão: " + a + " / " + b + " = " + divisao);
        System.out.println("Resto da divisão: " + a + " % " + b + " = " + resto);

    }
}