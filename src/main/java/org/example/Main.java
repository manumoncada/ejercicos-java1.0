package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        String pro1 = "dulces";
        int prod1 = 1000;

        String pro2 = "agua";
        int prod2 = 2000;

        String pro3 = "chocorramo";
        int prod3 = 3000;

        String pro4 = "paquete de papas";
        int prod4 = 4000;

        String pro5 = "gaseosa";
        int prod5 = 5000;

        System.out.println("Buen dia, a continuacion la lista de nuestros productos disponibles");

        System.out.println("1 " + pro1 + " su valor es de $" + prod1);
        System.out.println("2 " + pro2 + " su valor es de $" + prod2);
        System.out.println("3 " + pro3 + " su valor es de $" + prod3);
        System.out.println("4 " + pro4 + " su valor es de $" + prod4);
        System.out.println("5 " + pro5 + " su valor es de $" + prod5);

        int total = 0;
        int cantidadproductos=0;
        while(cantidadproductos < 5){

            System.out.println("ingrese el numero del producto deseado; para finalizar ingrese 0");
            int cantidad = Scanner.nextInt();

            switch (cantidad) {

                case 1-> {
                     total += prod1;
                    System.out.println("Producto agregado: " + pro1 + " - Total: $" + total);

                }
                case 2-> {
                    total += prod2;
                 System.out.println("Producto agregado: " + pro2 + " - Total: $" + total);

                }
                case 3->{
                    total += prod3;
                    System.out.println("Producto agregado: " + pro3 + " - Total: $" + total);
                }
                case 4->{
                    total += prod4;
                    System.out.println("Producto agregado: " + pro4 + " - Total: $" + total);
                }
                case 5-> {
                    total += prod5;
                    System.out.println("Producto agregado: " + pro5 + " - Total: $" + total);
                }


                }

            }

        }
    }
}