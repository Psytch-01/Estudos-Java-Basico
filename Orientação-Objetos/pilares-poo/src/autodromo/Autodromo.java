package autodromo;

public class Autodromo {
    public static void main(String[] args) {

        
        Carro jeep = new Carro();
        
        //jeep.ligar();
        jeep.setChassi("6545641");
        
        Moto r15 =  new Moto();
        r15.setChassi("1265896");
        //r15.ligar();

        //Fazendo uso do Polimorfismo
        Veiculo coringa = r15;
        coringa.ligar();
        
    }
}