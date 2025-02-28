public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
    
        // Exemplo de Condição composta

        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
            
        } else if (nota > 5 && nota < 7) {
            System.out.println("Em recuperação");

        } else {   
            System.out.println("Reprovado");
        }    

        //Opção de Condição ternária 
        // Equivalentes ->         if                          else if                         else
        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Em recuperção" : "Reprovado";
        System.out.println(resultado);
    }
}
