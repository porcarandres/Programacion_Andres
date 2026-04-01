package Tema7_EjerciciosFicherosYSerializacion;

import java.io.*;
import java.util.ArrayList;

public class Ej6S {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Ximo", 25));
        lista.add(new Persona("Marta", 30));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            ArrayList<Persona> leida = (ArrayList<Persona>) ois.readObject();
            for (Persona p : leida) {
                System.out.println(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}