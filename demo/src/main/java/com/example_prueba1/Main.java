package com.example_prueba1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, factorial, facBackup, i;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el Factorial");
            factorial = input.nextInt();

            num = factorial;
            facBackup = factorial;
            
        }

        System.out.println("--------------------");

        for(i = factorial; i > 1; i--)
        {
            factorial = (factorial - 1);

            System.out.println(num + " x " + factorial);

            num = (num * factorial);

            System.out.println("= " + num);

        }

        System.out.println("--------------------");

        System.out.println("El factorial de " + facBackup + "! es: " + num);
    }
}