package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        float precioNormal = 5f, precio50 = 4.50f, precio100 = 4f, precioTotal = 0;
        int cantidad = 0;
        System.out.println("------------SISTEMA------------");
        System.out.println("-------------------------------");
        do {
            System.out.println("Ingrese la cantidad a comprar");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Ingrese un número entero\n");
                input.next();
                continue;
            }
            cantidad = input.nextInt();
            if(cantidad <= 0){
                System.out.println("\nError: Ingrese un número mayor a 0\n");
                continuar = true;
            }
            else if(cantidad >= 50 && cantidad < 100){
                precioTotal = cantidad * precio50;
                continuar = false;
            }
            else if(cantidad >= 100){
                precioTotal = cantidad * precio100;
                continuar = false;
            }
            else{
                precioTotal = cantidad * precioNormal;
                continuar = false;
            }
        }while(continuar == true);

        System.out.println("-----------------------------");
        System.out.println("          Factura");
        System.out.println("-----------------------------");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Individual: " + precioNormal + "$");
        System.out.println("Precio Total: " + precioTotal + "$");
        System.out.println("-----------------------------");
    }
}
