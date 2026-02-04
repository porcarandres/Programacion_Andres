package Tema5_ProgramacionColecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionGym {
    public static void main(String[] args) {
        GestionGym gestion = new GestionGym();
        gestion.darAlta();
        gestion.darBaja();
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




