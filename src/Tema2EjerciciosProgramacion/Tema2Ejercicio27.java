package Tema2EjerciciosProgramacion;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;

        while (contador < 20) {
            boolean primo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
