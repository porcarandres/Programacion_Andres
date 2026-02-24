package Tema_5_Colecciones2;

import java.util.ArrayList;
import java.util.List;

public class GestionAvistamientos {
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
                System.out.println(a);
            }
        }
    }

    public void mostrarNocturnos() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a.getHora() >= 20 || a.getHora() < 8) {
                System.out.println(a);
            }
        }
    }

    public void mostrarManadas() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a instanceof ManadaLobos) {
                System.out.println(a);
            }
        }
    }

    public void mostrarSerpientes() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a instanceof Serpiente) {
                System.out.println(a);
            }
        }
    }

    public void mostrarPajaros() {
        for (int i = 0; i < listaAvistamientos.size(); i++) {
            Avistamiento a = listaAvistamientos.get(i);
            if (a instanceof Pajaro) {
                System.out.println(a);
            }
        }
    }
}