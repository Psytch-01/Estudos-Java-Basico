package sistemaibge;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());

        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        
        System.out.println("O melhor Estado Brasileiro é " + eb);
    }

}
