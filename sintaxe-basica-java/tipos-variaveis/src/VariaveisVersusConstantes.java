public class VariaveisVersusConstantes {

    public static void main(String[] args) {
        
        // Variável
        int idade = 25;  // Uma variável pode ter seu valor alterado durante a execução do programa.
        System.out.println("Idade inicial: " + idade);
        
        // Modificando o valor da variável
        idade = 30;
        System.out.println("Idade após atualização: " + idade);
        
        // Constante
        final double PI = 3.14159;  // Uma constante tem seu valor fixo e não pode ser alterado após sua declaração.

        // PI = 2;
        // Tentar modificar o valor de uma constante irá gerar um erro

        System.out.println("Valor de PI: " + PI);


        // PI = 3.14; // Erro de compilação, não é permitido modificar uma constante
        

    }
}
