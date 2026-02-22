package Tema_6_POO3;

public class Revista extends Ficha {
    int numPublicacion;
    int anio;

    public Revista(int numero, String titulo, int numPublicacion, int anio) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.anio = anio;
    }

    public void consultarAntiguedad() {
        System.out.println("Revista del año: " + anio);
    }
}
