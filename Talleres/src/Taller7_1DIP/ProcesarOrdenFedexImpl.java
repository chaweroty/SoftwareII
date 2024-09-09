package Taller7_1DIP;

public class ProcesarOrdenFedexImpl implements IProcesarOrdenFedex {
    @Override
    public void enviarOrdenFedex(Orden orden) {
            System.out.println(orden.getLugarOrigen());
            System.out.println("Hacia");
            System.out.println(orden.getLugarDestino());
        System.out.println("Con la operadora Fedex");
    }
        }





