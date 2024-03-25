package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {
    @Test
    void contarVocalesCon4() {
        assertEquals(4, Vocales.contarVocales("Hola Mundo"));
    }
}