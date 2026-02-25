package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaPokemonTPV {

    public static void main(String[] args){

        List<Articulo> carro = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

        System.out.println("Opcion:");
    int opcion =sc.nextInt();
        sc.nextLine();

         do{
        switch (opcion){
            case 1:
                aniadirPocion();

                break;
            case 2:
                borrarPosi();


                break;
            case 3:



                break;
            case 4:


                break;
            case 5:


                break;
            case 6:
                break;
            case 7:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Pon una opcion valida");

        }
        System.out.println("Opcion:");
        opcion =sc.nextInt();
        sc.nextLine();

    }while(opcion != 7);

    }

    public static void aniadirPocion(){

        //carro.add();
    }
    public static void borrarPosi(){

        //carro.remove();
    }

}


