public class TiposPrimitivos {

    public static void main(String[] args) {
        
        // byte: 8 bits, valores de -128 a 127
        byte idade = 102;

        // short: 16 bits, valores de -32.768 a 32.767
        short ano = 2023;

        // int: 32 bits, valores de -2^31 a 2^31 - 1
        int cep = 272148250;

        // long: 64 bits, valores de -2^63 a 2^63 - 1
        long cpf = 48578132603L;

        // float: 32 bits, precisão de 6-7 dígitos decimais
        float pi = 3.14F;

        // double: 64 bits, precisão de 15 dígitos decimais
        double salario = 1275.33;

        // char: 16 bits, armazena um único caractere Unicode
        char letra = 'A';

        // boolean: 1 bit, pode ser true ou false
        boolean isMaiorDeIdade = true;

        // Exibindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("PI: " + pi);
        System.out.println("Salário: " + salario);
        System.out.println("Letra: " + letra);
        System.out.println("Maior de Idade: " + isMaiorDeIdade);
    }
}
