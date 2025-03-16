public class OperadorTernario {

    public static void main(String[] args) {
        
        int idade = 18;

        // Exemplo 1: Verificando maioridade
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Idade: " + idade + " - " + resultado);

        // Exemplo 2: Número par ou ímpar. Exemplo sem string, usando 1 e 0 como true or false. 
        int numero = 8;
        int teste = numero == 7 ? 1 : 0;
        System.out.println(teste);
        
    }
}
    