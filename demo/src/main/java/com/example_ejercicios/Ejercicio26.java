package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String[] ciudades = new String[5];
        float[] temperaturasMin = new float[5];
        float[] temperaturasMax = new float[5];
        System.out.println("--------------------------------------------");
        System.out.println("                  BIENVENIDO");
        System.out.println("--------------------------------------------");
        System.out.println("     Ingrese el nombre de las 5 ciudades");
        for(int i = 0; i < ciudades.length; i++){
            System.out.println("Ciudad["+i+"]");
            System.out.print("-> ");
            ciudades[i] = input.nextLine();
        }
        System.out.println("--------------------------------------------");
            for (int tMin = 0; tMin < temperaturasMin.length; tMin++) {
                System.out.println("Ingrese la temperatura minima de la ciudad " + ciudades[tMin]);
                System.out.print("-> ");

                if(!input.hasNextFloat()){
                    System.out.println("\nError: Debe Ingresar Un Numero\n");
                    input.next();
                    tMin = tMin - 1;
                }
                else{
                    temperaturasMin[tMin] = input.nextFloat();
                    System.out.println("\nDato ingresado correctamente\n");
                }
            }

        System.out.println("-------------------------------------------------------");
        for (int tMax = 0; tMax < temperaturasMin.length; tMax++) {
            System.out.println("Ingrese la temperatura maxima de la ciudad " + ciudades[tMax]);
            System.out.print("-> ");

            if(!input.hasNextFloat()){
                System.out.println("\nError: Debe Ingresar Un Numero\n");
                input.next();
                tMax = tMax - 1;
            }
            else{
                temperaturasMax[tMax] = input.nextFloat();
                System.out.println("\nDato ingresado correctamente\n");
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Datos Ingresados");
        for(int i = 0; i < ciudades.length; i++){
            System.out.println("Ciudad: " + ciudades[i]);
            System.out.println("Temperaturas Minimas: " + temperaturasMin[i]);
            System.out.println("Temperaturas Maximas: " + temperaturasMax[i]);
        }
        System.out.println("-------------------------------------------------------");

    }
}
