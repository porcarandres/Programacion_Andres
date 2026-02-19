package Tema_6_POO3;

public class Vehiculo {
    private String matricula;
    private String marca;
    private int anioMatriculacion;

    public Vehiculo(String matricula, String marca, int anioMatriculacion) {
        this.matricula = matricula;
        this.marca = marca;
        this.anioMatriculacion = anioMatriculacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }
}
