package com.example_ejercicios;

import java.util.Scanner;

public class ejercicio15 {
      /*
       ? Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese "salir"
       */
  public static void main(String[] args) {

      String palabra;
      Scanner input = new Scanner(System.in);

      System.out.println("Ingrese la palabra que quiera mostrar por teclado");
      palabra = input.nextLine();

      while(!palabra.equalsIgnoreCase("salir") && !palabra.equalsIgnoreCase("Exit")) //? Mientras la palabra no sea igual a "salir" o a exit
      {
        System.out.println("La palabra es: " + palabra);

        System.out.println("Ingrese la palabra que quiera mostrar por teclado");
        palabra = input.nextLine();

      }
     System.out.println("Gracias por usar el Programa");
  }

}
