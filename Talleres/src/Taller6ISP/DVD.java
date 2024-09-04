package Taller6ISP;

public class DVD implements LibreriaDVD{
    private String nombre;
    private String archivo;
    private int stock;

    public DVD(String nombre, String archivo, int stock) {
        this.nombre = nombre;
        this.archivo = archivo;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }
}
