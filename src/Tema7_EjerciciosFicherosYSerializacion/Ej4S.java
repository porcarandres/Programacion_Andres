package Tema7_EjerciciosFicherosYSerializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Ej4S {
    public static void main(String[] args) {
        Persona p = new Persona("Ximo", 25);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}