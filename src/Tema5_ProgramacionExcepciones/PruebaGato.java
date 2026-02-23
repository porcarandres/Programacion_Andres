package Tema5_ProgramacionExcepciones;

public class PruebaGato {
    public static void main(String[] args) {
        try {
            Gato gato1 = new Gato("Amador", 15);
            gato1.imprimir();
            gato1.setEdad(-22);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
