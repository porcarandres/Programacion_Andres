package Tema4_ProgramacionObjetos;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        int opcion;
        PersonaCuenta persona1 = new PersonaCuenta();
        sMenu();

        do{
            System.out.println("Opcion:");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Introduce el DNI de la persona: ");
                    String dni = sc.next();
                    persona1 = new PersonaCuenta(dni);
                    break;

                case 2:
                    System.out.print("Introduce el número de cuenta: ");
                    int numC = sc.nextInt();

                    System.out.print("Introduce el saldo inicial: ");
                    int saldoC = sc.nextInt();

                    if (persona1.añadirCuenta(new Cuenta(numC, saldoC))) {
                        System.out.println("Cuenta añadida.");}
                    break;

                case 3:
                    System.out.println("Datos de la persona:");
                    System.out.println("DNI: " + persona1.getDni());
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:
                    if (persona1.esMoroso()) {
                        System.out.println("La persona es morosa (tiene cuentas en negativo).");
                    } else {
                        System.out.println("La persona no tiene deudas.");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }while (opcion !=0);




    }
    public static void sMenu() {
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
