package com.example_ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args)
  {
      boolean on = true;
      Scanner input = new Scanner(System.in);
      Random azar = new Random();

      while (on) {
          System.out.println("Ingrese el valor de a");
          int a = input.nextInt();

          System.out.println("Ingrese el valor de b");
          int b = input.nextInt();

          // Asegurar que a < b para evitar errores
          if (a > b) {
              int temp = a;
              a = b;
              b = temp;
              System.out.println("Se intercambiaron los valores para obtener un rango válido");
          }

          int capsula = azar.nextInt(a, b);
          System.out.println("El número de cápsula es: " + capsula);

          System.out.println("\n¿Desea continuar? (S/N)");
          input.nextLine(); // Consumir el salto de línea pendiente
          String respuesta = input.nextLine();

          if (respuesta.equalsIgnoreCase("N")) {
              on = false;
          }
      }

      input.close();
  }
}