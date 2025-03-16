package desafiosintaxe;

import java.util.Scanner;

public class DesafioValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = Double.parseDouble(scanner.next().replace(",", "."));
        
        // TODO: Na linha abaixo, implemente a entrada das três transações:
        
        double numero1 = Double.parseDouble(scanner.next().replace(",", "."));
        double numero2 = Double.parseDouble(scanner.next().replace(",", "."));
        double numero3 = Double.parseDouble(scanner.next().replace(",", "."));

        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        
        double saldoFinal = ((saldoInicial) + (numero1) + (numero2) + (numero3));

        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
