package Tema_6_POO3;

public class Leon extends Animal {
    public Leon(String nombre) {
        super(nombre);
    }

    void comer() {
        System.out.println(nombre + " come carne.");
    }

    void hacerRuido() {
        System.out.println("Roar");
    }

    public void cazar() {
        System.out.println(nombre + " esta cazando.");
    }
}