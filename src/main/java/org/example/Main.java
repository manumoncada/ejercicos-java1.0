package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        boolean calculadora = true;
        while (calculadora) {
            System.out.println("""
                    ¿Que desea calcular?
                    1 fahrenheit a celsius
                    2 celsius a fahrenheit
                    3 kelvin a celsius
                    4 celsius a kelvin
                    5 kelvin a fahrenheit
                    6 fahrenheit a kelvin
                    7 rankine a fahrenheit
                    8 fahrenheit a rankine
                    9 reaumur a celsius
                    10 rankine a kelvin
                    11 rankine a celsius
                    12 celsius a rankine
                    13 celsius a reaumur
                    14 kelvin a rankine
                    15 fahrenheit a reaumur
                    16 reaumur a fahrenheit
                    17 salir
                    """);
            int dato = Scanner.nextInt();

            switch (dato) {
                case 1 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado1 = ((5 * (valor - 32)) / 9);
                    System.out.println("el dato en celsius es " + resultado1);
                }
                case 2 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado2 = (((9 * valor) / 5) + 32);
                    System.out.println("el dato en fahrenheit es " + resultado2);
                }
                case 3 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado3 = (valor - 273.15);
                    System.out.println("el dato en celsius es " + resultado3);
                }
                case 4 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado4 = (valor + 273.15);
                    System.out.println("el dato en kelvin es " + resultado4);
                }
                case 5 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado5 = (((9*(valor-275.15))/5)+32);
                    System.out.println("el dato en fahrenheit es " + resultado5);
                }
                case 6 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado6 = ((9*(valor-32)/9)+273.15);
                    System.out.println("el dato en kelvin es " + resultado6);
                }
                case 7 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado7 = (valor-459.67);
                    System.out.println("el dato en fahrenheit es " + resultado7);
                }
                case 8 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado8 = (valor+459.67);
                    System.out.println("el dato en rankine es " + resultado8);
                }
                case 9 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado9 = ((5*valor)/4);
                    System.out.println("el dato en celsius es " + resultado9);
                }
                case 10 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado10 = (((5*(valor-491.67))/9)+273.15);
                    System.out.println("el dato en kelvin es " + resultado10);
                }
                case 11 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado11 = ((5*(valor-491.67))/9);
                    System.out.println("el dato en celsius es " + resultado11);
                }
                case 12 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado12 = (((9 * valor)/5)+491.67);
                    System.out.println("el dato en rankine es " + resultado12);
                }
                case 13 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado13 = ((4*valor)/5);
                    System.out.println("el dato en reaumur es " + resultado13);
                }
                case 14 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado14 = (((9*(valor-273.15))/5)+491.67);
                    System.out.println("el dato en rankine es " + resultado14);
                }
                case 15 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado15 = ((4*(valor-32))/9);
                    System.out.println("el dato en reaumur es " + resultado15);
                }
                case 16 -> {
                    System.out.println("ingrese el dato que quiere calcular ");
                    int valor = Scanner.nextInt();
                    double resultado16 = ((5 * (valor - 32)) / 9);
                    System.out.println("el dato en fahrenheit es " + resultado16);
                }
                case 17 -> {
                    return;
                }

            }
        }
    }
}