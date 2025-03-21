package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums=0;
        long producto = 1;
        System.out.println("---------------------------");
        System.out.println("       Bienvenido");
        System.out.println("---------------------------");
        do{
            System.out.println("Ingrese el limite");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Ingresar Un Numero Entero Positivo\n");
                input.next();
                continue;
            }
            nums = input.nextInt();
            if(nums <= 0){
                System.out.println("\nError: El Numero Debe Ser Mayor a 0\n");
            }
            else{
                System.out.println("\nLimite Ingresado Correctamente\n");
            }
        }while(nums <= 0);

        for(int i = 1; i <= nums; i++){
            if(i % 2 != 0){
                System.out.println("Numero Impar: " + i);
                producto = producto * i;
            }
        }

        System.out.println("\nEl Producto de los numeros impares es: " + producto);
    }
}
