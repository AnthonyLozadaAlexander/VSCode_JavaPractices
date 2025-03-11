package com.example_ejercicios;

public class ejercicio16 {
  public static void main(String[] args) 
  {
      /*
       * Realizar un programa que imprima por pantalla los numeros del 200 asl 250 saltando de 2 en 2, la secuencia deberia ser: 200, 202, 204, etc.
       */

       int count = 200;
       while(count <= 250)
       {
        System.out.println("num = " + count);
        count = count + 2;
       }

       System.out.println("---------------------------------------------\n");

       /*
        * Realizar un programa que imprima por pantalla una cuenta regresiva del 10 al 1, al finalizar la cuenta regresiva deberia imprimir "Feliz año nuevo"
        */
       
        count = 10;
        while(count > 0)
        {
          System.out.println("num = " + count);
          count--;   
        }
      System.out.println("Feliz año nuevo");
  }
}
