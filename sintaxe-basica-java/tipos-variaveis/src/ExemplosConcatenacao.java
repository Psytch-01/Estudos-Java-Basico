public class ExemplosConcatenacao {

    public static void main(String[] args) {
        
        // A partir da detecção de um caractere, o Java inicia a concatenação, contudo, ele realiza operações quando válidas, como vimos no Exemplo 5

        String concatenacao = "?";

        // Exemplo 1: A operação de soma é realizada primeiro (1+1+1), resultando em 3. Depois, a String "3" é concatenada com "1".
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao + " " + "Exemplo 1");

        // Exemplo 2: A String "1" é concatenada com o número 1, resultando em "11". Depois, o próximo número 1 é concatenado, resultando em "111". 
        // E o último número 1 também é concatenado, resultando em "1111".
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao + " " + "Exemplo 2");

        // Exemplo 3: A String "1" é concatenada com o número 1, e a operação continua concatenando as Strings, resultando em "1111".
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao + " " + "Exemplo 3");

        // Exemplo 4: A String "1" é concatenada com os números 1, 1, 1, resultando em "1111".
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao + " " + "Exemplo 4");
        
        // Exemplo 5: A expressão (1+1+1) é calculada primeiro, resultando em 3. Depois, a String "1" é concatenada com o resultado da soma (3), resultando em "13".
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao + " " + "Exemplo 5");

    }

}
