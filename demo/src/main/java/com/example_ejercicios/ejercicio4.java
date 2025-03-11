package com.example_ejercicios;

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
      //Cree un programa en Java que solicite al usuario una distancia en metros y el tiempo necesario (horas, minutos, segundos).
      //Muestra la velocidad, en metros por segundo, kilómetros por hora y millas por hora.
      //1 milla = 1609 metros.

      Scanner input = new Scanner(System.in);

      Double distanciaMetros, horas, minutos, segundos, VelocidadMetrosPorSegundo, VelocidadKilometrosPorHora, VelocidadMillasPorHora;
      int TiempoTotalSegundos;

      System.out.println("Ingrese la distancia en metros");
      distanciaMetros = input.nextDouble();

      System.out.println("Ingrese las horas");
      horas = input.nextDouble();

      System.out.println("Ingrese los minutos");
      minutos = input.nextDouble();

      System.out.println("Ingrese los segundos");
      segundos = input.nextDouble();

      TiempoTotalSegundos = (int) (horas * 3600 + minutos * 60 + segundos);
      VelocidadMetrosPorSegundo = (distanciaMetros / TiempoTotalSegundos);
      VelocidadKilometrosPorHora = (distanciaMetros / 1000.0) / (TiempoTotalSegundos / 3600.0);
      VelocidadMillasPorHora = (distanciaMetros / 1609.0) / (TiempoTotalSegundos / 3600.0);


      System.out.println("La velocidad metros por segundos es: " + VelocidadMetrosPorSegundo);
      System.out.println("La velocidad kilometros por hora es: " + VelocidadKilometrosPorHora);
      System.out.println("La velocidad millas por hora es: " + VelocidadMillasPorHora);

  }
  
}
