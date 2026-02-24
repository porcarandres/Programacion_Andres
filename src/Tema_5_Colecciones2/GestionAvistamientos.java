package Tema_5_Colecciones2;

import java.util.ArrayList;
import java.util.List;

public class GestionAvistamientos { // QUITADO EL ABSTRACT
    private List<Avistamiento> listaAvistamientos;

    public GestionAvistamientos() {
        this.listaAvistamientos = new ArrayList<>();
    }

    public void aniadirAvistamiento(Avistamiento a) {
        listaAvistamientos.add(a);
    }

    public void mostrarApartirDeOcho() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a.getHora() >= 8) {
                System.out.println(a.toString());
            }
        }
    }

    public void mostrarNocturnos() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a.getHora() >= 20 || a.getHora() < 8) {
                System.out.println(a.toString());
            }
        }
    }

    public void mostrarManadas() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a.getTipo().equals("Lobo")) {
                System.out.println(a.toString());
            }
        }
    }

    public void mostrarSerpientes() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a.getTipo().equals("Serpiente")) {
                System.out.println(a.toString());
            }
        }
    }

    public void mostrarPajaros() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a.getTipo().equals("Pajaro")) {
                System.out.println(a.toString());
            }
        }

    }
}