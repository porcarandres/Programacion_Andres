package Tema7_EjerciciosFicherosYSerializacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej3S {
    public static void main(String[] args) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    String[] palabras = linea.trim().split("\\s+");
                    contador += palabras.length;
                }
            }
            System.out.println("Total palabras: " + contador);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}