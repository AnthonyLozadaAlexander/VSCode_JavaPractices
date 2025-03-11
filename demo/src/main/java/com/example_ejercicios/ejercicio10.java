package com.example_ejercicios;
import java.util.Scanner;


public class ejercicio10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, absolute;

    System.out.println("Ingrese un numero: ");
    a = input.nextInt();

    absolute = Math.abs(a);

    System.out.println("El valor absoluto de " + a + " es: " + absolute);
      
  } 
}
