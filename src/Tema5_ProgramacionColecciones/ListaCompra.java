package Tema5_ProgramacionColecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Set<String> listaCompra = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String producto;

        System.out.println("Cuantos productos tiene tu Lista?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Escribe el producto:");
            producto = sc.nextLine();

            if(listaCompra.contains(producto)){
                System.out.println("El producto ya esta, pon otro.");
                cantidad++;
            }
            else{
                listaCompra.add(producto);
            }
        }
        System.out.println("La Lista contiene estos productos: "+listaCompra);
    }
}
