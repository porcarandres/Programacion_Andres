package Tema_6_POO3;

public class Libro extends Ficha {
    String autor;
    String editorial;

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public void mostrarDatos() {
        System.out.println("Libro: " + titulo + " de " + autor);
    }
}
