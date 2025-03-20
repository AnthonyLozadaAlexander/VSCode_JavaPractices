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
            dia = input.nextInt();
            if(dia <= 0){
                System.out.println("\nError: Dia Invalido\n");
            }
            else if((dia >=1 && dia <= 31) || (dia >= 1 && dia <= 30) || (dia >= 1 && dia <= 28)){
                System.out.println("\nDia Ingresado: "+ dia+"\n");
                do{
                    input = new Scanner(System.in);
                    System.out.println("Ingrese el mes");
                    System.out.print("-> ");
                    if(!input.hasNextInt()){
                        System.out.println("\nError: Dato Invalido\n");
                        input.next();
                        continue;
                    }
                    mes = input.nextInt();
                    if(mes <= 0){
                        System.out.println("\nError: Mes Invalido\n");
                    }
                    else if(mes >= 1 && mes <= 12){
                        System.out.println("\nMes Ingresado: "+ mes+"\n");
                        do {
                            input = new Scanner(System.in);
                            System.out.println("Ingrese el anio");
                            System.out.print("-> ");
                            if (!input.hasNextInt()) {
                                System.out.println("\nError: Dato Invalido\n");
                                input.next();
                                continue;
                            }
                            anio = input.nextInt();

                            if(anio == 0){
                                System.out.println("\nError: Anio Invalido\n");
                            }
                            else if(anio != 0){
                                System.out.println("Año Ingresado: "+anio);
                                System.out.println("\nFecha: "+dia+"/"+mes+"/"+anio);
                                System.out.println("La Fecha Es Correcta");
                            }
                        }while(anio == 0);
                    }
                    else{
                        System.out.println("\nError: Mes Invalido\n");
                    }
                }while(mes <= 0 || mes > 12);
            }
            else{
                System.out.println("Fecha Invalida: Dia: "+dia+" Incorrecto");
            }
        }while(dia <=0 || dia > 31);

    }
}
