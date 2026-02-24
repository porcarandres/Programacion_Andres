package Tema_6_POO3;

public class PublicacionTexto implements PublicacionConReaccion {
    public void publicar() {
        System.out.println("Publicando post de texto en el muro.");
    }

    public void compartir() {
        System.out.println("Compartiendo texto con mis amigos.");
    }

    public void comentar(String texto) {
        System.out.println("Comentario en el texto: " + texto);
    }
}
