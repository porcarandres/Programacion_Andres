package Tema2EjerciciosProgramacion;
import java.util.Scanner;
public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = sc.nextDouble();

        if (num1 >=num2 && num1 >=num3) {
            System.out.println("el numero mayor es:"+num1);
        } else if (num2>=num1 && num2>=num3) {
            System.out.println("el numero mayor es:"+num2);
        }else if (num3 >=num1 && num3>=num2) {
            System.out.println("el numero mayor es:" + num3);
        }

    }
}


