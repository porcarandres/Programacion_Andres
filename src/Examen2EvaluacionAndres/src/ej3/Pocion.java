package ej3;

public class Pocion extends Articulo{
    int nivel;
    String[] efectos={"velocidad","Fuerza","Vision"};

    public Pocion(int nivel, String[] efectos, String nombreArticulo, boolean gratis){
        super(nombreArticulo,gratis);
        this.nivel=nivel;
        this.efectos=efectos;
    }

    public static void precioPocion(int nivel) {
        int precio = 0;
        int total = 0;

        for (int i = 0; i < nivel; i++) {
            total = precio + 5;
        }
        System.out.println(total);
    }
}
