package Tema4_EjerciciosProgramacion;

import java.util.Scanner;

public class Persona {
        public static final int Default_Age= 0;
        String nombre;
        int edad;

        public void saludar() {
            System.out.println("¡Hola!");
        }

        public void presentarme() {
            System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
        }

        public void saludarA(String nombre) {
            System.out.println("¡Hola " + nombre + "!");
        }

    public Persona(String nombre){
        this.nombre="";
        this.edad= Default_Age;

    }
    public Persona(String nombre, int edad){
        this.nombre="";
        this.edad= 0;
    }
    public int getEdad (){
            return edad;
    }
    public String getNombre (){
            return nombre;
    }
    public void setEdad(int edad){
        if(edad>0) this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void showInfo(){
        System.out.println("Las personas tienen nombre y edad.");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
    }
}



