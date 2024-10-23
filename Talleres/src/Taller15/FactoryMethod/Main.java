package Taller15.FactoryMethod;

public class Main {

    public static void main(String[] args) {

        CreadorPago creadorTarjeta = new CreadorTarjeta();
        IMetodoPago pagoTarjeta = creadorTarjeta.crearMetodoPago();
        pagoTarjeta.procesarPago(100.000);

        CreadorPago creadorPaypal = new CreadorPaypal();
        IMetodoPago pagoPaypal = creadorPaypal.crearMetodoPago();
        pagoPaypal.procesarPago(250.000);

    }
}

