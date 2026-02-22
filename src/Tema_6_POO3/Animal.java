package Tema_6_POO3;

public abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    abstract void comer();

    public void dormir() {
        System.out.println("Cierran los ojos y descansan.");
    }

    abstract void hacerRuido();
}