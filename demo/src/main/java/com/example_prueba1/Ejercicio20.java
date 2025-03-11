package com.example_prueba1;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] ventas = new float[30];
        System.out.println("----------------VENTAS----------------");
        System.out.println("Ingrese las ventas del mes");
        for(int i = 0; i < ventas.length; i++){
            System.out.println("Ingrese la venta del dia ["+(i+1)+"]");
            System.out.print("-> ");
            ventas[i] = input.nextFloat();
        }

        System.out.println("---------------------------------------");
        System.out.println("Ventas del mes");
        for(int i = 0; i < ventas.length; i++){
            System.out.println("Dia ["+i+"]: "+ ventas[i]);
        }
        int count = 0;
        // int indice = 0;

        for(int i = 0; i < ventas.length; i++){
            if(ventas[i] > 2000){
                System.out.println("La venta ["+i+"] = "+ ventas[i] +"$, supera los 2000$");
                count = count + 1;
            }
        }

        System.out.println("Fueron "+count+" ventas que superaron los 2000$ dolares");
    }
}
