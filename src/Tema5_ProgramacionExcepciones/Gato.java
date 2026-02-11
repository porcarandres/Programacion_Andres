package Tema5_ProgramacionExcepciones;

public class Gato { //Ej6 T5.Exc..
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 caracteres");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Gato [Nombre: "+nombre+"| Edad: "+edad+"]");
    }
}

class PruebaGato {
    public static void main(String[] args) {
        try {
            Gato g1 = new Gato("Amador", 14);
            g1.imprimir();
            g1.setEdad(-17);

        } catch (Exception exception) {

            exception.printStackTrace();
        }
    }
}