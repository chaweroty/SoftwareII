package Taller9.Taller9YAGNI;

public class Yagni  {

    public static void main(String[] args) {
        Libro l1 = new Libro("El  sutil arte de que todo te importe un carajo", "Mark Manson", 2017);
        Libro l2 = new Libro("Número Uno", "Anders Ericsson y Robert Pool", 2018);
        Biblioteca b = new Biblioteca();
        b.agregarLibro(l1);
        b.agregarLibro(l2);
    }
}
