package Tema_6_POO3;

public class AtaqueMagico implements Ataque {
    public void lanzar() {
        System.out.println("Lanzando ráfaga de energía arcana.");
    }

    public int coste() {
        return 40;
    }

    public int danioInfligido() {
        return 0;
    }

    public int danioInfringido() {
        return 60;
    }
}