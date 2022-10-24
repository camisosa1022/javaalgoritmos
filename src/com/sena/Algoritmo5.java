package com.sena;

import java.util.Scanner;

public class Algoritmo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una altura");
        double h = sc.nextDouble();

        System.out.println("Ingrese una base menor");
double B = sc.nextDouble();

        System.out.println("Ingrese una base mayor");
        double b = sc.nextDouble();

        double resultado = (B * b * h)/2;
        System.out.println("Ingrese uno de los lados");
        double L1 = sc.nextDouble();

        System.out.println("Ingrese uno de los lados");
        double L2 = sc.nextDouble();

        double resultadoA = L1 + L2 + B + b;

        System.out.println("El perimetro es "+resultadoA);
        System.out.println("El area es "+resultado);
        System.out.println("Fin del programa");

    }

}
