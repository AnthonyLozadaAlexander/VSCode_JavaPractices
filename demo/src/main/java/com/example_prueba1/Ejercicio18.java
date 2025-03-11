package com.example_prueba1;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args)
    {
          Scanner input = new Scanner(System.in);
          float num1, num2;
          int opc;
          System.out.println("--------------------------");
          System.out.println("Ingrese el primer numero");
          System.out.print("-> ");
          num1 = input.nextFloat();

          System.out.println("Ingrese el segundo numero");
          System.out.print("-> ");
          num2 = input.nextFloat();
          System.out.println("\n--------------------------");
          System.out.println("-----------MENU-----------");
          System.out.println("1. Suma");
          System.out.println("2. Resta");
          System.out.println("3. Multiplicacion");
          System.out.println("4. Division");
          System.out.println("5. Exponenciacion");
          System.out.println("6. Radicacion");
          System.out.println("-----------------------------");
          System.out.println("Ingrese La Opcion");
          System.out.println("-> ");
          opc = input.nextInt();

          if(opc == 1){

          }
          else if(opc == 2){

          }
          else if(opc == 3){

          }
          else if(opc == 4){

          }
          else{
            System.out.println("Error: Opcion Invalida");
          }
    }
}
