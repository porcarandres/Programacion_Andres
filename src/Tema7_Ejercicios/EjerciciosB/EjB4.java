package Tema7_Ejercicios.EjerciciosB;

import java.io.*;
import java.util.*;

public class EjB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        List<String> nombres = cargarArchivo("/home/andporgui/IdeaProjects/Programacion/Programacion_Andres/src/Tema7_Ejercicios/Documentos/usa_nombres.txt");
        List<String> apellidos = cargarArchivo("/home/andporgui/IdeaProjects/Programacion/Programacion_Andres/src/Tema7_Ejercicios/Documentos/usa_apellidos.txt");

        // Si alguno de los archivos falla paramos
        if (nombres.isEmpty() || apellidos.isEmpty()) {
            System.out.println("Error: Asegúrate de que los archivos existen.");
            return;
        }

        System.out.print("¿Cuántos nombres quieres generar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.print("¿En qué archivo quieres guardarlos? ");
        String archivoDestino = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino, true))) {

            for (int i = 0; i < cantidad; i++) {

                String n = nombres.get(random.nextInt(nombres.size()));
                String a = apellidos.get(random.nextInt(apellidos.size()));

                String nombreCompleto = n + " " + a;

                bw.write(nombreCompleto);
                bw.newLine();
            }
            System.out.println("Se han añadido " + cantidad + " nombres a " + archivoDestino);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static List<String> cargarArchivo(String ruta) {

        List<String> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }

        } catch (IOException e) {
            System.out.println("No se pudo leer " + ruta);
        }
        return lista;
    }
}