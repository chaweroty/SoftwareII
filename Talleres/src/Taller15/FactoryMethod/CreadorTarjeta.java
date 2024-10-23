package Taller15.FactoryMethod;

public class CreadorTarjeta extends CreadorPago{
    @Override
    public IMetodoPago crearMetodoPago() {
        return new PagoTarjeta();
    }
}
