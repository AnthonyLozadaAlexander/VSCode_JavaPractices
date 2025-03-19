package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = 0, promedioN = 0, promedioP = 0, countP= 0, countN = 0, count0 = 0, sumaN=0, sumaP=0;
        System.out.println("--------Bienvenido--------");
        for(int i = 1; i <= 10; i++){
            System.out.println("Ingrese un numero ("+i+")");

            System.out.print("-> ");
            if(!input.hasNextInt()){
                System.out.println("\nError: Debe Digitar Un Numero\n");
                input.next();
                i = i - 1;
                continue;
            }
            nums = input.nextInt();

            if(nums < 0){
                countN = countN + 1;
                sumaN = sumaN + nums; // se suman los numeros negativos ingresados
            }
            else if(nums > 0){
                countP = countP + 1;
                sumaP = sumaP + nums; // se suman los numeros positivos ingresados
            }
            else if(nums == 0){
                count0 = count0 + 1;
            }
        }

        promedioP = sumaP / countP;
        promedioN = sumaN / countN;

        if(countP == 0) System.out.println("\nNo se puede realizar el promedio de numeros Positivos dado que no hay numeros Positivos Ingresados");
        else{
            System.out.println("\nNumeros Positivos Ingresados -> "+ countP);
            System.out.println("La suma de los numeros Positivos es: " + sumaP);
            System.out.println("El Promedio de los numeros positivos es: " + promedioP);
            System.out.println("Numeros Ceros Ingresados -> "+ count0 + "\n");
        }
        if(countN == 0) System.out.println("\n No se puede realizar el promedio de numeros Negativos dado que no hay numeros Negativos Ingresados");
        else{
            System.out.println("Numeros Negativos -> "+ countN);
            System.out.println("La suma de los numeros Negativos es: " + sumaN);
            System.out.println("El Promedio de los numeros negativos es: " + promedioN);
            System.out.println("Numeros Ceros Ingresados -> "+ count0);
        }

    }
}
