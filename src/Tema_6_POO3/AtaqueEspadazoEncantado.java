package Tema_6_POO3;

public class AtaqueEspadazoEncantado implements AtaqueAvanzado {
    public void lanzar() {
        System.out.println("¡Golpeas con una espada imbuida en energía rúnica!");
    }

    public String coste() {
        return "35 de Maná y 25 de Esfuerzo físico";
    }

    public String danioInfringido() {
        return "45 de Daño Mágico y 50 de Daño Físico";
    }
}
