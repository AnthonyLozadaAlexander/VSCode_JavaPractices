package com.example_prueba1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1 {
  public static void main(String[] args) throws IOException{
    // Escriba un programa en Java que solicite al usuario tres letras y los muestre al revés.

     BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 

        System.out.println("Ingrese tres letras: ");
        char a = obj.readLine().charAt(0); // ingresar una letra
        char b = obj.readLine().charAt(0); // ingresar una letra
        char c = obj.readLine().charAt(0); // ingresar una letra
        
        // Mostrar las letras al reves en el sout
        System.out.println(c + " " + b + " " + a);

  }
}
