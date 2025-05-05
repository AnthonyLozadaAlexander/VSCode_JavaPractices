package com.example_ejercicios;
import javax.swing.*;
public class Cuadratica {
    int a = 0;
    int b = 0;
    int c = 0;

    public Cuadratica(){
        a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de c: "));
        double determinante = Math.pow(b,2) - (4*a*c);
        if(determinante > 0){
            // se aplican las dos soluciones a la formula general
            double x1 = ((b * (-1)) + Math.sqrt(determinante)) / (2 * a);
            double x2 = ((b * (-1)) - Math.sqrt(determinante)) / (2 * a);
            System.out.println("El valor de x1 = " + x1);
            System.out.println("El valor de x2 = " + x2);
        }
        else
        {
            System.out.println("\nEl Determinante es negativo, no tiene solución real");
        }
    }
    public static void main(String[] args) {
        new Cuadratica(); // instancia de la clase
    }
}
