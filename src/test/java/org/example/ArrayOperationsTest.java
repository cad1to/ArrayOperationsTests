package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {

    @Test
    void numZero_arrayNulo_lanzaNullPointerException() {
        assertThrows(NullPointerException.class, () -> ArrayOperations.numZero(null));
    }

    @Test
    void numZero_arrayVacio_retornaCero() {
        assertEquals(0, ArrayOperations.numZero(new int[] {}));
    }

    @Test
    void numZero_sinCeros_retornaCero() {
        assertEquals(0, ArrayOperations.numZero(new int[] {1, 2, 3}));
    }

    @Test
    void numZero_cerosEnMedio_cuentaTodos() {
        assertEquals(2, ArrayOperations.numZero(new int[] {1, 0, 2, 0, 3}));
    }

    @Test
    void numZero_ceroAlFinal_loCuenta() {
        assertEquals(1, ArrayOperations.numZero(new int[] {1, 2, 0}));
    }
    //El ciclo for inicia en i = 1 entonces cada que el 0 esta en la primera posicion no lo cuenta por eso las siguientes 3 pruebas fallan.
    @Test
    void numZero_ceroAlInicio_loCuenta() {
        assertEquals(1, ArrayOperations.numZero(new int[] {0, 1, 2}));
    }

    @Test
    void numZero_unSoloElementoCero_retornaUno() {
        assertEquals(1, ArrayOperations.numZero(new int[] {0}));
    }

    @Test
    void numZero_todosCeros_cuentaTodos() {
        assertEquals(3, ArrayOperations.numZero(new int[] {0, 0, 0}));
    }

    @Test
    void numZero_soloNegativosYPositivos_retornaCero() {
        assertEquals(0, ArrayOperations.numZero(new int[] {-1, 5, -3, 7}));
    }

}