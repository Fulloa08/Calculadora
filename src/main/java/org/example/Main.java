package org.example;

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

}
