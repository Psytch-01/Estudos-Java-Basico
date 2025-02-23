public class SmartTv {
    // Implementação dos status iniciais da "SmartTV"
    boolean ligada=false;
    int canal = 1;
    int volume = 25;


    // Implementação dos Métodos ligar e desligar para que sejam chamados pelo Usuário
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
   }

   // Implementação dos Métodos aumentarVolume e diminuirVolume para que sejam chamados pelo Usuário
   public void aumentarVolume(){
        // volume = volume + 1;
        volume++;
    }
    
    public void diminuirVolume(){
       // volume = volume - 1;
        volume--;
   }
   
   // Implementação dos Métodos de manipulação de canal da Televisão
    public void aumentarCanal(){
    canal++;
    }

    public void diminuirCanal(){
    canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }

}
