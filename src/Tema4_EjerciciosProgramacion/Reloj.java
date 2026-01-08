package Tema4_EjerciciosProgramacion;

public class Reloj {

    int horas, minutos, segundos;
    boolean formato24h;

    public static final int Default_Hora = 0;
    public static final int Default_Min = 0;
    public static final int Default_Seg = 0;

    public Reloj(){
        horas=Default_Hora;
        minutos=Default_Min;
        segundos=Default_Seg;
    }
    public Reloj(int horas, int minuto, int segundos){
        this.horas= horas;
        this.minutos=minuto;
        this.segundos=segundos;

    }
    public int getHoras(){
        return horas;
    }
    public void SetHoras(int horas){
        if(horas>=0 && horas<=24){
            this.horas=horas;
        }
    }
    public int getMinutos(){
        return minutos;
    }
    public void setMinutos(int minutos){
        if(minutos>=0 && minutos<=60){
            this.minutos=minutos;
        }
    }
    public int getSegundos(){
        return segundos;
    }
    public void setSegundos(int segundos){
        if(segundos>=0 && minutos<=60){
            this.segundos=segundos;
        }
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }

}
