package Tema_6_POO3;

public class Triangulo extends Figura2D {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double area() {
        return (base * altura) / 2;
    }

    public double perimetro() {
        return base + lado1 + lado2;
    }

    public String toString() {
        return "Triangulo de base " + base + " y altura " + altura;
    }
}
