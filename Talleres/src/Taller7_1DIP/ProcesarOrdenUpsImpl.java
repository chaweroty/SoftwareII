package Taller7_1DIP;

public class ProcesarOrdenUpsImpl implements IProcesarOrdenUps{

    @Override
    public void enviarOrdenUps(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia");
        System.out.println(orden.getLugarDestino());
        System.out.println("Con la operadora Ups");
    }
}
