package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.println("-----------------------------------");
        System.out.println("Ingrese 10 numeros en el array");
        System.out.println("-----------------------------------");

        for(int i = 0; i < nums.length; i++){
            System.out.print("Ingrese un numero en la posicion["+i+"]: ");
            nums[i] = input.nextInt();
        }

        System.out.println("-----------------------------------");
        System.out.println("Elementos del array: ");
        for(int i = 0; i < nums.length; i++){
            System.out.println("Nums["+i+"]: "+ nums[i]);
        }

        int max = nums[0];
        int Indice = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                Indice = i;
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("El numero mayor del array es nums["+Indice+"] = " + max);
    }
}
