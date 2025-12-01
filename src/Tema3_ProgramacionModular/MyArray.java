package Tema3_ProgramacionModular;

import java.util.Scanner;

public class MyArray {

    public static void mostrarArray(int[] gerom){
        for (int i = 0; i < gerom.length; i++) {
            System.out.println(gerom[i]);
        }
        System.out.println();
    }

    public static int maxArray(int[] gerom){
        int max = gerom[0];
        for (int i = 0; i < gerom.length; i++) {
            if(gerom[i] > max){
                max =gerom[i];
            }
        }return max;
    }

    public static int minArray(int[] gerom){
        int min = gerom[0];
        for (int i = 0; i < gerom.length; i++) {
            if(gerom[i] < min){
                min =gerom[i];
            }
        }return min;
    }

    public static void main(String[] args){
        showMenu();
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion){
            case 1: int[] gerom = new int[]{3, 7, 2, 9, 5};
                mostrarArray(gerom);
                break;
            case 2: int[] numero = new int[]{3, 7, 2, 9, 5};
                System.out.println("Máximo array {3, 7, 2, 9, 5}: " + maxArray(numero));
                break;
            case 3: int[] n = new int[]{3,7,2,9,5};
                System.out.println("Minimo array {3, 7, 2, 9, 5}: "+ minArray(n));
                break;

        }

    }
    public static void showMenu(){
        System.out.println(" Menu ");
        System.out.println("1 - Mostrar Array");
        System.out.println("2 - Max Array");
        System.out.println("3 - Min Array");
        System.out.println("Elige una opcion: ");
    }
}

