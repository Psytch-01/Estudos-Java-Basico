public class OperadorUnario {

    public static void main(String[] args) {
        
        int numero = 5;

        // Exemplo 1: Negação unária
        numero = -numero; // Inverte o sinal de "numero", de 5 para -5
        System.out.println(numero); // Resultado: -5

        // Exemplo 2: Incremento unário
        numero++; // Incrementa o valor de "numero" de -5 para -4
        System.out.println(numero); // Resultado: -4

        // Exemplo 3: Decremento unário
        numero--; // Decrementa o valor de "numero" de -4 para -5
        System.out.println(numero); // Resultado: -5

        // Exemplo 4: Negação lógica unária
        boolean valor = true;
        valor = !valor; // Inverte o valor de "flag", de true para false
        System.out.println(valor); // Resultado: false
    }

}
