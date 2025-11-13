package Tema3_ProgramacionModular;

import java.util.Scanner;

import static Tema3_ProgramacionModular.Tema3Ejercicio2.isAdult;
import static Tema3_ProgramacionModular.Tema3Ejercicio3.*;
import static Tema3_ProgramacionModular.Tema3Ejercicio4.*;
import static Tema3_ProgramacionModular.Tema3Ejercicio5.Multiplicar;
import static Tema3_ProgramacionModular.Tema3Ejercicio6.tablas;
import static Tema3_ProgramacionModular.Tema3Ejercicio7.esPrimo;
import static Tema3_ProgramacionModular.Tema3Ejercicio8.ComprFecha;
import static Tema3_ProgramacionModular.Tema3Ejercicio9.creaTriangulo;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int opcion;
        ShowMenu();
        opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ESCRIBE UN NUMERO:");

                    int number = sc2.nextInt();

                    number= Tema3Ejercicio1.numberSign(number);

                    if(number > 0){
                        System.out.println(number);
                    } else if (number < 0) {
                        System.out.println(number);
                    }else{
                        System.out.println(number);
                    }
                    break;
                case 2:
                    Tema3Ejercicio1.numberSign(1);
                    Tema3Ejercicio1.main(args);

                    System.out.println("ESCRIBE TU EDAD:");
                    int edad = sc.nextInt();

                    boolean mayor = isAdult(edad);

                    if (mayor) {
                        System.out.println("Eres mayor de edad.");
                    } else {
                        System.out.println("Eres menor de edad.");
                    }
                    break;
                case 3:
                    double radius;

                    do {
                        System.out.print("Introduce el radio del circulo (>0): ");
                        radius = sc.nextDouble();

                        if (!validRadius(radius)) {
                            System.out.println("El radio debe ser mayor que 0.");
                        }
                    } while (!validRadius(radius));

                    double perimetro = calculateCirclePerimeter(radius);
                    double area = calculateCircleArea(radius);
                    System.out.println("Perimetro del círculo: "+perimetro);
                    System.out.println("Area del círculo: "+area);

                    break;
                case 4:
                    Tema3Ejercicio4.showMenu();
                    System.out.println("Selecciona una opcion de las 3: ");
                    opcion = sc.nextInt();
                    double cantidad;
                    if (opcion == 1){
                        System.out.println("Introduce euros:");
                        cantidad = sc.nextDouble();
                        System.out.println(cantidad + " euros, son " + euro2Dollar(cantidad) + " dolares.");
                    } else if (opcion == 2) {
                        System.out.println("Introduce dolares:");
                        cantidad = sc.nextDouble();
                        System.out.println(cantidad + " dolares, son " + dollar2Euro(cantidad) + " euros.");
                    } else if (opcion == 3) {
                        System.out.println("Fin");
                    }else{
                        System.out.println("No valido");
                    }
                    break;
                case 5:
                    System.out.println("Dame un numero entero entre 1 y 10: ");
                    Multiplicar();
                    break;
                case 6:
                    System.out.println("Ejercicio tablas de numeros de 1 al 10\n");
                    tablas();
                    break;
                case 7:
                    System.out.println("Pon numeros positivos y si quieres acabar pon 0: ");
                    int numero;

                    do {
                        numero = sc.nextInt();

                        if (numero > 0) {
                            if (esPrimo(numero)) {
                                System.out.println(numero + " es primo.");
                            } else {
                                System.out.println(numero + " no es primo.");
                            }
                        } else if (numero < 0) {
                            System.out.println("Por favor, introduce solo números positivos.");
                        }

                    } while (numero != 0);

                    System.out.println("Programa finalizado.");
                    break;
                case 8:
                    ComprFecha();
                    break;
                case 9:
                    System.out.print("Introduce el símbolo para el triángulo: ");
                    char simbolo = sc.next().charAt(0);

                    System.out.print("Introduce la cantidad de filas: ");
                    int filas = sc.nextInt();

                    if (filas > 0) {
                        creaTriangulo(simbolo, filas);
                    } else {
                        System.out.println("El número de filas debe ser mayor que 0.");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }


    }
    public static void ShowMenu(){
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1) Mostrar el signo de un número");
        System.out.println("2) Comprobar si el usuario es mayor de edad");
        System.out.println("3) Calcular el área y perímetro de un círculo");
        System.out.println("4) Conversor de euros ↔ dólares");
        System.out.println("5) Mostrar tabla de multiplicar de un número");
        System.out.println("6) Mostrar todas las tablas del 1 al 10");
        System.out.println("7) Comprobador de números primos");
        System.out.println("8) Comprobador de fechas");
        System.out.println("9) Dibujar triángulos");
        System.out.println("0) Salir");
        System.out.print("Elige una opción: ");

    }
}
