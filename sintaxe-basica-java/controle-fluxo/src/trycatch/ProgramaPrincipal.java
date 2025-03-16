package trycatch;

// Nesse programa principal, o uso do try catch está sendo exemplificado, tratando um tipo de excessão comum em Java. 
// A tratativa está na classe Financiamento.java, onde ela é passada na instanciação do método Financiamento

public class ProgramaPrincipal {

    public static void main(String[] args) {
        
        double valorTotal = 1000.0;
        double entrada = 200.0;
        int parcelas = 4;

        try {
            Financiamento f = new Financiamento (valorTotal, entrada, parcelas);
            System.out.println(f.prestação());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
