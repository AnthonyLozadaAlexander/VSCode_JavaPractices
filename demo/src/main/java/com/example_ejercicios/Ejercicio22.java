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
    }
}
