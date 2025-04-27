package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int input;
        do {
            mostrarOpciones();
            input = validarMenu();
            ejecutar(input);
        } while (input != 6);
        System.out.println("¡Gracias por usar la Calculadora Científica! Hasta pronto.");
    }

    private static void mostrarOpciones() {
        System.out.println("\n=== Calculadora Científica ===");
        System.out.println("Seleccione una opción:");
        System.out.println("1 - Operaciones Aritméticas");
        System.out.println("2 - Resolver Ecuación Cuadrática");
        System.out.println("3 - Cálculo de Figuras Geométricas");
        System.out.println("4 - Sistema de Ecuaciones Lineales");
        System.out.println("5 - Ecuación de la Recta");
        System.out.println("6 - Salir\n");
        System.out.print("Ingrese su opción: ");
    }

    private static void ejecutar(int input) {
        switch (input) {
            case 1:
                operacionAritmetrica();
                break;
            case 2:
                pedirDatosCuadratica();
                break;
            case 3:
                calcularFigurasGeometricas();
                break;
            case 4:
                sistemaCuadratico();
                break;
            case 5:
                ecuacionRecta();
                break;
            case 6:
                // Salir
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }
    }

    private static void operacionAritmetrica() {
        System.out.println("\n*** Operaciones Aritméticas ***");
        System.out.println("Símbolos válidos:");
        System.out.println("+ (suma), - (resta), * (multiplicación), / (división),");
        System.out.println("<> (comparar mayor o menor), ^ (potencia), % (porcentaje)");

        System.out.print("Ingrese el primer número: ");
        int primerDigito = validarNumero();

        System.out.print("Ingrese el símbolo de la operación: ");
        String simboloOperacion = validarSimbolo();

        System.out.print("Ingrese el segundo número: ");
        int segundoDigito = validarNumero();

        switch (simboloOperacion) {
            case "+":
                suma(primerDigito, segundoDigito);
                break;
            case "-":
                resta(primerDigito, segundoDigito);
                break;
            case "*":
                multi(primerDigito, segundoDigito);
                break;
            case "/":
                division(primerDigito, segundoDigito);
                break;
            case "<>":
                determinarMayorMenor(primerDigito, segundoDigito);
                break;
            case "^":
                elevado(primerDigito, segundoDigito);
                break;
            case "%":
                porcentaje(primerDigito, segundoDigito);
                break;
            default:
                System.out.println("Operación no reconocida.");
        }
    }

    private static void suma(int a, int b) {
        System.out.println("Resultado: " + (a + b));
    }

    private static void resta(int a, int b) {
        System.out.println("Resultado: " + (a - b));
    }

    private static void multi(int a, int b) {
        System.out.println("Resultado: " + (a * b));
    }

    private static void division(int a, int b) {
        try {
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    private static void determinarMayorMenor(int a, int b) {
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println(a + " es menor que " + b);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    private static void elevado(int base, int exponente) {
        System.out.println("Resultado: " + (int)Math.pow(base, exponente));
    }

    private static void porcentaje(int parte, int total) {
        if (total == 0) {
            System.out.println("Error: Total no puede ser cero.");
        } else {
            double resultado = (parte * 100.0) / total;
            System.out.println("Porcentaje: " + resultado + "%");
        }
    }

    private static void pedirDatosCuadratica() {
        System.out.println("\n*** Resolver Ecuación Cuadrática ***");
        System.out.println("Formato: Ax^2 + Bx + C = 0");
        System.out.print("Ingrese A: ");
        double A = validarNumero();
        System.out.print("Ingrese B: ");
        double B = validarNumero();
        System.out.print("Ingrese C: ");
        double C = validarNumero();
        resolverCuadratica(A, B, C);
    }

    private static void resolverCuadratica(double A, double B, double C) {
        double discriminante = (B * B) - (4 * A * C);

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
            return;
        }
        double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
        double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
        System.out.println("Soluciones:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    private static void sistemaCuadratico() {
        System.out.println("\n*** Resolver Sistema de Ecuaciones Lineales ***");
        System.out.println("Formato:");
        System.out.println("A*x + B*y = C");
        System.out.println("D*x + E*y = F");

        System.out.print("Ingrese A: ");
        double A = validarNumero();
        System.out.print("Ingrese B: ");
        double B = validarNumero();
        System.out.print("Ingrese C: ");
        double C = validarNumero();
        System.out.print("Ingrese D: ");
        double D = validarNumero();
        System.out.print("Ingrese E: ");
        double E = validarNumero();
        System.out.print("Ingrese F: ");
        double F = validarNumero();

        resolverSistema(A, B, C, D, E, F);
    }

    private static void resolverSistema(double A, double B, double C, double D, double E, double F) {
        double determinante = A * E - B * D;
        if (determinante == 0) {
            System.out.println("El sistema no tiene solución única.");
            return;
        }
        double x = (C * E - B * F) / determinante;
        double y = (A * F - C * D) / determinante;
        System.out.println("Soluciones:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void ecuacionRecta() {

        System.out.print("Introduce el valor de x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Introduce el valor de y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Introduce el valor de x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Introduce el valor de y2: ");
        double y2 = scanner.nextDouble();

        double m = (y2 - y1) / (x2 - x1);

        double b = y1 - m * x1;

        System.out.println("La ecuación de la recta que pasa por los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es:");
        System.out.println("y = " + m + "x + " + b);
    }

    private static void calcularFigurasGeometricas() {
        System.out.println("\n*** Cálculo de Figuras Geométricas ***");
        System.out.println("1 - Cuadrado\n2 - Rectángulo\n3 - Círculo\n4 - Esfera\n5 - Cubo\n6 - Cono");
        System.out.print("Seleccione una figura: ");
        int figura = validarNumero();

        System.out.println("Operaciones disponibles:");
        System.out.println("1 - Perímetro\n2 - Área\n3 - Volumen (si aplica)");
        System.out.print("Seleccione la operación: ");
        int operacion = validarNumero();

        switch (figura) {
            case 1:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                if (operacion == 1) {
                    System.out.println("Perímetro: " + (4 * lado));
                } else if (operacion == 2) {
                    System.out.println("Área: " + (lado * lado));
                } else {
                    System.out.println("Un cuadrado no tiene volumen.");
                }
                break;
            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = scanner.nextDouble();
                if (operacion == 1) {
                    System.out.println("Perímetro: " + (2 * (base + altura)));
                } else if (operacion == 2) {
                    System.out.println("Área: " + (base * altura));
                } else {
                    System.out.println("Un rectángulo no tiene volumen.");
                }
                break;
            case 3:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                if (operacion == 1) {
                    System.out.println("Perímetro (circunferencia): " + (2 * Math.PI * radio));
                } else if (operacion == 2) {
                    System.out.println("Área: " + (Math.PI * radio * radio));
                } else {
                    System.out.println("Un círculo no tiene volumen.");
                }
                break;
            case 4:
                System.out.print("Ingrese el radio de la esfera: ");
                radio = scanner.nextDouble();
                if (operacion == 2) {
                    System.out.println("Área: " + (4 * Math.PI * radio * radio));
                } else if (operacion == 3) {
                    System.out.println("Volumen: " + (4.0 / 3.0 * Math.PI * Math.pow(radio, 3)));
                } else {
                    System.out.println("Una esfera no tiene perímetro.");
                }
                break;
            case 5:
                System.out.print("Ingrese el lado del cubo: ");
                lado = scanner.nextDouble();
                if (operacion == 2) {
                    System.out.println("Área: " + (6 * lado * lado));
                } else if (operacion == 3) {
                    System.out.println("Volumen: " + (Math.pow(lado, 3)));
                } else {
                    System.out.println("Un cubo no tiene perímetro.");
                }
                break;
            case 6:
                System.out.print("Ingrese el radio del cono: ");
                radio = scanner.nextDouble();
                System.out.print("Ingrese la altura del cono: ");
                altura = scanner.nextDouble();
                if (operacion == 3) {
                    System.out.println("Volumen: " + (Math.PI * radio * radio * altura) / 3);
                } else if (operacion == 2) {
                    System.out.print("Ingrese la generatriz del cono: ");
                    double generatriz = scanner.nextDouble();
                    System.out.println("Área lateral: " + (Math.PI * radio * generatriz));
                } else {
                    System.out.println("El perímetro no aplica para conos.");
                }
                break;
            default:
                System.out.println("Figura no reconocida.");
        }
    }

    private static int validarMenu() {
        try {
            int input = scanner.nextInt();
            if (input >= 1 && input <= 6) {
                return input;
            } else {
                System.out.println("Error: Solo números entre 1 y 6.");
                return 0;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número.");
            scanner.next(); // Limpiar el scanner
            return 0;
        }
    }

    private static int validarNumero() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Solo números.");
            scanner.next();
            System.out.print("Ingrese nuevamente: ");
        }
        return (int) scanner.nextDouble();
    }

    private static String validarSimbolo() {
        String simbolo = scanner.next();
        return simbolo.trim();
    }
}

