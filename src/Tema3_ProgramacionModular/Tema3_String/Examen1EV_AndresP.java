import java.util.Scanner;

public class Examen1EV_AndresP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        readOption();
        char opcion;

        do {
            System.out.println("Introduce opcion:");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("A:");
                    estudiantesNota();
                    break;
                case 'b':
                    System.out.println("B:");
                    System.out.println("Inserta las respuestas (a,b,c,d) separado por espacios:");
                    String[] s = new String[]{sc.nextLine()};
                    tipoTest(s);
                    break;
                case 'c':
                    System.out.println("C:");
                    break;
                case 'd':
                    System.out.println("D:");
                    break;
                case 'e':
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (opcion != 'e');
    }

    public static void readOption(){
        System.out.println("Menu");
        System.out.println("a-Introducir notas del modulo");
        System.out.println("b-Introducir plantilla examen");
        System.out.println("c-Corregir un examen");
        System.out.println("d-Introducir notas ciclo");
        System.out.println("e-Salir");
    }

    public static void estudiantesNota() {
        Scanner sc = new Scanner(System.in);
        int aprobados =0;
        System.out.println("Numero de estudiantes: ");
        int estudiantes = sc.nextInt();
        System.out.println("estudiantes: "+estudiantes);
        while (estudiantes != 0) {
            System.out.println("Introduce Nota: ");
            double nota_sobre_50 = sc.nextInt();
            double nota_sobre_10 = nota_sobre_50 * 10 / 50;
            System.out.println("Nota sobre 10: "+nota_sobre_10);
            if (nota_sobre_10 >= 5) {
                aprobados++;
            }
            estudiantes--;
        }
        System.out.println("Aprobados: "+aprobados);
    }

    public static void tipoTest(String[] opcion) {
        Scanner sc = new Scanner(System.in);
         opcion= new String[]{sc.nextLine()};
            for (int i = 0; i < opcion.length; i++) {
                System.out.println("[" + opcion[i] + "]");
            }
        System.out.println();
    }

    public static void notaFinal(int[]a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el numero de estudiantes: ");
        System.out.println("Notas (separa con espacios): ");

        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }


}

