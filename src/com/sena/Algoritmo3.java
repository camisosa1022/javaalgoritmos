package com.sena;

import javax.swing.*;

public class Algoritmo3 {
    public static void main(String[] args) {
        double pi = 3.1416;
        int h = 11;
        int ra = 2;
        double vol = pi * h * Math.pow (ra,2) / 3;
        JOptionPane.showMessageDialog(null, "El volumen del cono es: " + vol);
    }
}
