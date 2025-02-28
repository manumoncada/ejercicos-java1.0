package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int cantidadinicial = 50000;
        int cajero = 50000;
        boolean cajerito = true;
        while (cajerito) {
            System.out.println("""
                    ingrese una opcion
                    1 consultar saldo
                    2 ingresar dinero
                    3 sacar dinero
                    4 salir
                    """);
            int s = Scanner.nextInt();
            switch (s) {
                case 1 -> {
                    System.out.println("la cantidad disponible es " + cajero);
                }
                case 2 -> {
                    System.out.println("ingrese la cantidad a ingresar");
                    int ingreso = Scanner.nextInt();
                    cajero = ingreso + cantidadinicial;
                }
                case 3 -> {
                    System.out.println("¿cuanto dinero desea retirar?");
                    int retiro = Scanner.nextInt();
                    if (cajero >= retiro) {
                        cajero = cajero - retiro;

                    } else System.out.println("no cuenta con el saldo suficiente");
                }
                case 4 -> {
                    return;
                }
            }


        }



    }

}