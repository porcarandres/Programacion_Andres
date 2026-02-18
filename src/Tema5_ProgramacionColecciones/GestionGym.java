package Tema5_ProgramacionColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, UsuarioGym> gym = new HashMap<>();

        System.out.println("1-Dar Alta");
        System.out.println("1-Dar Baja");
        System.out.println("3-Mostrar Datos");
        System.out.println("4-Modificar Usuarios");
        System.out.println("5-Salir");

        int opcion;

        do {
            System.out.println("Inserta opcion:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    darAlta(sc, gym);
                    break;
                case 2:
                    darBaja(sc, gym);
                    break;
                case 3:
                    mostrarDatos(gym);
                    break;
                case 4:
                    modificarUsuarios(sc, gym);
                    break;
                case 5:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
    }

    public static void darAlta(Scanner sc, Map<String, UsuarioGym> gym){
        System.out.println("DNI del nuevo usuario:");
        String dni = sc.nextLine();

        System.out.println("Edad:");
        int edad = sc.nextInt();
        sc.nextLine();

        gym.put(dni, new UsuarioGym(dni, edad));
        System.out.println("Dado de alta");
    }

    public static void darBaja(Scanner sc, Map<String, UsuarioGym> gym){
        System.out.println("Introduce el DNI del usuario a borrar:");
        String dni = sc.nextLine();

        if (gym.containsKey(dni)) {
            gym.remove(dni);
            System.out.println("Usuario con DNI " + dni + " eliminado.");
        } else {
            System.out.println("No hay ningun usuario con ese DNI.");
        }
    }

    public static void mostrarDatos(Map<String, UsuarioGym> gym){
        System.out.println("Datos Usuarios:");
        if (gym.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            for (Map.Entry<String, UsuarioGym> entry : gym.entrySet()) {
                UsuarioGym usuario = entry.getValue();
                System.out.println(usuario.toString());
            }
        }
    }

    public static void modificarUsuarios(Scanner sc, Map<String, UsuarioGym> gym){
        System.out.println("DNI del usuario a modificar:");
        String dni = sc.nextLine();

        if (gym.containsKey(dni)){
            System.out.println("Nueva edad;");
            int edadnueva = sc.nextInt();
            sc.nextLine();

            gym.get(dni).setEdad(edadnueva);
            System.out.println("Usuario modificado.");
        } else {
            System.out.println("El DNI no existe.");
        }
    }
}




