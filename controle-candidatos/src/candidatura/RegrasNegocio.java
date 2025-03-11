package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RegrasNegocio {

    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");

        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        
        }else {
            System.out.println("Aguradando demais candidatos");

        }
    }

    // Método Auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

}
