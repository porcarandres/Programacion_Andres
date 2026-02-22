package Tema_6_POO3;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    void comer() {
        System.out.println(nombre + " come algo.");
    }

    void hacerRuido() {
        System.out.println("guau guau");
    }

    public void darLaPata() {
        System.out.println(nombre + " da la pata.");
    }
}