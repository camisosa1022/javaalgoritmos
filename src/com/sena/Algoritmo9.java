package com.sena;

import javax.swing.*;

public class Algoritmo9 {
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog("ingrese un numero a");
        double x = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog("ingrese un numero b");
        double y = Double.parseDouble(b);
        if (x+y>100) {
            x = Math.pow(x,2) + Math.pow(y,2);
        }
        else {
            x = 0;
        }

        JOptionPane.showMessageDialog(null, "el resultado es " + x);

    }
}