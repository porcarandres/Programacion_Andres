package Tema7_Ejercicios.EjerciciosB;

class Alumno {
    String nombreCompleto;
    double media;

    public  Alumno(String nombreCompleto,double media){
        this.media=media;
        this.nombreCompleto=nombreCompleto;
    }

    @Override
    public String toString() {
        return String.format("Nombre: "+nombreCompleto+" | NotaMedia: "+media);
    }

}
