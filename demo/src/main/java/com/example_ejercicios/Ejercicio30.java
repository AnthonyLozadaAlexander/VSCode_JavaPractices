package com.example_ejercicios;

import javax.swing.*;

public class Ejercicio30 {
    public static void main(String[] args) {
        int dia=0, mes=0, anio=0;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if((dia >= 1)&& (dia <= 30)){ // si el dia es correcto
            if((mes >= 1) && (mes <= 12)){ // si el mes es correcto
                if(anio != 0){ // si el año es correcto
                    JOptionPane.showMessageDialog(null, "La Fecha Es Correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La Fecha Es Incorrecta, Año Incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "La Fecha es incorrecta, Mes Incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La Fecha es Incorrecta, Dia Incorrecta");
        }
    }
}
