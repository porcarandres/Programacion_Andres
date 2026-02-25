package ej3;

import java.util.Scanner;

public class Pokebola extends Articulo{
    String [] tipoBola={"Pokeball","Greatball","Ultraball"};

    public Pokebola(String nombreArticulo, boolean gratis,String[] tipoBola) {
        super(nombreArticulo, gratis);
        this.tipoBola=tipoBola;

    }

    public static void precioPokebola() {

    }


}
