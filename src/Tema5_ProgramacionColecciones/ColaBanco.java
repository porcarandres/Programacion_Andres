package Tema5_ProgramacionColecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColaBanco {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

    }
    List<UsuarioBanco> cola = new ArrayList<UsuarioBanco>();
    Scanner sc= new Scanner(System.in);

    public void añadirUsuario(){
        System.out.println("Añade el nombre del usuario:");
        String nombre=sc.nextLine();
        System.out.println("Añade el dni del usuario:");
        String dni=sc.nextLine();
        System.out.println("Añade la edad del usuario:");
        int edad=sc.nextInt();

        cola.add(new UsuarioBanco(nombre,dni,edad));
        System.out.println("Datos añadidos:"+nombre+" Dni: "+dni+" Edad: "+edad);
    }

    public class UsuarioBanco{
        private String nombre;
        private String dni;
        private int edad;

        public UsuarioBanco(String nombre,String dni, int edad) {
            this.nombre=nombre;
            this.dni = dni;
            this.edad = edad;

        }
        public UsuarioBanco() {
            this.nombre="Jose";
            this.dni = "11111111A";
            this.edad = 58;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}
