package Tema3_ProgramacionModular.Tema3_String;

import java.util.Scanner;

public class MyString {
    // Mostrar elementos de un array de Strings
    public static void imprimirLista(String[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
    // a) Invertir cadena y pasar a mayúsculas
    public static String invertirEnMayus(String frase) {
        String invertida = "";
        for (int x = frase.length() - 1; x >= 0; x--) {
            invertida += frase.charAt(x);
        }
        return invertida.toUpperCase();
    }
    // b) Contar vocales
    public static int contarVocales(String texto) {
        int suma = 0;
        String t = texto.toLowerCase();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                suma++;
            }
        }
        return suma;
    }
    // c) Palabra más larga
    public static String palabraLarga(String linea) {
        linea = linea + " ";
        String actual = "";
        String maxima = "";
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);

            if (c != ' ') {
                actual += c;
            } else {
                if (actual.length() > maxima.length()) {
                    maxima = actual;
                }
                actual = "";
            }
        }
        return maxima;
    }
    // d) Contar cuántas veces aparece una subcadena
    public static int aparicionesDe(String texto, String buscar) {
        int total = 0;
        int len1 = texto.length();
        int len2 = buscar.length();

        for (int i = 0; i <= len1 - len2; i++) {
            boolean igual = true;

            for (int j = 0; j < len2; j++) {
                if (texto.charAt(i + j) != buscar.charAt(j)) {
                    igual = false;
                    break;
                }
            }

            if (igual) total++;
        }

        return total;
    }
    // e) Número de palabras
    public static int numeroPalabras(String texto) {
        int cantidad = 0;
        boolean dentro = false;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c != ' ' && !dentro) {
                dentro = true;
                cantidad++;
            } else if (c == ' ') {
                dentro = false;
            }
        }
        return cantidad;
    }
    // f) Formatear teléfono
    public static String formatearTelefono(String num) {
        String salida = "(+";

        for (int i = 0; i < num.length(); i++) {
            salida += num.charAt(i);

            if (i == 1) {
                salida += ")-";
            } else if (i == 4) {
                salida += "-";
            }
        }
        return salida;
    }
    // g) Histograma de vocales
    public static void imprimirHistogramaVocales(String texto) {
        String t = texto.toLowerCase();
        String vs = "aeiou";

        for (int i = 0; i < vs.length(); i++) {
            char v = vs.charAt(i);
            int rep = 0;

            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == v) rep++;
            }

            System.out.print(v + " " + rep + " ");

            for (int k = 0; k < rep; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a invertir y convertir a mayusculas");
        System.out.print("escribe un texto: ");
        String a = sc.nextLine();
        System.out.println("resultado " + MyString.invertirEnMayus(a));

        System.out.println("b contar vocales");
        System.out.print("introduce texto: ");
        String b = sc.nextLine();
        System.out.println("vocales encontradas " + MyString.contarVocales(b));

        System.out.println("c palabra mas larga");
        System.out.print("frase: ");
        String c = sc.nextLine();
        System.out.println("mas larga " + MyString.palabraLarga(c));

        System.out.println("d subcadena dentro de cadena");
        System.out.print("cadena principal: ");
        String d1 = sc.nextLine();
        System.out.print("subcadena a buscar: ");
        String d2 = sc.nextLine();
        System.out.println("veces encontrada " + MyString.aparicionesDe(d1, d2));

        System.out.println("e contar palabras");
        System.out.print("introduce frase: ");
        String e = sc.nextLine();
        System.out.println("numero de palabras " + MyString.numeroPalabras(e));

        System.out.println("f formato telefono");
        System.out.print("introduce numero 11 digitos: ");
        String f = sc.nextLine();
        System.out.println("formato " + MyString.formatearTelefono(f));

        System.out.println("g histograma de vocales");
        System.out.print("introduce texto: ");
        String g = sc.nextLine();
        MyString.imprimirHistogramaVocales(g);
    }
}
