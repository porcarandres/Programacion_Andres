package Tema_5_Colecciones2;

public class Serpiente extends Avistamiento {
    private double longitud;
    private String especie;

    public Serpiente(int hora, double longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    public String getTipo() { return "Serpiente"; }

    public String toString() {
        return "Hora: " + hora + " | Serpiente (" + especie + ", Longitud: " + longitud + "m)";
    }
}
