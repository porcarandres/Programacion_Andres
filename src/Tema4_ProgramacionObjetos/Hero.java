package Tema4_ProgramacionObjetos;

import java.util.Random;

public class Hero {
    private static final int CURACION_POCION = 10;
    private static final int CURACION_DESCANSO = 50;
    private static final int XP_POR_ATAQUE = 10;
    private static final int XP_NECESARIA_NIVEL = 50;
    private static final int DANIO_MINIMO_REGLA = 10;

    private static final int MEJORA_VIDA = 5;
    private static final int MEJORA_ATAQUE = 1;
    private static final int MEJORA_DEFENSA = 1;

    private String nombre;
    private int nivel;
    private int salud;
    private int saludMax;
    private int experiencia;
    private int ataque;
    private int defensa;

    public Hero(String nombre, int nivel, int salud, int saludMax, int experiencia, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.saludMax = saludMax;
        this.salud = salud;
        this.experiencia = experiencia;
        this.ataque = ataque;
        this.defensa = defensa;
    }


    public String getNombre() {
        return nombre; }

    public int getNivel() {
        return nivel; }

    public int getSalud() {
        return salud; }

    public int getSaludMax() {
        return saludMax; }

    public int getExperiencia() {
        return experiencia; }

    public int getAtaque() {
        return ataque; }

    public int getDefensa() {
        return defensa; }

    public void setNombre(String nombre) {
        this.nombre = nombre; }

    public void setNivel(int nivel) {
        this.nivel = nivel; }

    public void setSalud(int salud) {
        this.salud = salud; }

    public void setSaludMax(int saludMax) {
        this.saludMax = saludMax; }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia; }

    public void setAtaque(int ataque) {
        this.ataque = ataque; }

    public void setDefensa(int defensa) {
        this.defensa = defensa; }

    public void drinkPotion() {

        this.salud = this.salud + CURACION_POCION;

        if (this.salud > this.saludMax) {
            this.salud = this.saludMax;
        }
        System.out.println(nombre + " usa pocion. Vida: " + salud);

    }

    public void rest() {

        this.salud = this.salud + CURACION_DESCANSO;
        if (this.salud > this.saludMax) {
            this.salud = this.saludMax;
        }
        System.out.println(nombre + " descansa. Vida: " + salud);
    }

    public String toString() {

        return "Heroe: " + nombre + " | Nivel: " + nivel + " | HP: " + salud + "/" + saludMax + " | Atq: " + ataque + " | Def: " + defensa + " | XP: " + experiencia;

    }

    public void attack(Hero Hero2) {
        Random random = new Random();

        // calculamos el daño maximo posible
        int diferencia = this.ataque - Hero2.defensa;
        int danoTope;
        if (diferencia > DANIO_MINIMO_REGLA) {
            danoTope = diferencia;
        } else {
            danoTope = DANIO_MINIMO_REGLA;

        }

        // daño aleatorio entre 1 y 10 que es el tope
        int danoFinal = random.nextInt(danoTope) + 1;
        Hero2.salud = Hero2.salud - danoFinal;
        if (Hero2.salud < 0) {
            Hero2.salud = 0;
        }
        System.out.println(this.nombre + " golpea a " + Hero2.nombre + " con " + danoFinal + " de daño.");



        // ver si sube de nivel con la xp que tiene
        this.experiencia = this.experiencia + XP_POR_ATAQUE;
        if (this.experiencia >= XP_NECESARIA_NIVEL) {
            levelUp();
        }
    }
    private void levelUp() {
        this.nivel = this.nivel + 1;
        this.experiencia = 0;
        this.saludMax = this.saludMax + MEJORA_VIDA;
        this.salud = this.salud + MEJORA_VIDA;
        this.ataque = this.ataque + MEJORA_ATAQUE;
        this.defensa = this.defensa + MEJORA_DEFENSA;
        System.out.println(nombre +" ha subido al nivel "+ nivel);

    }
}