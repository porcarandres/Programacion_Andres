package Tema7_Ejercicios.EjerciciosB;

import java.io.*;
import java.util.Scanner;

public class EjB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contenidoPi = leerArchivo("pi-million.txt");
        if (contenidoPi == null) return;

        System.out.print("Introduce el número a buscar: ");
        String objetivo = sc.nextLine();

        boolean encontrado = false;
        int posicion = -1;

        int limite = contenidoPi.length() - objetivo.length();

        for (int i = 0; i <= limite; i++) {
            boolean coincidenciaCompleta = true;

            for (int j = 0; j < objetivo.length(); j++) {
                if (contenidoPi.charAt(i + j) != objetivo.charAt(j)) {
                    coincidenciaCompleta = false;
                    break;
                }
            }

            if (coincidenciaCompleta) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Encontrado en la posición: " + posicion);
        } else {
            System.out.println("No se ha encontrado el número.");
        }
    }

    public static String leerArchivo(String ruta) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea.trim());
            }
            return sb.toString();
        } catch (IOException e) {
            return null;
        }
    }
}