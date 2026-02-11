package Tema5_ProgramacionExcepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        while (listaGatos.size() < 5) {
            try {
                System.out.print("Nombre del gato: ");
                String nombre = sc.next();

                System.out.print("Edad del gato: ");
                int edad = sc.nextInt();

                Gato nuevoGato = new Gato(nombre, edad);

                listaGatos.add(nuevoGato);

            } catch (InputMismatchException inputMismatchException) {

                System.out.println("Error: La edad debe ser un número.");
                inputMismatchException.printStackTrace();
                sc.nextLine();

            } catch (Exception exception) {

                System.out.println("Error al crear gato: " + exception.getMessage());
                exception.printStackTrace();

            }
        }

        System.out.println("Lista final de gatos:");
        for (Gato gato : listaGatos) {
            gato.imprimir();

        }
    }
}
