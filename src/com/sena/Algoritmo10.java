package com.sena;

import javax.swing.*;

public class Algoritmo10 {
    public static void main(String[] args) {
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero"));

        if (p1 >= 1000 && p1 <= 10000) {
            JOptionPane.showMessageDialog(null, "el numero no es aceptado");
        }
    }
}
