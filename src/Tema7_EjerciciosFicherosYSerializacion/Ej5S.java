package Tema7_EjerciciosFicherosYSerializacion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Ej5S {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona p = (Persona) ois.readObject();
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}