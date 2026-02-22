package Tema_6_POO3;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    void comer() {
        System.out.println(nombre + " come pescado.");
    }

    void hacerRuido() {
        System.out.println("Miau");
    }

    public void araniar() {
        System.out.println(nombre + " te araña.");
    }
}
