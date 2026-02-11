package Tema5_ProgramacionExcepciones;

public class Ej5 {
    public static void main(String[] args) {

        try {
            imprPositivo(10);
            imprPositivo(-8);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            imprNegativo(-9);
            imprNegativo(7);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void imprPositivo(int p) throws Exception {

        if (p < 0) throw new Exception("El valor p no puede ser negativo ");

        System.out.println("Valor positivo: " + p);
    }

    public static void imprNegativo(int n) throws Exception {

        if (n >= 0) throw new Exception("El valor n debe ser negativo ");

        System.out.println("Valor negativo: " + n);
    }
}
