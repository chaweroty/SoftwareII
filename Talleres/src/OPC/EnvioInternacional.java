package OPC;

public class EnvioInternacional implements  Envio{

    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 2.0 + distancia *0.5;
    }
}
