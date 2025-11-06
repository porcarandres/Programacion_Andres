import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("horas:");
        int hora = sc.nextInt();
        System.out.println("minutos:");
        int minutos = sc.nextInt();
        System.out.println("Es la Española (1) o la Japonesa (2) ?: ");
        int pais = sc.nextInt();
        System.out.println("Que dia es de la semana escribe (1)Lunes,... hasta 7.");
        int dia = sc.nextInt();
        if(pais == 1) {
            switch (dia) {
                case 1: if(minutos>60){
                    hora++;
                }
                int horajapon1= hora-8;
                    System.out.println("Son las "+horajapon1+"h y "+minutos+" min en japon un Lunes");
                break;

                case 2: if(minutos>60){
                    hora++;
                }
                    int horajapon2= hora-8;
                    System.out.println("Son las "+horajapon2+"h y "+minutos+" min en japon un Martes");
                    break;
                case 3: if(minutos>60){
                    hora++;
                }
                    int horajapon3 = hora+8;
                    System.out.println("Son las "+ horajapon3 +"h y "+minutos+" min en japon un Miercoles");
                    break;

                case 4: if(minutos>60){
                    hora++;
                }
                    int horajapon4 = hora-8;
                    System.out.println("Son las "+ horajapon4 +"h y "+minutos+" min en japon un Jueves");
                    break;

                case 5: if(minutos>60){
                    hora++;
                }
                    int horajapon5 = hora-8;
                    System.out.println("Son las "+ horajapon5 +"h y "+minutos+" min en japon un Viernes");
                    break;
                case 6: if(minutos>60){
                    hora++;
                }
                    int horajapon6 = hora+8;
                    System.out.println("Son las "+ horajapon6 +"h y "+minutos+" min en japon un Sabado");
                    break;

                case 7: if(minutos>60){
                    hora++;
                }
                    int horajapon7 = hora-8;
                    System.out.println("Son las "+ horajapon7 +"h y "+minutos+" min en japon un Domingo");
                    break;
            }
            if(pais == 2) {
                switch (dia) {
                    case 1: if(minutos>60){
                        hora++;
                    }
                        int horaesp1 = hora+8;
                        System.out.println("Son las "+ horaesp1 +"h y "+minutos+" min en España un Lunes");
                        break;

                    case 2: if(minutos>60){
                        hora++;
                    }
                        int horaesp2 = hora-8;
                        System.out.println("Son las "+ horaesp2 +"h y "+minutos+" min en España un Martes");
                        break;
                    case 3: if(minutos>60){
                        hora++;
                    }
                        int horaesp3 = hora+8;
                        System.out.println("Son las "+ horaesp3 +"h y "+minutos+" min en japon un Miercoles");
                        break;

                    case 4: if(minutos>60){
                        hora++;
                    }
                        int horaesp4 = hora-8;
                        System.out.println("Son las "+ horaesp4 +"h y "+minutos+" min en España un Jueves");
                        break;

                    case 5: if(minutos>60){
                        hora++;
                    }
                        int horaesp5 = hora-8;
                        System.out.println("Son las "+ horaesp5 +"h y "+minutos+" min en España un Viernes");
                        break;
                    case 6: if(minutos>60){
                        hora++;
                    }
                        int horaesp6 = hora-8;
                        System.out.println("Son las "+ horaesp6 +"h y "+minutos+" min en España un Sabado");
                        break;

                    case 7: if(minutos>60){
                        hora++;
                    }
                        int horaesp7 = hora-8;
                        System.out.println("Son las "+ horaesp7 +"h y "+minutos+" min en España un Domingo");
                        break;
                }


        }
    }
}
}
