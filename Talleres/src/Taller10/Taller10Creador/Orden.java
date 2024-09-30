package Taller10.Taller10Creador;
import java.util.ArrayList;
import java.util.List;
public class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private FabricaComputadoras fabrica = new FabricaComputadoras();

    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram) {
        Computadora computadora = fabrica.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Computadoras en la orden:");
        for (Computadora computadora : computadoras) {
            System.out.println(computadora+"\t"+computadora.getProcesador()+"\t"+computadora.getTarjetaGrafica()+"\t"+computadora.getRam());
        }
    }
}
