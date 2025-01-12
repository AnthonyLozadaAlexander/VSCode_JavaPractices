package com.example_prueba1;

import java.util.Scanner;


public class ejercicio11 {
  public static void main(String[] args){
    int a, b, suma, numLimit;
    Scanner input = new Scanner(System.in);
    a = 0;
    b = 1;

    System.out.println("Ingrese el limite de la secuencia");
    numLimit = input.nextInt();

    System.out.println(a);
    System.out.println(b);

    for(int i = 0; i <= numLimit; i++)
    {
      suma = a + b; //? 0 + 1 = 1, 1 + 1 = 2, 2 + 1 = 3 
      System.out.println(suma);
      a = b; //? a = 1, a = 1, a = 2
      b = suma; //? b = 1, b = 2, b = 3

    }
  }
  
}
