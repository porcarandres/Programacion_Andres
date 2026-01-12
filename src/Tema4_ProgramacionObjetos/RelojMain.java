package Tema4_ProgramacionObjetos;

public class RelojMain {
    public static void main(String[] args){
        Reloj reloj = new Reloj();
        reloj.setHora(23);
        reloj.setMinuto(2);
        reloj.setSegundo(2);
        reloj.formato24h = false;
        reloj.mostrarHora();
    }
}
