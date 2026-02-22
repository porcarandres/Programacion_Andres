package Tema_6_POO3;

public class Turismo extends Vehiculo {
    private int numPlazas;
    private String tipoDeUso;

    public Turismo(String matricula, String marca, int numPlazas, String tipoDeUso) {
        super(matricula, marca);
        this.numPlazas = numPlazas;
        this.tipoDeUso = tipoDeUso;
    }
}