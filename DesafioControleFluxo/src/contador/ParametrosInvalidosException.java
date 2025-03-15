package contador;

import java.util.InputMismatchException;

public class ParametrosInvalidosException {

    static int contar(int parametroUm, int parametroDois) { // throws ParametrosInvalidosException {

               
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm <= parametroDois) {
            
            return Contador.contando = parametroDois - parametroUm;
                               
        }else if (parametroDois < parametroUm) {
            throw new RuntimeException("O segundo parâmetro deve ser maior que o primeiro");

        }else {
            throw new InputMismatchException("O número deve ser inteiro");
            
        // Realizar o for para imprimir os números com base na variável contagem
       } 
    }
}
