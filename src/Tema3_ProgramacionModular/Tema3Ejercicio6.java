package Tema3_ProgramacionModular;

public class Tema3Ejercicio6 {
    public static void tablas(){
        System.out.println("Ejercicio tablas de numeros de 1 al 10\n");
    }

    public static void main(String[] args) {
        tablas();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");

            for (int a = 1; a <= 10; a++) {
                System.out.println(i + " x " + a + " = " + (i * a)+"\n");
            }
        }
    }
}