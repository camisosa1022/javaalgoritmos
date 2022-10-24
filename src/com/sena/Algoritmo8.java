package com.sena;

import javax.swing.*;

public class Algoritmo8{
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("ingrese un numero a");
        double x = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog("ingrese un numero b");
        double y = Double.parseDouble(b);
        String c = JOptionPane.showInputDialog("ingrese un numero c");
        double z = Double.parseDouble(c);
        double resultado;
        if (x > 100){
            resultado=(x+y+z);
        }
        else {resultado=x-y-z;}
        JOptionPane.showMessageDialog(null, "el resultado es " + resultado);

    }
}
