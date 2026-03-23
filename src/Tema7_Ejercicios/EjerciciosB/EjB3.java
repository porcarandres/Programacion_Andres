package Tema7_Ejercicios.EjerciciosB;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EjB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo A (lectura): ");
        String rutaA = sc.nextLine();

        System.out.print("Introduce el nombre del archivo B (escritura): ");
        String rutaB = sc.nextLine();

        File archivoA = new File(rutaA);
        File archivoB = new File(rutaB);

        List<String> lineas = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(archivoA))){
        String linea;
        while ((linea = br.readLine()) != null){
            lineas.add(linea);
        }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collections.sort(lineas); //toma tu lista de textos y la reordena alfabéticamente (de la A a la Z) basándose en el código ASCII.

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivoB))){

            for (int i = 0; i < lineas.size(); i++) {
                String s = lineas.get(i); // sacamos el elemento en la posición i
                bw.write(s);
                bw.newLine();
            }

            /*for (String s : lineas){
                bw.write(s);
                bw.newLine();
            }*/

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
