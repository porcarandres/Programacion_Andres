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
    public static boolean existeArray(int[] a, int elemento) {
        for (int n : a) {
            if (n == elemento) {
                return true;
            }
        }
        return false;
    }
    public static int[] sumarVectores(int[] vectorA, int[] vectorB){
        if (vectorA.length != vectorB.length) {
            System.out.println("Error: Los vectores deben tener la misma longitud");
        }
        int[] resultado = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            resultado[i] = vectorA[i] + vectorB[i];
        }
        return resultado;
    }
    public static int[] restarVectores(int[] vectorA, int[] vectorB){
        if (vectorA.length != vectorB.length) {
            System.out.println("Error: Los vectores deben tener la misma longitud");
        }
        int[] resultado = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            resultado[i] = vectorA[i] - vectorB[i];
        }
        return resultado;
    }

    public static void main(String[] args){
        showMenu();
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        int[] n1 = new int[]{3, 7, 2, 9, 5};
        int[] n2 = new int[]{9, 5, 3, 2, 1};

        switch (opcion){
            case 1:
                mostrarArray(n1);
                break;
            case 2:
                System.out.println("Máximo array {3, 7, 2, 9, 5}: " + maxArray(n1));
                break;
            case 3:
                System.out.println("Minimo array {3, 7, 2, 9, 5}: "+ minArray(n1));
                break;
            case 4:
                System.out.println("Media array {3, 7, 2, 9, 5}: " + mediaArray(n1));
                break;
            case 5:
                System.out.println("Inserta numero buscado");
                int buscado = sc.nextInt();
                if (existeArray(n1, buscado)) {
                    System.out.println("El elemento SÍ existe en el array.");
                }else{
                    System.out.println("El elemento NO existe en el array.");
                }break;
            case 6:
                System.out.println("La suma de los dos vectores es: ");
                int[] resultadoSuma = sumarVectores(n1, n2);
                mostrarArray(resultadoSuma);
                break;
            case 7:
                System.out.println("La resta de los dos vectores es: ");
                int[] resultadoresta = restarVectores(n1, n2);
                mostrarArray(resultadoresta);
                break;
        }

    }
    public static void showMenu(){
        System.out.println(" Menu ");
        System.out.println("1 - Mostrar Array");
        System.out.println("2 - Max Array");
        System.out.println("3 - Min Array");
        System.out.println("4 - Media Array");
        System.out.println("5 - Buscar numero en Array");
        System.out.println("6 - Sumar Vectores");
        System.out.println("7 - Restar Vectores");
        System.out.println("Elige una opcion: ");
    }
}

