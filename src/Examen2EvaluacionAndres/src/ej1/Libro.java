package ej1;

public class Libro {

    private String isbn;
    private String nombre;
    private String autor;
    private int numPaginas;
    private String genero;
    private String formato ;


    public Libro(String isbn,String nombre,String autor,int numPaginas,String genero,String formato){
        this.isbn=isbn;
        this.nombre=nombre;
        this.autor=autor;
        this.numPaginas=numPaginas;
        this.genero=genero;
        this.formato= formato;
    }

    @Override
    public String toString() {
        return "Nombre:"+nombre+"| Autor"+autor+"| Peso:";
    }

    public void pesoLibro(int peso){


        peso=50;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
