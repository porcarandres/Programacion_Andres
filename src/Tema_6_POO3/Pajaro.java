package Tema_6_POO3;

public class Pajaro extends Animal {
    public Pajaro(String nombre){
        super(nombre);
    }
    void comer() {
        System.out.println(nombre + " come semillas.");
    }

    void hacerRuido() {
        System.out.println("Pio pio");
    }

    public void volar() {
        System.out.println(nombre + " vuela.");
    }
}
