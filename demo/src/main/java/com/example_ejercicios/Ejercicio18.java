package com.example_ejercicios;
import java.util.Scanner;

public class Ejercicio18 {
      public static float suma(float num1, float num2){
            return num1 + num2;
      }

      public static float resta(float num1, float num2){
            return num1 - num2;
      }

      public static float multiplicacion(float num1, float num2){
            return num1 * num2;
      }

      public static float division(float num1, float num2){
            return num1 / num2;
      }

      public static float exponenciacion(float num1, float num2){
            return (float) Math.pow(num1, num2);
      }

      public static float radicacion(float num1, float num2){
            return (float) Math.pow(num1, (1/num2));
      }
      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            float num1 = 0, num2 = 0;
            boolean salir = false;
            String respuesta = "";
            int opc = 0;
            do {
                  System.out.println("----OPERACIONES ARITMETICAS----");
                  System.out.println("-------------------------------");

                  System.out.println("Introduce el primer numero");
                  System.out.print("-> ");
                  num1 = input.nextFloat();

                  System.out.println("Introduce el segundo numero");
                  System.out.print("-> ");
                  num2 = input.nextFloat();
                  System.out.println("-------------------------------");

                  System.out.println("\n--------------------------------");
                  System.out.println("------------OPCIONES--------------");
                  System.out.println("        1. Sumar");
                  System.out.println("        2. Restar");
                  System.out.println("        3. Multiplicacion");
                  System.out.println("        4. Division");
                  System.out.println("        5. Exponenciacion");
                  System.out.println("        6. Radicacion");
                  System.out.println("--------------------------------");

                  boolean error = true;
                  do {
                        System.out.println("Elige una opcion");
                        System.out.print("-> ");
                        if (!input.hasNextInt()) {
                              System.out.println("\nError: Debe ser un numero entero\n");
                              input.next(); // Clear invalid input
                              error = true;
                              continue; // Skip to next iteration
                        }
                        opc = input.nextInt();
                        if (opc < 1 || opc > 6) {
                              System.out.println("\nError: Opcion Invalida\n");
                              error = true;
                        } else {
                              error = false;
                        }
                  } while (error == true);

                  System.out.println("\n----------------------------------");
                  System.out.println("        Opcion Elegida: " + opc);
                  System.out.println("----------------------------------\n");

                  if (opc == 1) {
                        System.out.println("\nLa suma de " + num1 + " + " + num2 + " es -> " + suma(num1, num2));
                  } else if (opc == 2) {
                        if (num1 == 0) {
                              System.out.println("Error: No se puede restar 0 a otro numero");
                        } else if (num1 < num2) {
                              System.out.println("Error: El minuendo no puede ser menor que el sustraendo");
                        } else {
                              System.out.println("\nLa resta de " + num1 + " - " + num2 + " es -> " + resta(num1, num2));
                        }
                  } else if (opc == 3) {
                        System.out.println("\nLa multiplicacion de " + num1 + " * " + num2 + " es -> " + multiplicacion(num1, num2));

                  } else if (opc == 5) {
                        if (num2 == 0) {
                              System.out.println("Error: No se puede elevar a la 0");
                        } else {
                              System.out.println("\n La exponenciacion de " + num1 + " ^" + num2 + " es -> " + exponenciacion(num1, num2));
                        }
                  } else if (opc == 6) {

                        System.out.println("La radicacion de " + num1 + " ^" + num2 + " es -> " + radicacion(num1, num2));

                  } else {
                        System.out.println("Error: Opcion Invalida");
                  }

                  input = new Scanner(System.in); // Limpiar buffer
                  do {
                        System.out.println("\nDesea volver a intentarlo? (si/no)");
                        System.out.print("-> ");
                        respuesta = input.nextLine();
                        if (respuesta.equalsIgnoreCase("si")) {
                              salir = false;
                        } else if (respuesta.equalsIgnoreCase("no")) {
                              System.out.println("\n------------------------------------");
                              System.out.println("Gracias por usar el programa");
                              System.out.println("------------------------------------\n");
                              salir = true;
                        } else {
                              System.out.println("\nError: Respuesta Invalida\n");
                        }
                  } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
            } while (salir == false);
      }
}
