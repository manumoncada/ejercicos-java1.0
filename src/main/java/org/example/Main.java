package org.example;

import java.util.Scanner;

public class Main {

    static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int defensa = 0;
        int ataque = 0;


        final double ATAQUE_NEUTRO = 0.5;
        final int ATAQUE_EFECTIVO = 1;
        final int ATAQUE_SUPEREFECTIVO=2;

        /*
        while(ataque==0) {
            System.out.println("introduzca el ataque de su pokemon");
            ataque = Scanner.nextInt();
            if (ataque > 100) {
                System.out.println("el ataque es demasiado alto");
                return;
            } else if (ataque < 1) {
                System.out.println("el ataque es demasiado bajo");
                return;

            }
        }
        */


        //..............

        do{
            System.out.println("introduzca el ataque de su pokemon");
            ataque = Scanner.nextInt();
            if (ataque > 100) {
                System.out.println("el ataque es demasiado alto");
            }
            if (ataque < 1) {
                System.out.println("el ataque es demasiado bajo");
            }
        } while( (ataque > 100) || (ataque < 1) );

        //..........

        System.out.println("""
                selecione el tipo de su pokemon
                1 electrico
                2 agua
                3 planta
                4 fuego
                """);
        int tipo = Scanner.nextInt();
        switch(tipo){

            case 1-> {
                System.out.println("""
                        seleccione el tipo de su rival
                        1 electrico
                        2 agua
                        3 planta
                        4 fuego""");
                int rival= Scanner.nextInt();

                do{
                    System.out.println("introduzca el defensa de su pokemon");
                    defensa = Scanner.nextInt();
                    if (defensa > 100) {
                        System.out.println("el defensa es demasiado alto");
                    }
                    if (defensa < 1) {
                        System.out.println("el defensa es demasiado bajo");
                    }
                } while( (defensa > 100) || (defensa < 1) );



                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_NEUTRO);
                        System.out.println("el daño es ATAQUE_NEUTRO, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * ((double)ataque / defensa)) * ATAQUE_SUPEREFECTIVO);
                        System.out.println("el daño es ATAQUE_SUPEREFECTIVO, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * ((double)ataque / defensa))*ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);
                    }
                }


            }
            case 2->{
                System.out.println("""
                        seleccione el tipo de su rival
                        1 electrico
                        2 agua
                        3 planta
                        4 fuego""");
                int rival= Scanner.nextInt();

                do{
                    System.out.println("introduzca el defensa de su pokemon");
                    defensa = Scanner.nextInt();
                    if (defensa > 100) {
                        System.out.println("el defensa es demasiado alto");
                    }
                    if (defensa < 1) {
                        System.out.println("el defensa es demasiado bajo");
                    }
                } while( (defensa > 100) || (defensa < 1) );

                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * ((double)ataque / defensa)) * ATAQUE_NEUTRO);
                        System.out.println("el daño es ATAQUE_NEUTRO, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * ((double)ataque / defensa))*ATAQUE_SUPEREFECTIVO);
                        System.out.println("el daño es ATAQUE_SUPEREFECTIVO, por ende su daño final es de "+ dano);
                    }
                }
            }
            case 3->{
                System.out.println("""
                        seleccione el tipo de su rival
                        1 electrico
                        2 agua
                        3 planta
                        4 fuego""");
                int rival= Scanner.nextInt();
                do{
                    System.out.println("introduzca el defensa de su pokemon");
                    defensa = Scanner.nextInt();
                    if (defensa > 100) {
                        System.out.println("el defensa es demasiado alto");
                    }
                    if (defensa < 1) {
                        System.out.println("el defensa es demasiado bajo");
                    }
                } while( (defensa > 100) || (defensa < 1) );
                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * ((double)ataque / defensa)) * ATAQUE_SUPEREFECTIVO);
                        System.out.println("el daño es ATAQUE_SUPEREFECTIVO, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * ((double)ataque / defensa))*ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_NEUTRO, por ende su daño final es de "+ dano);
                    }
                }
            }
            case 4->{System.out.println("""
                        seleccione el tipo de su rival
                        1 electrico
                        2 agua
                        3 planta
                        4 fuego""");
                int rival= Scanner.nextInt();
                do{
                    System.out.println("introduzca el defensa de su pokemon");
                    defensa = Scanner.nextInt();
                    if (defensa > 100) {
                        System.out.println("el defensa es demasiado alto");
                    }
                    if (defensa < 1) {
                        System.out.println("el defensa es demasiado bajo");
                    }
                } while( (defensa > 100) || (defensa < 1) );
                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * ((double)ataque / defensa)) * ATAQUE_NEUTRO);
                        System.out.println("el daño es ATAQUE_NEUTRO, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * ((double)ataque / defensa)) * ATAQUE_SUPEREFECTIVO);
                        System.out.println("el daño es ATAQUE_SUPEREFECTIVO, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * (((double)ataque) / defensa)) * ATAQUE_EFECTIVO);
                        System.out.println("el daño es ATAQUE_EFECTIVO, por ende su daño final es de "+ dano);
                    }
                }

            }
        }


    }
}