package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] ventas = new float[30];
        int Indices = 0;
        float countTotal = 0;
        float total = 0;
        int count = 0;
        System.out.println("----------------VENTAS----------------");
        System.out.println("Ingrese las 30 ventas del mes");
        for (int i = 0; i < 30; i++) {
            System.out.println("Ingrese la venta del dia["+i+"]");
            System.out.print("-> ");
            if(!input.hasNextFloat()){
                System.out.println("--------------------------------------");
                System.out.println("Error: Debe ingresar un valor numerico");
                System.out.println("--------------------------------------");
                i = i - 1;
                input.next();
                continue;
            }
            ventas[i] = input.nextFloat();
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Ventas del mes: ");
        for(int i = 0; i < 30; i++){
            System.out.println("Dia["+i+"] = "+ ventas[i] + "$");
        }
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Dias que superaron los 2000$");
        System.out.println("----------------------------------------------");
        while(Indices < 30){
            if(ventas[Indices] > 2000){
                System.out.println("Dia["+Indices+"] = " + ventas[Indices]);
                count = count + 1;
                countTotal = countTotal + ventas[Indices];
            }
            Indices = Indices + 1; // incrementador del la condicion while para que no sea un bucle infinito
            total = total + ventas[Indices];
        }
        System.out.println("-----------------------------------------------");
        System.out.println("fueron " + count + " ventas en el mes que superaron los 2000$");
        System.out.println("Total de ventas mayores a 2000$ = " + countTotal + "$");
        System.out.println("Total de ventas del mes = " + total + "$");
        System.out.println("-----------------------------------------------");
    }
}
