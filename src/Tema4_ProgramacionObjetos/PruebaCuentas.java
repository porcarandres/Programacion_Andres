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
                    System.out.println("DNI: " + persona1.toString());
                    break;

                case 4:
                    System.out.print("Introduce el número de cuenta: ");
                    int numNomina = sc.nextInt();
                    System.out.print("Importe de la nómina: ");
                    int importeNomina = sc.nextInt();

                    for (int i = 0; i < persona1.getCuentas().length; i++) {
                        Cuenta cuenta = persona1.getCuentas()[i];
                        if (cuenta != null && cuenta.setNumCuenta() == numNomina) {
                            cuenta.abonar(importeNomina);
                            System.out.println("Nómina recibida.");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Introduce el número de cuenta: ");
                    int numPago = sc.nextInt();
                    System.out.print("Importe: ");
                    int importePago = sc.nextInt();

                    for (int i = 0; i < persona1.getCuentas().length; i++) {
                        Cuenta cuenta = persona1.getCuentas()[i];
                        if (cuenta != null && cuenta.setNumCuenta() == numPago) {
                            cuenta.pagar(importePago);
                            System.out.println("Pago realizado");
                        }
                    }
                    break;

                case 6:
                    System.out.print("Num cuenta origen: ");
                    int origen = sc.nextInt();
                    System.out.print("Num cuenta destino: ");
                    int destino = sc.nextInt();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    Cuenta cOrigen = null;
                    Cuenta cDestino = null;

                    for (int i = 0; i < persona1.getCuentas().length; i++) {
                        Cuenta cuenta = persona1.getCuentas()[i];
                        if (cuenta != null) {
                            if (cuenta.setNumCuenta() == origen) cOrigen = cuenta;
                            if (cuenta.setNumCuenta() == destino) cDestino = cuenta;
                        }
                    }
                    if (cOrigen != null && cDestino != null) {
                        cOrigen.pagar(cantidad);
                        cDestino.abonar(cantidad);
                        System.out.println("Transferencia realizada");
                    } else {
                        System.out.println("Error");
                    }
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
