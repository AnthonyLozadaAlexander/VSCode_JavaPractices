package com.example_ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args)
  {
   boolean On = true;
   
   while(On){
    Random azar = new Random();
    Scanner input = new Scanner(System.in);
    int a, b, capsula;
     
     System.out.println("Ingrese el valor de a");
     a = input.nextInt();
     
     System.out.println("Ingrese el valor de b");
     b = input.nextInt();

     capsula = azar.nextInt(a,b);
    
     System.out.println("El numero de capsula es: " + capsula);
    } 
  }
}
