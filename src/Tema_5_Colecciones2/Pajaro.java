package Tema_5_Colecciones2;

public class Pajaro extends Avistamiento {
    private double peso;
    private String especie;

    public Pajaro(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    public String toString() {
        return "Hora: " + hora + " | Pájaro (" + especie + ", Peso: " + peso + "kg)";
    }
}