package Tema5_ProgramacionColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompraAmpliacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> productos = new HashSet<>();
        Set<String> carro = new HashSet<>();
        int opcion;

        System.out.println("Lista de la compra.");
        System.out.print("¿Cuántos productos vas a comprar? ");
        int total = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < total; i++) {
            System.out.println("Escribe el producto numero "+(i+1)+": ");
            String producto = sc.nextLine();

            if(productos.contains(producto)){
                System.out.println("El producto ya esta, pon otro.");
                total++;
            }
            else{
                productos.add(producto);
            }
        }

        do {
            System.out.println("   Menu    ");
            System.out.println("1. Añadir producto al carro");
            System.out.println("2. Ver productos en el carro");
            System.out.println("3. Ver que falta por añadir");
            System.out.println("4. Salir");
            System.out.print("     Opcion:");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("¿Qué producto acabas de meter en el carro? ");
                    String item = sc.nextLine();
                    if (productos.contains(item)) {
                        carro.add(item);
                        System.out.println("¡Añadido!");
                    } else {
                        System.out.println("Ese producto no estaba en tu lista original.");
                    }
                    break;
                case 2:
                    System.out.println("En el carro llevas: " + carro);
                    break;
                case 3:
                    Set<String> faltantes = new HashSet<>(productos);
                    faltantes.removeAll(carro);

                    if (faltantes.isEmpty()) {
                        System.out.println("La lista está completa, ya lo tienes todo.");
                    } else {
                        System.out.println("Te falta por comprar: " + faltantes);
                    }
                    break;
            }
        } while (opcion != 4);
    }
}

