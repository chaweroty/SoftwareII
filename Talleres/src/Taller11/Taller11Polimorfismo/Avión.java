package Taller11.Taller11Polimorfismo;

public class Avión implements Transporte {
    @Override
    public void acelerar() {
        System.out.println("El avión acelera.");
    }

    @Override
    public void frenar() {
        System.out.println("El avión frena");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Info del avión");
    }
}
