package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia=0, mes=0, anio=0;

        System.out.println("------------BIENVENIDO-------------");
        do {
            System.out.println("\nDigite el dia");
            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Dato Invalido\n");
                input.next();
                continue;
            }
            if(dia <= 0){
                System.out.println("\nError: Dia Invalido\n");
            }
            else if((dia >=1 && dia <= 31) || (dia >= 1 && dia <= 30) || (dia >= 1 && dia <= 28)){
                System.out.println("\nDia Ingresado: "+ dia);
                do{
                    System.out.println("Ingrese el mes");
                    System.out.print("-> ");
                }while(mes <= 0);
            }
            else{
                System.out.println("Fecha Invalida: Dia: "+dia+" Incorrecto");
            }
            dia = input.nextInt();
        }while(dia <=0);

    }
}
