package com.example_prueba1;

import java.util.Scanner;

public class ejercicio14 {
  public static void main(String[] args) {

    String respuesta;
    boolean On = true;
    Scanner input = new Scanner(System.in);

    System.out.println("Imprimiendo numeros del 200 al 250 en 2 en 2\n");
    for(int count = 200; count <= 250; count=count+2){
      System.out.println(count);
    }
    System.out.println("---------------------------------------------\n");

    System.out.println("Cuenta regresiva del 10 al 1\n");
    for(int i = 10; i > 0; i--){
      System.out.println(i);
    }
    System.out.println("Feliz año nuevo");

    System.out.println("---------------------------------------------\n");

    while(On){
      System.out.println("Desea Continuar o Salir del bucle? (Continuar/Salir)");
      respuesta = input.nextLine();
      if(respuesta.equalsIgnoreCase("Salir")){
        System.out.println("Seleccion: " + respuesta);
        System.out.println("Saliendo del bucle");
        On = false;
      }
      else{
        System.out.println("Seleccion: " + respuesta);
        System.out.println("Continuando en el bucle");
      }

    }
  } 
}
