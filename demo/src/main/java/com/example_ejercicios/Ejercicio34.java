package com.example_ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Fecha De Nacimiento (dd/mm/yyyy)");
        System.out.println("--------------------------------");
        String fecha = input.nextLine();

        try{
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(fecha, formatoFecha);

            LocalDate fechaActual = LocalDate.now();

            Period periodo = Period.between(fechaNacimiento, fechaActual);
            System.out.printf("La edad es: %d años, %d meses y %d días\n", periodo.getYears(), periodo.getMonths(), periodo.getDays());
            System.out.println();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return;
        }
    }
}
