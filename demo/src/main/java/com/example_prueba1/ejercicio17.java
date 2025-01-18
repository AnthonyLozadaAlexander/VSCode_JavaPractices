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
       int tipoServicio, cantHoras;
       double montoPagar, total;
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
          /*
           * Los tipos de estacionamiento disponibles son 3:
           * Por hora: $3 USD por hora
           * Media Jornada: $15 USD y posee 5% de descuento
           * Jornada Completa: $30 USD y posee 10% de descuento 
           */
          if(tipoServicio == 1)
          {
            System.out.println("El monto a pagar es de $3 USD");
            cantHoras = input.nextInt();
            total = cantHoras * 3;
          }
          else{
            if(tipoServicio == 2){
              System.out.println("El servicio de media jornada corresponde a 5 horas y posee un descuento del 5%");
              total = 15 - (15 * 0.05); // calculo descuento
              System.out.println("El total de su estacionamiento es de: " + total);
            }
            else{
              System.out.println("El servicio de jornada completa corresponde a 10 horas y posee un descuento del 10%");
              total = 30 - (30 * 0.10); // calculo descuento
              System.out.println("El total de su estacionamiento es de: " + total);
            }
          }
        }
        System.out.println("*****Muchas Gracias Por Su Compra!*****");
     }
  } 
}
