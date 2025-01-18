package com.example_prueba1;

import java.util.Scanner;

public class ejercicio17 {
  public static void main(String[] args) {
      /*
       * El programa debe soliticar por teclado dos datos:
       * la patente del vehiculo
       * el tipo de estacionamiento
       */

       String patente = "";
       int tipoServicio;
       Scanner input = new Scanner(System.in);

       /*
        * El programa debe calcular el monto a pagar para cada cliente en funcion del tipo de estacionamiento seleccionado. la carga de datos debe continuar hasta que el usuario ingrese "Fin" en lugar de la patente.
        */
       while(!patente.equalsIgnoreCase("Si")){
        System.out.println("Ingrese la patente del vehiculo");
        patente = input.nextLine();
        System.out.println("-------------------------------------");
        System.out.println("Ingrese el tipo de servicio");
        System.out.println("1- Por Hora");
        System.out.println("2- Media Jornada(5 horas)");
        System.out.println("3- Jornada Completa(10 horas)");
        input = new Scanner(System.in); // Reset Scanner 
        tipoServicio = input.nextInt(); 

        if(tipoServicio <= 0 || tipoServicio > 3)
        {
          System.out.println("Tipo de servicio no valido"); 
        }
        else
        {
          
        }
       }
  } 
}
