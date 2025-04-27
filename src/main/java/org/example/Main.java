package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int mayor = numeromayor(1,2);
        System.out.println("el número mayor es: " + mayor);

        int menor = numeromenor(3,2);
        System.out.println("el número menor es: " + menor);

        double resultado = potenciaDeUnNumero(2,4);
        System.out.println("el resultado es: " + resultado);

        double porcentaje = calcularPorcentaje(100, 50);
        System.out.println("El calculo del porcentaje solicitado es: " + porcentaje);

        System.out.println(ecuacionRecta(1,2,3,6));

        resolverCuadratica(2.0,8.0,4.0);
        calcularFigurasGeometrica();


    }
    public static int numeromayor(int numero1, int numero2){
        if (numero1 > numero2) {
            return numero1;
        } else if (numero2 > numero1) {
            return numero2;
        } else {
            throw new IllegalArgumentException("Los números son iguales.");
        }
    }

    public static int numeromenor(int numero1, int numero2){
        if (numero1 < numero2) {
            return numero1;
        } else if (numero2 < numero1) {
            return numero2;
        } else {
            throw new IllegalArgumentException("Los números son iguales.");
        }
    }

    public static double potenciaDeUnNumero(double base, double exponente){
        return Math.pow(base,exponente);
    }

    public static double calcularPorcentaje(double numero, double porcentaje){
        double transformarPorcentaje = porcentaje/100;
        double calculo = (numero * transformarPorcentaje);
        return calculo;
    }

    public static String ecuacionRecta(double x1, double y1, double x2, double y2){
        double  m = (y2-y1) / (x2-x1);
        double b = y1 - (m*x1);
        return "Y = " + m + "X + " + b;
    }
    public static double perimetroCuadrado(double lado){
        return 4 * lado;
    }
    public static double areaCuadrado(double lado){
        return lado * lado;
    }
    public static double perimetroRectangulo(double base, double altura){
        return 2 * (base + altura);
    }
    public static double areaRectangulo(double base, double altura){
        return base * altura;
    }
    public static double perimetroCirculo (double radio ){
        return 2 * Math.PI * radio;
    }
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    public static double volumenEsfera(double radio){
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    public static double areaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
    public static double volumenCubo(double lado){
        return Math.pow(lado, 3);
    }
    public static double areaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }
    public static double volumenCono(double radio, double altura) {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }
    public static double areaLateralCono(double radio, double generatriz){
        return Math.PI * radio * generatriz;
    }
    public static void calcularFigurasGeometrica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una figura geométrica:");
        System.out.println("1. Cuadrado\n2. Rectángulo\n3. Círculo\n4. Esfera\n5. Cubo\n6. Cono");

        int figura = scanner.nextInt();

        System.out.println("Selecciona una operación:");
        System.out.println("1. Perímetro\n2. Área\n3. Volumen (si aplica)");
        int operacion = scanner.nextInt();

        switch (figura){
            case 1:
                System.out.println("Ingresa el lado:");
                double lado = scanner.nextDouble();
                if (operacion == 1) {
                    System.out.println("Perímetro: " + perimetroCuadrado(lado));
                } else if (operacion == 2) {
                    System.out.println("Área: " + areaCuadrado(lado));
                } else {
                    System.out.println("Operación no válida para un cuadrado.");
                }
                break;

            case 2: // Rectángulo
                System.out.println("Ingresa la base:");
                double base = scanner.nextDouble();
                System.out.println("Ingresa la altura:");
                double altura = scanner.nextDouble();
                if (operacion == 1) {
                    System.out.println("Perímetro: " + perimetroRectangulo(base, altura));
                } else if (operacion == 2) {
                    System.out.println("Área: " + areaRectangulo(base, altura));
                } else {
                    System.out.println("Operación no válida para un rectángulo.");
                }
                break;

            case 3: // Círculo
                System.out.println("Ingresa el radio:");
                double radio = scanner.nextDouble();
                if (operacion == 1) {
                    System.out.println("Perímetro: " + perimetroCirculo(radio));
                } else if (operacion == 2) {
                    System.out.println("Área: " + areaCirculo(radio));
                } else {
                    System.out.println("Operación no válida para un círculo.");
                }
                break;

            case 4: // Esfera
                System.out.println("Ingresa el radio:");
                radio = scanner.nextDouble();
                if (operacion == 2) {
                    System.out.println("Área: " + areaEsfera(radio));
                } else if (operacion == 3) {
                    System.out.println("Volumen: " + volumenEsfera(radio));
                } else {
                    System.out.println("Operación no válida para una esfera.");
                }
                break;

            case 5: // Cubo
                System.out.println("Ingresa el lado:");
                lado = scanner.nextDouble();
                if (operacion == 2) {
                    System.out.println("Área: " + areaCubo(lado));
                } else if (operacion == 3) {
                    System.out.println("Volumen: " + volumenCubo(lado));
                } else {
                    System.out.println("Operación no válida para un cubo.");
                }
                break;

            case 6: // Cono
                System.out.println("Ingresa el radio:");
                radio = scanner.nextDouble();
                System.out.println("Ingresa la altura:");
                altura = scanner.nextDouble();
                if (operacion == 3) {
                    System.out.println("Volumen: " + volumenCono(radio, altura));
                } else if (operacion == 2) {
                    System.out.println("Ingresa la generatriz:");
                    double generatriz = scanner.nextDouble();
                    System.out.println("Área lateral: " + areaLateralCono(radio, generatriz));
                } else {
                    System.out.println("Operación no válida para un cono.");
                }
                break;

            default:
                System.out.println("Figura geométrica no válida.");
        }

    }
    public static void resolverCuadratica(double A, double B, double C) {

        double discriminante = (B * B) - (4 * A * C);

        if (discriminante < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
            return;
        }
        double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
        double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);

        System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
    }

}



