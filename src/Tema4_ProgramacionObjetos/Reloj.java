package Tema4_ProgramacionObjetos;

public class Reloj {

    int hora, minuto, segundo, hora12;
    boolean formato24h;

    public static final int DefaultSegundo = 0;
    public static final int DefaultMinuto = 0;
    public static final int DefaultHora = 0;

    public Reloj() {
        this.hora= DefaultHora;
        this.minuto= DefaultMinuto;
        this.segundo= DefaultSegundo;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        } else {
            if(hora >=0 && hora <= 12){
            this.hora = hora;
            } else if(hora>= 12 && hora<=24){
                this.hora12 = hora -12;
            }
        }
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto invalido");
        }
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo invalido");
        }
    }
    public boolean isFormato24h() {
        return formato24h;
    }
    public void mostrarHora() {
        if (formato24h == true) {
            System.out.println("Hora formato 24h: "+hora+":"+minuto+":"+segundo);
        } else if(formato24h != true) {
            if (hora <= 12){
                System.out.println("Hora :"+hora+":"+minuto+":"+segundo+"AM");
            }else{
                System.out.println("Hora :"+hora12+":"+minuto+":"+segundo+"PM   ");
            }
        }
    }
}

