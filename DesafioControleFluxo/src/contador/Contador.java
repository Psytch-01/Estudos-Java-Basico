package contador;

import java.util.Scanner;

//Fazer o DESAFIO AQUI

public class Contador {
    public static int contando;

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        try {

            int contando = ParametrosInvalidosException.contar(parametroUm, parametroDois);
           
            System.out.println(contando);                
           
                        
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        terminal.close();
    }
}      

//java.util.InputMismatchException Ao colocar uma letra
//java.util.InputMismatchException  Ao colocar 10.0
//java.util.InputMismatchException Ao colocar -

