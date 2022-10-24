package com.sena;

import javax.swing.*;

public class Algoritmo7 {
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog("ingrese un numero a");
        double x = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog("ingrese un numero b");
        double y = Double.parseDouble(b);
        String c = JOptionPane.showInputDialog("ingrese un numero c");
        double z = Double.parseDouble(c);
        double Resultado = Math.sqrt((Math.pow(x,2)+Math.pow(y,2))/(2*x*z));
        JOptionPane.showMessageDialog(null, "el resultado es " + Resultado);

    }

}
