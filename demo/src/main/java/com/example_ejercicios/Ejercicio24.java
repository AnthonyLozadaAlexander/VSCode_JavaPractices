package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, size = 0;
        System.out.println("-------------Bienvenido-----------");
        System.out.println("Ingrese el tamaño del array nums[]");
        System.out.print("-> ");
        size = input.nextInt();
        int [] nums = new int[size];
        int i = 0;
        do{
            System.out.println("\nIngrese un numero entero");
            System.out.print("-> ");
            nums[i] = input.nextInt();
            System.out.println("Numero Ingresado: " + nums[i] + "\n");
            if(nums[i] == 0){
                System.out.println("Fin del programa");
                break;
            }
            else{
                count = count + nums[i];
                i++;
            }
        }while(i < size);

        System.out.println("-----------------Resultados-------------------");
        System.out.println("La suma de los numeros ingresados es: " + count);
    }
}
