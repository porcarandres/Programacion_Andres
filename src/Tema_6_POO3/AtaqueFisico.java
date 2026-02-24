package Tema_6_POO3;

public class AtaqueFisico implements Ataque {
    public void lanzar() {
        System.out.println("Ejecutando golpe físico básico.");
    }

    public int coste() {
        return 20;
    }

    public int danioInfligido() {
        return 0;
    }

    public int danioInfringido() {
        return 40;
    }
}