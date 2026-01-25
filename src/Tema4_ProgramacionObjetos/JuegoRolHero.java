package Tema4_ProgramacionObjetos;

import java.util.Random;

public class JuegoRolHero {
    public static void main(String[] args){
        Random rand = new Random();

        //nuestro personaje
        Hero prota = new Hero("Aragorn", 5, 100, 100, 0, 40, 15);
        int hordas = 0;

        System.out.println("EMPIEZA EL JUEGO");

        while (prota.getSalud() > 0) {
            hordas = hordas + 1;
            System.out.println("HORDA " + hordas + " ");

            // aparecen entre 1 y 3 enemigos
            int numEnemigos = rand.nextInt(3) + 1;
            Hero[] enemigos = new Hero[numEnemigos];

            for (int i = 0; i < numEnemigos; i++) {
                // son mas debiles (menos ataque y vida)
                enemigos[i] = new Hero("Orco " + (i + 1), 1, 30, 30, 0, 10, 2);
            }
            System.out.println("Han aparecido " + numEnemigos + " enemigos");

            // lucha por turnos hasta que muera el prota o todos los enemigos
            boolean hordaViva = true;
            while (hordaViva && prota.getSalud() > 0) {

                // turno de los enemigos: 10% probabilidad de huir antes de que ataquemos
                for (int i = 0; i < enemigos.length; i++) {
                    if (enemigos[i] != null && enemigos[i].getSalud() > 0) {
                        if (rand.nextInt(100) < 10) {
                            System.out.println("Un enemigo ha huido.");
                            enemigos[i].setSalud(0);
                        }
                    }
                }

                // ataque de nuestro personaje
                for (int i = 0; i < enemigos.length; i++) {
                    if (enemigos[i] != null && enemigos[i].getSalud() > 0) {
                        prota.attack(enemigos[i]);
                        break; // solo atacamos a uno por turno
                    }
                }

                // ataque de cada enemigo vivo al prota
                for (int i = 0; i < enemigos.length; i++) {
                    if (enemigos[i] != null && enemigos[i].getSalud() > 0 && prota.getSalud() > 0) {
                        enemigos[i].attack(prota);
                    }
                }

                // comprobar si queda algún enemigo vivo en el array
                hordaViva = false;
                for (int i = 0; i < enemigos.length; i++) {
                    if (enemigos[i].getSalud() > 0) {
                        hordaViva = true;
                    }
                }
            }
            if (prota.getSalud() <= 0) break;

            // probabilidades al acabar la horda
            // Descanso (0.1%)
            if (rand.nextInt(1000) < 1) {
                prota.rest();
            }

            // pocion (10% )
            if (rand.nextInt(100) < 10) {
                prota.drinkPotion();
            }
            System.out.println();
        }

        System.out.println("JUEGO TERMINADO. \n Sobreviviste a " + hordas + " hordas.");
    }
}
