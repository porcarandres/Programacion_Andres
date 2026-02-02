package Tema4_ProgramacionObjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaCuentas {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        ArrayList<PersonaCuenta> personas= new ArrayList<>();
        int opcion;
        showMenu();

        do{
            System.out.println("Opcion:");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Introduce DNI: ");
                    personas.add(new PersonaCuenta(sc.nextLine()));
                    break;

                case 2:
                    System.out.println("DNI:");


                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }while (opcion !=0);




    }
    public static void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Crear Persona");
        System.out.println("2. Añadir Cuenta a Persona");
        System.out.println("3. Mostrar datos Persona");
        System.out.println("4. Recibir Nomina");
        System.out.println("5. Realizar Pago");
        System.out.println("6. Transferencia");
        System.out.println("7. Ver Morosos");
        System.out.println("0. Salir");
    }
}
