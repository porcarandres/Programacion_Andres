package Tema4_ProgramacionObjetos;

public class PersonaMain {
    public static void main(String[] args) {
        Persona p1 = new Persona("23434456G","Pereira","Castor","Paletas",24);
        p1.isAdult();
        p1.isRetired();

        Persona p2 = new Persona("12312454M","Agustin","Cincuentayuno","Souypro",23);
        p2.isAdult();
        p2.isRetired();

        System.out.println("Persona 1:");
        p1.print();
        System.out.println(p1.getNombre() + " es adulto? " + p1.isAdult());
        System.out.println(p1.getNombre() + " esta jubilado? " + p1.isRetired());
        System.out.println("El DNI es verdadero? "+ Persona.checkDNI(p1.getDNI()));

        System.out.println("\n");

        System.out.println("Persona 2:");
        p2.print();
        System.out.println(p2.getNombre() + " es adulto? " + p2.isAdult());
        System.out.println(p2.getNombre() + " esta jubilado? " + p2.isRetired());
        System.out.println("El DNI es verdadero? "+Persona.checkDNI(p2.getDNI()));

        System.out.println("\nDiferencia de edad:");

        int diferencia = p1.ageDifference(p2);
        System.out.println("La diferencia de edad entre las personas es: "+diferencia);

    }
}
