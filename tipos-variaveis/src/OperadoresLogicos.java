public class OperadoresLogicos {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 30;

        // Operador lógico E (&&) - Ambos precisam ser verdadeiros
        System.out.println("Operador AND (&&):");
        System.out.println("(a < b) && (b < c): " + ((a < b) && (b < c))); // true && true -> true
        System.out.println("(a > b) && (b < c): " + ((a > b) && (b < c))); // false && true -> false
        System.out.println("(a > b) && (b > c): " + ((a > b) && (b > c))); // false && false -> false

        // Operador lógico OU (||) - Apenas um precisa ser verdadeiro
        System.out.println("\nOperador OR (||):");
        System.out.println("(a < b) || (b < c): " + ((a < b) || (b < c))); // true || true -> true
        System.out.println("(a > b) || (b < c): " + ((a > b) || (b < c))); // false || true -> true
        System.out.println("(a > b) || (b > c): " + ((a > b) || (b > c))); // false || false -> false

        // Operador lógico NÃO (!) - Inverte o valor booleano
        System.out.println("\nOperador NOT (!):");
        System.out.println("!(a < b): " + (!(a < b))); // !true -> false
        System.out.println("!(b > c): " + (!(b > c))); // !false -> true

        // Exemplo 1: Verificando se um número está no intervalo de 10 a 20
        int numero = 15;
        boolean dentroDoIntervalo = numero >= 10 && numero <= 20;
        System.out.println("\nO número " + numero + " está entre 10 e 20? " + dentroDoIntervalo);

        // Exemplo 2: Pode dirigir (idade mínima 18 e CNH válida)
        int idade = 17;
        boolean temCnh = true;
        boolean podeDirigir = idade >= 18 && temCnh;
        System.out.println("Pode dirigir? " + podeDirigir);
    }
}
