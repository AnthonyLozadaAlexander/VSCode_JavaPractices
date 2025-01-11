package com.example_prueba1;

import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
      boolean On;
      int x, y;
      Scanner input = new Scanner(System.in);
      try {
        System.out.println("Digite el primer numero");
        x = input.nextInt();
        System.out.println("Digite el segundo numero");
        y = input.nextInt();
         if(x % 2 == 0 && y % 2 == 0){
          On = true;
          System.out.println("Ambos numeros son pares: " + On);
         }
         else if(x % 2 != 0 && y % 2 != 0){
          On = false;
          System.out.println("Ambos numeros son impares: " + On);
         }
         else{
          On = false;
          System.out.println("Uno de los numeros es par y el otro es impar: " + On);
         }
         
        } catch (Exception e) {
          System.out.println("Dato no valido");
      }      
  }
  
}
