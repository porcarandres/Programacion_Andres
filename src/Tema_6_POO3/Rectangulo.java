package Tema_6_POO3;

public class Rectangulo extends Figura2D {
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

    public String toString() {
        return "Rectangulo de base " + base + " y altura " + altura;
    }
}