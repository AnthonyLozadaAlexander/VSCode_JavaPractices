package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] codigo = new String[5];
        float cantLitros=0, precioLitro=0, facturacionTotal=0, count=0, countLitros=0, montoTotal =0, datoLitros=0;
        boolean On = false;
        for(int i = 0; i < 5; i++){
            input = new Scanner(System.in);
            facturacionTotal = 0;
            do{
                System.out.println("\n----------------------------------");
                System.out.println("        FACTURACION N("+(i+1)+")");
                System.out.println("----------------------------------");
                System.out.println("Ingrese el codigo del producto");
                System.out.print("-> ");
                codigo[i] = input.nextLine();

                if(codigo[i] == ""){
                    System.out.println("\nError: El Codigo No Puede Estar Vacio\n");
                }
                else{
                    System.out.println("\nCodigo Ingresado: " + codigo[i] + "\n");
                    do{
                        System.out.println("Ingrese La Cantidad Vendida Por Litro");
                        System.out.print("-> ");

                        if(!input.hasNextFloat()){
                            System.out.println("\nError: Debe Ingresar Datos Numericos\n");
                            input.next();

                            if(i == 0 || i < 5){
                                do{
                                    System.out.println("Ingrese La Cantidad Vendida Por Litro");
                                    System.out.print("-> ");
                                    if(!input.hasNextFloat()) {
                                        System.out.println("\nError: Debe Ingresar Datos Numericos\n");
                                        input.next();
                                        On = false;
                                    }
                                    else{
                                        float temp = Float.parseFloat(input.next());
                                        if (temp > 0) {
                                            datoLitros = temp;
                                        On = true;
                                        } else
                                        {
                                            System.out.println("\nError: Debe ingresar un valor mayor a 0\n");
                                            On = false;
                                        }
                                    }

                                }while(On == false);
                            }
                            else{
                                continue;
                            }
                        }
                        if(datoLitros > 0){
                            cantLitros = datoLitros;
                        }
                        else{
                            cantLitros = input.nextFloat();
                        }
                        if(cantLitros <= 0){
                            System.out.println("\nError: Debe Ingresar La Cantidad Mayor a Cero\n");
                        }
                        else{
                            countLitros = countLitros + cantLitros;
                            System.out.println("\nCantidad De Litros Ingresados: " + cantLitros + "\n");
                            do{
                                System.out.println("Ingrese El Precio");
                                System.out.print("-> ");

                                if(!input.hasNextFloat()){
                                    System.out.println("\nError: Debe Ingresar Datos Numericos\n");
                                    input.next();
                                    continue;
                                }
                                precioLitro = input.nextFloat();
                                if(precioLitro <= 0){
                                    System.out.println("\nError: Debe Ingresar El Precio Mayor a Cero\n");
                                }
                                else{

                                    System.out.println("\nPrecio Ingresado: " + precioLitro + "\n");
                                }
                            }while(precioLitro <= 0);
                        }
                    }while(cantLitros <= 0);
                }
            }while(codigo[i] == "");

            facturacionTotal = (precioLitro * cantLitros);
            montoTotal = montoTotal + facturacionTotal;
            if(facturacionTotal > 600){
                count = count + 1;
            }

        }

        System.out.println("\n-----------------------------");
        System.out.println("           FACTURA");
        System.out.println("\n-----------------------------");
        for(int i = 0; i < 5; i++){
            System.out.println("Codigos Ingresados: " + codigo[i]);
        }
        System.out.println("Cantidad De Litros Ingresados: " + countLitros);
        System.out.println("Facturas Mayores a $600: " + count);
        System.out.println("Monto Total: " + montoTotal);

    }
}
