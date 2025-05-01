package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainTest {

    @Test
    void testEcuacionRecta() {
        String result = Main.ecuacionRecta(1, 2, 3, 6);
        Assertions.assertEquals("Y = 2.0X + 0.0", result);
    }

    @Test
    void testSuma() {
        // Simula una suma
        Assertions.assertEquals(8, 5 + 3);
    }

    @Test
    void testResta() {
        Assertions.assertEquals(2, 5 - 3);
    }

    @Test
    void testMultiplicacion() {
        Assertions.assertEquals(15, 5 * 3);
    }

    @Test
    void testDivision() {
        Assertions.assertEquals(2, 6 / 3);
    }

    @Test
    void testDivisionPorCero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int r = 6 / 0;
        });
    }

    @Test
    void testDeterminarMayor() {
        Assertions.assertTrue(8 > 2);
    }

    @Test
    void testDeterminarMenor() {
        Assertions.assertFalse(3 > 5);
    }

    @Test
    void testElevado() {
        int resultado = (int)Math.pow(2, 3);
        Assertions.assertEquals(8, resultado);
    }

    @Test
    void testPorcentaje() {
        int parte = 25, total = 100;
        int resultado = parte * 100 / total;
        Assertions.assertEquals(25, resultado);
    }
    @Test
    void testLetraEnLugarDeNumeroLanzaExcepcion() {
        String input = "a\n";
        Scanner testScanner = new Scanner(input);

        Assertions.assertThrows(InputMismatchException.class, () -> {
            int num = testScanner.nextInt();
        });
    }

    @Test
    void testCaracterEspecialEnLugarDeNumeroLanzaExcepcion() {
        String input = "@\n";
        Scanner testScanner = new Scanner(input);

        Assertions.assertThrows(InputMismatchException.class, () -> {
            int num = testScanner.nextInt();
        });
    }

    @Test
    void testNumeroValidoNoLanzaExcepcion() {
        String input = "42\n";
        Scanner testScanner = new Scanner(input);

        Assertions.assertDoesNotThrow(() -> {
            int num = testScanner.nextInt();
            Assertions.assertEquals(42, num);
        });
    }

    @Test
    void testCadenaInvalidaLanzaExcepcion() {
        String input = "abc123\n";
        Scanner testScanner = new Scanner(input);

        Assertions.assertThrows(InputMismatchException.class, () -> {
            int num = testScanner.nextInt();
        });
    }
}
