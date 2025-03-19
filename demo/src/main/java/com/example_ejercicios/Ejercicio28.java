package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String codigo = "";
        int cantKilos = 0;
        float precio = 0;
        float total = 0;
        float facturacionTotal=0;
        int count = 0;
        int totalKilos = 0;

        for(int i = 1; i <= 5; i++)
        {
            input = new Scanner(System.in); // Reiniciar el Scanner para cada iteración
            System.out.println("\nFactura N°("+i+")");
            System.out.println("Ingrese el codigo del producto");
            System.out.print("-> ");
            codigo = input.nextLine();
            do {
                System.out.println("\nIngrese la cantidad de kilos");
                System.out.print("-> ");
                if(!input.hasNextInt()){
                    System.out.println("Error: Ingrese un número entero positivo");
                    input.next(); // Limpiar el buffer
                    continue;
                }
                cantKilos = input.nextInt();
                if (cantKilos <= 0) {
                    System.out.println("Error: La cantidad de kilos debe ser mayor a 0");
                }
            }while(cantKilos <= 0);

            do {
                System.out.println("\nIngrese el precio");
                System.out.print("-> ");
                if(!input.hasNextFloat()){
                    System.out.println("Error: Ingrese un número decimal positivo");
                    input.next(); // Limpiar el buffer
                    continue;
                }
                precio = input.nextFloat();

                if(precio <= 0){
                    System.out.println("Error: El precio debe ser mayor a 0");
                }
            }while(precio <= 0);

            total = cantKilos * precio;
            facturacionTotal = facturacionTotal + total;

            if(total > 1000){
                count = count+ 1;
            }
            totalKilos = totalKilos + cantKilos;

        }

        System.out.println("\nDetalles De Las Ventas");
        System.out.println("Ventas Superios a $1000: "+ count);
        System.out.println("Facturacion Total: " + facturacionTotal);
        System.out.println("Total De Kilos Vendidos: " + totalKilos);
    }
}
