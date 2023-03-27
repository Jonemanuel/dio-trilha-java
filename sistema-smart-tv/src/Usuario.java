public class Usuario {
    public static void main(String[] args) throws Exception {
        //Criando uma nova instância da classe SmartTv
        SmartTv smartTv = new SmartTv();
        
        //chamando o metodo mudarcanal 
        smartTv.mudarCanal(13);
            System.out.println("Canal Atual:" +smartTv.canal);

        //chamando o metodo mudar volume 
        smartTv.diminuirVolume();
            System.out.println("Volume Atual?:" +smartTv.volume);

            System.out.println("TV Ligada?:" + smartTv.ligada);
            System.out.println("Canal Atual:" +smartTv.canal);
            System.out.println("Volume Atual?:" +smartTv.volume);

        //chamando o metodo ligar tv
        smartTv.ligar();
            System.out.println("Novo status -> TV Ligada?:" + smartTv.ligada);

    }
}
