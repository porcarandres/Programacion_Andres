package ej3;

public class Accesorio extends Articulo{

    String accesorio="Mochila";
    int precioaccesorio=7;

    public Accesorio(String nombreArticulo, boolean gratis,String accesorio) {
        super(nombreArticulo, gratis);
        this.accesorio=accesorio;
    }
}
