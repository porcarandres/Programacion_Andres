package Tema4_ProgramacionObjetos;

public class PersonaMain {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setDNI("20922208A");
        p1.setNombre("PEREIRA");
        p1.setApellido1("CASTOR");
        p1.setApellido2("PALETAS");
        p1.setEdad(32);
        p1.isAdult();
        p1.isRetired();


        Persona p2 = new Persona();
        p2.setDNI("29033380B");
        p2.setNombre("AGUSTIN");
        p2.setApellido1("CINCUENTAYUNO");
        p2.setApellido2("SOYPRO");
        p2.setEdad(28);
        p2.isAdult();
        p2.isRetired();

        System.out.println("Persona 1:");
        p1.print();
        System.out.println(p1.getNombre() + " es adulto? " + p1.isAdult());
        System.out.println(p1.getNombre() + " esta jubilado? " + p1.isRetired());

        System.out.println("\n");

        System.out.println("Persona 2:");
        p2.print();
        System.out.println(p2.getNombre() + " es adulto? " + p2.isAdult());
        System.out.println(p2.getNombre() + " esta jubilado? " + p2.isRetired());

        System.out.println("\n");

        int diferencia = p1.ageDifference(p2);
        System.out.println("La diferencia de edad entre las personas es: "+diferencia);


    }
}
