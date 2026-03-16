package Tema7_Ejercicios.EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EjB1 {
        public static void main(String[] args){

            File archivo = new File("/home/andporgui/IdeaProjects/Programacion/Programacion_Andres/src/Tema7_Ejercicios/Documentos/numeros.txt");

            try (Scanner lector = new Scanner(archivo)) {

                if (lector.hasNextDouble()) {
                    double primero = lector.nextDouble();
                    double maximo = primero;
                    double minimo = primero;

                    while (lector.hasNextDouble()) {
                        double actual = lector.nextDouble();
                        if (actual > maximo){
                            maximo = actual;
                        }

                        if (actual < minimo){
                            minimo = actual;
                        }
                    }

                    System.out.println("Máximo: " + maximo);
                    System.out.println("Mínimo: " + minimo);
                } else {
                    System.out.println("El archivo está vacio o no tiene numeros.");
                }

            } catch (FileNotFoundException e) {
                //Por si el archivo numeros.txt no existe
                System.out.println("No se encuentra el archivo en la carpeta.");

            } catch (InputMismatchException e) {
                //Por si el archivo tiene letras en lugar de numeros
                System.out.println("El archivo contiene datos que no son numeros.");
            }
        }
    }