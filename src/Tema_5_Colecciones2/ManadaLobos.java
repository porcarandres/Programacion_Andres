package Tema_5_Colecciones2;

public class ManadaLobos extends Avistamiento {
    private int numLobos;
    private String observaciones;

    public ManadaLobos(int hora, int numLobos, String observaciones) {
        super(hora);
        this.numLobos = numLobos;
        this.observaciones = observaciones;
    }

    public String toString() {
        return "Hora: " + hora + " | Manada de " + numLobos + " lobos. Obs: " + observaciones;
    }
}