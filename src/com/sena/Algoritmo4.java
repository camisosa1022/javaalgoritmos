package com.sena;

import java.util.Scanner;

public class Algoritmo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi=3.1416;
        int d=3;
        double h = sc.nextDouble();
        System.out.println("Ingrese altura");
        sc.nextDouble();

        System.out.println("Ingrese un radio");
        double ra = sc.nextDouble();

        double resultado = pi * h * Math.pow(ra, 2) / d;
        System.out.println("El volumen es " + resultado);
        System.out.println("Fin del comunicado");
    }
}
