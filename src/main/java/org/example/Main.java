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

}

public class FigurasGeometricas {
    public static double perimetroCuadrado(double lado){
        return 4 * lado;
    }
    public static double areaCuadrado(double lado){
        return lado * lado;
    }
    public static double perimetroRectangular(double base, double altura){
        return 2 * (base + altura);
    }
    public static double areaRectangulo(double base, double altura){
        return base * altura;
    }
    public static double perimetroCirculo (double radio ){
        return 2 * Math.PI * radio;
    }
    public static double volumenEsfera(double radio){
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
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
        System.out.println("");
    }

}
