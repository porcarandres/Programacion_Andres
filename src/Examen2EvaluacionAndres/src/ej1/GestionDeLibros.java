package ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionDeLibros {

    public static void main(String[] args){
        List<Libro> libros = new ArrayList<>();
        Libro e = new Libro("1","Lazarillo de tramas","Miprimo",12,"Amor","tapaDura");
        libros.add(e);
        Libro t = new Libro("5","Gambito","Tuprima",34,"Desgracia","tapaBlanda");
        libros.add(t);
        Libro a = new Libro("6","LarsenAttack","Suprimo",55,"Comedia","tapaBolsillo");
        libros.add(a);

        Scanner sc = new Scanner(System.in);
        showMenu();

        System.out.println("Opcion:");
        int opcion =sc.nextInt();
        sc.nextLine();

         do{
             switch (opcion){
                 case 1:
                     System.out.println("1");
                     introLibro(sc, (ArrayList<Libro>) libros);
                     break;
                 case 2:
                     mostrarInfo(sc,(ArrayList<Libro>) libros);

                     break;
                 case 3:
                     modificarInfo(sc, (ArrayList<Libro>) libros);


                     break;
                 case 4:
                     librosAutor(sc, (ArrayList<Libro>) libros);

                     break;
                 case 5:
                     System.out.println("Saliendo");

                     break;
                 default:
                     System.out.println("Pon una opcion valida");

             }
             System.out.println("Opcion:");
             opcion =sc.nextInt();
             sc.nextLine();

         }while(opcion != 5);

    }


    public static void introLibro(Scanner sc,ArrayList<Libro> libros){

        System.out.println("Introduce un ej1.Libro:");
        System.out.println("isbn:");
        String isbn = sc.nextLine();

        System.out.println("nombre");
        String nombre = sc.nextLine();

        System.out.println("autor");
        String autor = sc.nextLine();

        System.out.println("numpaginas");
        int numpaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("genero");
        String genero = sc.nextLine();


        System.out.println("formato");
        String formatro = sc.nextLine();

        Libro x = new Libro(isbn,nombre,autor,numpaginas,genero,formatro);
        libros.add(x);
    }
    public static void mostrarInfo(Scanner sc, ArrayList<Libro> libros){
        System.out.println("Tamaño de la biblioteca: "+libros.size()+"Acuerdate que empieza en el 0 la posicion");

        System.out.println("Que libro quieres ver:");
        int posicion =sc.nextInt();

        if (posicion<=libros.size()){
            System.out.println("Info:  "+libros.get(posicion));
        }else{
            System.out.println("ESA POSICION NO EXISTE");
        }
    }

    public static void modificarInfo(Scanner sc, ArrayList<Libro> libros){
        System.out.println("ej1.Libro a modificar:");
        int posicion=sc.nextInt();
        System.out.println("genero modificado:");
        String generomodificado=sc.nextLine();
        sc.nextLine();

        libros.get(posicion).setGenero(generomodificado);

        System.out.println("libro modificado"+libros.get(posicion));
    }

    public static void librosAutor(Scanner sc, ArrayList<Libro> libros){
        System.out.println("Autor a bucar");
        String autorbusca= sc.nextLine();
        sc.nextLine();
        /*if(){


        }else{
            System.out.println("No existe");
        }*/
    }




    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1-Introducir ej1.Libro");
        System.out.println("2-Mostrar informacion de un libro");
        System.out.println("3-Modificar el genero de un libro");
        System.out.println("4-Buscar todos los libros de un autor");
        System.out.println("5-Salir");

    }
}
