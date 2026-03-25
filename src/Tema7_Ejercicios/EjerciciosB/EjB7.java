package Tema7_Ejercicios.EjerciciosB;

import java.io.*;
import java.util.*;

public class EjB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del archivo: "); //C:\Users\Usuario\Downloads\adad.txt ejemplo de prueba
        String ruta = sc.nextLine();

        int nLineas = 0;
        int nPalabras = 0;
        int nCaracteres = 0;
        HashMap<String, Integer> mapa = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                nLineas++;
                nCaracteres += linea.length();

                String[] trozos = linea.toLowerCase().split("\\s+");

                for (int i = 0; i < trozos.length; i++) {
                    String p = trozos[i].replaceAll("[^a-zñáéíóú]", "");

                    if (p.length() > 0) {
                        nPalabras++;

                        if (mapa.containsKey(p)) {
                            int cuenta = mapa.get(p);
                            mapa.put(p, cuenta + 1);
                        } else {
                            mapa.put(p, 1);
                        }
                    }
                }
            }

            System.out.println("ESTADÍSTICAS");
            System.out.println("Líneas: " + nLineas);
            System.out.println("Palabras: " + nPalabras);
            System.out.println("Caracteres: " + nCaracteres);

            List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet());
            lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println("TOP 10 PALABRAS");

            int tope = 10;
            if (lista.size() < 10) {
                tope = lista.size();
            }

            for (int i = 0; i < tope; i++) {
                Map.Entry<String, Integer> entrada = lista.get(i);
                System.out.println((i + 1) + ". " + entrada.getKey() + ": " + entrada.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}