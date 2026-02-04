package Tema5_ProgramacionColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionGym gestion = new GestionGym();

        System.out.println("1-Dar Alta");
        System.out.println("1-Dar Baja");
        System.out.println("3-Mostrar Datos");
        System.out.println("4-Modificar Usuarios");
        System.out.println("5-Salir");

        int opcion;

        do {
            System.out.println("Inserta opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    gestion.darAlta();
                    break;
                case 2:
                    gestion.darBaja();
                    break;
                case 3:
                    gestion.mostrarDatos();
                    break;
                case 4:
                    gestion.modificarUsuarios();
                    break;
                case 5:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
    }

    Map<String, UsuarioGym> Gym = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void darAlta(){
        System.out.println("DNI del nuevo usuario:");
        String dni = sc.nextLine();

        System.out.println("Edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        Gym.put(dni, new UsuarioGym(dni, edad));
        System.out.println("Dado de alta");
    }

    public void darBaja(){
        System.out.println("Introduce el DNI del usuario a borrar:");
        String dni = sc.nextLine();

        if (Gym.containsKey(dni)) {
            Gym.remove(dni);
            System.out.println("Usuario con DNI " + dni + " eliminado.");
        } else {
            System.out.println("No hay ningun usuario con ese DNI.");
        }
    }

    public void mostrarDatos(){
        System.out.println("Datos Usuarios:");
        for (Map.Entry<String, UsuarioGym> entry : Gym.entrySet()) {
            String dni = entry.getKey();
            UsuarioGym usuario = entry.getValue();
            System.out.println("DNI: " + dni + " | Edad: " + usuario.getEdad());
        }
    }

     public void modificarUsuarios(){
         System.out.println("DNI del usuario a modificar:");
         String dni = sc.nextLine();

         if (Gym.containsKey(dni)){
             int edadnueva = sc.nextInt();
             sc.nextLine();

             Gym.replace(dni,new UsuarioGym(dni,edadnueva));
         }else {
             System.out.println("El DNI no existe.");
         }
     }


    public class UsuarioGym {

        private String dni;
        private int edad;

        public UsuarioGym(String dni, int edad) {
            this.dni = dni;
            this.edad = edad;

        }

        public UsuarioGym() {
            this.dni = "11111111A";
            this.edad = 18;
        }

        public int getEdad() {
            return edad;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}




