package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        mostrarOpciones();
        int input;
        do {
            input=validarMenu();
            ejecutar(input);
        } while (input != 6);
    }

    private static void mostrarOpciones() {
        System.out.println("     Calculadora cientifica     ");
        System.out.println("   1-Operaciones Aritmetricas     ");
        System.out.println("   2-Ecuación Cuadrática     ");
        System.out.println("   3-Figuras Geometricas     ");
        System.out.println("   4-Sistema de ecuaciones lineales     ");
        System.out.println("   5-Ecuacion de la recta     ");
        System.out.println("   6-Salir     ");
    }

    private static void ejecutar(int input) {
        if (input == 1) {
            System.out.println("*En caso de querer determinar si un numero es mayor que otro escriba <> como simbolo de operacion");
            System.out.println("*En caso de determinar % escriba sus opciones de maenara: parte,%,total");
            operacionAritmetrica();
        }
        if (input == 2) {
            ecuacionCuadratica();
        }
        if (input == 3) {
            figurasG();
        }
        if (input == 4) {
            sistemaCuadratico();
        }
        if (input == 5) {
            ecuacionRecta(1, 2, 3, 6);
        }
        if (input == 0) {
            System.out.println(" ");
        }
    }

    private static void operacionAritmetrica() {
        int primerDigito = validarNumero();
        String simboloOperacion = validarSimbolo();
        int segundoDigito = validarNumero();
        if (simboloOperacion.equals("+")) {
            suma(primerDigito, segundoDigito);
        }
        if (simboloOperacion.equals("-")) {
            resta(primerDigito, segundoDigito);
        }
        if (simboloOperacion.equals("*")) {
            multi(primerDigito, segundoDigito);
        }
        if (simboloOperacion.equals("/")) {
            division(primerDigito, segundoDigito);
        }

        if (simboloOperacion.equals("<>")) {
            determinarMayorMenor(primerDigito, segundoDigito);
        }
        if (simboloOperacion.equals("^")) {
            elevado(primerDigito, segundoDigito);
        }
        if (simboloOperacion.equals("%")) {
            porcentaje(primerDigito, segundoDigito);
        }
        if (simboloOperacion.isEmpty()) {
            System.out.println(" ");
        }
    }

    private static void suma(int sumando1, int sumando2) {
        int resultado = sumando1 + sumando2;
        System.out.println("El resultado es " + resultado);
    }

    private static void resta(int restando1, int restando2) {
        int resultado = restando1 - restando2;
        System.out.println("El resultado es " + resultado);
    }

    private static void multi(int multi1, int multi2) {
        int resultado = multi1 * multi2;
        System.out.println("El resultado es " + resultado);
    }

    private static void division(int dividendo1, int dividendo2) {
        try {
            int resultado = dividendo1 / dividendo2;
            System.out.println("El resultado es " + resultado);
        } catch (ArithmeticException e) {
            System.out.print("No se puede dividir por 0");
        }
    }

    private static void determinarMayorMenor(int numero1, int numero2) {
        boolean resultado = numero1 > numero2;
        if (resultado) {
            System.out.println("El" + numero1 + "es mayor que " + numero2);
        } else {
            System.out.println("El" + numero1 + " es menor que " + numero2);
        }
    }

    private static void elevado(int base, int exponente) {
        int resultado = base ^ exponente;
        System.out.println("El resultado es " + resultado);
    }

    private static void porcentaje(int parte, int total) {
        int resultado = parte / total * 100;
        System.out.println("El porcentaje obtenido es" + resultado + "%");
    }

    private static void ecuacionCuadratica() {
    }

    private static void figurasG() {
    }

    private static void sistemaCuadratico() {
    }

    private static String ecuacionRecta(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        return "Y = " + m + "X + " + b;
    }

    private static int validarMenu() {
        try{
            int input = scanner.nextInt();
            if (input>=1 && input<=6) {
                return (input);
            } else {
                System.out.println("Solo se admiten numeros entre 1 y 6");
                return(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Solo se admiten numeros");
            return (0);
        }
    }

    private static int validarNumero() {
        int numero;
        try {
            numero= scanner.nextInt();
            return (numero);
    } catch (InputMismatchException e) {
            System.out.println("Solo se admiten numeros");
            return (0);
        }
    }

    private static String validarSimbolo() {
        String simbolo;
                try {
                    simbolo= scanner.nextLine();
                    return (simbolo);
                } catch (InputMismatchException e) {
                    System.out.println("Input invalido");
                    return("");
                }
    }
}