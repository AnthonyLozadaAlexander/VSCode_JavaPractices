package com.example_ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;

    try{ //?Try catch para evitar errores de tipo de dato
    System.out.println("Digite el primer numero: ");
    num = input.nextInt();

    if(num > 0){
      System.out.println("\nEl numero "+ num + " es positivo");
    }
    else if(num < 0){
      System.out.println("\nEl numero "+ num + " es negativo");
    }
    else{
      System.out.println("\nEl numero " + num + " es cero");
    }
    }catch (InputMismatchException e){ // si se ingresa texto en vez de numeros se activara el catch
      System.out.println("Error404: Dato no valido");
    }
  }   
}
