package Tema5_ProgramacionColecciones;

import java.util.HashMap;
import java.util.Map;

public class GestionGym {
    Map<String, Integer> Gym = new HashMap<>();a




    public class UsuariosGym {

        private String dni;
        private int edad;

        public UsuariosGym(String dni, int edad) {
            this.dni = dni;
            this.edad = edad;

        }

        public UsuariosGym() {
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
