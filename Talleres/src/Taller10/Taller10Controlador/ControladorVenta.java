package Taller10.Taller10Controlador;
import java.util.ArrayList;
import java.util.List;

public class ControladorVenta {
    private List<Entrada> entradas = new ArrayList<>();

    public ControladorVenta() {
        // Inicializar la lista de entradas disponibles
        entradas.add(new Entrada("VIP", 100.0,true));
        entradas.add(new Entrada("Platino", 50.0,true));
        entradas.add(new Entrada("General", 30.0,true));
    }

    public void comprarEntrada(String tipoEntrada) {
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if(entrada != null){
            if (entrada.isDisponible()) {
                entrada.setDisponible(false);
                // Aquí se realizaría el procesamiento del pago, etc.
                System.out.println("Entrada comprada.");
            } else {
                System.out.println("Entrada no disponible.");
            }
        }else{
            System.out.println("Tipo de entrada inválido");
        }
    }

    private Entrada encontrarEntrada(String tipoEntrada) {
        for (Entrada entrada : entradas) {
            if (entrada.getTipo().equalsIgnoreCase(tipoEntrada)) {
                return entrada;
            }
        }
        return null; // Retorna null si no se encontró la entrada
    }
}
