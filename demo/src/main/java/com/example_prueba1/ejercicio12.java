package com.example_prueba1;

import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[] args) {
      int x;
      Scanner input = new Scanner(System.in);

      System.out.println("Ingrese su calificacion");
      x = input.nextInt();

      switch (x) {
        case 10:
        System.out.println("Matricula de honor");
        break;

        case 9:
        System.out.println("Sobresaliente");
        break;

        case 7:
        System.out.println("Notable");
        break;

        case 5:
        System.out.println("Aprobado");
        break;

        case 4:
        System.out.println("Suspenso");
        break;

        default:
        System.out.println("Calificacion no valida");
              
     }
  }
  
}
