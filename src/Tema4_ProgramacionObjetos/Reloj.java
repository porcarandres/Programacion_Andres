package Tema4_ProgramacionObjetos;

public class Reloj {

    int hora, minuto, segundo, hora12;
    boolean formato24h;

    public static final int DefaultSegundo = 0;
    public static final int DefaultMinuto = 0;
    public static final int DefaultHora = 0;

    public Reloj() {
        this.hora = DefaultHora;
        this.minuto = DefaultMinuto;
        this.segundo = DefaultSegundo;
        this.formato24h = true;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora invalida");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto invalido");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
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

    public String toString() {

        if (formato24h) {
            return String.format("Hora formato 24h: "+ hora + ":" + minuto + ":" + segundo);
        } else {

            if (hora == 0) {
                hora12 = 12;
                return String.format("Hora: " + hora12 + ":" + minuto + ":" + segundo + " AM");

            } else if (hora < 12) {
                hora12 = hora;
                return String.format("Hora: " + hora12 + ":" + minuto + ":" + segundo + " AM");

            } else if (hora == 12) {
                hora12 = 12;
                return String.format("Hora: " + hora12 + ":" + minuto + ":" + segundo + " PM");

            } else {
                hora12 = hora - 12;
                return String.format("Hora: " + hora12 + ":" + minuto + ":" + segundo + " PM");
            }
        }
    }
}


