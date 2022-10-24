package com.sena;

import javax.swing.*;

public class Algoritmo6 {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        Systen.out.println("Ingrese un dato");
        int x= sc.netxInt(); */
        //JOptionPane.showInputDialog("Ingrese un dato");
        String s = JOptionPane.showInputDialog("ingrese el primer numero");
        int x = Integer.parseInt(s);
        String a = JOptionPane.showInputDialog("ingrese el segundo numero");
        int z = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog("ingrese el tercero numero");
        int y = Integer.parseInt(b);
        int resultado = x+z-y;
        if (x < 10){
            x=0;
        }

        JOptionPane.showMessageDialog(null, "el resultado es " + x);

    }
}
