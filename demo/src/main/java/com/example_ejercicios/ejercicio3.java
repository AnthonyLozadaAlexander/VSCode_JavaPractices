package com.example_ejercicios;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args){
    // Determinar si un numero es primo
    boolean esPrimo = true;
    int Divisible, num;
    Divisible = 2;
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un numero");
    num = input.nextInt();

    if(num < 2){
      esPrimo = false;
    }
    else{
      while(esPrimo && Divisible < Math.sqrt(num))
      {
        if(num % Divisible == 0) // num % 2 == 0
        {
           esPrimo = false;
        }
        else{
          Divisible = Divisible + 1; // Incremento Divisible
        }
      }
    }  

    if(esPrimo){
      System.out.println("El numero " + num + " Es Primo");
    }
    else{
      System.out.println("El numero " + num + " No es Primo");
    }

    input.close(); // cerrar el scanner
  }
}
