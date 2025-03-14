package com.example_ejercicios;
import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float nums = 0, promedio = 0, sum = 0;
    int count = 0;
    System.out.println("------------WELCOME------------");
    do{
      System.out.println("Ingrese un numero positivo");
      System.out.print("-> ");
      if(!input.hasNextFloat()){
        System.out.println("\n--------------------------------------------------");
        System.out.println("Error: Debe ingresar un numero positivo");
        System.out.println("----------------------------------------------------\n");
        input.next();
        continue;
      }
      nums = input.nextFloat();
      if(nums < 0){
        System.out.println("\n--------------------------------------------------");
        System.out.println("Error: Debe ingresar un numero positivo");
        System.out.println("----------------------------------------------------\n");
      }
      else{
        sum = sum + nums;
        count = count + 1;
        System.out.println("Numero Ingresado -> " + nums);
        System.out.println("Count -> " + count);
      }

    }while(nums > 0);
    
    promedio = (sum/count);
    System.out.println("\n--------------------------------------------------");
    System.out.println("La suma de los numeros ingresados es: " + sum);
    System.out.println("El promedio de los numeros ingresados es: " + promedio);
    System.out.println("----------------------------------------------------\n");
  }
}
