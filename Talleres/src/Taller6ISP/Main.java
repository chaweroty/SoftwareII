package Taller6ISP;

public class Main {
    public static void main(String [] args) {
        LibreriaCartilla cartilla1 = new Cartilla("Software II", 200,false);
        LibreriaDVD DVD1 = new DVD("Interestelar","mp4",20);
        LibreriaLibro libro1 = new Libro("Se tú", 170, "pasta", "123456543",false);

        cartilla1.prestar();
        cartilla1.mantenimientoHojas();
        cartilla1.devolver();
        cartilla1.devolver();

        DVD1.prestar();
        DVD1.devolver();

        libro1.prestar();
        libro1.renovarPortada();
        libro1.devolver();
    }
}
