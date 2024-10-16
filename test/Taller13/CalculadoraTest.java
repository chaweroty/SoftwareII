package Taller13;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    public static void init() {
        calculadora = new Taller13.Calculadora();
    }

    @Test
    public void testSumar() {
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
        assertNotEquals(4, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    @Test
    public void testRestar() {
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
        assertNotEquals(0, resultado);
        assertTrue(resultado >= 0);
        assertFalse(resultado < -5);
    }

    @RepeatedTest(3)
    public void testMultiplicar() {
        int resultado = calculadora.multiplicar(4, 2);
        assertEquals(8, resultado);
        assertNotEquals(0, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    @Test
    public void testDividir() {
        double resultado = calculadora.dividir(10, 2);
        assertEquals(5.0, resultado);
        assertNotEquals(3.0, resultado);
        assertTrue(resultado > 0);
        assertFalse(resultado < 0);
    }

    @Test
    public void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
