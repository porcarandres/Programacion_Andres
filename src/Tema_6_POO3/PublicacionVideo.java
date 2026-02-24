package Tema_6_POO3;

public class PublicacionVideo implements PublicacionConReaccion, AbrirPublicacion {
    public void publicar() {
        System.out.println("Publicando video en la sección de Reels.");
    }

    public void compartir() {
        System.out.println("Compartiendo enlace del video.");
    }

    public void comentar(String texto) {
        System.out.println("Comentario en el video: " + texto);
    }

    public void abrir() {
        System.out.println("Reproduciendo video con sonido.");
    }
}