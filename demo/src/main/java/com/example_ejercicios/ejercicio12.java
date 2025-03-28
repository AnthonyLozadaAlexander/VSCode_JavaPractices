package com.example_ejercicios;

import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[] args) {
      int x=0;
      do {
          Scanner input = new Scanner(System.in);
          System.out.println("Ingrese su calificacion del 0 al 10");
          System.out.print("-> ");
          if(!input.hasNextInt()){
              System.out.println("\nError: La Calificacion Debe Ser Un Numero Entero\n");
              input.next();
              continue;
          }
          x = input.nextInt();

          if(x < 0){
              System.out.println("\nError: La Calificacion Debe Ser Un Numero Natural\n");
          }
          else{
              System.out.println("\nDato Ingresado: " + x + "\n");

              switch (x) {
                  case 10:
                      System.out.println("Estado Academico: Excelente");
                      break;

                  case 9:
                      System.out.println("Estado Academico: Muy bueno");
                      break;

                  case 7:
                      System.out.println("Estado Academico: Bueno");
                      break;

                  case 6:
                      System.out.println("Estado Academico: Bueno");
                      break;

                  case 5:
                      System.out.println("Estado Academico: Suficiente");
                      break;

                  case 4:
                      System.out.println("Estado Academico: Necesita mejorar");
                      break;

                  case 3:
                      System.out.println("Estado Academico: Recuperacion");
                      break;

                  case 2:
                      System.out.println("Estado Academico: Recuperacion");
                      break;

                  case 1:
                      System.out.println("Estado Academico: Recuperacion");
                      break;

                  case 0:
                      System.out.println("Estado Academico: Reprobado/Suspendido");
                      break;

                  default:
                      System.out.println("Calificacion no valida");
                      break;

              }
          }
      }while(x < 0);

  }
  
}
