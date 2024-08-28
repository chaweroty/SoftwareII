package OCPII;

public class CalculoImpuestoReteIva extends Calculo{
    private static final double RETE_IVA = 0.10;
    public CalculoImpuestoReteIva(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calculaImpuesto() {
        return cantidad * precio * RETE_IVA;
    }
}
