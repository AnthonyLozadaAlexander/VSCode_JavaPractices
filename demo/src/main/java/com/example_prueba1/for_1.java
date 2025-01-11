package com.example_prueba1;

public class for_1 {
  public static void main(String[] args) {

    /* 
    for(int contador = 0; contador < 10; contador++){
      System.out.println("Estoy en la iteracion N° " + contador + " del contador hasta llegar 10");
    }

    System.out.println();
    System.out.println("--------------------------------------------------\n");

    for(int contador = 0; contador < 10; contador++){
      // Contador + 1 es para que contador empieze desde 1 y no desde 0
      System.out.println("Estoy en la iteracion N° " + (contador + 1) + " del contador hasta llegar 10");

    }

    System.out.println();
    System.out.println("--------------------------------------------------\n");
    */

    int suma;

    for(int contador = 0; contador < 10; contador++){
      // Contador + 1 es para que contador empieze desde 1 y no desde 0
      System.out.println("Estoy en la iteracion N° " + contador + " del contador hasta llegar 10");

      suma = 5 + contador;

      if(suma >= 7){
        contador = 11;
      }

    }
      
  }
  
}
