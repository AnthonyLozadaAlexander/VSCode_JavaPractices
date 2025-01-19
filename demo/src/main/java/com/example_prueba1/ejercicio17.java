package com.example_prueba1;

import java.util.Scanner;

public class ejercicio17 {
  public static void main(String[] args) {
      /*
       ? El programa debe soliticar por teclado dos datos:
       ? la patente del vehiculo
       ? el tipo de estacionamiento
       */

       String patente = "";
       int tipoServicio, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
       double montoPagar, total, totalDia = 0;
       Scanner input = new Scanner(System.in);

       /*
        ? El programa debe calcular el monto a pagar para cada cliente en funcion del tipo de estacionamiento seleccionado. la carga de datos debe continuar hasta que el usuario ingrese "Fin" en lugar de la patente.
        */
       while(!patente.equalsIgnoreCase("Fin")){
        System.out.println("Ingrese la patente del vehiculo");
        patente = input.nextLine();

        if(!patente.equalsIgnoreCase("Fin")) {
            System.out.println("-------------------------------------");
            System.out.println("Ingrese el tipo de servicio");
            System.out.println("1- Por Hora");
            System.out.println("2- Media Jornada(5 horas)");
            System.out.println("3- Jornada Completa(10 horas)");
            input = new Scanner(System.in); // Reset Scanner
            tipoServicio = input.nextInt();

            if (tipoServicio <= 0 || tipoServicio > 3) {
                System.out.println("Tipo de servicio no valido");
            } else {
          /*
           ? Los tipos de estacionamiento disponibles son 3:
           ? Por hora: $3 USD por hora
           ? Media Jornada: $15 USD y posee 5% de descuento
           ? Jornada Completa: $30 USD y posee 10% de descuento
           */
                if (tipoServicio == 1) {
                    System.out.println("Ingrese la cantidad de horas que desea estacionar");
                    cantHoras = input.nextInt();
                    total = cantHoras * 3;
                    System.out.println("El total de su estacionamiento es de: " + total);
                    cont1 = cont1 + 1;
                    totalDia = totalDia + total;
                } else {
                    if (tipoServicio == 2) {
                        System.out.println("El servicio de media jornada corresponde a 5 horas y posee un descuento del 5%");
                        System.out.println("-------------------------------------");
                        total = 15 - (15 * 0.05); // calculo descuento
                        System.out.println("El total de su estacionamiento es de: " + total);
                        cont2 = cont2 + 1;
                        totalDia = totalDia + total;
                    } else {
                        System.out.println("El servicio de jornada completa corresponde a 10 horas y posee un descuento del 10%");
                        System.out.println("-------------------------------------");
                        total = 30 - (30 * 0.10); // calculo descuento
                        System.out.println("El total de su estacionamiento es de: " + total);
                        cont3 = cont3 + 1;
                        totalDia = totalDia + total;

                    }
                }
            }
        }
        System.out.println("");
        System.out.println("*****Muchas Gracias Por Su Compra!*****");
        input = new Scanner(System.in); // Reset Scanner
     }
     System.out.println("---------------------------------------------");
     System.out.println("Totales Monetarios Del Dia");
     System.out.println("Cantidad Servicios Por Hora: " + cont1);
     System.out.println("Cantidad Servicios de media jornada: " + cont2);
     System.out.println("Cantidad Servicios Jornada Completa: " + cont3);
     System.out.println("El monto total recaudado del dia es de: $" + totalDia + " USD");
    }
}
