package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args){

    //Bucle while
    Scanner input = new Scanner (System.in);
    int contador;

    System.out.println("El numero debe ser menor a 15 para cumplir la condicion del bucle");
    contador = input.nextInt();

    System.out.println("--------------------------------------------------");

    while(contador <= 15){

      System.out.println("El contador es: " + contador);
      contador++; // Incremento de la variable contador para evitar un bucle infinito

    }

    
    System.out.println("--------------------------------------------------");

  }
  
}
