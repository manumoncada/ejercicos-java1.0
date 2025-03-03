package org.example;

import java.util.Scanner;

public class Main {

    static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int defensa = 0;
        int ataque = 0;
        double neutro = 0.5;
        int efectivo = 1;
        int superefectivo=2;

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

        System.out.println("""
                selecione el tipo de su pokemon
                1 electrico
                2 agua
                3 planta
                4 fuego
                """);
        int tipo = Scanner.nextInt();
        if (tipo==0) {}
        switch(tipo){

            case 1-> {
                System.out.println("""
                        seleccione el tipo de su rival
                        1 electrico
                        2 agua
                        3 planta
                        4 fuego""");
                int rival= Scanner.nextInt();
                if (rival==0);
                System.out.println("ingrese la defensa del rival");
                defensa = Scanner.nextInt();

                if(defensa>100){
                    System.out.println("la defensa es demasiado alta");
                    return;}

                else if (defensa<1){
                    System.out.println("la defensa es demasiado baja");
                    return;}
                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * (ataque / defensa)) * neutro);
                        System.out.println("el daño es neutro, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * (ataque / defensa)) * superefectivo);
                        System.out.println("el daño es superefectivo, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * (ataque / defensa)) * efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * (ataque / defensa))*efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);
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
                if (rival==0);
                System.out.println("ingrese la defensa del rival");
                defensa = Scanner.nextInt();

                if(defensa>100){
                    System.out.println("la defensa es demasiado alta");
                    return;}

                else if (defensa<1){
                    System.out.println("la defensa es demasiado baja");
                    return;}

                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * (ataque / defensa)) * efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * (ataque / defensa)) * neutro);
                        System.out.println("el daño es neutro, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * (ataque / defensa)) * efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * (ataque / defensa))*superefectivo);
                        System.out.println("el daño es superefectivo, por ende su daño final es de "+ dano);
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
                if (rival==0);
                System.out.println("ingrese la defensa del rival");
                defensa = Scanner.nextInt();

                if(defensa>100){
                    System.out.println("la defensa es demasiado alta");
                    return;}

                else if (defensa<1){
                    System.out.println("la defensa es demasiado baja");
                    return;}
                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * (ataque / defensa)) * efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * (ataque / defensa)) * superefectivo);
                        System.out.println("el daño es superefectivo, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * (ataque / defensa)) * efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * (ataque / defensa))*efectivo);
                        System.out.println("el daño es neutro, por ende su daño final es de "+ dano);
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
                if (rival==0);
                System.out.println("ingrese la defensa del rival");
                defensa = Scanner.nextInt();

                if(defensa>100){
                    System.out.println("la defensa es demasiado alta");
                    return;}

                else if (defensa<1){
                    System.out.println("la defensa es demasiado baja");
                    return;}
                switch(rival){
                    case 1-> {
                        //electrico
                        double dano = (( 50 * (ataque / defensa)) * efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);

                    }
                    case 2->{
                        //agua
                        double dano = ( (50 * (ataque / defensa)) * neutro);
                        System.out.println("el daño es neutro, por ende su daño final es de "+ dano);

                    }
                    case 3->{
                        //planta
                        double dano = (( 50 * (ataque / defensa)) * superefectivo);
                        System.out.println("el daño es superefectivo, por ende su daño final es de "+ dano);
                    }
                    case 4-> {
                        //fuego
                        double dano = ((50 * (ataque / defensa)) * efectivo);
                        System.out.println("el daño es efectivo, por ende su daño final es de "+ dano);
                    }
                }

            }
        }


    }
}