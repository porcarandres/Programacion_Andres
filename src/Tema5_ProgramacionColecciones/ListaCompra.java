package Tema5_ProgramacionColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Set<String> ListaCompra = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String producto;

        System.out.println("Cuantos productos tiene tu Lista?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Escribe el producto:");
            producto = sc.nextLine();

            if(ListaCompra.contains(producto)){
                System.out.println("El producto ya esta, pon otro.");
            }
            else{
                ListaCompra.add(producto);
            }

        }
        System.out.println("La Lista contiene estos productos: "+ListaCompra);
    }
}
