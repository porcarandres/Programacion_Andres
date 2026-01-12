package Tema4_ProgramacionObjetos;

public class RelojMain {
    public static void main(String[] args){
        Reloj reloj = new Reloj();
        reloj.setHora(17);
        reloj.setMinuto(50);
        reloj.setSegundo(40);
        reloj.setFormato24h(false);
        System.out.println(reloj);
    }
}
