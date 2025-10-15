package Tema2EjerciciosProgramacion;
import java.util.Scanner;
public class Tema2Ejercicio6 {
    public static void main(String[] args){
        System.out.println("Introduce un numero:");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        if (numero>0){
            System.out.println("el numero es positivo");
        } else if (numero<0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es igual a 0");}

    }
}
