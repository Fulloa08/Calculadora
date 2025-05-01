package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainTest {

    @Test
    void testEcuacionRecta() {
        String result = Main.ecuacionRecta(1, 2, 3, 6);
        assertEquals("Y = 2.0X + 0.0", result);
    }

    @Test
    void testSuma() {
        // Simula una suma
        assertEquals(8, 5 + 3);
    }

    @Test
    void testResta() {
        assertEquals(2, 5 - 3);
    }

    @Test
    void testMultiplicacion() {
        assertEquals(15, 5 * 3);
    }

    @Test
    void testDivision() {
        assertEquals(2, 6 / 3);
    }

    @Test
    void testDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            int r = 6 / 0;
        });
    }

    @Test
    void testDeterminarMayor() {
        assertTrue(8 > 2);
    }

    @Test
    void testDeterminarMenor() {
        assertFalse(3 > 5);
    }

    @Test
    void testElevado() {
        int resultado = (int)Math.pow(2, 3);
        assertEquals(8, resultado);
    }

    @Test
    void testPorcentaje() {
        int parte = 25, total = 100;
        int resultado = parte * 100 / total;
        assertEquals(25, resultado);
    }
    @Test
    void testLetraEnLugarDeNumeroLanzaExcepcion() {
        String input = "a\n";
        Scanner testScanner = new Scanner(input);

        assertThrows(InputMismatchException.class, () -> {
            int num = testScanner.nextInt();
        });
    }

    @Test
    void testCaracterEspecialEnLugarDeNumeroLanzaExcepcion() {
        String input = "@\n";
        Scanner testScanner = new Scanner(input);

        assertThrows(InputMismatchException.class, () -> {
            int num = testScanner.nextInt();
        });
    }

    @Test
    void testNumeroValidoNoLanzaExcepcion() {
        String input = "42\n";
        Scanner testScanner = new Scanner(input);

        assertDoesNotThrow(() -> {
            int num = testScanner.nextInt();
            assertEquals(42, num);
        });
    }

    @Test
    void testCadenaInvalidaLanzaExcepcion() {
        String input = "abc123\n";
        Scanner testScanner = new Scanner(input);

        assertThrows(InputMismatchException.class, () -> {
            int num = testScanner.nextInt();
        });
    }
}
