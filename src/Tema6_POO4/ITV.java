package Tema6_POO4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ITV{
    public static void main(String [] args){

        ArrayList<String> registrados = new ArrayList<>();
        String[] vehiculos= {"Taaaa","aa","Baa"};
        Random dado=new Random();
        int segundo = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Simulación iniciada...");


        while (segundo < 10){

            segundo ++;
            int indice = dado.nextInt(3);
            String tipo = vehiculos[indice];

            String dato = "Segundo: " + segundo + " | Vehículo: " + tipo;
            registrados.add(dato);
            System.out.println("Registrado: " + dato);

        }
    }
}
