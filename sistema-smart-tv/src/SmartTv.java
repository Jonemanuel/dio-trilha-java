public class SmartTv {
    //variáveis
    boolean ligada= false;
    int canal=1;
    int volume=25;
    
    //metodo para mudar o canal
    public void mudarCanal (int novoCanal){
        canal=novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    //Metodo para definir o volume
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    //metodo para lifar a TV
    public void ligar (){
        ligada= true;
    }
    public void desligar (){
        ligada= false;
    }
}