import java.util.Scanner;
public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int A = sc.nextInt();
        System.out.println("Introduce un numero: ");
        int B = sc.nextInt();
        if (A > B) {
            System.out.println("El numero"+A+ " es mayor");}
        else if (B>A){ System.out.println("El numero " +B+" es mas grande");}
        else {
            System.out.println("Los numeros "+A+" y "+B+" son igules");

        }
    }
}