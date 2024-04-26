public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);
        

        smartTv.ligar ();
        System.out.println("TV ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.trocarCanalUp();
        smartTv.trocarCanalUp();
        System.out.println("Volume " + smartTv.volume);
        System.out.println("canal " + smartTv.canal);

        smartTv.escolherCanal(15);
        System.out.println("canal " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV ligada ? " + smartTv.ligada);
        
    }
    
}
