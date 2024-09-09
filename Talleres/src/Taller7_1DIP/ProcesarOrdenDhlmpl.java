package Taller7_1DIP;

public class ProcesarOrdenDhlmpl implements IProcesarOrdenDhl{


    @Override
    public void enviarOrdenDhl(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia");
        System.out.println(orden.getLugarDestino());
        System.out.println("Con la operadora Dhl");

    }
}
