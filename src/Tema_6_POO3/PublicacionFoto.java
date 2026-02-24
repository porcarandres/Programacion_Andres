package Tema_6_POO3;

public class PublicacionFoto implements PublicacionConReaccion, AbrirPublicacion {
    public void publicar() {
        System.out.println("Subiendo foto a la galería.");
    }

    public void compartir() {
        System.out.println("Enviando foto por mensaje privado.");
    }

    public void comentar(String texto) {
        System.out.println("Comentario en la foto: " + texto);
    }

    public void abrir() {
        System.out.println("Mostrando la foto a pantalla completa.");
    }
}
