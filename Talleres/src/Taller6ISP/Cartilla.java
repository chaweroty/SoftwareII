package Taller6ISP;

public class Cartilla implements LibreriaCartilla {
    private String nombre;
    private int numeroHojas;
    private boolean prestado;

    public Cartilla(String nombre, int numeroHojas, boolean prestado) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
        this.prestado = prestado;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("La cartilla '" + nombre + "' ha sido prestada.");
        } else {
            System.out.println("La cartilla '" + nombre + "' ya está prestada.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("La cartilla '" + nombre + "' ha sido devuelta.");
        } else {
            System.out.println("La cartilla '" + nombre + "' no estaba prestada.");
        }
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Mantenimiento realizado en la cartilla '" + nombre + "'. Número de hojas: " + numeroHojas);
    }
}
