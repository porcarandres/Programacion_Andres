package Tema_6_POO3;

public class DVD extends Ficha {
    String director;
    int anio;
    String tipo;

    public DVD(int numero, String titulo, String director, int anio, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    public void reproducirTrailer() {
        System.out.println("Reproduciendo trailer de " + titulo);
    }
}