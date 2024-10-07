package Taller11.Taller11Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Coche coche = new Coche();
        Avión avion = new Avión();
        Bicicleta bicicleta = new Bicicleta();
        garage.estacionar(coche);
        garage.estacionar(avion);
        garage.estacionar(bicicleta);
    }
}
