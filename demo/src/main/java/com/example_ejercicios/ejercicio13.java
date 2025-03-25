package com.example_ejercicios;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Imprimiendo numeros del 1 al 30");

        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        int limit;

        System.out.println("\nImprimir numeros del limite que el usuario desee\n");
        System.out.println("Ingrese el limite: ");
        limit = input.nextInt();

        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }

    }

}
