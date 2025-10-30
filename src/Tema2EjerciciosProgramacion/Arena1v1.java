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
        System.out.println("Jugador1 inserta tu nombre:");
        String jugador1 = sc.next();
        System.out.println("¿Quieres que los atributos sean aleatorios? (0 = sí, 1 = manual)");
        opcion = sc.nextInt();

        if (opcion == 0) {
            ataque1 = random.nextInt(200 - 80 + 1) + 60;
            defensa1 = random.nextInt(200 - 80 + 1) + 60;
            vida1 = random.nextInt(200 - 80 + 1) + 60;
            velocidad1 = random.nextInt(200 - 80 + 1) + 60;
            System.out.println("Atributos aleatorios para " + jugador1 + ":");
            System.out.println("Ataque: " + ataque1 + " | Defensa: " + defensa1 + " | Vida: " + vida1 + " | Velocidad: " + velocidad1);

        } else {
            do {
                System.out.println(jugador1 + " inserta los atributos (no te pases, de entre 1-200 en cada y maximo entre todos 500)");
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
        System.out.println("Jugador2 inserta tu nombre:");
        String jugador2 = sc.next();

        System.out.println("¿Quieres que los atributos sean aleatorios? (0 = sí, 1 = manual)");
        opcion = sc.nextInt();
        if (opcion == 0) {
            ataque2 = random.nextInt(200 - 80 + 1) + 60;
            defensa2 = random.nextInt(200 - 80 + 1) + 60;
            vida2 = random.nextInt(200 - 80 + 1) + 60;
            velocidad2 = random.nextInt(200 - 80 + 1) + 60;
            System.out.println("Atributos aleatorios para " + jugador2 + ":");
            System.out.println("Ataque: " + ataque2 + " | Defensa: " + defensa2 + " | Vida: " + vida2 + " | Velocidad: " + velocidad2);
        } else {
            do {

                System.out.println(jugador2 + " inserta los atributos (no te pases, de entre 1-200 en cada y maximo entre todos 500)");
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

        System.out.println("\n Comienza la batalla");

        boolean defensaActiva1 = false;
        boolean defensaActiva2 = false;
        int curacion;
        double d1, d2;
        int ronda = 0;

        // combate
        while (vida1 > 0 && vida2 > 0) {
            ronda++;
            System.out.println("\n Ronda: " + ronda +"⚔\uFE0F");

            //Mostrar estado actual
            System.out.println(jugador1 + ": " + vida1 + " " + "\uD83C\uDF7A".repeat(vida1/10));
            System.out.println(jugador2 + ": " + vida2 + " " + "\uD83C\uDF7A".repeat(vida2/10));

            // Si jugador 1 es más rápido
            if (velocidad1 >= velocidad2) {

                //Turno jug1
                System.out.println("\nTurno de: " + jugador1);
                System.out.println("1. Atacar  2. Defenderse  3. Curarse");
                int accion1 = sc.nextInt();

                if (accion1 == 1) {
                    //Ataque
                    d1 = (int) ((ataque1 * 0.6) - (defensa2 * 0.4) + random.nextInt(10));
                    if (d1 < 10) d1 = 10;

                    //Golpe critico
                    double critChance1 = 0.2;
                    double critMultiplier1 = 1.5;
                    if (random.nextDouble() < critChance1) {
                        d1 = (int) (d1 * critMultiplier1);
                        System.out.println("💥¡Golpe crítico de " + jugador1 + "! 💥");
                    }

                    //Defensa rival
                    if (defensaActiva2) {
                        d1 /= 2;
                        defensaActiva2 = false;
                        System.out.println(jugador2 + " se defendió y redujo el daño a la mitad.");
                    }

                    //Aplicar daño
                    vida2 -= d1;
                    if (vida2 < 0) vida2 = 0;
                    System.out.println(jugador1 + " ataca a " + jugador2 + " causando " + d1 + " puntos de daño. Vida restante: " + vida2+"."+"\uD83C\uDF7A".repeat(vida2/10));

                } else if (accion1 == 2) {
                    // Defensa
                    defensaActiva1 = true;
                    System.out.println(jugador1 + " se prepara para defenderse del próximo ataque.");

                } else if (accion1 == 3) {
                    //Curacion
                    curacion = random.nextInt(30) + 10;
                    vida1 += curacion;
                    if (vida1 > 200) vida1 = 200;
                    System.out.println(jugador1 + " se cura " + curacion + " puntos. Vida total: " + vida1+"."+"\uD83C\uDF7A".repeat(vida1/10));
                }

                //Turno jugador 2
                if (vida2 > 0) {
                    System.out.println("\nTurno de: " + jugador2);
                    System.out.println("1. Atacar  2. Defenderse  3. Curarse");
                    int accion2 = sc.nextInt();

                    if (accion2 == 1) {
                        //Ataque
                        d2 = (int) ((ataque2 * 0.6) - (defensa1 * 0.4) + random.nextInt(10));
                        if (d2 < 10) d2 = 10;

                        //Golpe critico
                        double critChance2 = 0.2;
                        double critMultiplier2 = 1.5;
                        if (random.nextDouble() < critChance2) {
                            d2 = (int) (d2 * critMultiplier2);
                            System.out.println("💥 ¡Golpe crítico de " + jugador2 + "! 💥");
                        }

                        //Defensa rival
                        if (defensaActiva1) {
                            d2 /= 2;
                            defensaActiva1 = false;
                            System.out.println(jugador1 + " se defendió y redujo el daño a la mitad.");
                        }

                        //Aplicar daño
                        vida1 -= d2;
                        if (vida1 < 0) vida1 = 0;
                        System.out.println(jugador2 + " ataca a " + jugador1 + " causando " + d2 + " puntos de daño. Vida restante: " + vida1+"."+"\uD83C\uDF7A".repeat(vida1/10));

                    } else if (accion2 == 2) {
                        //Defensa
                        defensaActiva2 = true;
                        System.out.println(jugador2 + " se prepara para defenderse del próximo ataque.");

                    } else if (accion2 == 3) {
                        //Curacion
                        curacion = random.nextInt(30) + 10;
                        vida2 += curacion;
                        if (vida2 > 200) vida2 = 200;
                        System.out.println(jugador2 + " se cura " + curacion + " puntos. Vida total: " + vida2+"."+"\uD83C\uDF7A".repeat(vida2/10));
                    }
                }

            } else {
                // Si jugador 2 es más rapido
                //Turno jug2
                System.out.println("\nTurno de: " + jugador2);
                System.out.println("1. Atacar  2. Defenderse  3. Curarse");
                int accion2 = sc.nextInt();

                if (accion2 == 1) {
                    //Ataque
                    d2 = (int) ((ataque2 * 0.6) - (defensa1 * 0.4) + random.nextInt(10));
                    if (d2 < 10) d2 = 10;

                    //Golpe critico
                    double critChance2 = 0.2;
                    double critMultiplier2 = 1.5;
                    if (random.nextDouble() < critChance2) {
                        d2 = (int) (d2 * critMultiplier2);
                        System.out.println("💥 ¡Golpe crítico de " + jugador2 + "! 💥");
                    }

                    //Defensa rival
                    if (defensaActiva1) {
                        d2 /= 2;
                        defensaActiva1 = false;
                        System.out.println(jugador1 + " se defendió y redujo el daño a la mitad.");
                    }

                    //Aplicar daño
                    vida1 -= d2;
                    if (vida1 < 0) vida1 = 0;
                    System.out.println(jugador2 + " ataca a " + jugador1 + " causando " + d2 + " puntos de daño. Vida restante: " + vida1+"."+"\uD83C\uDF7A".repeat(vida1/10));

                } else if (accion2 == 2) {
                    //Defensa
                    defensaActiva2 = true;
                    System.out.println(jugador2 + " se prepara para defenderse del próximo ataque.");

                } else if (accion2 == 3) {
                    //Curacion
                    curacion = random.nextInt(30) + 10;
                    vida2 += curacion;
                    if (vida2 > 200) vida2 = 200;
                    System.out.println(jugador2 + " se cura " + curacion + " puntos. Vida total: " + vida2+"."+"\uD83C\uDF7A".repeat(vida2/10));
                }

                //Turno jug 1
                if (vida1 > 0) {
                    System.out.println("\nTurno de: " + jugador1);
                    System.out.println("1. Atacar  2. Defenderse  3. Curarse");
                    int accion1 = sc.nextInt();

                    if (accion1 == 1) {
                        //Ataque
                        d1 = (int) ((ataque1 * 0.6) - (defensa2 * 0.4) + random.nextInt(10));
                        if (d1 < 10) d1 = 10;

                        //Golpe critico
                        double critChance1 = 0.2;
                        double critMultiplier1 = 1.5;
                        if (random.nextDouble() < critChance1) {
                            d1 = (int) (d1 * critMultiplier1);
                            System.out.println("💥 ¡Golpe crítico de " + jugador1 + "! 💥");
                        }

                        //Defensa rival
                        if (defensaActiva2) {
                            d1 /= 2;
                            defensaActiva2 = false;
                            System.out.println(jugador2 + " se defendió y redujo el daño a la mitad.");
                        }

                        //Aplicar daño
                        vida2 -= d1;
                        if (vida2 < 0) vida2 = 0;
                        System.out.println(jugador1 + " ataca a " + jugador2 + " causando " + d1 + " puntos de daño. Vida restante: " + vida2+"."+"\uD83C\uDF7A".repeat(vida2/10));

                    } else if (accion1 == 2) {
                        //Defensa
                        defensaActiva1 = true;
                        System.out.println(jugador1 + " se prepara para defenderse del próximo ataque.");

                    } else if (accion1 == 3) {
                        //Curacion
                        curacion = random.nextInt(30) + 10;
                        vida1 += curacion;
                        if (vida1 > 200) vida1 = 200;
                        System.out.println(jugador1 + " se cura " + curacion + " puntos. Vida total: " + vida1+"."+"\uD83C\uDF7A".repeat(vida1/10));
                    }
                }
            }
        }

        //Resultado final
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
//ywadwad