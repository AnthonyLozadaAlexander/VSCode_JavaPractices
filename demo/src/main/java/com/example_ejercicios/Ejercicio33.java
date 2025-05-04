package com.example_ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] codigo = new String[5];
        float cantLitros = 0, precioLitro = 0, facturacionTotal = 0, countFacturas = 0, countLitros = 0, montoTotal = 0, datoLitros = 0, datoPrecios = 0, productoUno=0;
        boolean On = false;
        for (int i = 0; i < 5; i++) {
            facturacionTotal = 0;
            datoLitros = 0;
            datoPrecios = 0;
            System.out.println("\n----------------------------------");
            System.out.println("        FACTURACION N(" + (i + 1) + ")");
            System.out.println("----------------------------------");
            do {
                input = new Scanner(System.in);
                System.out.println("Ingrese el codigo del producto");
                System.out.print("-> ");
                codigo[i] = input.nextLine();

                if (codigo[i].isEmpty()) {
                    System.out.println("\nError: El Codigo No Puede Estar Vacio\n");
                } else {
                    System.out.println("\nCodigo Ingresado: " + codigo[i] + "\n");
                    do {
                        input = new Scanner(System.in);
                        System.out.println("Ingrese La Cantidad De Litros");
                        System.out.print("-> ");

                        if (!input.hasNextFloat()) {
                            System.out.println("\nError: Debe Ingresar Datos Numericos\n");
                            input.next();

                            if (i == 0 || i < 5) {
                                do {
                                    input = new Scanner(System.in);
                                    System.out.println("Ingrese La Cantidad De Litros");
                                    System.out.print("-> ");
                                    if (!input.hasNextFloat()) {
                                        System.out.println("\nError: Debe Ingresar Datos Numericos\n");
                                        input.next();
                                        On = false;
                                    } else {
                                        float temporal = Float.parseFloat(input.next());
                                        if (temporal > 0) {
                                            datoLitros = temporal;
                                            On = true;
                                        } else {
                                            System.out.println("\nError: Debe ingresar un valor mayor a 0\n");
                                            On = false;
                                        }
                                    }

                                } while (On == false);
                            }
                        }
                        if (datoLitros > 0) {
                            cantLitros = datoLitros;
                        } else {
                            cantLitros = input.nextFloat();
                        }
                        if (cantLitros <= 0) {
                            System.out.println("\nError: Debe Ingresar La Cantidad Mayor a Cero\n");
                        } else {
                            // countLitros = countLitros + cantLitros;
                            System.out.println("\nCantidad De Litros Ingresados: " + cantLitros + "\n");
                            do {
                                input = new Scanner(System.in);
                                System.out.println("Ingrese El Precio");
                                System.out.print("-> ");

                                if (!input.hasNextFloat()) {
                                    System.out.println("\nError: Debe Ingresar Datos Numericos\n");
                                    input.next();

                                    if (i == 0 || i < 5) {
                                        do {
                                            input = new Scanner(System.in);
                                            System.out.println("Ingrese El Precio Vendido Por Litro");
                                            System.out.print("-> ");
                                            if (!input.hasNextFloat()) {
                                                System.out.println("\nError: Debe Ingresar Datos Numericos\n");
                                                input.next();
                                                On = false;
                                            } else {
                                                float temporal = Float.parseFloat(input.next());
                                                if (temporal > 0) {
                                                    datoPrecios = temporal;
                                                    On = true;
                                                } else {
                                                    System.out.println("\nError: Debe ingresar un valor mayor a 0\n");
                                                    On = false;
                                                }
                                            }

                                        } while (On == false);
                                    }
                                }
                                if (datoPrecios > 0) {
                                    precioLitro = datoPrecios;
                                } else {
                                    precioLitro = input.nextFloat();
                                }
                                if (precioLitro <= 0) {
                                    System.out.println("\nError: Debe Ingresar La Cantidad Mayor a Cero\n");
                                } else {
                                    System.out.println("\nPrecio De Venta Por Litros Ingresados: " + precioLitro + "\n");
                                }
                            } while (precioLitro <= 0);
                        }
                    } while (cantLitros <= 0);
                }
            } while (codigo[i].isEmpty());

            if(codigo[i].equalsIgnoreCase("1")){
                productoUno = productoUno + cantLitros;
            }

            facturacionTotal = (precioLitro * cantLitros);
            montoTotal = montoTotal + facturacionTotal;
            if (facturacionTotal > 600) {
                countFacturas = countFacturas + 1;
            }

            countLitros = countLitros + cantLitros;
        }

        System.out.println("\n-----------------------------");
        System.out.println("           RESUMEN");
        System.out.println("-----------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Codigos Ingresados: " + codigo[i]);
        }
        System.out.println("Cantidad De Litros Ingresados: " + countLitros);
        System.out.println("Cantidad De Litros Vendidos Del Articulo 1: " + productoUno);
        System.out.println("Facturas Mayores a $600: " + countFacturas);
        System.out.println("FacturacionTotal: " + montoTotal);

    }
}
