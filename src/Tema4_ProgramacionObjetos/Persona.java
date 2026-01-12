package Tema4_ProgramacionObjetos;

public class Persona {
    String DNI = "";
    String nombre ="";
    String apellido1 = "";
    String apellido2="";
    int edad;

    public static final String DefaultDNI = "000000A";
    public static final String Defaultnombre= "N";
    public static final String Defaultapellido1 = "A";
    public static final String Defaultapellido2="A";
    public static final int Defaultedad = 0;

    public Persona(){
        this.DNI = DefaultDNI;
        this.nombre = Defaultnombre;
        this.apellido1 = Defaultapellido1;
        this.apellido2 = Defaultapellido2;
        this.edad = Defaultedad;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI= DNI;
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
        this.edad=edad;
    }

    public boolean isAdult(){
        if(edad<=18){
            return true;
        }else{
            return false;
        }
    }
    public boolean isRetired(){
        if(edad<65){
            return true;
        }else{
            return false;
        }
    }


}
