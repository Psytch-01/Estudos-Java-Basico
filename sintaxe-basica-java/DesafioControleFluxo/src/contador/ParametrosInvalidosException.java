package contador;

import java.util.InputMismatchException;

public class ParametrosInvalidosException {

    static int contar(int parametroUm, int parametroDois) { 

               
        // Validando se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm <= parametroDois) {
            
            return Contador.contando = parametroDois - parametroUm;
                               
        }else if (parametroDois < parametroUm) {
            throw new RuntimeException("O segundo número precisa ser maior que o primeiro número");

        }else {
            throw new InputMismatchException("O número deve ser inteiro"); // 
            
       } 
    }
}
