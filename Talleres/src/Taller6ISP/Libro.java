package Taller6ISP;

public class Libro implements LibreriaLibro{
    private String nombre;
    private int numeroDeHojas;
    private String imagen;
    private  String serial;

    public Libro(String nombre, int numeroDeHojas, String imagen, String serial) {
        this.nombre = nombre;
        this.numeroDeHojas = numeroDeHojas;
        this.imagen = imagen;
        this.serial = serial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeHojas() {
        return numeroDeHojas;
    }

    public void setNumeroDeHojas(int numeroDeHojas) {
        this.numeroDeHojas = numeroDeHojas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void renovarPortada() {

    }

    @Override
    public void mantenimientoHojas() {

    }

    @Override
    public void solicitarNuevaversion() {

    }
}
