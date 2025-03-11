package com.example_ejercicios;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args)
  {
    //Escriba un programa en Java que solicite el ancho (x) y la altura (y) de un rectángulo y calcule el perímetro, el área y la diagonal.
    //Perímetro= suma de los cuatro lados.
    //Área= base x altura.
    //Diagonal= Teorema de Pitágoras.

    Scanner input = new Scanner(System.in);
    Double altura, ancho, Perimetro, Area, Diagonal;

    System.out.println("Ingrese el ancho del rectangulo");
    ancho = input.nextDouble();

    System.out.println("Ingrese la altura del rectangulo");
    altura = input.nextDouble();
    
    Perimetro = 2 * (ancho + altura); // suma de los cuatro lados
    Area = (ancho * altura); // base x altura
    Diagonal = Math.sqrt((ancho * altura)+(altura * altura)); // Pitagoras

    System.out.println("");

    System.out.println("El perimetro del rectangulo es: " + Perimetro);
    System.out.println("El area del rectangulo es: " + Area);
    System.out.println("La Diagonal del rectangulo es: " + Diagonal);
  }
  
}
