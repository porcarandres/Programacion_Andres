package Tema4_ProgramacionObjetos;

public class Reloj {

    int hora, minuto, segundo;
    boolean formato24h;

    public static final int DefaultSegundo = 0;
    public static final int DefaultMinuto = 0;
    public static final int DefaultHora = 0;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora= DefaultHora;
        this.minuto= DefaultMinuto;
        this.segundo= DefaultSegundo;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora invalida");
        }
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto invalido");
        }
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo invalido");
        }
    }
    public boolean isFormato24h() {
        return formato24h;
    }
    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }
    public void mostrarHora() {
        if (formato24h) {
            System.out.println("Hora formato 24h"+hora+":"+minuto+":"+segundo);
        } else {

        }
    }
}

