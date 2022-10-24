package com.sena;

import javax.swing.*;

public class Algoritmo11 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero"));

        if (a >=0 && a<=10 || a >=90 && a <=100 ){
            JOptionPane.showMessageDialog(null, "el numero es aceptado");
        }
    }
}
