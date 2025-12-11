package Tema3_ProgramacionModular.Tema3_Array;

import java.util.Random;
import java.util.Scanner;

public class AtrapaMosca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int total = 15;
        int mosca = random.nextInt(total);
        boolean atrapada = false;

        System.out.println("Juego: Atrapa la mosca");
        System.out.println("Selecciona una posicion entre 1 y 15 para atrapar la mosca.");

        while(!atrapada){
            System.out.print("Ingresa posicion: ");
            int eleccion = sc.nextInt() - 1;

            if(eleccion < 0 || eleccion >= total){
                System.out.println("Opcion no valida.");
                continue;
            }

            if (eleccion == mosca) {
                System.out.println("Has atrapado a la mosca en la posicion "+(mosca + 1));
                atrapada = true;
            }
            else if (eleccion == mosca - 1 || eleccion == mosca + 1) {
                if (mosca > 0) {
                    mosca--;
                } else {
                    mosca++;
                }
                System.out.println("La mosca se ha escapado a otra posición cercana");
            } else {
                System.out.println("La mosca no esta ahi");
            }
        }
    }
}
