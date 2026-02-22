package Tema_6_POO3;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    void comer() {
        System.out.println(nombre + " come hierba.");
    }

    void hacerRuido() {
        System.out.println("¡Muuuu!");
    }

    public void darLeche() {
        System.out.println(nombre + " da leche.");
    }
}