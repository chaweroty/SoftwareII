package Taller15.FactoryMethod;

public class PagoTarjeta implements IMetodoPago{
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("El pago fue de: $" + cantidad + " realizado por medio de Tarjeta.");
    }
}
