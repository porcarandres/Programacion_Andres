package Tema3_ProgramacionModular;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void showMenu(){
        System.out.println("Conversor $ y € \n (1) Convertir euros a dolares \n (2) Convertir dolares a euros \n (3) Fin.");
    }

    public static double euro2Dollar(double euro){
        double Cambio = 1.16;
        return euro * Cambio;
    }

    public static double dollar2Euro(double dollar){
        double Cambio = 1.16;
        return dollar / Cambio;
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double cantidad;

        while (opcion != 3){
        showMenu();
        System.out.println("Selecciona una opcion de las 3: ");
        opcion = scanner.nextInt();

        if (opcion == 1){
            System.out.println("Introduce euros:");
            cantidad = scanner.nextDouble();
            System.out.println(cantidad + " euros, son " + euro2Dollar(cantidad) + " dolares.");
        } else if (opcion == 2) {
            System.out.println("Introduce dolares:");
            cantidad = scanner.nextDouble();
            System.out.println(cantidad + " dolares, son " + dollar2Euro(cantidad) + " euros.");
        } else if (opcion == 3) {
            System.out.println("Fin");
        }else{
            System.out.println("No valido");
        }
        }

    }
}