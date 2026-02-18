package Tema5_ProgramacionColecciones;

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

    @Override
    public String toString() {
        return "DNI: " + dni + " | Edad: " + edad;
    }
}