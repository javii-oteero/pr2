package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @ParameterizedTest
    @CsvSource(
            {"'Hola Mundo', 4",
            "'Esto Es una cadenA', 8",
            "'Java mola MogollOn', 7",
            "'4h0r4 s0n num3r0s', 1",
            "'Cadena S1n Vocales', 6",
            "'', 0",
            "'cmd', 0"}
    )
    void testParametrizado(String texto, int vocales){
        assertEquals(vocales, Vocales.contarVocales(texto));
    }
}