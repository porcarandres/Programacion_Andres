package Tema4_ProgramacionObjetos;

public class Persona {
    private final String DNI;
    private  String nombre;
    private  String apellido1;
    private  String apellido2;
    private  int edad;

    public static final int adultAge = 18;
    public static final int retiredAge = 65;

    //constructor vacío

    public Persona(String DNI,String nombre, String apellido1,String apellido2,int edad){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }
    public Persona(){
        this.DNI = "11111111A";
        this.nombre = "a";
        this.apellido1 = "a";
        this.apellido2 = "a";
        this.edad = 0;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>=0){
        this.edad=edad;
        } else{
            System.out.println("Edad no valida");
        }
    }

    public void print() {
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.out.println("Edad: " + edad);
    }

    public boolean isAdult(){
        return edad >= adultAge;
    }

    public boolean isRetired(){
        return edad > retiredAge;
    }

    public int ageDifference(Persona persona2) {
        if (edad > persona2.edad) {
            return (this.edad - persona2.edad);
        } else{
            return (persona2.edad - this.edad) ;
        }
    }

    public static boolean checkDNI(String DNI) {
        if (DNI == null || DNI.length() != 9) return false;

        for (int i = 0; i < 8; i++)
            if (DNI.charAt(i) < '0' || DNI.charAt(i) > '9') return false;

        char ultima = DNI.charAt(8);
        return (ultima >= 'A' && ultima <= 'Z') || (ultima >= 'a' && ultima <= 'z');
    }

}
