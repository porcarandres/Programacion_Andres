package Tema7_Ejercicios.EjerciciosB;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjB2 {
    public static void main(String[] args) {
        String ruta = "/home/andporgui/IdeaProjects/Programacion/Programacion_Andres/src/Tema7_Ejercicios/Documentos/alumnos_notas.txt";
        List<Alumno> listaAlumnos = new ArrayList<>();

        try (Scanner lector = new Scanner(new File(ruta))) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                // Dividimos la linea por espacios
                String[] partes = linea.split(" ");

                // Las dos primeras partes son Nombre y Apellido
                String nombre = partes[0] + " " + partes[1];

                double suma = 0;
                int contadorNotas = 0;

                // i = 2 para que sume desde el 2 (donde estan las notas)
                for (int i = 2; i < partes.length; i++) {
                    suma += Double.parseDouble(partes[i]);
                    contadorNotas++;
                }

                double media = suma / contadorNotas;
                listaAlumnos.add(new Alumno(nombre, media));
            }

            // Comparamos las medias de mayor a menor
            listaAlumnos.sort((a1, a2) -> Double.compare(a2.media, a1.media));

            // MOSTRAR RESULTADOS
            System.out.println("[Alumnos]");
            for (Alumno a : listaAlumnos) {
                System.out.println(a);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}