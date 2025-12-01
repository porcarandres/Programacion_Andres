package Tema3_ProgramacionModular;

import java.util.Scanner;

public class MyArray {

    public static void mostrarArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static int maxArray(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }return max;
    }

    public static int minArray(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }return min;
    }

    public static double mediaArray(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        } return (double) suma / a.length;
    }

    public static void main(String[] args){
        showMenu();
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion){
            case 1: int[] n1 = new int[]{3, 7, 2, 9, 5};
                mostrarArray(n1);
                break;
            case 2: int[] n2 = new int[]{3, 7, 2, 9, 5};
                System.out.println("Máximo array {3, 7, 2, 9, 5}: " + maxArray(n2));
                break;
            case 3: int[] n3 = new int[]{3,7,2,9,5};
                System.out.println("Minimo array {3, 7, 2, 9, 5}: "+ minArray(n3));
                break;
            case 4: int[] n4 = new int[]{3,7,2,9,5};
                System.out.println("Media array {3, 7, 2, 9, 5}: " + mediaArray(n4));
                break;
            case 5:
        }

    }
    public static void showMenu(){
        System.out.println(" Menu ");
        System.out.println("1 - Mostrar Array");
        System.out.println("2 - Max Array");
        System.out.println("3 - Min Array");
        System.out.println("4 - Media Array");
        System.out.println("Elige una opcion: ");
    }
}

