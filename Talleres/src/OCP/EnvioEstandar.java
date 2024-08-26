package OCP;

public class EnvioEstandar implements Envio {

    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.5 + distancia * 0.1;
    }
}
