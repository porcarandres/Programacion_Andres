package Tema3_ProgramacionModular;

import java.util.Scanner;

import static Tema3_ProgramacionModular.Tema3Ejercicio2.isAdult;
import static Tema3_ProgramacionModular.Tema3Ejercicio3.*;

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
                    Tema3Ejercicio4.dollar2Euro(1);
                    Tema3Ejercicio4.euro2Dollar(1);
                    Tema3Ejercicio4.main(args);
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

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
