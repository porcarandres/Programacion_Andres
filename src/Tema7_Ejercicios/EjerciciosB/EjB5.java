package Tema7_Ejercicios.EjerciciosB;

import java.io.*;
import java.util.*;

public class EjB5 {
    public static void main(String[] args) {

        File directorio = new File("Diccionario");
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        File archivoOrigen = new File("diccionario.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen))) {
            String palabra;

            while ((palabra = br.readLine()) != null) {
                if (!palabra.isEmpty()) {

                    char primeraLetra = Character.toUpperCase(palabra.charAt(0));

                    String rutaDestino = "Diccionario/" + primeraLetra + ".txt";

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino, true))) {
                        bw.write(palabra);
                        bw.newLine();
                    }
                }
            }
            System.out.println("Diccionario organizado por letras");

        } catch (IOException e) {
            System.out.println("Error: No se pudo procesar el diccionario. " + e.getMessage());
        }
    }
}