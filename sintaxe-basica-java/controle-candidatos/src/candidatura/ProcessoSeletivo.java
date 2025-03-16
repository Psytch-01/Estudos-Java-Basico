package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {
            "Ana Souza", 
            "Carlos Pereira", 
            "Mariana Oliveira", 
            "João Silva", 
            "Fernanda Costa"            
        };
        for (String candidato: candidatos ) { 
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu =RegrasNegocio.atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
                


        }while(continuarTentando && tentativasRealizadas < 3);

            if(atendeu){
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
            }else {
                System.out.println("não conseguimos contato com " + candidato +", número máximo de tentativas " + tentativasRealizadas + " realizada");
            }


    }

    static void imprimirCandidatos() {
        String[] candidatos = {
            "Ana Souza", 
            "Carlos Pereira", 
            "Mariana Oliveira", 
            "João Silva", 
            "Fernanda Costa"            
        };

        System.out.println("Imprimindo a lista de candidatos, informando o índice do elemento");

        for (int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);

        }
    }

    static void selecaoCandidatos() {

        String[] candidatos = {
            "Ana Souza", 
            "Carlos Pereira", 
            "Mariana Oliveira", 
            "João Silva", 
            "Fernanda Costa", 
            "Lucas Almeida", 
            "Patricia Rocha", 
            "Rafael Lima", 
            "Juliana Santos", 
            "Eduardo Martins"
        };
            
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
    
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = RegrasNegocio.valorPretendido();

            System.out.println("O candidato " + candidato + "  Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
    
        }       
    }
}
