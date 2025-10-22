package Tema2EjerciciosProgramacion;

import java.util.Random;
import java.util.Scanner;

public class Arena1v1 {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la arena gladiadores");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Atributos
        int vida1, defensa1, ataque1, velocidad1;
        int vida2, defensa2, ataque2, velocidad2;

        //Jugador1
        System.out.println("Jugador1 inserte su nombre:");
        String jugador1 = sc.next();
        do{
            System.out.println(jugador1+"inserte sus atributos (no te pases de 200 en cada y maximo entre todos 500");
            System.out.println("ATAQUE J1");
            ataque1 = sc.nextInt();

            System.out.println("DEFENSA J1");
            defensa1 = sc.nextInt();

            System.out.println("VIDA J1");
            vida1 = sc.nextInt();

            System.out.println("VELOCIDAD J1");
            velocidad1 = sc.nextInt();

            if (velocidad1 < 1 || velocidad1 > 200 || vida1 < 1 || vida1 > 200 || defensa1 < 1 || defensa1 > 200 || ataque1 < 1 || ataque1 > 200) {
                System.out.println("no te pases de 200 en cada atributo");
            } else if (velocidad1 + vida1 + defensa1 + ataque1 > 500) {
                System.out.println("no te pases de 500 entre todos");
            }

        }while(vida1 < 1 || vida1 > 200 || velocidad1 < 1 || velocidad1 > 200 || defensa1 < 1 || defensa1 > 200 || ataque1 < 1 || ataque1 > 200);

        //Jugador2
        System.out.println("Jugador2 inserte su nombre:");
        String jugador2 = sc.next();
        do{
            System.out.println(jugador2+"inserte sus atributos (no te pases de 200 en cada y maximo entre todos 500");
            System.out.println("ATAQUE J2");
            ataque2 = sc.nextInt();

            System.out.println("DEFENSA J2");
            defensa2 = sc.nextInt();

            System.out.println("VIDA J2");
            vida2 = sc.nextInt();

            System.out.println("VELOCIDAD J2");
            velocidad2 = sc.nextInt();

            if (velocidad2 < 1 || velocidad2 > 200 || vida2 < 1 || vida2 > 200 || defensa2 < 1 || defensa2 > 200 || ataque2 < 1 || ataque2 > 200) {
                System.out.println("no te pases de 200 en cada atributo");
            } else if (velocidad2 + vida2 + defensa2 + ataque2 > 500) {
                System.out.println("no te pases de 500 entre todos");
            }

        }while(vida2 < 1 || vida2 > 200 || velocidad2 < 1 || velocidad2 > 200 || defensa2 < 1 || defensa2 > 200 || ataque2 < 1 || ataque2 > 200);

        //Personajes Creados
        System.out.println("Personajes creados:");
        System.out.println("P1:"+jugador1+"//Atributos: || Vida"+vida1+"|| Ataque:"+ataque1+"|| Velocidad:"+velocidad1+"|| Defensa:"+defensa1);
        System.out.println("P2:"+jugador2+"//Atributos: || Vida"+vida2+"|| Ataque:"+ataque2+"|| Velocidad:"+velocidad2+"|| Defensa:"+defensa2);

        System.out.println("Comienza la batalla");

        //d1 o d2 = daño
        int d1,d2;

        //combate
        while (vida1 > 0 && vida2 > 0) {
            if (velocidad1 >= velocidad2) {
                // Turno del jugador 1
                d1 = (ataque1 - defensa2+ random.nextInt(10));
                vida2 -= d1;
                System.out.println(jugador1 + " ataca a " + jugador2 + " causando " + d1 + " de daño. Vida restante de " + jugador2 + ": " + Math.max(0, vida2));
                if (vida2 <= 0) break;

                // Turno del jugador 2
                d2 = (ataque2 -defensa1+ random.nextInt(10));
                vida1 -= d2;
                System.out.println(jugador2 + " ataca a " + jugador1 + " causando " + d2 + " de daño. Vida restante de " + jugador1 + ": " + Math.max(0, vida1));
            } else {
                // Turno del jugador 2
                d2 =(ataque2 - defensa1+ random.nextInt(10));
                vida1 -= d2;
                System.out.println(jugador2 + " ataca a " + jugador1 + " causando " + d2 + " de daño. Vida restante de " + jugador1 + ": " + Math.max(0, vida1));
                if (vida1 <= 0) break;

                // Turno del jugador 1
                d1 = (ataque1 -defensa2+ random.nextInt(10));
                vida2 -= d1;
                System.out.println(jugador1 + " ataca a " + jugador2 + " causando " + d1 + " de daño. Vida restante de " + jugador2 + ": " + Math.max(0, vida2));
            }
        }
    }
}
//añadir mas cosas