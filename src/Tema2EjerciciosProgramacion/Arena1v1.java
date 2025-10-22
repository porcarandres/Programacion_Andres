package Tema2EjerciciosProgramacion;

import java.util.Random;
import java.util.Scanner;

public class Arena1v1 {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la arena gladiadores");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean valido1 = false, valido2 = false;

        while (!valido1) {
            System.out.println("Jugador1 inserte sus atributos (no te pases de 200 en cada y maximo entre todos 500)");
            System.out.println("ATAQUE J1");
            int ataqueJ1 = sc.nextInt();

            System.out.println("DEFENSA J1");
            int defensaJ1 = sc.nextInt();

            System.out.println("VIDA J1");
            int vidaJ1 = sc.nextInt();

            System.out.println("VELOCIDAD J1");
            int velocidadJ1 = sc.nextInt();
            if (velocidadJ1 < 0 || velocidadJ1 > 200 || vidaJ1 < 0 || vidaJ1 > 200 || defensaJ1 < 0 || defensaJ1 > 200 || ataqueJ1 < 0 || ataqueJ1 > 200) {
                System.out.println("no te pases de 200 en cada atributo");
            } else if (velocidadJ1 + vidaJ1 + defensaJ1 + ataqueJ1 > 500) {
                System.out.println("no te pases de 500 entre todos");
            }
        }
    }
}
