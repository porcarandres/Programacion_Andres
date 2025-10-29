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
        int opcion;

        //Jugador1
        System.out.println("Jugador1 inserte su nombre:");
        String jugador1 = sc.next();
        System.out.println("¿Quieres que los atributos sean aleatorios? (0 = sí, otro número = manual)");
        opcion = sc.nextInt();

        if (opcion == 0) {
            ataque1 = random.nextInt(200);
            defensa1 = random.nextInt(170);
            vida1 = random.nextInt(200);
            velocidad1 = random.nextInt(170);
            System.out.println("Atributos aleatorios para " + jugador1 + ":");
            System.out.println("Ataque: " + ataque1 + " | Defensa: " + defensa1 + " | Vida: " + vida1 + " | Velocidad: " + velocidad1);

        } else {
            do {
                System.out.println(jugador1 + " inserte sus atributos (no te pases, de entre 1-200 en cada y maximo entre todos 500");
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

            } while (vida1 < 1 || vida1 > 200 || velocidad1 < 1 || velocidad1 > 200 || defensa1 < 1 || defensa1 > 200 || ataque1 < 1 || ataque1 > 200);
        }
        //Jugador2
        System.out.println("Jugador2 inserte su nombre:");
        String jugador2 = sc.next();

        System.out.println("¿Quieres que los atributos sean aleatorios? (0 = sí, otro número = manual)");
        opcion = sc.nextInt();
        if (opcion == 0) {
            ataque2 = random.nextInt(200);
            defensa2 = random.nextInt(170);
            vida2 = random.nextInt(200);
            velocidad2 = random.nextInt(170);
            System.out.println("Atributos aleatorios para " + jugador2 + ":");
            System.out.println("Ataque: " + ataque2 + " | Defensa: " + defensa2 + " | Vida: " + vida2 + " | Velocidad: " + velocidad2);
        } else {
            do {

                System.out.println(jugador2 + " inserte sus atributos (no te pases, de entre 1-200 en cada y maximo entre todos 500");
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

            } while (vida2 < 1 || vida2 > 200 || velocidad2 < 1 || velocidad2 > 200 || defensa2 < 1 || defensa2 > 200 || ataque2 < 1 || ataque2 > 200);
        }
        //Personajes Creados
        System.out.println("Personajes creados:");
        System.out.println("P1:" + jugador1 + "//Atributos: || Vida" + vida1 + "|| Ataque:" + ataque1 + "|| Velocidad:" + velocidad1 + "|| Defensa:" + defensa1);
        System.out.println("P2:" + jugador2 + "//Atributos: || Vida" + vida2 + "|| Ataque:" + ataque2 + "|| Velocidad:" + velocidad2 + "|| Defensa:" + defensa2);

        System.out.println("Comienza la batalla");

        boolean defensaActiva1 = false;
        boolean defensaActiva2 = false;
        int curacion;
        int d1, d2;

        // combate
        while (vida1 > 0 && vida2 > 0) {
            System.out.print("Escribe 'siguiente' para continuar: ");
            sc.nextLine();

            // Mostrar estado actual
            System.out.println("\n--- Estado actual ---");
            System.out.println(jugador1 + ": " + vida1 + " " + "\uD83C\uDF7A".repeat(vida1));
            System.out.println(jugador2 + ": " + vida2 + " " + "\uD83C\uDF7A".repeat(vida2));

            // Si jugador 1 es más rápido, empieza él
            if (velocidad1 >= velocidad2) {

                // Turno del jugador 1
                System.out.println("Turno de: " + jugador1);
                System.out.println("1. Atacar, 2. Curarse, 3. Defenderse");
                int accion1 = sc.nextInt();

                if (accion1 == 1) {
                    d1 = ataque1 - defensa2 + random.nextInt(15);
                    if (d1 < 5) d1 = 5;
                    if (defensaActiva2) {
                        d1 /= 2;
                        defensaActiva2 = false;
                        System.out.println(jugador2 + " se defendió y redujo el daño a la mitad!");
                    }
                    vida2 -= d1;
                    if (vida2 < 0) vida2 = 0;
                    System.out.println(jugador1 + " ataca a " + jugador2 + " causando " + d1 + " de daño. Vida restante: " + vida2);
                } else if (accion1 == 2) {
                    curacion = random.nextInt(30);
                    vida1 += curacion;
                    if (vida1 > 200) vida1 = 200;
                    System.out.println(jugador1 + " se cura " + curacion + " puntos. Vida total: " + vida1);
                } else if (accion1 == 3) {
                    defensaActiva1 = true;
                    System.out.println(jugador1 + " se prepara para defenderse del próximo ataque.");
                }

                // Turno del jugador 2 solo si sigue con vida
                if (vida2 > 0) {
                    System.out.println("\nTurno de: " + jugador2);
                    System.out.println("1. Atacar, 2. Curarse, 3. Defenderse");
                    int accion2 = sc.nextInt();

                    if (accion2 == 1) {
                        d2 = ataque2 - defensa1 + random.nextInt(15);
                        if (d2 < 5) d2 = 5;
                        if (defensaActiva1) {
                            d2 /= 2;
                            defensaActiva1 = false;
                            System.out.println(jugador1 + " se defendió y redujo el daño a la mitad!");
                        }
                        vida1 -= d2;
                        if (vida1 < 0) vida1 = 0;
                        System.out.println(jugador2 + " ataca a " + jugador1 + " causando " + d2 + " de daño. Vida restante: " + vida1);
                    } else if (accion2 == 2) {
                        curacion = random.nextInt(30);
                        vida2 += curacion;
                        if (vida2 > 200) vida2 = 200;
                        System.out.println(jugador2 + " se cura " + curacion + " puntos. Vida total: " + vida2);
                    } else if (accion2 == 3) {
                        defensaActiva2 = true;
                        System.out.println(jugador2 + " se prepara para defenderse del próximo ataque.");
                    }
                }

            } else {
                // Si jugador 2 es más rápido
                System.out.println("\nTurno de: " + jugador2);
                System.out.println("1. Atacar, 2. Curarse, 3. Defenderse");
                int accion2 = sc.nextInt();

                if (accion2 == 1) {
                    d2 = ataque2 - defensa1 + random.nextInt(15);
                    if (d2 < 5) d2 = 5;
                    if (defensaActiva1) {
                        d2 /= 2;
                        defensaActiva1 = false;
                        System.out.println(jugador1 + " se defendió y redujo el daño a la mitad!");
                    }
                    vida1 -= d2;
                    if (vida1 < 0) vida1 = 0;
                    System.out.println(jugador2 + " ataca a " + jugador1 + " causando " + d2 + " de daño. Vida restante: " + vida1);
                } else if (accion2 == 2) {
                    curacion = random.nextInt(30);
                    vida2 += curacion;
                    if (vida2 > 200) vida2 = 200;
                    System.out.println(jugador2 + " se cura " + curacion + " puntos. Vida total: " + vida2);
                } else if (accion2 == 3) {
                    defensaActiva2 = true;
                    System.out.println(jugador2 + " se prepara para defenderse del próximo ataque.");
                }

                // Turno del jugador 1 solo si sigue con vida
                if (vida1 > 0) {
                    System.out.println("\nTurno de: " + jugador1);
                    System.out.println("1. Atacar, 2. Curarse, 3. Defenderse");
                    int accion1 = sc.nextInt();

                    if (accion1 == 1) {
                        d1 = ataque1 - defensa2 + random.nextInt(15);
                        if (d1 < 5) d1 = 5;
                        if (defensaActiva2) {
                            d1 /= 2;
                            defensaActiva2 = false;
                            System.out.println(jugador2 + " se defendió y redujo el daño a la mitad!");
                        }
                        vida2 -= d1;
                        if (vida2 < 0) vida2 = 0;
                        System.out.println(jugador1 + " ataca a " + jugador2 + " causando " + d1 + " de daño. Vida restante: " + vida2);
                    } else if (accion1 == 2) {
                        curacion = random.nextInt(30);
                        vida1 += curacion;
                        if (vida1 > 200) vida1 = 200;
                        System.out.println(jugador1 + " se cura " + curacion + " puntos. Vida total: " + vida1);
                    } else if (accion1 == 3) {
                        defensaActiva1 = true;
                        System.out.println(jugador1 + " se prepara para defenderse del próximo ataque.");
                    }
                }
            }
        }

        // Resultado final
        System.out.println("\uD83C\uDF7A"+"Fin de la batalla "+"\uD83C\uDF7A");
        if (vida1 <= 0 && vida2 <= 0) {
            System.out.println("Empate.");
        } else if (vida1 <= 0) {
            System.out.println("El ganador es: " + jugador2);
        } else {
            System.out.println("El ganador es: " + jugador1);
        }
    }
}
//a