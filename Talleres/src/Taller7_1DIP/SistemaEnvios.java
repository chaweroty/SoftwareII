package Taller7_1DIP;

public class SistemaEnvios {
   private IProcesarOrdenFedex procesarOrdenFedex;
   private IProcesarOrdenDhl procesarOrdenDhl;
   private IProcesarOrdenUps procesarOrdenUps;

    public SistemaEnvios(IProcesarOrdenFedex procesarOrdenFedex, IProcesarOrdenDhl procesarOrdenDhl, IProcesarOrdenUps procesarOrdenUps){
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenDhl = procesarOrdenDhl;
        this.procesarOrdenUps = procesarOrdenUps;
    }

    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    public void enviarOrdenDhl(Orden orden){
        procesarOrdenDhl.enviarOrdenDhl(orden);
    }
    public void enviarOrdenUps(Orden orden){
        procesarOrdenUps.enviarOrdenUps(orden);
    }
}
