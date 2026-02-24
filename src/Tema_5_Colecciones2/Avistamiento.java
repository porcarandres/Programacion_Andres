package Tema_5_Colecciones2;

public abstract class Avistamiento {
    protected int hora;

    public Avistamiento(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public abstract String toString();

    public String getTipo() {
        return "";
    }
}