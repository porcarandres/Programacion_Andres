package Tema_6_POO3;

public class AtaqueBolaFuego implements AtaqueAvanzado {
    public void lanzar() {
        System.out.println("¡Lanzas una gran bola de fuego!");
    }

    public String coste() {
        return "60 de Maná y 0 de Esfuerzo físico";
    }

    public String danioInfringido() {
        return "90 de Daño Mágico y 0 de Daño Físico";
    }
}