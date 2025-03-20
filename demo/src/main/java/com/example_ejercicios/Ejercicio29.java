package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horasTrabajadas = 0, sueldoxHora = 0, total=0, sueldoExtra=0;
        System.out.println("-------------------------------------------");
        System.out.println("                 BIENVENIDO");
        System.out.println("-------------------------------------------");
        do {
            System.out.println("\nIngrese las Horas Trabajadas trabajadas");
            System.out.print("-> ");
            if (!input.hasNextInt()) {
                System.out.println("\nError: Debe Ingresar Numeros Enteros\n");
                input.next();
                continue;
            }
            horasTrabajadas = input.nextInt();
            if(horasTrabajadas <= 0){
                System.out.println("\nError: Debe Ingresar Numeros Enteros Positivos\n");
            }
            else{
                System.out.println("\nHoras Ingresadas Correctamente\n");
            }
        }while(horasTrabajadas <= 0);

        if(horasTrabajadas <= 40){
            sueldoxHora = 16;
            total = sueldoxHora * horasTrabajadas;

        }
        else if(horasTrabajadas > 40){
            sueldoxHora = 16;
            sueldoExtra = 20;

            total = (sueldoxHora * 40) + ((horasTrabajadas-40)) * (sueldoExtra);
        }

        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Horas Extra: " + (horasTrabajadas-40));
        System.out.println("Salario Semanal: "+total);
    }
}
