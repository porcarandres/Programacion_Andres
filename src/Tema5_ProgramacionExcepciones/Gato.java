package Tema5_ProgramacionExcepciones;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("El nombre debe tener al menos 3 letras");
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
        System.out.println("Gato [Nombre: "+nombre+"| Edad:"+edad+"]");
    }
}


class PruebaGato {
    public static void main(String[] args) {
        try {
            Gato gato1 = new Gato("Amador", 15);
            gato1.imprimir();
            gato1.setEdad(-22);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
