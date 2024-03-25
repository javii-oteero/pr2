package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {
    @Test
    void testContarVocalesCon4() {
        assertEquals(4, Vocales.contarVocales("Hola Mundo"));
    }

    @Test
    void testContarVocalesCon8() {
        assertEquals(8, Vocales.contarVocales("Esto Es una cadenA"));
    }

    @Test
    void testContarVocalesCon7() {
        assertEquals(7, Vocales.contarVocales("Java mola MogollOn"));
    }

    @Test
    void testContarVocalesCon1() {
        assertEquals(1, Vocales.contarVocales("4h0r4 s0n num3r0s"));
    }

    @Test
    void testContarVocalesCon6() {
        assertEquals(6, Vocales.contarVocales("Cadena S1n Vocales"));
    }

    @Test
    void testContarVocalesConCadenaVacia() {
        assertEquals(0, Vocales.contarVocales(""));
    }

    @Test
    void testContarVocalesCon0() {
        assertEquals(0, Vocales.contarVocales("cmd"));
    }
}