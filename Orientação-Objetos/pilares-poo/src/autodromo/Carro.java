package autodromo;

public class Carro extends Veiculo {
    
    public void ligar () {
        confereConbustivel();
        System.out.println("Carro Ligado!");
    }

    private void confereConbustivel () {
        System.out.println("Conferindo Combustível");
    }

}
