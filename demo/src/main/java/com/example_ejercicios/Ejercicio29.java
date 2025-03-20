package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas = 0, sueldoxHora = 0, total=0, horasExtra=0, sueldoExtra=0;
        System.out.println("-------------------------------------------");
        System.out.println("                 BIENVENIDO");
        System.out.println("-------------------------------------------");
        do {
            System.out.println("\nIngrese las horas trabajadas");
            System.out.print("-> ");
            if (!input.hasNextInt()) {
                System.out.println("\nError: Debe Ingresar Numeros Enteros\n");
                input.next();
                continue;
            }
            horas = input.nextInt();
            if(horas <= 0){
                System.out.println("\nError: Debe Ingresar Numeros Enteros Positivos\n");
            }
            else{
                System.out.println("\nHoras Ingresadas Correctamente\n");
            }
        }while(horas <= 0);

        do {
            System.out.println("Ingrese las Horas Extras Trabajadas");
            System.out.print("-> ");
            if (!input.hasNextInt()) {
                System.out.println("\nError: Debe Ingresar Numeros Enteros\n");
                input.next();
                continue;
            }
            horasExtra = input.nextInt();
            if (horasExtra < 0) {
                System.out.println("\nError: Debe Ingresar Numeros Enteros Positivos\n");
            } else {
                System.out.println("\nHoras Extras Ingresadas Correctamente\n");
            }
        }while(horasExtra < 0);

        if(horas <= 40){
            sueldoxHora = 16;
            total = sueldoxHora * horas;

            System.out.println("Horas Trabajadas: " + horas);
            System.out.println("Horas Extra: " + horasExtra);
            System.out.println("Salario Semanal: "+total);
        }
        else if(horas > 40){
            sueldoxHora = 16;
            sueldoExtra = 20;

            total = (sueldoxHora * 40) + (sueldoExtra * horasExtra);
            System.out.println("Horas Trabajadas: " + horas);
            System.out.println("Horas Extra: " + horasExtra);
            System.out.println("Salario Semanal: "+total);
        }

    }
}
