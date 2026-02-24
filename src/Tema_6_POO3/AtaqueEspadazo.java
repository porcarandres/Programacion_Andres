package Tema_6_POO3;

public class AtaqueEspadazo implements AtaqueAvanzado {
    public void lanzar() {
        System.out.println("¡Zas! Un tajo potente con la espada.");
    }

    public String coste() {
        return "0 de Maná y 40 de Esfuerzo físico";
    }

    public String danioInfringido() {
        return "0 de Daño Mágico y 75 de Daño Físico";
    }
}