package Tema_6_POO3;

public class AtaqueMagicoYFisico implements Ataque {
    public void lanzar() {
        System.out.println("Ejecutando ataque combinado de espada y hechizo.");
    }

    public int coste() {
        return 50;
    }

    public int danioInfligido() {
        return 0;
    }

    public int danioInfringido() {
        return 100;
    }
}