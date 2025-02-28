public class SistemaMedida {

    public static void main(String[] args) {
        
        // O Switch Case tem uma boa proposta em casos específicos, contudo, não traz muitas vantagens a nível de sintaxe, 
        //podendo ser confuso e mais tendencioso a dar problemas

        String sigla = "G";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
        
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
        
            case "G": {
                System.out.println("GRANDE");
                break;
            }
        
            default:
                System.out.println("INDEFINIDO");
                   
        }
    }
}
