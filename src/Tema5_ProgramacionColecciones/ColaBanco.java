package Tema5_ProgramacionColecciones;

public class ColaBanco {
    public static void main(String[] args){


    }

    public class UsuarioBanco{
        private String nombre;
        private String dni;
        private int edad;

        public UsuarioBanco(String dni, int edad) {
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
