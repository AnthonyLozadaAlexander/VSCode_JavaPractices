package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Ingrese los 5 numeros al arreglo");
        for(int i = 0; i < nums.length; i++){
            System.out.print("Nums["+i+"] = ");
            nums[i] = input.nextInt();
        }
        System.out.println("---------------------------------------");
        int mayor = nums[0];
        int indice = 0;
        System.out.println("Los numeros ingresados son: ");
        for(int i = 0; i < nums.length; i++){
            System.out.println("Nums["+i+"] = "+ nums[i]);
            if(nums[i] > mayor){
                mayor = nums[i];
                indice = i;
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("El numero mayor es: ");
        System.out.println("num["+indice+"] = " + mayor);

    }
}
