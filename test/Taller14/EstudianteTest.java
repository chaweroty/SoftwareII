package Taller14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

class EstudianteTest {

    private static Estudiante estudiante;


    @BeforeAll
    public static void setup() {
        estudiante = new Estudiante("Juan", 24);
        System.out.println("Inicio de las pruebas...");
    }

    @AfterAll
    public static void teardown() {
        System.out.println("Fin de las pruebas.");
    }

    @Test
    public void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        assertEquals(8.5, estudiante.obtenerPromedio(), 0.001, "La calificación agregada no es la esperada.");
    }

    @Test
    public void obtenerPromedioTest() {
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.0);
        double promedioEsperado = (8.5 + 9.0 + 7.0) / 3;
        assertEquals(promedioEsperado, estudiante.obtenerPromedio(), 0.001, "El promedio no es el esperado.");
    }

    @Test
    public void getNumeroCalificacionesTest() {
        estudiante = new Estudiante("Juan", 24);
        estudiante.agregarCalificacion(8.5);
        estudiante.agregarCalificacion(9.0);
        estudiante.agregarCalificacion(7.0);
        int numeroEsperado = 3;
        assertEquals(numeroEsperado, estudiante.getNumeroCalificaciones(), "El número de calificaciones no es el esperado.");
    }

    @Test
    public void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(-1);
        });
        assertEquals("La calificacion debe estar entre 0 y 10.", exception.getMessage());
    }
}