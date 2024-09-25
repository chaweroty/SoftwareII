package Taller9.Taller9YAGNI;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    public void agregarLibro(Libro libro) {
        libro.setAñoPublicacion(2024);
        getLibros().add(libro);
        System.out.println("El libro "+libro.getTitulo()+" de "+libro.getAutor()+" fue agregado exitosamente");
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
