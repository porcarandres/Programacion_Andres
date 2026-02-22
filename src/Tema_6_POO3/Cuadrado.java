package Tema_6_POO3;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public String toString() {
        return "Cuadrado de lado " + base;
    }
}
