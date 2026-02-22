package Tema_6_POO3;

public class Camion extends Vehiculo {
    private double pesoMaximo;
    private boolean mercanciaPeligrosa;

    public Camion(String matricula, String marca, double pesoMaximo, boolean mercanciaPeligrosa) {
        super(matricula, marca);
        this.pesoMaximo = pesoMaximo;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }
}