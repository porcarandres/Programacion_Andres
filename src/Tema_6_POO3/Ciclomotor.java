package Tema_6_POO3;

public class Ciclomotor extends Vehiculo {
    private int cilindrada;

    public Ciclomotor(String matricula, String marca, int cilindrada) {
        super(matricula, marca);
        this.cilindrada = cilindrada;
    }
    public boolean necesitaCarnet() {
        return this.cilindrada >= 125;
    }
}