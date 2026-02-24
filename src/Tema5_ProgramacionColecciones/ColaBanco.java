package Tema5_ProgramacionColecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColaBanco {
    public static void main(String[] args) {
        List<UsuarioBanco> cola = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("1. Añadir usuario");
            System.out.println("2. Atender Primero");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            System.out.println("   Opcion:");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    anadirUsuario(sc, cola);
                    break;
                case 2:
                    atenderPrimero(cola);
                    break;
                case 3:
                    System.out.println("Posicion a eliminar:");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    seCanso(pos, cola);
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    public static void anadirUsuario(Scanner sc, List<UsuarioBanco> cola) {
        System.out.println("Añade el nombre del usuario:");
        String nombre = sc.nextLine();

        System.out.println("Añade el dni del usuario:");
        String dni = sc.nextLine();

        System.out.println("Añade la edad del usuario:");
        int edad = sc.nextInt();
        sc.nextLine();

        cola.add(new UsuarioBanco(nombre, dni, edad));
        System.out.println("Datos añadidos:" + nombre + " Dni: " + dni + " Edad: " + edad);
    }

    public static void atenderPrimero(List<UsuarioBanco> cola) {
        if (!cola.isEmpty()) {
            UsuarioBanco atendido = cola.remove(0);
            System.out.println("Atendiendo a: " + atendido.getNombre());
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public static void seCanso(int posicion, List<UsuarioBanco> cola) {
        if (posicion >= 0 && posicion < cola.size()) {
            UsuarioBanco eliminado = cola.remove(posicion);
            System.out.println("El usuario " + eliminado.getNombre() + " se ha cansado y se ha ido.");
        } else {
            System.out.println("Esa posicion no esta en la cola.");
        }
    }
}

