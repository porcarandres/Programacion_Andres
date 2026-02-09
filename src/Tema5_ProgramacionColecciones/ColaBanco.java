package Tema5_ProgramacionColecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColaBanco {
    public static void main(String[] args){
        ColaBanco ColaBanco = new ColaBanco();
        Scanner sc= new Scanner(System.in);
        int opcion = 0;

        // Necesitamos un bucle para que el menú se repita
        while (opcion != 4) {
            System.out.println("1. Añadir usuario");
            System.out.println("2. Atender Primero");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            System.out.println("   Opcion:");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ColaBanco.anadirUsuario();
                    break;
                case 2:
                    ColaBanco.atenderPrimero();
                    break;
                case 3:
                    System.out.println("Posicion a eliminar:");
                    int pos = sc.nextInt();
                    ColaBanco.seCanso(pos);
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
    List<UsuarioBanco> cola = new ArrayList<UsuarioBanco>();
    Scanner sc= new Scanner(System.in);

    public void anadirUsuario(){
        System.out.println("Añade el nombre del usuario:");
        String nombre=sc.nextLine();
        System.out.println("Añade el dni del usuario:");
        String dni=sc.nextLine();
        System.out.println("Añade la edad del usuario:");
        int edad=sc.nextInt();

        cola.add(new UsuarioBanco(nombre,dni,edad));
        System.out.println("Datos añadidos:"+nombre+" Dni: "+dni+" Edad: "+edad);
    }

    public void atenderPrimero() {
        if (!cola.isEmpty()) {
            UsuarioBanco atendido = cola.remove(0);
            System.out.println("Atendiendo a: " + atendido.getNombre());
        } else {
            System.out.println("La cola está vacía.");
        }
    }

    public void seCanso(int posicion){
        if (posicion >= 0 && posicion < cola.size()){
            cola.remove(posicion);
        }else {
            System.out.println("Esa posicion no esta en la cola.");
        }
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

