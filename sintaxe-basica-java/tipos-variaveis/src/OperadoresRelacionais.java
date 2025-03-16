public class OperadoresRelacionais {

    public static void main(String[] args) {
        
        // Definindo algumas variáveis para comparar
        int a = 10;
        int b = 20;
        int c = 10;
        
        // Exemplo 1: Igualdade (==)
        System.out.println("A é igual a B? " + (a == b));  // false, pois 10 != 20
        System.out.println("A é igual a C? " + (a == c));  // true, pois 10 == 10

        // Exemplo 2: Diferença (!=)
        System.out.println("A é diferente de B? " + (a != b));  // true, pois 10 != 20
        System.out.println("A é diferente de C? " + (a != c));  // false, pois 10 == 10

        // Exemplo 3: Maior que (>)
        System.out.println("A é maior que B? " + (a > b));  // false, pois 10 não é maior que 20

        // Exemplo 4: Menor que (<)
        System.out.println("A é menor que B? " + (a < b));  // true, pois 10 é menor que 20

        // Exemplo 5: Maior ou igual a (>=)
        System.out.println("A é maior ou igual a B? " + (a >= b));  // false, pois 10 não é maior ou igual a 20

        // Exemplo 6: Menor ou igual a (<=)
        System.out.println("A é menor ou igual a B? " + (a <= b));  // true, pois 10 é menor ou igual a 20
    }
}
