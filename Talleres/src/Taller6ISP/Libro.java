package Taller6ISP;

public class Libro implements LibreriaLibro{
    private String nombre;
    private int numeroDeHojas;
    private String imagen;
    private  String serial;
    private boolean prestado;

    public Libro(String nombre, int numeroDeHojas, String imagen, String serial, boolean prestado) {
        this.nombre = nombre;
        this.numeroDeHojas = numeroDeHojas;
        this.imagen = imagen;
        this.serial = serial;
        this.prestado = prestado;
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
        if (!prestado) {
            prestado = true;
            System.out.println("El libro '" + nombre + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + nombre + "' ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + nombre + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + nombre + "' no estaba prestado.");
        }
    }

    @Override
    public void renovarPortada() {
        System.out.println("La portada del libro '" + nombre + "' ha sido renovada.");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Mantenimiento realizado en las hojas del libro '" + nombre + "'.");
    }

    @Override
    public void solicitarNuevaversion() {
        System.out.println("Se ha solicitado una nueva versión del libro '" + nombre + "'.");
    }
}
