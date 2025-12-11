package Tema3_ProgramacionModular;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class Parejas {
    public static void barajarCartas(String[] array) {
        List<String> listaCartas = Arrays.asList(array);
        Collections.shuffle(listaCartas);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] cartasOcultas;
        cartasOcultas = new String[] {"leon", "leon", "mandril", "mandril", "suricata", "suricata", "facoquero", "facoquero", "lobo", "lobo", "rana", "rana", "tortuga", "tortuga", "buho", "buho", "zorro", "zorro", "pinguino", "pinguino"};
        barajarCartas(cartasOcultas);
        String [] tableroVisible;
        tableroVisible = new String[] {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"};

        boolean juegoTerminado = false;
        while (!juegoTerminado) {
            System.out.println("\nEstado actual del tablero:");

            for (int i = 0; i < tableroVisible.length; i++) {

                System.out.print((i+1) + ": " + tableroVisible[i] + "  ");
            }
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("Ingresa la posicion de la PRIMERA carta que quieres elegir: (1-20)");
            int indice1 = sc.nextInt() - 1;
            if (indice1 < 0 || indice1 > 19) {
                System.out.println("Esa posicion NO es valida. Intenta de nuevo.");
                continue;
            }
            System.out.println("Ingresa la posicion de la SEGUNDA carta que quieres elegir: (1-20)");
            int indice2 = sc.nextInt() - 1;
            if (indice2 < 0 || indice2 > 19) {
                System.out.println("Esa posicion NO es valida. Intenta de nuevo.");
                continue;
            }
            if (indice1 == indice2) {
                System.out.println("Debes elegir dos posiciones DIFERENTES.");
                continue;
            }
            System.out.println("\nHas destapado:");
            System.out.println("Posicion " + (indice1 + 1) + ": " + cartasOcultas[indice1]);
            System.out.println("Posicion " + (indice2 + 1) + ": " + cartasOcultas[indice2]);

            if (cartasOcultas[indice1].equals(cartasOcultas[indice2])) {
                System.out.println("¡Pareja encontrada! Se mantienen visibles.");
                tableroVisible[indice1] = cartasOcultas[indice1];
                tableroVisible[indice2] = cartasOcultas[indice2];
            } else {
                System.out.println("No son pareja. Se volveran a ocultar.");

                System.out.println("Pulsa Enter para continuar:");
                sc.nextLine();
                sc.nextLine();

                for (int i = 0; i < 30; i++) {
                    System.out.println();
                }
            }
            juegoTerminado = true;
            for (String carta : tableroVisible) {
                if (carta.equals("*")) {
                    juegoTerminado = false;
                    break;
                }
            }
        }
        System.out.println("\n¡Felicidades! Has encontrado todas las parejas.");
        System.out.println("\nTablero final:");
        for (int i = 0; i < tableroVisible.length; i++) {
            System.out.print((i+1) + ": " + tableroVisible[i] + "  ");
        }
    }
}

