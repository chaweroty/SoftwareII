package Taller15.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        IFabricaMuebles fabricaModerna = new FabricaModerna();
        ISilla sillaModerna = fabricaModerna.crearSilla();
        IMesa mesaModerna = fabricaModerna.crearMesa();
        sillaModerna.crear();
        mesaModerna.crear();
        IFabricaMuebles fabricaClasica = new FabricaClasica();
        ISilla sillaClasica = fabricaClasica.crearSilla();
        IMesa mesaClasica = fabricaClasica.crearMesa();
        sillaClasica.crear();
        mesaClasica.crear();
    }
}


