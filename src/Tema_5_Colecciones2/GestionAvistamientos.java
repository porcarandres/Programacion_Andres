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
        listaAvistamientos.stream()
                .filter(a -> a.getHora() >= 8)
                .forEach(System.out::println);
    }

    public void mostrarNocturnos() {
        listaAvistamientos.stream()
                .filter(a -> a.getHora() >= 20 || a.getHora() < 8)
                .forEach(System.out::println);
    }

    public void mostrarManadas() {
        listaAvistamientos.stream()
                .filter(a -> a instanceof ManadaLobos)
                .forEach(System.out::println);
    }

    public void mostrarSerpientes() {
        listaAvistamientos.stream()
                .filter(a -> a instanceof Serpiente)
                .forEach(System.out::println);
    }

    public void mostrarPajaros() {
        listaAvistamientos.stream()
                .filter(a -> a instanceof Pajaro)
                .forEach(System.out::println);
    }
}