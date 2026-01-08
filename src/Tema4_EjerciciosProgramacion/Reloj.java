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
    public Reloj(int hora, int minuto, int segundos){
        this.horas=hora;
        this.minutos=minuto;
        this.segundos=segundos;

    }
    public int getHoras(){
        return horas;
    }
    public void SetHoras(){
        if(horas<0 && horas>24){

        }
    }
}
