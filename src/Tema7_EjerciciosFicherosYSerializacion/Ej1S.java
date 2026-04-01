package Tema7_EjerciciosFicherosYSerializacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej1S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce edad: ");
        int edad = sc.nextInt();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("usuario.txt"))) {
            bw.write("Nombre: " + nombre);
            bw.newLine();
            bw.write("Edad: " + edad);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}