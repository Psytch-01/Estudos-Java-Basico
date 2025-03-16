public class ExemploIncrementoDecremento {

    public static void main(String[] args) {
        
        int numero = 10;

        // Pós-incremento
        System.out.println("Antes do pós-incremento: " + numero); // Exibe 10
        System.out.println("Usando pós-incremento: " + numero++); // Exibe 10, depois incrementa para 11
        System.out.println("Depois do pós-incremento: " + numero); // Exibe 11

        System.out.println();

        // Pré-incremento
        numero = 10; // Reinicio de variável
        System.out.println("Antes do pré-incremento: " + numero); // Exibe 10
        System.out.println("Usando pré-incremento: " + ++numero); // Incrementa para 11 e exibe 11
        System.out.println("Depois do pré-incremento: " + numero); // Exibe 11

        System.out.println();

        // Pós-decremento
        numero = 10; // Reinicio de variável
        System.out.println("Antes do pós-decremento: " + numero); // Exibe 10
        System.out.println("Usando pós-decremento: " + numero--); // Exibe 10, depois decrementa para 9
        System.out.println("Depois do pós-decremento: " + numero); // Exibe 9

        System.out.println();

        // Pré-decremento
        numero = 10; // Reinicio de variável
        System.out.println("Antes do pré-decremento: " + numero); // Exibe 10
        System.out.println("Usando pré-decremento: " + --numero); // Decrementa para 9 e exibe 9
        System.out.println("Depois do pré-decremento: " + numero); // Exibe 9
    }
}
