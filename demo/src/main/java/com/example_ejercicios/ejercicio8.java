package com.example_ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, num2;

    try{ //?Try catch para evitar errores de tipo de dato
    System.out.println("Digite el primer numero: ");
    num = input.nextInt();

    System.out.println("");

    if(num > 0){
      System.out.println("El numero "+ num + " es positivo");
    }
    else if(num < 0){
      System.out.println("El numero "+ num + " es negativo");
    }
    else{
      System.out.println("El numero " + num + " es cero");
    }
    }catch (InputMismatchException e){
      System.out.println("Error: Dato no valido");
    }
  }   
}
