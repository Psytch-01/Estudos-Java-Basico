public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        // Manipulação de Volume, deixando-o em 23 ao invés do Volume inicial padrão de 25
        smartTv .diminuirVolume();
        smartTv .diminuirVolume();
        smartTv .diminuirVolume();
        smartTv .aumentarVolume();

        // Manipúlação de Volume
        smartTv.mudarCanal(04);

        // Impressões do Programa
        System.out.println("TV Ligada ?:" + " " + smartTv.ligada);
        System.out.println("canal atual ?:" + " " + smartTv.canal);
        System.out.println("Volume Atual ?:" + " " + smartTv.volume);

        
        // Liga e Desliga 
        smartTv.ligar();
        System.out.println("NOVO STATUS -> TV Ligada ?:" + " " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("NOVO STATUS -> TV Ligada ?:" + " " + smartTv.ligada);
        
    }
}
