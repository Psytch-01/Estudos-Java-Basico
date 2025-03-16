package contador;

import java.util.Scanner;

//Fazer o DESAFIO AQUI

public class Contador {
    public static int contando;

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {

            int contando = ParametrosInvalidosException.contar(parametroUm, parametroDois);
            int i = 0;
            System.out.println("A diferença entre o " + parametroDois + " e " + parametroUm + " é " + contando + ". Iremos imprimir o resultado agora.");                
            for (i = 1; (i <= contando); i++ ) {

                System.out.println("imprimindo o número " + i);                
            }
           
                        
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
            
        }          

        
        terminal.close();
    }
}      


